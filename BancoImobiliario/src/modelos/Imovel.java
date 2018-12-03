package modelos;

public abstract class Imovel extends Casa {

	private int valor;
	
	public Imovel(Dono dono, Acao acao, int valor) {
		super(dono, acao);
		this.valor = valor;
	}
	
	public abstract int getValorAluguel(int multiplicador);

	public int getValor() {
		return valor;
	}

}
