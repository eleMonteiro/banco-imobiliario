package modelos;

public class Banco extends Dono {

	private static Banco banco = null;
	
	private Banco() {
		super(5000);
	}
	
	public static Banco getInstance() {
		if( banco == null) {
			banco = new Banco();
		}
		
		return banco;
	}
	
}
