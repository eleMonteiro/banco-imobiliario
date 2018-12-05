package controladores;

import java.util.Collections;
import java.util.List;

import cartasSorteOuReves.CartaSorteOuReves;
import repositorios.RepositorioCartasSorteOuReves;

public class ControladorSorteOuReves {

	public CartaSorteOuReves sortearCartaSorteOuReves() {
		List<CartaSorteOuReves> cartas = RepositorioCartasSorteOuReves.getInstance().getCartasNaoUsadas();
		Collections.shuffle(cartas);
		CartaSorteOuReves cartaSorteada = cartas.get(0);

		return cartaSorteada;
	}
}
