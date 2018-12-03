package modelos;

public class Jogador extends Dono{

	private boolean estaPreso;
	private Casa casaAtual;
		
	public Jogador(int saldo) {
		super(saldo);
		this.estaPreso = false;
	}
	
	public void definirCasaAtual(Casa casaAtual) {
		this.casaAtual = casaAtual;
	}
	
	public Casa getCasaAtual() {
		return casaAtual;
	}
		
	public boolean estaPreso() {
		return estaPreso;
	}	
}
