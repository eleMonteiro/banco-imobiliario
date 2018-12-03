package controladores;

import java.util.List;

import cartasSorteOuReves.CartaSorteOuReves;
import modelos.Casa;
import modelos.Dono;
import modelos.Imovel;
import modelos.Jogador;
import modelos.Tabuleiro;

public class ControladorTabuleiro {

	private Tabuleiro tabuleiro;
	
	public ControladorTabuleiro() {
		this.tabuleiro = Tabuleiro.getInstance();
	}
		
	public void novaJogada() {
	
	}
	
	public List<Casa> casasTabuleiro(){
		return tabuleiro.getCasasTabuleiro();
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
