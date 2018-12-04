package modelos;

public class AcaoImpostoDeRenda implements Acao {

	private CasaEspecialComTaxa casaEspecialComTaxa;

	
	public void iniciarAcao(Jogador jogador) {
		jogador.getConta().sacar(casaEspecialComTaxa.getTaxa());
		Banco.getInstance().getConta().depositar(casaEspecialComTaxa.getTaxa());
	}

}
