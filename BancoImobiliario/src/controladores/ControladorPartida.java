package controladores;

import java.util.List;

import modelos.Jogador;
import modelos.Partida;

public class ControladorPartida {

	private Partida partida = null;
	
	public ControladorPartida() {
		
	}
	
	public List<Jogador> criarPartida(int quantidadeJogadores){
		this.partida = Partida.getInstance(quantidadeJogadores);
		return this.partida.listaJogadores();
	}
		
	public Jogador jogadorDaVez() {
		return  this.partida.jogadorDaVez();
	}
	
	
	
}
