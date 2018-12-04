package modelos;

public class AcaoLucrosEDividendos implements Acao {

	private CasaEspecialComTaxa casaEspecialComTaxa;

	public AcaoLucrosEDividendos() {
	}
	
	public AcaoLucrosEDividendos(CasaEspecialComTaxa casaEspecialComTaxa) {
		this.casaEspecialComTaxa = casaEspecialComTaxa;
	}
	
	public void iniciarAcao(Jogador jogador) {
		Banco.getInstance().getConta().sacar(casaEspecialComTaxa.getTaxa());
		jogador.getConta().depositar(casaEspecialComTaxa.getTaxa());
	}
}
