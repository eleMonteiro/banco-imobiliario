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

public class ControladorTabuleiro {

	private Tabuleiro tabuleiro;
	private static ControladorTabuleiro controladorTabuleiro = null;
	
	private ControladorTabuleiro() {
		this.tabuleiro = new Tabuleiro();
	}

	public List<Casa> casasTabuleiro() {
		return tabuleiro.getCasasTabuleiro();
	}

	public void fazerJogadorAndar(int numeroDeCasasAAndar, Jogador jogador) {
		Casa casaAtual = jogador.getCasaAtual();
		Casa novaCasa = this.tabuleiro.getCasaComSalto(casaAtual, numeroDeCasasAAndar);
		casaAtual.removerJogadorDaCasa(jogador);
		novaCasa.inserirJogadorNaCasa(jogador);
		jogador.setCasaAtual(novaCasa);
	}

	public int perguntarSeJogadorQuerComprarTerrenoOuPagarAluguel() {
		return 0;
	}

	public void comprarImovel(Imovel imovel, Dono novoDono) {
		if (Banco.getInstance().equals(imovel.getDono())) {
			imovel.setDono(novoDono);
		}
	}

	public void pagarAluguelDeImovel(Imovel imovel, Dono jogador, FaceDadosSorteado faceDadosSorteados) {
		if (!imovel.getDono().equals(jogador)) {
			imovel.getDono().getConta().depositar(imovel.getValorAluguel(faceDadosSorteados.getSomaFaces()));
			jogador.getConta().sacar(imovel.getValorAluguel(faceDadosSorteados.getSomaFaces()));
		}
	}

	public void prenderJogador(Jogador jogador) {

	}
	
	public static ControladorTabuleiro getInstance() {
		if( controladorTabuleiro == null) {
			controladorTabuleiro = new ControladorTabuleiro();
		}
		
		return controladorTabuleiro;
	}
}
