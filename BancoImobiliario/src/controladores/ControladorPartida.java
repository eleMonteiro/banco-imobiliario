package controladores;

import java.util.List;
import java.util.ListIterator;

import acoes.AcaoVaParaAPrisao;
import dado.FaceDadosSorteado;
import modelos.Banco;
import modelos.Jogador;
import modelos.Partida;
import repositorios.RepositorioFacesDoDadoSorteada;
import tabuleiro.Tabuleiro;
import tabuleiro.casas.Imovel;

public class ControladorPartida {

	public void novaJogada(FaceDadosSorteado faceDadosSorteado) {
		Partida partida = Partida.getInstance();
		Jogador jogadorDaVez = partida.getJogadorDaVez();

		if (jogadorDaVez.estaPreso() == false) {
			if (existemTresDuplasParaOJogador(jogadorDaVez)) {
				new AcaoVaParaAPrisao().iniciarAcao(jogadorDaVez);
			} else {
				new ControladorTabuleiro().fazerJogadorAndar(faceDadosSorteado.getSomaFaces(), jogadorDaVez);
			}
		} else {
			if (jogadorDaVez.temCartaLiberarDaPrisao()) {
				ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
				int respostaDoJogador = controladorElementosGraficos.getiPainelDeMensagensDoJogo()
						.solicitarConfirmacao("DESEJA USAR SUA CARTA DE LIBERACAO DA PRISAO?");

				if (respostaDoJogador == 0) {
					jogadorDaVez.setEstaPreso(false);
				}
			} else if (faceDadosSorteado.eUmaDupla()) {
				jogadorDaVez.setEstaPreso(false);
			}
		}
	}

	public Partida getPartida() {
		return Partida.getInstance();
	}

	public Tabuleiro getTabuleiro() {
		return Partida.getInstance().getTabuleiro();
	}

	public Jogador getJogadorDaVez() {
		return Partida.getInstance().getJogadorDaVez();
	}

	public List<Jogador> getJogadores() {
		return Partida.getInstance().getJogadores();
	}

	public List<Jogador> criarPartida(int quantidadeDeJogadores) {
		Partida partida = Partida.getInstance();
		return partida.criarJogadores(quantidadeDeJogadores);
	}

	public void mudarJogadorDaVez() {
		Partida.getInstance().mudarJogadorDaVez();
	}

	public void removerJogadorDaPartida(Jogador jogador) {
		Banco banco = Banco.getInstance();

		List<Imovel> imoveisDoJogador = jogador.getImoveis();
		for (Imovel imovel : imoveisDoJogador) {
			imovel.setDono(banco);
		}

		banco.getConta().depositar(jogador.getConta().getSaldo());

		Partida partida = Partida.getInstance();
		partida.removerJogador(jogador);

		ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
		controladorElementosGraficos.getiPainelDeMensagensDoJogo().mostrarMensagem(jogador.getNome() + " PERDEU");
	}

	private boolean existemTresDuplasParaOJogador(Jogador jogador) {
		RepositorioFacesDoDadoSorteada respositorio = RepositorioFacesDoDadoSorteada.getInstance();
		List<FaceDadosSorteado> facesDadosSorteados = respositorio.getFacesDadosSorteado();

		ListIterator<FaceDadosSorteado> listIterator = facesDadosSorteados.listIterator();
		int cont = 0, numeroDeDuplasIguais = 0;
		while (listIterator.hasPrevious() && cont < 3) {
			if (listIterator.previous().getJogador() == jogador) {
				numeroDeDuplasIguais++;
			}
			cont++;
		}

		if (numeroDeDuplasIguais == 3) {
			return true;
		} else {
			return false;
		}
	}

	public Jogador getVencedor() {
		Partida partida = Partida.getInstance();
		if (partida.getJogadores().size() == 1) {
			return partida.getJogadores().get(0);
		}

		return null;
	}

}
