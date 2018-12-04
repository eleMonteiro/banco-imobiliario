package modelos;

import java.util.ArrayList;
import java.util.List;

public class Casa {

	private List<Jogador> jogadores;
	private Acao acao;

	public Casa(Acao acao) {
		jogadores = new ArrayList<>();
		this.acao = acao;
	}

	public void inserirJogadorNaCasa(Jogador jogador) {
		jogadores.add(jogador);
		System.out.println(acao.getClass());
//		acao.iniciarAcao(jogador);
	}

	public void removerJogadorDaCasa(Jogador jogador) {
		jogadores.remove(jogador);
	}
}
