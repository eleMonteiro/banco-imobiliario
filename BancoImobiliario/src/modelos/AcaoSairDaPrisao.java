package modelos;

public class AcaoSairDaPrisao implements Acao {

	@Override
	public void iniciarAcao(Jogador jogador) {
		jogador.setEstaPreso(false);
	}

}
