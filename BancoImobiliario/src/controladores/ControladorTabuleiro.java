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

	public CartaSorteOuReves sortearCartaSorteOuRevés() {
		return null;
	}

	public int perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel() {
		return 0;
	}

	public void comprarImóvel(Imovel imóvel, Dono novoDono) {

	}

	public void pagarAluguelDeImovel(Imovel imóvel, Jogador jogador) {

	}

	public void prenderJogador(Jogador jogador) {

	}
}
