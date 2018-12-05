package acoes;

import modelos.jogador.Jogador;

public class AcaoCartaLiberarDaPrisao implements IAcao {

	@Override
	public void iniciarAcao(Jogador jogador) {
		jogador.setTemCartaLiberarDaPrisao(true);
	}

}
