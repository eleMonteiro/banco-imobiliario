package modelos;

import controladores.ControladorTabuleiro;
import repositorios.RepositorioFacesDoDadoSorteada;

public class AcaoTerreno implements Acao {

	private Terreno terreno;
	private ControladorTabuleiro controladorTabuleiro;
	
	public AcaoTerreno() {	
	}

	public AcaoTerreno(Terreno terreno) {
		this.terreno = terreno;
		this.controladorTabuleiro = new ControladorTabuleiro();
	}

	public void iniciarAcao(Jogador jogador) {
		Dono donoTerreno = this.terreno.getDono();
		int escolhaJogador = 0;
		
		if(Banco.getInstance().equals(donoTerreno)) {
			escolhaJogador = this.controladorTabuleiro.perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel(); 
			
			if( escolhaJogador == 1 ) {
				this.controladorTabuleiro.comprarImovel(terreno, jogador);
			}else {
				this.controladorTabuleiro.pagarAluguelDeImovel(terreno, donoTerreno, 
						RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
			}
		}else {
			this.controladorTabuleiro.pagarAluguelDeImovel(terreno, donoTerreno, 
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
