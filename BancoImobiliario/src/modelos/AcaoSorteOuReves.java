package modelos;

import cartasSorteOuReves.CartaSorteOuReves;
import controladores.ControladorSorteOuReves;

public class AcaoSorteOuReves implements Acao {
	
	public void iniciarAcao(Jogador jogador) {
		CartaSorteOuReves cartaSorteada = new ControladorSorteOuReves().sortearCartaSorteOuReves();
		
		if(cartaSorteada.equals("sorte")) {
			//Acao realizada para a carta de sorte
		}else{
			//Acao realizada para a carta de reves
		}
	
	
	}

}
