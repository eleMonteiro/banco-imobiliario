package modelos;

import cartasSorteOuReves.CartaSorteOuReves;
import controladores.ControladorSorteOuReves;

public class AcaoSorteOuReves implements Acao {

	public AcaoSorteOuReves() {
	}
	
	public void iniciarAcao(Jogador jogador) {
		CartaSorteOuReves carta = ControladorSorteOuReves.getInstance().sortearCartaSorteOuReves();
		
		if( carta.getTaxa() < 0 ) {
			jogador.getConta().sacar(carta.getTaxa());
			Banco.getInstance().getConta().depositar(carta.getTaxa());
		}
		
	}

}
