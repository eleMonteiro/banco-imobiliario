package acoes;

import controladores.ControladorElementosGraficos;
import modelos.jogador.Jogador;

public class AcaoCasaPrisao implements IAcao {

	@Override
	public void iniciarAcao(Jogador jogador) {
		if (jogador.estaPreso()) {
			ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
			controladorElementosGraficos.getiPainelDeMensagensDoJogo()
					.mostrarMensagem(jogador.getNome() + " ESTA PRESO");
		}
	}

}
