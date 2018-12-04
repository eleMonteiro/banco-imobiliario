package igu;

import jplay.Sprite;
import modelos.Jogador;

public class Peao extends Sprite {

	private Jogador jogador;
	private Coordenada coordenada;

	public Peao(String nomeDoArquivoDoPeao, Jogador jogador, Coordenada coordenada) {
		super(nomeDoArquivoDoPeao);
		this.setJogador(jogador);
		this.setCoordenada(coordenada);
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public void moverParaCoordenada() {
		moveTo(coordenada.getX(), coordenada.getY(), 0.5);
	}

}
