package acoes;

import modelos.Jogador;

public class AcaoReceberValor implements IAcao {

	private int valor;

	public AcaoReceberValor(int valor) {
		this.valor = valor;
	}

	@Override
	public void iniciarAcao(Jogador jogador) {
		jogador.getConta().depositar(valor);
	}

}
