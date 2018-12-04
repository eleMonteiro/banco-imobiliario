package igu;

import java.util.List;

import controladores.ControladorPartida;
import controladores.ControladorTabuleiro;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;
import modelos.Casa;
import modelos.FaceDadosSorteado;
import modelos.Jogador;

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
		this.criarPartida(quantidadeDeJogadores);
		this.criarCasasDoTabuleiro();
		this.iniciar();
	}

	public void iniciar() {
		while (true) {
			cena.draw();
			janela.update();

			if (this.teclado.keyDown(Keyboard.SPACE_KEY)) {
//				FaceDadosSorteado faceDadosSorteado = new ControladorDado().sortearDados();
//				this.dadoDuplo.setValorDadoEsquerda(faceDadosSorteado.getFaceDadoUm());
//				this.dadoDuplo.setValorDadoDireita(faceDadosSorteado.getFaceDadoDois());
			}
		}
	}

	private void criarPartida(int quantidadeDeJogadores) {
		List<Jogador> jogadores = new ControladorPartida().criarPartida(quantidadeDeJogadores);

		int spritePeao = 1;
		for (Jogador jogador : jogadores) {
			peoes.add(new Peao(spritePeao + ".png", jogador, new Coordenada(640, 0)));
			spritePeao++;
		}
	}

	private void criarCasasDoTabuleiro() {
		List<Casa> casas = new ControladorTabuleiro().casasTabuleiro();

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
