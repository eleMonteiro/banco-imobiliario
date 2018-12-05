package acoes;

import controladores.ControladorElementosGraficos;
import excecoes.SaldoInsufucienteException;
import modelos.banco.Banco;
import modelos.jogador.Jogador;
import modelos.tabuleiro.CasaEspecial;

public class AcaoCasaLucrosEDividendos implements IAcao {

	private CasaEspecial casaEspecialComTaxa;

	public AcaoCasaLucrosEDividendos() {
	}

	public AcaoCasaLucrosEDividendos(CasaEspecial casaEspecialComTaxa) {
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
