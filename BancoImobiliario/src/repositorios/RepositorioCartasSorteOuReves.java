package repositorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cartasSorteOuReves.CartaSorteOuReves;

public class RepositorioCartasSorteOuReves {

	private static RepositorioCartasSorteOuReves repositorio;
	private List<CartaSorteOuReves> cartasUsadas;
	private List<CartaSorteOuReves> cartasNaoUsadas;
	
	private RepositorioCartasSorteOuReves() {
		this.cartasUsadas = new ArrayList<CartaSorteOuReves>();
		this.cartasNaoUsadas = new ArrayList<CartaSorteOuReves>();
	}
	
	public static RepositorioCartasSorteOuReves getInstance() {
		if( repositorio == null) {
			repositorio = new RepositorioCartasSorteOuReves();
		}
		return repositorio;
	}
	
	public CartaSorteOuReves getCarta(int indice) {
        //Embaralha as cartas
		Collections.shuffle(cartasNaoUsadas);
        CartaSorteOuReves cartaSorteada = cartasNaoUsadas.get(0);
        
        this.cartasUsadas.add(cartaSorteada);
        this.cartasNaoUsadas.remove(cartaSorteada);
        
        return cartaSorteada;
	}

	public List<CartaSorteOuReves> getCartasUsadas() {
		return cartasUsadas;
	}

	public void setCartasUsadas(List<CartaSorteOuReves> cartasUsadas) {
		this.cartasUsadas = cartasUsadas;
	}

	public List<CartaSorteOuReves> getCartasNaoUsadas() {
		return cartasNaoUsadas;
	}

	public void setCartasNaoUsadas(List<CartaSorteOuReves> cartasNaoUsadas) {
		this.cartasNaoUsadas = cartasNaoUsadas;
	}
	
}
