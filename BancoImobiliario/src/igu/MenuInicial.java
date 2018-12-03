package igu;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class MenuInicial {

	private Window janela;
	private GameImage imagemDeFundo;
	private Keyboard teclado;

	public MenuInicial(Window janela) {
		this.janela = janela;
		imagemDeFundo = new GameImage(URL.sprite("background-tabuleiro.png"));
		teclado = janela.getKeyboard();

		executar();
	}

	public void executar() {
		while (true) {
			imagemDeFundo.draw();
			janela.update();

			if (teclado.keyDown(Keyboard.ENTER_KEY)) {
				new Tabuleiro(janela);
			}
		}
	}

}
