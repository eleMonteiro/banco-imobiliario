package controladores;

import java.util.List;

import modelos.Jogador;
import modelos.Partida;
import modelos.Tabuleiro;

public class ControladorPartida {

	public Tabuleiro getTabuleiro() {
		return Partida.getInstance().getTabuleiro();
	}

	public List<Jogador> criarPartida(int quantidadeDeJogadores) {
		Partida partida = Partida.getInstance();
		return partida.criarJogadores(quantidadeDeJogadores);
	}

	public Jogador getJogadorDaVez() {
		return Partida.getInstance().getJogadorDaVez();
	}

	public void mudarJogadorDaVez() {
		Partida.getInstance().mudarJogadorDaVez();
	}

	public void novaJogada(int numeroDeCasasAAndar) {
		new ControladorTabuleiro(Partida.getInstance().getTabuleiro()).fazerJogadorAndar(numeroDeCasasAAndar,
				this.getJogadorDaVez());
	}

}
