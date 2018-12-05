package controladores;

import acoes.AcaoCasaInicio;
import excecoes.SaldoInsufucienteException;
import modelos.Partida;
import modelos.dado.FaceDadosSorteado;
import modelos.jogador.Dono;
import modelos.jogador.Jogador;
import modelos.tabuleiro.Casa;
import modelos.tabuleiro.Imovel;
import modelos.tabuleiro.Tabuleiro;

public class ControladorTabuleiro {

	public void fazerJogadorAndar(int numeroDeCasasAAndar, Jogador jogador) {
		Tabuleiro tabuleiro = Partida.getInstance().getTabuleiro();

		Casa casaAtual = jogador.getCasaAtual();
		Casa novaCasa = tabuleiro.getCasaComSalto(casaAtual, numeroDeCasasAAndar);
		casaAtual.removerJogadorDaCasa(jogador);
		novaCasa.inserirJogadorNaCasa(jogador);
		
		
		if( tabuleiro.getIndiceCasaComSalto(casaAtual, numeroDeCasasAAndar) > 39 )
			new AcaoCasaInicio().iniciarAcao(jogador);
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

	public void pagarAluguel(Imovel imovel, Jogador jogador, FaceDadosSorteado faceDadosSorteados) {
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
