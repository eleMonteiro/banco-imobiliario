package modelos;

public class FaceDadosSorteado {

	private int faceDadoUm;
	private int faceDadoDois;
	private Jogador jogador;
	
	public FaceDadosSorteado(int faceDadoUm, int faceDadoDois) {
		this.faceDadoUm = faceDadoUm;
		this.faceDadoDois = faceDadoDois;
	}

	public int getFaceDadoUm() {
		return faceDadoUm;
	}

	public void setFaceDadoUm(int faceDadoUm) {
		this.faceDadoUm = faceDadoUm;
	}

	public int getFaceDadoDois() {
		return faceDadoDois;
	}

	public void setFaceDadoDois(int faceDadoDois) {
		this.faceDadoDois = faceDadoDois;
	}
	
	public boolean eUmaDupla() {
		return faceDadoUm == faceDadoDois;
	}
	
	public int getSomaFaces() {
		return this.faceDadoUm + this.faceDadoDois;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

}
