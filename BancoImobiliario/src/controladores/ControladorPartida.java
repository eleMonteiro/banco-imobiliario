package controladores;

import java.util.List;

import modelos.Jogador;
import modelos.Partida;
import modelos.Tabuleiro;

public class ControladorPartida {

	private static ControladorPartida controladorPartida = null;
	private Partida partida;

	private ControladorPartida() {

	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}
	
	public Tabuleiro getTabuleiro() {
		return partida.getTabuleiro();
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
		new ControladorTabuleiro(partida.getTabuleiro()).fazerJogadorAndar(numeroDeCasasAAndar, this.getJogadorDaVez());
	}

	public static ControladorPartida getInstance() {
		if (controladorPartida == null) {
			controladorPartida = new ControladorPartida();
		}

		return controladorPartida;
	}

}
