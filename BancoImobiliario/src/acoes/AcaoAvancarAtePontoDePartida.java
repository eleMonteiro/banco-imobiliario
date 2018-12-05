package acoes;

import modelos.Jogador;
import modelos.Partida;
import tabuleiro.casas.Casa;

public class AcaoAvancarAtePontoDePartida implements IAcao {

	@Override
	public void iniciarAcao(Jogador jogador) {
		Partida partida = Partida.getInstance();
		Casa novaCasa = partida.getTabuleiro().getCasaInicial();
		Casa casaAtual = jogador.getCasaAtual();
		casaAtual.removerJogadorDaCasa(jogador);
		novaCasa.inserirJogadorNaCasa(jogador);
		jogador.setEstaPreso(true);
	}

}
