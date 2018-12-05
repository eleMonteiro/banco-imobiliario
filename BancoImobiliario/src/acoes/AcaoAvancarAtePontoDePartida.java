package acoes;

import modelos.Partida;
import modelos.jogador.Jogador;
import modelos.tabuleiro.Casa;

public class AcaoAvancarAtePontoDePartida implements IAcao {

	@Override
	public void iniciarAcao(Jogador jogador) {
		Partida partida = Partida.getInstance();
		Casa novaCasa = partida.getTabuleiro().getCasaInicial();
		Casa casaAtual = jogador.getCasaAtual();
		casaAtual.removerJogadorDaCasa(jogador);
		novaCasa.inserirJogadorNaCasa(jogador);
	}

}
