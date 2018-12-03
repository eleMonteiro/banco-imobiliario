package modelos;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

	private static Tabuleiro tabuleiro = null;
	private CasaEspecial prisao;
	private List<Casa> casasTabuleiro;
	
	private Tabuleiro() {
		this.casasTabuleiro = new ArrayList<>();
	}
	
	public static Tabuleiro getInstance() {
		if( tabuleiro == null) {
			tabuleiro = new Tabuleiro();
		}
		
		return tabuleiro;
	}
	
	public List<Casa> getCasasTabuleiro() {
		return casasTabuleiro;
	}
	
	public Casa getCasaComSalto(Casa casaAtual, int numeroDeCasasASaltar) {
		int indiceCasa = 0;
		
		for (Casa casa : casasTabuleiro) {
			indiceCasa++;
			if( casa.equals(casaAtual) ) break;
		}
		
		return this.casasTabuleiro.get(((indiceCasa + numeroDeCasasASaltar ) % 40));
	}
	
	public void fazerJogadorAndar(int numeroDeCasasAAndar, Jogador jogador) {
		Casa casaNova = this.casasTabuleiro.get(numeroDeCasasAAndar);
		Casa casaAtual = jogador.getCasaAtual();
		
		casaAtual.removerJogadorDaCasa(jogador);
		casaNova.inserirJogadorNaCasa(jogador);
	}

	public CasaEspecial getPrisao() {
		return prisao;
	}

	public void setPrisao(CasaEspecial prisao) {
		this.prisao = prisao;
	}
		
}
