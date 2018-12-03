package modelos;

import java.util.List;

public class Terreno extends Imovel {

	private int quantidadeDeCasas;
	private List<Integer> tabelaAlugueis;

	public Terreno(Dono dono, Acao acao, int valor, int quantidadeDeCasas, List<Integer> tabelaAlugueis) {
		super(dono, acao, valor);
		this.quantidadeDeCasas = quantidadeDeCasas;
		this.tabelaAlugueis = tabelaAlugueis;
	}

	public int getQuantidadeDeCasas() {
		return quantidadeDeCasas;
	}

	public void construirUmaCasa() {
		quantidadeDeCasas++;
	}

	@Override
	public int getValorAluguel(int multiplicador) {
		return tabelaAlugueis.get(quantidadeDeCasas);
	}

}
