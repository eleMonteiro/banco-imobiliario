package tabuleiro.casas;

import dono.Dono;

public class Companhia extends Imovel {

	private int valorAluguel;

	public Companhia(Dono dono, int valor, int valorAluguel) {
		super(dono, valor);
		this.valorAluguel = valorAluguel;
	}

	public int getValorAluguel(int multiplicador) {
		return multiplicador * valorAluguel;
	}

	public int getValorAluguel() {
		return valorAluguel;
	}
}
