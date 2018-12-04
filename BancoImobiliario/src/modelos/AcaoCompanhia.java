package modelos;

import controladores.ControladorTabuleiro;
import repositorios.RepositorioFacesDoDadoSorteada;

public class AcaoCompanhia implements Acao {

	private Companhia companhia;
	private ControladorTabuleiro controladorTabuleiro;
	
	public AcaoCompanhia() {	
	}

	public AcaoCompanhia(Companhia companhia) {
		this.companhia = companhia;
		this.controladorTabuleiro = new ControladorTabuleiro();
	}

	public void iniciarAcao(Jogador jogador) {
		Dono donoTerreno = this.companhia.getDono();
		int escolhaJogador = 0;
		
		if(Banco.getInstance().equals(donoTerreno)) {
			escolhaJogador = this.controladorTabuleiro.perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel(); 
			
			if( escolhaJogador == 1 ) {
				this.controladorTabuleiro.comprarImovel(companhia, jogador);
			}else {
				this.controladorTabuleiro.pagarAluguelDeImovel(companhia, donoTerreno, 
						RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
			}
		}else {
			this.controladorTabuleiro.pagarAluguelDeImovel(companhia, donoTerreno, 
					RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
		}
	}

	public Companhia getCompanhia() {
		return companhia;
	}

	public void setTerreno(Companhia companhia) {
		this.companhia = companhia;
	}
}

