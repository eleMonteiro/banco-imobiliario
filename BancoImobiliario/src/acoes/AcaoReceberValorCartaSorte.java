package acoes;

import modelos.jogador.Jogador;

public class AcaoReceberValorCartaSorte implements IAcao {

	private int valor;

	public AcaoReceberValorCartaSorte(int valor) {
		this.valor = valor;
	}

	@Override
	public void iniciarAcao(Jogador jogador) {
		jogador.getConta().depositar(valor);
	}

}
