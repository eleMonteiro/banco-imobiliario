package igu;

import java.util.ArrayList;
import java.util.List;

import modelos.Casa;

public class CasaTabuleiro {

	private List<Peao> peoes;
	private Coordenada coordenada;
	private Casa casa;

	public CasaTabuleiro(Coordenada coordenada, Casa casa) {
		peoes = new ArrayList<>();
		this.coordenada = coordenada;
		this.casa = casa;
	}

	public List<Peao> getPeoes() {
		return peoes;
	}

	public void adicionarPeao(Peao peao) {
		peoes.add(peao);
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void desenharPeoes() {
		for (Peao peao : peoes) {
			peao.draw();
		}
	}

}
