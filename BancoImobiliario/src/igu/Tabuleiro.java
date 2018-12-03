package igu;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Tabuleiro {

	private Window janela;
	private Scene cena;
	private Keyboard teclado;

	public Tabuleiro(Window janela) {
		this.janela = janela;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Tabuleiro.scn"));
		teclado = janela.getKeyboard();

		executar();
	}

	private void executar() {
		while (true) {
			cena.draw();
			janela.update();
			
			if (teclado.keyDown(Keyboard.SPACE_KEY)) {
				System.out.println("Jogar DADO");
			}
		}
	}

}
