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
		this.cartasNaoUsadas.add(new CartaSorteOuReves("A prefeitura mandou abrir uma nova avenida, para o que desapropriou vários prédios. EM consequência seu terreno valorizou.", 25));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Papai os livros do ano passado não servem mais preciso de livros novos.", -40));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Seus filhos já vão para a escola. Pague a primeira mensalidade.", -50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Huve um assalto á sua loja, mas você estava segurado.", 150));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Seu clube está ampliando as piscinas. Os sócios devem contribuir.", -25));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Você acaba de receber a comunicação do Imposto de Renda.", -50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Você foi promovido a diretor da sua empresa.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Você é papai outra vez! Despesas de maternidade.", -100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Parabéns! Você convidou seus amigos para festejar o aniversário.", -100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Um amigo tinha lhe pedido um empréstimo e se esqqueceu de devolver. Ele acaba de se lembrar.", 50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Você saiu de férias e se hospedou na casa de um amigo. Você economizou o hotel.", 45 ));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Você vai casar e está comprando um apartamento novo.", -25));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Você estacionou seu carro em um lugar proibido e entrou na contra mão", -30));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("O médico lhe recomendou repouso num bom hotel de montanha.", -45));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("A geada prejudicou a sua safra de café.", -50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Avance até o ponto de partida e...", 200));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Você trocou seu carro usado com um amigo e ainda saiu lucrando.", 50 ));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("O seu cachorro policial tirou o 1º prêmio na exposição do Kennel Club.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Seus parentes do interior vieram passar umas 'férias' na sua casa.", -45));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Você jogou na Loteria Esportiva com um grupo de amigos. Ganharam!", 20));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Vá para a prisão sem receber nada. (Talvez eu lhe faça uma visita...)", 0));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Um amigo pediu-lhe um empréstimo. Você não pode recusar.", -15));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Inesperadamente você recebeu uma herança que já estava esquecida.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Você apostou com os parceiros deste jogo e ganhou.", 50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("Saida livre da prisão. (Conserve este cartão para quando lhe for preciso ou negocie-o em qualquer ocasião, por preço a combinar).", 1));
//		this.cartasNaoUsadas.add(new CartaSorteOuReves("VocÊ est", ));
		
		
		
	}
}
