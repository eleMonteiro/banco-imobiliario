package modelos;

import dono.Dono;
import tabuleiro.casas.Casa;

public class Jogador extends Dono {

	private String nome;
	private Casa casaAtual;
	private boolean temCartaLiberarDaPrisao;
	private boolean estaPreso;

	public Jogador(int saldo, String nome, Casa casaAtual) {
		super(saldo);
		this.setNome(nome);
		this.setCasaAtual(casaAtual);
		this.setEstaPreso(false);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public boolean temCartaLiberarDaPrisao() {
		return temCartaLiberarDaPrisao;
	}

	public void setTemCartaLiberarDaPrisao(boolean temCartaLiberarDaPrisao) {
		this.temCartaLiberarDaPrisao = temCartaLiberarDaPrisao;
	}

}
