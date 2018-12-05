package dono;

import excecoes.SaldoInsufucienteException;

public class Conta {

	private int saldo;

	public Conta(int saldo) {
		this.saldo = saldo;
	}

	public void depositar(int valor) {
		saldo = saldo + valor;
	}

	public void sacar(int valor) throws SaldoInsufucienteException {
		if (valor <= saldo) {
			saldo = saldo - valor;
		} else {
			throw new SaldoInsufucienteException();
		}
	}

	public int getSaldo() {
		return saldo;
	}
}
