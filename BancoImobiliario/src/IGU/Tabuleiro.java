package IGU;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controladores.ControladorDado;
import controladores.ControladorPartida;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;
import modelos.Partida;
import modelos.dado.FaceDadosSorteado;
import modelos.jogador.Jogador;
import modelos.tabuleiro.Casa;

public class Tabuleiro {

	private Window janela;
	private Keyboard teclado;
	private Scene cena;
	private DadoDuplo dadoDuplo;
	private List<Peao> peoes;
	private List<CasaTabuleiro> casasTabuleiro;
	
	public Tabuleiro(Window janela, int quantidadeDeJogadores) {
		this.janela = janela;
		this.teclado = janela.getKeyboard();
		this.cena = new Scene();
		this.cena.loadFromFile(URL.scenario("Tabuleiro.scn"));
		this.dadoDuplo = new DadoDuplo();
		this.peoes = new ArrayList<>();
		this.casasTabuleiro = new ArrayList<>();

		this.criarPartida(quantidadeDeJogadores);
		this.criarCasasDoTabuleiro();
		this.iniciar();
	}

	public void iniciar() {
		FaceDadosSorteado faceDadosSorteado = new ControladorDado().lancarDado();

		while (true) {
			cena.draw();
			mostrarDados(faceDadosSorteado.getFaceDadoDois(), faceDadosSorteado.getFaceDadoUm());
			mostrarPeoes();
			if (this.teclado.keyDown(Keyboard.SPACE_KEY)) {
				JOptionPane.showMessageDialog(null, Partida.getInstance().getJogadorDaVez().getNome());
				faceDadosSorteado = new ControladorDado().lancarDado();
				mostrarDados(faceDadosSorteado.getFaceDadoDois(), faceDadosSorteado.getFaceDadoUm());

				cena.draw();
				
				novaJogada(faceDadosSorteado);
				atualizaCoordenadasPeoes();
				mostrarPeoes();

				janela.update();

				executarAcaoDaCasa();

				if(faceDadosSorteado.getFaceDadoUm() != faceDadosSorteado.getFaceDadoDois())
					mudarJogadorDaVez();
			}

			Jogador jogador = new ControladorPartida().getVencedor();
			if (jogador != null) {
				JOptionPane.showMessageDialog(null, jogador.getNome() + " VENCEU");
				break;
			}

			janela.update();
		}
	}

	private void mostrarDados(int dadoDireita, int dadoEsquerda) {
		this.dadoDuplo.setValorDadoDireita(dadoDireita);
		this.dadoDuplo.setValorDadoEsquerda(dadoEsquerda);
	}

	private void mostrarPeoes() {
		List<Jogador> jogadores = new ControladorPartida().getJogadores();

		for (Peao peao : peoes) {
			if (jogadores.contains(peao.getJogador())) {
				peao.moverParaCoordenada();
			}
		}
	}

	private void novaJogada(FaceDadosSorteado faceDadosSorteado) {
		new ControladorPartida().novaJogada(faceDadosSorteado);
	}

	private void executarAcaoDaCasa() {
		Jogador jogadorDaVez = new ControladorPartida().getJogadorDaVez();
		Casa casaAtual = jogadorDaVez.getCasaAtual();
		casaAtual.getAcao().iniciarAcao(jogadorDaVez);
	}

	private void atualizaCoordenadasPeoes() {
		Jogador jogadorDaVez = new ControladorPartida().getJogadorDaVez();
		Peao peao = procurarPeaoDoJogador(jogadorDaVez);
		CasaTabuleiro casaTabuleiro = procurarCasaTabuleiro(jogadorDaVez.getCasaAtual());
		peao.setCoordenada(casaTabuleiro.getCoordenada());
	}

	private void mudarJogadorDaVez() {
		new ControladorPartida().mudarJogadorDaVez();
	}

	private Peao procurarPeaoDoJogador(Jogador jogador) {
		for (Peao peao : peoes) {
			if (jogador == peao.getJogador()) {
				return peao;
			}
		}

		return null;
	}

	private CasaTabuleiro procurarCasaTabuleiro(Casa casa) {
		for (CasaTabuleiro casaTabuleiro : casasTabuleiro) {
			if (casa == casaTabuleiro.getCasa()) {
				return casaTabuleiro;
			}
		}

		return null;
	}

	private void criarPartida(int quantidadeDeJogadores) {
		List<Jogador> jogadores = new ControladorPartida().criarPartida(quantidadeDeJogadores);

		int spritePeao = 1;
		for (Jogador jogador : jogadores) {
			peoes.add(new Peao("pino-" + spritePeao + ".png", jogador, new Coordenada(640, 0)));
			spritePeao++;
		}
	}
	
	private void criarCasasDoTabuleiro() {
		ControladorPartida controladorPartida = new ControladorPartida();
		List<Casa> casas = controladorPartida.getTabuleiro().getCasas();

		casasTabuleiro.add(new CasaTabuleiro(casas.get(0), new Coordenada(640, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(1), new Coordenada(640, 64)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(2), new Coordenada(640, 128)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(3), new Coordenada(640, 192)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(4), new Coordenada(640, 256)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(5), new Coordenada(640, 320)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(6), new Coordenada(640, 384)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(7), new Coordenada(640, 448)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(8), new Coordenada(640, 512)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(9), new Coordenada(640, 576)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(10), new Coordenada(640, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(11), new Coordenada(576, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(12), new Coordenada(512, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(13), new Coordenada(448, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(14), new Coordenada(384, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(15), new Coordenada(320, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(16), new Coordenada(256, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(17), new Coordenada(192, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(18), new Coordenada(128, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(19), new Coordenada(64, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(20), new Coordenada(0, 640)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(21), new Coordenada(0, 576)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(22), new Coordenada(0, 512)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(23), new Coordenada(0, 448)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(24), new Coordenada(0, 384)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(25), new Coordenada(0, 320)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(26), new Coordenada(0, 256)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(27), new Coordenada(0, 192)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(28), new Coordenada(0, 128)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(29), new Coordenada(0, 64)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(30), new Coordenada(0, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(31), new Coordenada(64, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(32), new Coordenada(128, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(33), new Coordenada(192, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(34), new Coordenada(256, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(35), new Coordenada(320, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(36), new Coordenada(384, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(37), new Coordenada(448, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(38), new Coordenada(512, 0)));
		casasTabuleiro.add(new CasaTabuleiro(casas.get(39), new Coordenada(576, 0)));
	}

}
