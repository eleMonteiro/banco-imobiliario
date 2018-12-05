package acoes;

import controladores.ControladorElementosGraficos;
import excecoes.SaldoInsufucienteException;
import modelos.Banco;
import modelos.Jogador;
import tabuleiro.casas.CasaEspecialComTaxa;

public class AcaoCasaLucrosEDividendos implements IAcao {

	private CasaEspecialComTaxa casaEspecialComTaxa;

	public AcaoCasaLucrosEDividendos() {
	}

	public AcaoCasaLucrosEDividendos(CasaEspecialComTaxa casaEspecialComTaxa) {
		this.casaEspecialComTaxa = casaEspecialComTaxa;
	}

	public void iniciarAcao(Jogador jogador) {
		try {
			Banco.getInstance().getConta().sacar(casaEspecialComTaxa.getTaxa());
			jogador.getConta().depositar(casaEspecialComTaxa.getTaxa());
		} catch (SaldoInsufucienteException e) {
			ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
			controladorElementosGraficos.getiPainelDeMensagensDoJogo()
					.mostrarMensagem("BANCO NAO TEM SALDO SUFICIENTE");
		}
	}
}
