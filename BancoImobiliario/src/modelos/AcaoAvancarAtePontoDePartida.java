package modelos;

import controladores.ControladorPartida;

public class AcaoAvancarAtePontoDePartida implements Acao {

	@Override
	public void iniciarAcao(Jogador jogador) {
		Tabuleiro tabuleiro = new ControladorPartida().getTabuleiro();
		Casa casaAtual = jogador.getCasaAtual();
		casaAtual.removerJogadorDaCasa(jogador);
		Casa pontoDePartida = tabuleiro.getCasaInicial();
		pontoDePartida.inserirJogadorNaCasa(jogador);
	}

}
