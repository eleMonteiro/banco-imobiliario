package igu;

import java.util.ArrayList;
import java.util.List;

import modelos.Casa;

public class CasaTabuleiro {

	private Casa casa;
	private Coordenada coordenada;
	private List<Peao> peoes;

	public CasaTabuleiro(Casa casa, Coordenada coordenada) {
		this.setCasa(casa);
		this.setCoordenada(coordenada);
		this.setPeoes(new ArrayList<>());
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

	public List<Peao> getPeoes() {
		return peoes;
	}

	public void setPeoes(List<Peao> peoes) {
		this.peoes = peoes;
	}

	public void adicionarPeao(Peao peao) {
		peoes.add(peao);
	}

	public void desenharPeoes() {
		for (Peao peao : peoes) {
			peao.draw();
		}
	}

}
