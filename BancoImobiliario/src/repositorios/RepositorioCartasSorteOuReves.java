package repositorios;

import java.util.ArrayList;
import java.util.List;

import cartasSorteOuReves.CartaSorteOuReves;
import modelos.AcaoAvancarAtePontoDePartida;
import modelos.AcaoPagarValor;
import modelos.AcaoReceberValor;
import modelos.AcaoVaParaAPrisao;

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
		if (repositorio == null) {
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
		CartaSorteOuReves carta01 = new CartaSorteOuReves("Sorte", "A prefeitura mandou abrir uma nova avenida, "
				+ "para o que desapropriou varios predios. EM consequencia seu terreno valorizou.");
		carta01.setAcao(new AcaoReceberValor(25));

		CartaSorteOuReves carta02 = new CartaSorteOuReves("Reves",
				"Papai os livros do ano passado nao servem mais preciso de livros novos.");
		carta02.setAcao(new AcaoPagarValor(40));

		CartaSorteOuReves carta03 = new CartaSorteOuReves("Reves",
				"Seus filhos ja vao para a escola. Pague a primeira mensalidade.");
		carta03.setAcao(new AcaoPagarValor(50));

		CartaSorteOuReves carta04 = new CartaSorteOuReves("Sorte",
				"Houve um assalto a sua loja, mas voce estava segurado.");
		carta04.setAcao(new AcaoReceberValor(150));

		CartaSorteOuReves carta05 = new CartaSorteOuReves("Reves",
				"Seu clube esta ampliando as piscinas. Os socios devem contribuir.");
		carta05.setAcao(new AcaoPagarValor(25));

		CartaSorteOuReves carta06 = new CartaSorteOuReves("Reves",
				"Voce acaba de receber a comunicacao do Imposto de Renda.");
		carta06.setAcao(new AcaoPagarValor(50));

		CartaSorteOuReves carta07 = new CartaSorteOuReves("Sorte", "Voce foi promovido a diretor da sua empresa.");
		carta07.setAcao(new AcaoReceberValor(100));

		CartaSorteOuReves carta08 = new CartaSorteOuReves("Reves", "Voce e papai outra vez! Despesas de maternidade.");
		carta08.setAcao(new AcaoPagarValor(100));

		CartaSorteOuReves carta09 = new CartaSorteOuReves("Reves",
				"Parabens! Voce convidou seus amigos para festejar o aniversario.");
		carta09.setAcao(new AcaoPagarValor(100));

		CartaSorteOuReves carta10 = new CartaSorteOuReves("Sorte",
				"Um amigo tinha lhe pedido um emprestimo e se esqqueceu de devolver. Ele acaba de se lembrar.");
		carta10.setAcao(new AcaoReceberValor(50));

		CartaSorteOuReves carta11 = new CartaSorteOuReves("Sorte",
				"Um amigo tinha lhe pedido um emprestimo e se esqqueceu de devolver. Ele acaba de se lembrar.");
		carta11.setAcao(new AcaoReceberValor(50));

		CartaSorteOuReves carta12 = new CartaSorteOuReves("Sorte",
				"Voce saiu de ferias e se hospedou na casa de um amigo. Voce economizou o hotel.");
		carta12.setAcao(new AcaoReceberValor(45));

		CartaSorteOuReves carta13 = new CartaSorteOuReves("Reves",
				"Voce vai casar e esta comprando um apartamento novo.");
		carta13.setAcao(new AcaoPagarValor(25));

		CartaSorteOuReves carta14 = new CartaSorteOuReves("Reves",
				"Voce estacionou seu carro em um lugar proibido e entrou na contra mao");
		carta14.setAcao(new AcaoPagarValor(30));

		CartaSorteOuReves carta15 = new CartaSorteOuReves("Reves",
				"O medico lhe recomendou repouso num bom hotel de montanha.");
		carta15.setAcao(new AcaoPagarValor(45));

		CartaSorteOuReves carta16 = new CartaSorteOuReves("Reves", "A geada prejudicou a sua safra de cafe.");
		carta16.setAcao(new AcaoPagarValor(50));

		CartaSorteOuReves carta17 = new CartaSorteOuReves("Sorte", "Avance ate o ponto de partida e...");
		carta17.setAcao(new AcaoAvancarAtePontoDePartida());

		CartaSorteOuReves carta18 = new CartaSorteOuReves("Sorte",
				"Voce trocou seu carro usado com um amigo e ainda saiu lucrando.");
		carta18.setAcao(new AcaoReceberValor(50));

		CartaSorteOuReves carta19 = new CartaSorteOuReves("Sorte",
				"O seu cachorro policial tirou o primeiro premio na exposicao do Kennel Club.");
		carta19.setAcao(new AcaoReceberValor(100));

		CartaSorteOuReves carta20 = new CartaSorteOuReves("Reves",
				"Seus parentes do interior vieram passar umas 'ferias' na sua casa.");
		carta20.setAcao(new AcaoPagarValor(45));

		CartaSorteOuReves carta21 = new CartaSorteOuReves("Sorte",
				"Voce jogou na Loteria Esportiva com um grupo de amigos. Ganharam!");
		carta21.setAcao(new AcaoReceberValor(20));

		CartaSorteOuReves carta22 = new CartaSorteOuReves("Reves",
				"Va para a prisao sem receber nada. (Talvez eu lhe faca uma visita...)");
		carta22.setAcao(new AcaoVaParaAPrisao());

		CartaSorteOuReves carta23 = new CartaSorteOuReves("Reves",
				"Um amigo pediu-lhe um emprestimo. Voce nao pode recusar.");
		carta23.setAcao(new AcaoPagarValor(15));

		CartaSorteOuReves carta24 = new CartaSorteOuReves("Sorte",
				"Inesperadamente voce recebeu uma heranca que ja estava esquecida.");
		carta24.setAcao(new AcaoReceberValor(100));

		CartaSorteOuReves carta25 = new CartaSorteOuReves("Sorte",
				"Voce apostou com os parceiros deste jogo e ganhou.");
		carta25.setAcao(new AcaoReceberValor(50));

		CartaSorteOuReves carta26 = new CartaSorteOuReves("Sorte",
				"Saida livre da prisao. (Conserve este cartao para quando lhe for preciso ou negocie-o em qualquer ocasiao, por preco a combinar).");
		carta26.setAcao(null);

		CartaSorteOuReves carta27 = new CartaSorteOuReves("Sorte",
				"Voce este com Sorte. Suas acoes na Bolsa de Valores estao em alta.");
		carta27.setAcao(new AcaoReceberValor(200));

		CartaSorteOuReves carta28 = new CartaSorteOuReves("Reves", "Renove a tempo a licenca do seu automovel.");
		carta28.setAcao(new AcaoPagarValor(30));

		CartaSorteOuReves carta29 = new CartaSorteOuReves("Sorte",
				"Voce acaba de receber uma parcela do seu 13 salario.");
		carta29.setAcao(new AcaoReceberValor(50));

		CartaSorteOuReves carta30 = new CartaSorteOuReves("Sorte",
				"Voce tirou o primeiro lugar no Torneio de Tenis do seu clube. Parabens!");
		carta30.setAcao(new AcaoReceberValor(100));

		cartasNaoUsadas.add(carta30);
		cartasNaoUsadas.add(carta29);
		cartasNaoUsadas.add(carta28);
		cartasNaoUsadas.add(carta27);
		cartasNaoUsadas.add(carta26);
		cartasNaoUsadas.add(carta25);
		cartasNaoUsadas.add(carta24);
		cartasNaoUsadas.add(carta23);
		cartasNaoUsadas.add(carta22);
		cartasNaoUsadas.add(carta21);
		cartasNaoUsadas.add(carta20);
		cartasNaoUsadas.add(carta19);
		cartasNaoUsadas.add(carta18);
		cartasNaoUsadas.add(carta17);
		cartasNaoUsadas.add(carta16);
		cartasNaoUsadas.add(carta15);
		cartasNaoUsadas.add(carta14);
		cartasNaoUsadas.add(carta13);
		cartasNaoUsadas.add(carta12);
		cartasNaoUsadas.add(carta11);
		cartasNaoUsadas.add(carta10);
		cartasNaoUsadas.add(carta09);
		cartasNaoUsadas.add(carta08);
		cartasNaoUsadas.add(carta07);
		cartasNaoUsadas.add(carta06);
		cartasNaoUsadas.add(carta05);
		cartasNaoUsadas.add(carta04);
		cartasNaoUsadas.add(carta03);
		cartasNaoUsadas.add(carta02);
		cartasNaoUsadas.add(carta01);
	}
}
