package repositorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cartasSorteOuReves.CartaSorteOuReves;

public class RepositorioCartasSorteOuReves {

	private static RepositorioCartasSorteOuReves repositorio = null;
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
	
	private void adicionarCartasSorteOuReves() {
		this.cartasNaoUsadas.add(new CartaSorteOuReves("A prefeitura mandou abrir uma nova avenida, para o que desapropriou v�rios pr�dios. EM consequ�ncia seu terreno valorizou.", 25));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Papai os livros do ano passado n�o servem mais preciso de livros novos.", -40));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Seus filhos j� v�o para a escola. Pague a primeira mensalidade.", -50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Huve um assalto � sua loja, mas voc� estava segurado.", 150));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Seu clube est� ampliando as piscinas. Os s�cios devem contribuir.", -25));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� acaba de receber a comunica��o do Imposto de Renda.", -50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� foi promovido a diretor da sua empresa.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� � papai outra vez! Despesas de maternidade.", -100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Parab�ns! Voc� convidou seus amigos para festejar o anivers�rio.", -100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Um amigo tinha lhe pedido um empr�stimo e se esqqueceu de devolver. Ele acaba de se lembrar.", 50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� saiu de f�rias e se hospedou na casa de um amigo. Voc� economizou o hotel.", 45 ));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� vai casar e est� comprando um apartamento novo.", -25));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� estacionou seu carro em um lugar proibido e entrou na contra m�o", -30));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("O m�dico lhe recomendou repouso num bom hotel de montanha.", -45));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("A geada prejudicou a sua safra de caf�.", -50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Avance at� o ponto de partida e...", 200));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� trocou seu carro usado com um amigo e ainda saiu lucrando.", 50 ));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("O seu cachorro policial tirou o 1� pr�mio na exposi��o do Kennel Club.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Seus parentes do interior vieram passar umas 'f�rias' na sua casa.", -45));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� jogou na Loteria Esportiva com um grupo de amigos. Ganharam!", 20));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("V� para a pris�o sem receber nada. (Talvez eu lhe fa�a uma visita...)", 0));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Um amigo pediu-lhe um empr�stimo. Voc� n�o pode recusar.", -15));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Inesperadamente voc� recebeu uma heran�a que j� estava esquecida.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� apostou com os parceiros deste jogo e ganhou.", 50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Saida livre da pris�o. (Conserve este cart�o para quando lhe for preciso ou negocie-o em qualquer ocasi�o, por pre�o a combinar).", 1));
//		this.cartasNaoUsadas.add(new CartaSorteOuReves("Voc� est", ));
		
		
		
	}
}
