package modelos;

import java.util.ArrayList;
import java.util.List;

public class Casa {

	private List<Jogador> jogadores;
	private Dono dono;
	private Acao acao;

	public Casa(Dono dono, Acao acao) {
		jogadores = new ArrayList<>();
		this.dono = dono;
		this.acao = acao;
	}

	public void inserirJogadorNaCasa(Jogador jogador) {
		jogadores.add(jogador);
		acao.iniciarAcao(jogador);
	}

	public void removerJogadorDaCasa(Jogador jogador) {
		jogadores.remove(jogador);
	}

	public Dono obterDono() {
		return dono;
	}

}
