package controladores;

import cartasSorteOuReves.CartaSorteOuReves;
import modelos.Dono;
import modelos.Imovel;
import modelos.Jogador;
import modelos.Tabuleiro;

public class ControladorTabuleiro {

	private Tabuleiro tabulerio;
	
	public ControladorTabuleiro() {
		this.tabulerio = Tabuleiro.getInstance();
	}
		
	public void novaJogada() {
	}

	public void fazerJogadorAndar(int numeroDeCasas, Jogador jogador) {

	}

	public CartaSorteOuReves sortearCartaSorteOuReves() {
		return null;
	}

	public int perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel() {
		return 0;
	}

	public void comprarImovel(Imovel imovel, Dono novoDono) {

	}

	public void pagarAluguelDeImovel(Imovel imovel, Jogador jogador) {

	}

	public void prenderJogador(Jogador jogador) {

	}
}
