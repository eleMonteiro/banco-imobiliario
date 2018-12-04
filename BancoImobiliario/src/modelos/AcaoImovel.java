package modelos;

import controladores.ControladorTabuleiro;
import repositorios.RepositorioFacesDoDadoSorteada;

public class AcaoImovel implements Acao {

	private Terreno terreno;
	
	public AcaoImovel() {	
	}

	public AcaoImovel(Terreno terreno) {
		this.terreno = terreno;
	}

	public void iniciarAcao(Jogador jogador) {
		Dono donoTerreno = this.terreno.getDono();
		int escolhaJogador = 0;
		
		if(Banco.getInstance().equals(donoTerreno)) {
			escolhaJogador = ControladorTabuleiro.getInstance().perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel(); 
			
			if( escolhaJogador == 1 ) {
				ControladorTabuleiro.getInstance().comprarImovel(terreno, jogador);
			}else {
				ControladorTabuleiro.getInstance().pagarAluguelDeImovel(terreno, donoTerreno, RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
			}
		}else {
			ControladorTabuleiro.getInstance().pagarAluguelDeImovel(terreno, jogador, RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
		}
	}

	public Terreno getTerreno() {
		return terreno;
	}

	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}

}
