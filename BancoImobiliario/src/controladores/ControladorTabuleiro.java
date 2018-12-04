package controladores;

import java.util.List;

import cartasSorteOuReves.CartaSorteOuReves;
import modelos.Banco;
import modelos.Casa;
import modelos.Dono;
import modelos.FaceDadosSorteado;
import modelos.Imovel;
import modelos.Jogador;
import modelos.Tabuleiro;
import modelos.Terreno;

public class ControladorTabuleiro {

	private Tabuleiro tabuleiro;

	public ControladorTabuleiro() {
		this.tabuleiro = Tabuleiro.getInstance();
	}

	public void novaJogada() {

	}

	public List<Casa> casasTabuleiro() {
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
		if( Banco.getInstance().equals(imovel.getDono())) {
			imovel.setDono(novoDono);
		}
	}

	public void pagarAluguelDeImovel(Imovel imovel, Jogador jogador, FaceDadosSorteado faceDadosSorteados) {
		if(!imovel.getDono().equals(jogador)) {
			imovel.getDono().getConta().depositar(imovel.getValorAluguel(faceDadosSorteados.getSomaFaces()));
			jogador.getConta().sacar(imovel.getValorAluguel(faceDadosSorteados.getSomaFaces()));
		}
	}

	public void prenderJogador(Jogador jogador) {

	}
}
