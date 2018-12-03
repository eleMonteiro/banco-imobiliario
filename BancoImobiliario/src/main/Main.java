package main;

import igu.Tabuleiro;
import jplay.Keyboard;
import jplay.Window;

public class Main {

	public static void main(String[] args) {
		Window janela = new Window(704, 704);
		Keyboard teclado = janela.getKeyboard();

		while (true) {
			janela.update();

			if (teclado.keyDown(Keyboard.ENTER_KEY)) {
				new Tabuleiro(janela);
			}
		}
	}

}
