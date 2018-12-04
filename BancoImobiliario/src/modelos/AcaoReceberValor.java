package modelos;

public class AcaoReceberValor implements Acao {

	private int valor;

	public AcaoReceberValor(int valor) {
		this.valor = valor;
	}

	@Override
	public void iniciarAcao(Jogador jogador) {
		jogador.getConta().depositar(valor);
	}

}
