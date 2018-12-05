package modelos;

import java.util.ArrayList;
import java.util.List;

import modelos.jogador.Jogador;
import modelos.tabuleiro.Tabuleiro;

public class Partida {

	private static Partida partida;
	private Tabuleiro tabuleiro;
	private List<Jogador> jogadores;
	private Jogador jogadorDaVez;

	public Partida() {
		this.setTabuleiro(new Tabuleiro());
		this.setJogadores(new ArrayList<>());
		this.setJogadores(new ArrayList<>());
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public void removerJogador(Jogador jogador) {
		jogadores.remove(jogador);
	}

	public List<Jogador> criarJogadores(int quantidadeDeJogadores) {
		for (int i = 0; i < quantidadeDeJogadores; i++) {
			Jogador novoJogador = new Jogador(2458, "Jogador " + i, tabuleiro.getCasaInicial());
			jogadores.add(novoJogador);
		}

		this.setJogadorDaVez(jogadores.get(0));

		return jogadores;
	}

	public Jogador getJogadorDaVez() {
		return jogadorDaVez;
	}

	public void setJogadorDaVez(Jogador jogadorDaVez) {
		this.jogadorDaVez = jogadorDaVez;
	}

	public void mudarJogadorDaVez() {
		int indiceJogador = 0;
		for (Jogador jogador : jogadores) {
			indiceJogador++;
			if (this.jogadorDaVez.equals(jogador))
				break;
		}

		this.jogadorDaVez = this.jogadores.get(indiceJogador % this.jogadores.size());
	}

	public static Partida getInstance() {
		if (partida == null) {
			partida = new Partida();
		}

		return partida;
	}

}
