package modelos;

import java.util.ArrayList;
import java.util.List;

import repositorios.RepositorioCasasTabuleiro;

public class Partida {

	private Tabuleiro tabuleiro;
	private List<Jogador> jogadores;
	private Jogador jogadorDaVez;

	public Partida(int quantidadeJogadores) {
		this.setTabuleiro(new Tabuleiro());
		this.setJogadores(new ArrayList<>());
		this.criarJogadores(quantidadeJogadores);
		this.setJogadorDaVez(jogadores.get(0));
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

	private void criarJogadores(int quantidadeDeJogadores) {
		RepositorioCasasTabuleiro repositorioCasasTabuleiro = RepositorioCasasTabuleiro.getInstance();
		for (int i = 0; i < quantidadeDeJogadores; i++) {
			Jogador novoJogador = new Jogador(2458, repositorioCasasTabuleiro.getCasaTabuleiro(0));
			jogadores.add(novoJogador);
		}
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
}
