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

<<<<<<< HEAD
	public CartaSorteOuReves sortearCartaSorteOuRev�s() {
=======
	public CartaSorteOuReves sortearCartaSorteOuReves() {
>>>>>>> 4ce32be41296adec3599f74bed95ed25f74e00fd
		return null;
	}

	public int perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel() {
		return 0;
	}

<<<<<<< HEAD
	public void comprarIm�vel(Imovel im�vel, Dono novoDono) {

	}

	public void pagarAluguelDeImovel(Imovel im�vel, Jogador jogador) {
=======
	public void comprarImovel(Imovel imovel, Dono novoDono) {

	}

	public void pagarAluguelDeImovel(Imovel imovel, Jogador jogador) {
>>>>>>> 4ce32be41296adec3599f74bed95ed25f74e00fd

	}

	public void prenderJogador(Jogador jogador) {

	}
}
