package controladores;

import java.util.List;
import java.util.ListIterator;

import modelos.AcaoVaParaAPrisao;
import modelos.FaceDadosSorteado;
import modelos.Jogador;
import modelos.Partida;
import modelos.Tabuleiro;
import repositorios.RepositorioFacesDoDadoSorteada;

public class ControladorPartida {

	public Partida getPartida() {
		return Partida.getInstance();
	}

	public Tabuleiro getTabuleiro() {
		return Partida.getInstance().getTabuleiro();
	}

	public Jogador getJogadorDaVez() {
		return Partida.getInstance().getJogadorDaVez();
	}

	public List<Jogador> criarPartida(int quantidadeDeJogadores) {
		Partida partida = Partida.getInstance();
		return partida.criarJogadores(quantidadeDeJogadores);
	}

	public void mudarJogadorDaVez() {
		Partida.getInstance().mudarJogadorDaVez();
	}

	public void novaJogada(FaceDadosSorteado faceDadosSorteado) {
		Partida partida = Partida.getInstance();
		Jogador jogadorDaVez = partida.getJogadorDaVez();

		if (jogadorDaVez.estaPreso() && faceDadosSorteado.eUmaDupla()) {
			jogadorDaVez.setEstaPreso(false);
		} else if (existemTresDuplasParaOJogador(jogadorDaVez)) {
			new AcaoVaParaAPrisao().iniciarAcao(jogadorDaVez);
		} else {
			new ControladorTabuleiro(partida.getTabuleiro()).fazerJogadorAndar(faceDadosSorteado.getSomaFaces(),
					jogadorDaVez);
		}
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

}
