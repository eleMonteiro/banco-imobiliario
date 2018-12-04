package modelos;

import java.util.ArrayList;
import java.util.List;

public class Casa {

	private List<Jogador> jogadores;
	private Acao acao;

	public Casa() {
		jogadores = new ArrayList<>();
	}

	public void inserirJogadorNaCasa(Jogador jogador) {
		jogadores.add(jogador);
		acao.iniciarAcao(jogador);
	}

	public void removerJogadorDaCasa(Jogador jogador) {
		jogadores.remove(jogador);
	}

	public boolean jogadorEstaNaCasa(Jogador jogador) {
		return jogadores.contains(jogador);
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

}
