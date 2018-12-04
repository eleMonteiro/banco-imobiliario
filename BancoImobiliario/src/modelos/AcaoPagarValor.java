package modelos;

public class AcaoPagarValor implements Acao {

	private int valor;

	public AcaoPagarValor(int valor) {
		this.valor = valor;
	}

	@Override
	public void iniciarAcao(Jogador jogador) {
		jogador.getConta().sacar(valor);
	}

}
