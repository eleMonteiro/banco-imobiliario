package modelos;

public class Companhia extends Imovel {

	private int valorAluguel;

	public Companhia(Dono dono, Acao acao, int valor, int valorAluguel) {
		super(dono, acao, valor);
		this.valorAluguel = valorAluguel;
	}

	
	public int getValorAluguel(int multiplicador) {
		return multiplicador * valorAluguel;
	}

	public int getValorAluguel() {
		return valorAluguel;
	}
}
