package modelos;

public class Conta {

	private int saldo;
	
	public Conta(int saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(int valor) {
		this.saldo += valor;
	}
	
	public void sacar(int valor) {
		if(valor <= this.saldo ) this.saldo -= valor;
	}
	
	public int getSaldo() {
		return saldo;
	}
}
