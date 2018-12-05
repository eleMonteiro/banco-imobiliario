package IGU;

import jplay.Sprite;
import jplay.URL;
import modelos.jogador.Jogador;

public class Peao extends Sprite {

	private Jogador jogador;
	private Coordenada coordenada;

	public Peao(String nomeDoArquivoDoPeao, Jogador jogador, Coordenada coordenada) {
		super(URL.sprite(nomeDoArquivoDoPeao));
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
		this.x = coordenada.getX();
		this.y = coordenada.getY();
	}

	public void moverParaCoordenada() {
		this.draw();
		this.moveTo(coordenada.getX(), coordenada.getY(), 0.5);
	}

}
