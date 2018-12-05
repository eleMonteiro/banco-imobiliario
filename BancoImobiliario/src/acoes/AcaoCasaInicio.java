package acoes;

import controladores.ControladorElementosGraficos;
import modelos.jogador.Jogador;

public class AcaoCasaInicio implements IAcao {

	public void iniciarAcao(Jogador jogador) {
		jogador.getConta().depositar(200);

		ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
		controladorElementosGraficos.getiPainelDeMensagensDoJogo()
				.mostrarMensagem("VOCE PASSOU PELA PARTIDA");
	}

}
