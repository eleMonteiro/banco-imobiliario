package acoes;

import controladores.ControladorPartida;
import excecoes.SaldoInsufucienteException;
import modelos.banco.Banco;
import modelos.jogador.Jogador;
import modelos.tabuleiro.CasaEspecialComTaxa;

public class AcaoCasaImpostoDeRenda implements IAcao {

	private CasaEspecialComTaxa casaEspecialComTaxa;

	public AcaoCasaImpostoDeRenda(CasaEspecialComTaxa casaEspecialComTaxa) {
		this.casaEspecialComTaxa = casaEspecialComTaxa;
	}

	public void iniciarAcao(Jogador jogador) {
		try {
			jogador.getConta().sacar(casaEspecialComTaxa.getTaxa());
			Banco.getInstance().getConta().depositar(casaEspecialComTaxa.getTaxa());
		} catch (SaldoInsufucienteException e) {
			new ControladorPartida().removerJogadorDaPartida(jogador);
		}
	}

}
