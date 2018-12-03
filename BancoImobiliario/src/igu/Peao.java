package igu;

import jplay.Sprite;
import modelos.Jogador;

public class Peao extends Sprite {

	private Jogador jogador;
	private Coordenada coordenada;

	public Peao(String nomeDoArquivo, Jogador jogador, Coordenada coordenada) {
		super(nomeDoArquivo);
		this.jogador = jogador;
		this.setCoordenada(coordenada);
	}

	public Jogador getJogador() {
		return jogador;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
		moveTo(coordenada.getX(), coordenada.getY(), 0.5);
	}

}
