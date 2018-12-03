package igu;

import java.util.List;

import javax.swing.JOptionPane;

import controladores.ControladorPartida;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;
import modelos.Jogador;

public class MenuInicial {

	private Window janela;
	private GameImage imagemDeFundo;
	private Keyboard teclado;

	public MenuInicial(Window janela) {
		this.janela = janela;
		imagemDeFundo = new GameImage(URL.sprite("background-tabuleiro.png"));
		teclado = janela.getKeyboard();
	}

	public void iniciar() {
		while (true) {
			imagemDeFundo.draw();
			janela.update();

			if (teclado.keyDown(Keyboard.ENTER_KEY)) {
				int quantidadeDeJogadores = getQuantidadeDeJogadores();
				List<Jogador> jogadores = new ControladorPartida().criarPartida(quantidadeDeJogadores);
				
				
				
				Tabuleiro tabuleiro = new Tabuleiro(janela);
				
				for (Jogador jogador : jogadores) {
					
				}
				
				tabuleiro.iniciar();
			}
		}
	}

	private int getQuantidadeDeJogadores() {
		Object[] opcoes = { 2, 3, 4, 5, 6 };
		int quantidadeDeJogadores = (int) JOptionPane.showInputDialog(null, "Selecione o número de jogadores", "Atenção",
				JOptionPane.PLAIN_MESSAGE, null, opcoes, null);

		return quantidadeDeJogadores;
	}

}
