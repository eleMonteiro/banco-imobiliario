package acoes;

import modelos.Partida;
import modelos.jogador.Jogador;
import modelos.tabuleiro.Casa;

public class AcaoVaParaAPrisao implements IAcao {

	public void iniciarAcao(Jogador jogador) {
		Partida partida = Partida.getInstance();
		Casa novaCasa = partida.getTabuleiro().getPrisao();
		Casa casaAtual = jogador.getCasaAtual();
		casaAtual.removerJogadorDaCasa(jogador);
		novaCasa.inserirJogadorNaCasa(jogador);
		jogador.setEstaPreso(true);
	}

}
