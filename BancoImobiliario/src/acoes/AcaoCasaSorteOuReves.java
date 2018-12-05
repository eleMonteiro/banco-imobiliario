package acoes;

import controladores.ControladorElementosGraficos;
import controladores.ControladorSorteOuReves;
import modelos.cartas.CartaSorteOuReves;
import modelos.jogador.Jogador;

public class AcaoCasaSorteOuReves implements IAcao {

	public void iniciarAcao(Jogador jogador) {
		CartaSorteOuReves cartaSorteada = new ControladorSorteOuReves().sortearCarta();
		cartaSorteada.getAcao().iniciarAcao(jogador);

		ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
		controladorElementosGraficos.getiPainelDeMensagensDoJogo().mostrarMensagem(cartaSorteada.getDescricao());
	}

}