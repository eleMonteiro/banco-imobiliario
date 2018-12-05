package modelos.banco;

import modelos.jogador.Dono;

public class Banco extends Dono {

	private static Banco banco = null;

	private Banco() {
		super(15000);
	}

	public static Banco getInstance() {
		if (banco == null) {
			banco = new Banco();
		}

		return banco;
	}

}
