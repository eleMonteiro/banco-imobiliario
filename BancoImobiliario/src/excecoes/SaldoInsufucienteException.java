package excecoes;

public class SaldoInsufucienteException extends Exception {

	private static final long serialVersionUID = -5281685757612774946L;

	public SaldoInsufucienteException() {
		super("VOCE NAO TEM SALDO SUFICIENTE PARA ESTA OPERACAO");
	}

}
