package repositorios;

import java.util.ArrayList;
import java.util.List;

import cartasSorteOuReves.CartaSorteOuReves;

public class RepositorioCartasSorteOuReves {

	private static RepositorioCartasSorteOuReves repositorio = null;
	private List<CartaSorteOuReves> cartasUsadas;
	private List<CartaSorteOuReves> cartasNaoUsadas;
	
	private RepositorioCartasSorteOuReves() {
		this.cartasUsadas = new ArrayList<CartaSorteOuReves>();
		this.cartasNaoUsadas = new ArrayList<CartaSorteOuReves>();
		this.adicionarCartasSorteOuReves();
	}
	
	public static RepositorioCartasSorteOuReves getInstance() {
		if( repositorio == null) {
			repositorio = new RepositorioCartasSorteOuReves();
		}
		return repositorio;
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
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "A prefeitura mandou abrir uma nova avenida, "
				+ "para o que desapropriou vários prédios. EM consequência seu terreno valorizou.", 25));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves","Papai os livros do ano passado não servem mais preciso de livros novos.", 40));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Seus filhos já vão para a escola. Pague a primeira mensalidade.", 50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Huve um assalto á sua loja, mas você estava segurado.", 150));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Seu clube está ampliando as piscinas. Os sócios devem contribuir.", 25));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Você acaba de receber a comunicação do Imposto de Renda.", 50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Você foi promovido a diretor da sua empresa.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Você é papai outra vez! Despesas de maternidade.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Parabéns! Você convidou seus amigos para festejar o aniversário.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Um amigo tinha lhe pedido um empréstimo e se esqqueceu de devolver. Ele acaba de se lembrar.", 50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Você saiu de férias e se hospedou na casa de um amigo. Você economizou o hotel.", 45));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Você vai casar e está comprando um apartamento novo.", 25));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Você estacionou seu carro em um lugar proibido e entrou na contra mão", 30));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "O médico lhe recomendou repouso num bom hotel de montanha.", 45));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "A geada prejudicou a sua safra de café.", 50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Avance até o ponto de partida e...", 200));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Você trocou seu carro usado com um amigo e ainda saiu lucrando.", 50 ));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "O seu cachorro policial tirou o 1º prêmio na exposição do Kennel Club.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Seus parentes do interior vieram passar umas 'férias' na sua casa.", 45));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte","Você jogou na Loteria Esportiva com um grupo de amigos. Ganharam!", 20));
//		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Vá para a prisão sem receber nada. (Talvez eu lhe faça uma visita...)", 0));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Um amigo pediu-lhe um empréstimo. Você não pode recusar.", 15));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Inesperadamente você recebeu uma herança que já estava esquecida.", 100));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Você apostou com os parceiros deste jogo e ganhou.", 50));
//		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Saida livre da prisão. (Conserve este cartão para quando lhe for preciso ou negocie-o em qualquer ocasião, por preço a combinar).", 1));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Você está com sorte. Suas ações na Bolsa de Valores estão em alta.", 200));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("reves", "Renove a tempo a licença do seu automóvel.", 30));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Você acaba de receber uma parcela do seu 13º salário.", 50));
		this.cartasNaoUsadas.add(new CartaSorteOuReves("sorte", "Você tirou o primeiro lugar no Torneio de Tênis do seu clube. Parabéns!", 100));
	}
}
