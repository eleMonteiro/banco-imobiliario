package igu;

import java.util.ArrayList;
import java.util.List;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;
import modelos.Casa;

public class Tabuleiro {

	private Window janela;
	private Scene cena;
	private Keyboard teclado;
	private List<CasaTabuleiro> casasTabuleiro;

	public Tabuleiro(Window janela) {
		this.janela = janela;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Tabuleiro.scn"));
		teclado = janela.getKeyboard();
		casasTabuleiro = new ArrayList<>();
	}

	public void iniciar() {
		while (true) {
			cena.draw();
			janela.update();

			if (teclado.keyDown(Keyboard.SPACE_KEY)) {
				desenharTabuleiro();
			}
		}
	}

	private void inicializar() {
		List<Casa> casas = new ArrayList<>();

		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 0), casas.get(0)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 64), casas.get(1)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 128), casas.get(2)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 192), casas.get(3)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 256), casas.get(4)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 320), casas.get(5)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 384), casas.get(6)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 448), casas.get(7)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 512), casas.get(8)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 576), casas.get(9)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(640, 640), casas.get(10)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(576, 640), casas.get(11)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(512, 640), casas.get(12)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(448, 640), casas.get(13)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(384, 640), casas.get(14)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(320, 640), casas.get(15)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(256, 640), casas.get(16)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(192, 640), casas.get(17)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(128, 640), casas.get(18)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(64, 640), casas.get(19)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 640), casas.get(20)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 576), casas.get(21)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 512), casas.get(22)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 448), casas.get(23)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 384), casas.get(24)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 320), casas.get(25)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 256), casas.get(26)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 192), casas.get(27)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 128), casas.get(28)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 64), casas.get(29)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(0, 0), casas.get(30)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(64, 0), casas.get(31)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(128, 0), casas.get(32)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(192, 0), casas.get(33)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(256, 0), casas.get(34)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(320, 0), casas.get(35)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(384, 0), casas.get(36)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(448, 0), casas.get(37)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(512, 0), casas.get(38)));
		casasTabuleiro.add(new CasaTabuleiro(new Coordenada(576, 0), casas.get(39)));
	}

	private void desenharTabuleiro() {
		for (CasaTabuleiro casaTabuleiro : casasTabuleiro) {
			casaTabuleiro.desenharPeoes();
		}

		cena.draw();
	}

}
