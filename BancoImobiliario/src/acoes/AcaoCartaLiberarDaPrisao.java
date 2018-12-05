package acoes;

import modelos.Jogador;

public class AcaoCartaLiberarDaPrisao implements IAcao {

	@Override
	public void iniciarAcao(Jogador jogador) {
		jogador.setTemCartaLiberarDaPrisao(true);
	}

}
