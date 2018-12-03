package modelos;

import java.util.List;

public class Partida {

	private static Partida partida = null;
	private List<Jogador> jogadores;
	private Jogador jogadorDaVez;
	
	private Partida(int quantidadeJogadores) {
		this.adicionarJogadores(quantidadeJogadores);
	}
	
	public static Partida getInstance(int quantidadeJogadores) {
		if( partida == null ) {
			partida = new Partida(quantidadeJogadores);
		}
		
		return partida;
	}
	
	private void adicionarJogadores(int quantidadeJogadores) {
		for(int i = 1; i <= quantidadeJogadores; i++) {
			this.jogadores.add(new Jogador(2458));		
		}
	}
	
	public Jogador jogadorDaVez() {
		int indiceJogador = 0;
		for (Jogador jogador : jogadores) {
			indiceJogador++;
			if(this.jogadorDaVez.equals(jogador)) break;
		}		
		
		this.jogadorDaVez = this.jogadores.get(indiceJogador%this.jogadores.size());
		return jogadorDaVez;
	}
	
	public List<Jogador> listaJogadores(){
		return jogadores;
	}
}
