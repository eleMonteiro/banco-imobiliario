package modelos;

import controladores.ControladorTabuleiro;
import repositorios.RepositorioFacesDoDadoSorteada;

public class AcaoTerreno implements Acao {

	private Terreno terreno;

	public AcaoTerreno(Terreno terreno) {
		this.terreno = terreno;
	}

	public void iniciarAcao(Jogador jogador) {
		Dono donoTerreno = terreno.getDono();
		int escolhaJogador = 0;

		if (Banco.getInstance().equals(donoTerreno)) {
			escolhaJogador = new ControladorTabuleiro().perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel();

			if (escolhaJogador == 1) {
				new ControladorTabuleiro().comprarImovel(terreno, jogador);
			} else {
				new ControladorTabuleiro().pagarAluguelDeImovel(terreno, donoTerreno,
						RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
			}
		} else {
			new ControladorTabuleiro().pagarAluguelDeImovel(terreno, donoTerreno,
					RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
		}
	}

	public Terreno getTerreno() {
		return terreno;
	}

	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}

}
