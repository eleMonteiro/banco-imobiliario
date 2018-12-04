package modelos;

public class Jogador extends Dono {

	private Casa casaAtual;

	public Jogador(int saldo, Casa casaAtual) {
		super(saldo);
		this.setCasaAtual(casaAtual);
	}

	public Casa getCasaAtual() {
		return casaAtual;
	}

	public void setCasaAtual(Casa casaAtual) {
		this.casaAtual = casaAtual;
	}

}
