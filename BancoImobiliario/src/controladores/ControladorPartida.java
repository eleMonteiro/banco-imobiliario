package controladores;

import java.util.List;

import modelos.Jogador;
import modelos.Partida;

public class ControladorPartida {

	private static ControladorPartida controladorPartida = null;
	private Partida partida;

	private ControladorPartida() {

	}

	public List<Jogador> criarPartida(int quantidadeDeJogadores) {
		partida = new Partida(quantidadeDeJogadores);
		return partida.getJogadores();
	}

	public Jogador getJogadorDaVez() {
		return partida.getJogadorDaVez();
	}

	public void mudarJogadorDaVez() {
		partida.mudarJogadorDaVez();
	}

	public void novaJogada(int numeroDeCasasAAndar) {
		ControladorTabuleiro.getInstance().fazerJogadorAndar(numeroDeCasasAAndar, this.getJogadorDaVez());
	}

	public static ControladorPartida getInstance() {
		if (controladorPartida == null) {
			controladorPartida = new ControladorPartida();
		}

		return controladorPartida;
	}

}
