package modelos;

import cartasSorteOuReves.CartaSorteOuReves;
import controladores.ControladorSorteOuReves;

public class AcaoCasaSorteOuReves implements Acao {

	public void iniciarAcao(Jogador jogador) {
		CartaSorteOuReves cartaSorteada = new ControladorSorteOuReves().sortearCartaSorteOuReves();
		cartaSorteada.getAcao().iniciarAcao(jogador);
	}

}