package modelos;

public class Jogador extends Dono {

	private Casa casaAtual;
	private boolean estaPreso;

	public Jogador(int saldo, Casa casaAtual) {
		super(saldo);
		this.setCasaAtual(casaAtual);
		this.setEstaPreso(false);
	}

	public Casa getCasaAtual() {
		return casaAtual;
	}

	public void setCasaAtual(Casa casaAtual) {
		this.casaAtual = casaAtual;
	}

	public boolean estaPreso() {
		return estaPreso;
	}

	public void setEstaPreso(boolean estaPreso) {
		this.estaPreso = estaPreso;
	}

}
