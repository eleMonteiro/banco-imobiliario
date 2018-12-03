package modelos;

public abstract class Dono {
	
	private Conta conta = null;
	
	public Dono(int saldo) {
		this.conta = new Conta(saldo);
	}
	
	public Conta getConta() {
		return conta;
	}

}
