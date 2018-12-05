package tabuleiro.casas;

import java.util.ArrayList;
import java.util.List;

import acoes.IAcao;
import modelos.Jogador;

public class Casa {

	private List<Jogador> jogadores;
	private IAcao acao;

	public Casa() {
		jogadores = new ArrayList<>();
	}

	public void inserirJogadorNaCasa(Jogador jogador) {
		jogadores.add(jogador);
		jogador.setCasaAtual(this);
	}

	public void removerJogadorDaCasa(Jogador jogador) {
		jogadores.remove(jogador);
	}

	public boolean jogadorEstaNaCasa(Jogador jogador) {
		return jogadores.contains(jogador);
	}

	public IAcao getAcao() {
		return acao;
	}

	public void setAcao(IAcao acao) {
		this.acao = acao;
	}
}
