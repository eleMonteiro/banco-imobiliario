package modelos;

public class FaceDadosSorteado {

	private int faceDadoUm;
	private int faceDadoDois;
	
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
	
	public int getSomaFaces() {
		return this.faceDadoUm + this.faceDadoDois;
	}

}
