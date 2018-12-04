package igu;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class MenuInicial {

	private Window janela;
	private Keyboard teclado;
	private GameImage imagemDeFundo;

	public MenuInicial(Window janela) {
		this.janela = janela;
		teclado = janela.getKeyboard();
		imagemDeFundo = new GameImage(URL.sprite("menu-inicial.png"));
	}

	public void iniciar() {
		while (true) {
			imagemDeFundo.draw();
			this.janela.update();

			if (this.teclado.keyDown(Keyboard.ENTER_KEY)) {
				int quantidadeDeJogadores = getQuantidadeDeJogadores();
				new Tabuleiro(this.janela, quantidadeDeJogadores);
			}
		}
	}

	private int getQuantidadeDeJogadores() {
		Object[] opcoes = { 2, 3, 4, 5, 6 };
		int quantidadeDeJogadores = (int) JOptionPane.showInputDialog(null, "Selecione o número de jogadores",
				"Atenção", JOptionPane.PLAIN_MESSAGE, null, opcoes, null);

		return quantidadeDeJogadores;
	}

}
