package acoes;

import controladores.ControladorElementosGraficos;
import modelos.jogador.Jogador;

public class AcaoCasaParadaLivre implements IAcao {

	public void iniciarAcao(Jogador jogador) {
		ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
		controladorElementosGraficos.getiPainelDeMensagensDoJogo()
				.mostrarMensagem("PARADA LIVRE. DESCANCE!");
	}

}
