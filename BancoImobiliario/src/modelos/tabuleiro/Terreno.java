package modelos.tabuleiro;

import modelos.jogador.Dono;

public class Terreno extends Imovel {

	private int quantidadeDeCasas;
	private int valorCadaCasa;
	private String cor;
	private TabelaAluguel tabelaAluguel;

	public Terreno(Dono dono, int valor, int valorCadaCasa, String cor, TabelaAluguel tabelaAluguel) {
		super(dono, valor);
		this.quantidadeDeCasas = 0;
		this.valorCadaCasa = valorCadaCasa;
		this.setCor(cor);
		this.tabelaAluguel = tabelaAluguel;
	}

	public int getQuantidadeDeCasas() {
		return quantidadeDeCasas;
	}

	public int getValorCadaCasa() {
		return valorCadaCasa;
	}

	public void construirUmaCasa() {
		quantidadeDeCasas++;
	}

	@Override
	public int getValorAluguel(int multiplicador) {
		if (quantidadeDeCasas == 0)
			return this.tabelaAluguel.getSemCasa();
		else if (quantidadeDeCasas == 1)
			return this.tabelaAluguel.getComUmaCasa();
		else if (quantidadeDeCasas == 2)
			return this.tabelaAluguel.getComDuasCasas();
		else if (quantidadeDeCasas == 3)
			return this.tabelaAluguel.getComTresCasas();
		else if (quantidadeDeCasas == 4)
			return this.tabelaAluguel.getComQuatroCasas();
		else
			return this.tabelaAluguel.getHotel();
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
