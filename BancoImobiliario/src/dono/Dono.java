package dono;

import java.util.ArrayList;
import java.util.List;

import tabuleiro.casas.Imovel;

public abstract class Dono {

	private Conta conta = null;
	private List<Imovel> imoveis;

	public Dono(int saldo) {
		this.conta = new Conta(saldo);
		this.imoveis = new ArrayList<>();
	}

	public Conta getConta() {
		return conta;
	}

	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public void adicionarImovel(Imovel imovel) {
		imoveis.add(imovel);
	}

}
