package controladores;

import dado.FaceDadosSorteado;
import dono.Dono;
import excecoes.SaldoInsufucienteException;
import igu.ComponentesGraficos;
import modelos.Jogador;
import modelos.Partida;
import tabuleiro.Tabuleiro;
import tabuleiro.casas.Casa;
import tabuleiro.casas.Imovel;

public class ControladorTabuleiro {

	public void fazerJogadorAndar(int numeroDeCasasAAndar, Jogador jogador) {
		Tabuleiro tabuleiro = Partida.getInstance().getTabuleiro();

		Casa casaAtual = jogador.getCasaAtual();
		Casa novaCasa = tabuleiro.getCasaComSalto(casaAtual, numeroDeCasasAAndar);
		casaAtual.removerJogadorDaCasa(jogador);
		novaCasa.inserirJogadorNaCasa(jogador);
	}

	public int perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel() {
		return new ComponentesGraficos().perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel();
	}

	public void comprarImovel(Imovel imovel, Dono novoDono) throws SaldoInsufucienteException {
			Dono donoImovel = imovel.getDono();
			donoImovel.getConta().depositar(imovel.getValor());
			novoDono.getConta().sacar(imovel.getValor());
			imovel.setDono(novoDono);

			ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
			controladorElementosGraficos.getiPainelDeMensagensDoJogo()
					.mostrarMensagem("VOCE COMPROU UM IMOVEL. SALDO: " + novoDono.getConta().getSaldo());
	}

	public void pagarAluguelDeImovel(Imovel imovel, Jogador jogador, FaceDadosSorteado faceDadosSorteados) {
		try {
			int valorAluguelImovel = imovel.getValorAluguel(faceDadosSorteados.getSomaFaces());
			Dono donoImovel = imovel.getDono();
			donoImovel.getConta().depositar(valorAluguelImovel);
			jogador.getConta().sacar(valorAluguelImovel);

			ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
			controladorElementosGraficos.getiPainelDeMensagensDoJogo()
					.mostrarMensagem("VOCE ALUGOU UM IMOVEL. SALDO: " + jogador.getConta().getSaldo());
		} catch (SaldoInsufucienteException e) {
			new ControladorPartida().removerJogadorDaPartida(jogador);
		}
	}

}
