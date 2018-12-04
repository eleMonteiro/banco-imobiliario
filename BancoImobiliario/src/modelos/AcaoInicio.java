package modelos;

public class AcaoInicio implements Acao {

	public void iniciarAcao(Jogador jogador) {
		jogador.getConta().depositar(200);
	}

}
