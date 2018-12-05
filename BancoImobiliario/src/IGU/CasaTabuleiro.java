package IGU;

import modelos.tabuleiro.Casa;

public class CasaTabuleiro {

	private Casa casa;
	private Coordenada coordenada;

	public CasaTabuleiro(Casa casa, Coordenada coordenada) {
		this.setCasa(casa);
		this.setCoordenada(coordenada);
	}

	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

}
