package acoes;

import cartasSorteOuReves.CartaSorteOuReves;
import controladores.ControladorElementosGraficos;
import controladores.ControladorSorteOuReves;
import modelos.Jogador;

public class AcaoCasaSorteOuReves implements IAcao {

	public void iniciarAcao(Jogador jogador) {
		CartaSorteOuReves cartaSorteada = new ControladorSorteOuReves().sortearCartaSorteOuReves();
		cartaSorteada.getAcao().iniciarAcao(jogador);

		ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
		controladorElementosGraficos.getiPainelDeMensagensDoJogo().mostrarMensagem(cartaSorteada.getDescricao());
	}

}