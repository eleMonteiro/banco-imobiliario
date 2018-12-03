package igu;

import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Tabuleiro {

	private Window janela;
	private Scene cena;

	public Tabuleiro(Window janela) {
		this.janela = janela;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Tabuleiro.scn"));

		executar();
	}

	private void executar() {
		while (true) {
			cena.draw();
			janela.update();
		}
	}

}
