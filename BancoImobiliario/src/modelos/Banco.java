package modelos;

public class Banco {

	private static Banco banco = null;
	private int quantidadeDinheiro;
	
	private Banco() {
		this.quantidadeDinheiro = 5000;
	}
	
	public static Banco getInstance() {
		if( banco == null) {
			banco = new Banco();
		}
		
		return banco;
	}
	
}
