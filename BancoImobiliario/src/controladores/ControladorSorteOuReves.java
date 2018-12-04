package controladores;

import java.util.Collections;
import java.util.List;

import cartasSorteOuReves.CartaSorteOuReves;
import repositorios.RepositorioCartasSorteOuReves;

public class ControladorSorteOuReves {

	private static ControladorSorteOuReves controladorSorteOuReves = null;
	
	private ControladorSorteOuReves() {
		
	}
	
	public static ControladorSorteOuReves getInstance() {
		if( controladorSorteOuReves == null ) {
			controladorSorteOuReves = new ControladorSorteOuReves();
		}
		
		return controladorSorteOuReves;
	}
	
	public CartaSorteOuReves sortearCartaSorteOuReves() {
		List<CartaSorteOuReves> cartas = RepositorioCartasSorteOuReves.getInstance().getCartasUsadas();
		Collections.shuffle(cartas);
		CartaSorteOuReves cartaSorteada = cartas.get(0);
    
		return cartaSorteada;
		
	}
}
