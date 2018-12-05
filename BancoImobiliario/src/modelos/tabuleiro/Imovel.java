package modelos.tabuleiro;

import modelos.jogador.Dono;

public abstract class Imovel extends Casa {

	private int valor;
	private Dono dono;

	public Imovel(Dono dono, int valor) {
		super();
		this.valor = valor;
		this.dono = dono;
	}

	public abstract int getValorAluguel(int multiplicador);

	public int getValor() {
		return valor;
	}

	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
		dono.adicionarImovel(this);
	}

}
