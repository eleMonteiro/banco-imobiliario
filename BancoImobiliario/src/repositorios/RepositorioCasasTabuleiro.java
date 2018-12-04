package repositorios;

import java.util.ArrayList;
import java.util.List;

import modelos.AcaoImovel;
import modelos.AcaoImpostoDeRenda;
import modelos.AcaoInicio;
import modelos.AcaoLucrosEDividendos;
import modelos.AcaoParadaLivre;
import modelos.AcaoPrisao;
import modelos.AcaoSorteOuReves;
import modelos.AcaoVaParaAPrisao;
import modelos.Banco;
import modelos.Casa;
import modelos.Terreno;
import modelos.CasaEspecial;
import modelos.CasaEspecialComTaxa;
import modelos.Companhia;
import modelos.TabelaAluguel;;

public class RepositorioCasasTabuleiro {

	private static RepositorioCasasTabuleiro repositorioCasas = null;
	private List<Casa> casasTabuleiro;

	private RepositorioCasasTabuleiro() {
		this.casasTabuleiro = new ArrayList<>();
		this.adicionarCasas();
	}

	public List<Casa> getCasasTabuleiro() {
		return casasTabuleiro;
	}
	
	public Casa getCasaTabuleiro(int indice) {
		return casasTabuleiro.get(indice);
	}

	private void adicionarCasas() {
		this.casasTabuleiro.add(new CasaEspecial(new AcaoInicio()));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 100, 50,
				new TabelaAluguel(6, 30, 90, 270, 400, 500)));
		this.casasTabuleiro.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casasTabuleiro.add(
				new Terreno(Banco.getInstance(), new AcaoImovel(), 60, 50, new TabelaAluguel(2, 10, 30, 90, 160, 250)));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 60, 50,
				new TabelaAluguel(4, 20, 60, 180, 320, 450)));
		this.casasTabuleiro.add(new Companhia(Banco.getInstance(), new AcaoImovel(), 200, 50));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 240, 150,
				new TabelaAluguel(20, 100, 300, 750, 925, 1100)));
		this.casasTabuleiro.add(new Companhia(Banco.getInstance(), new AcaoImovel(), 200, 50));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 220, 150,
				new TabelaAluguel(18, 90, 250, 700, 875, 1050)));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 220, 150,
				new TabelaAluguel(18, 90, 250, 700, 875, 1050)));
		this.casasTabuleiro.add(new CasaEspecial(new AcaoPrisao()));

		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 200, 100,
				new TabelaAluguel(16, 80, 220, 600, 800, 1000)));
		this.casasTabuleiro.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 180, 100,
				new TabelaAluguel(14, 70, 200, 550, 750, 950)));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 180, 100,
				new TabelaAluguel(14, 70, 200, 550, 750, 950)));
		this.casasTabuleiro.add(new Companhia(Banco.getInstance(), new AcaoImovel(), 150, 40));
		this.casasTabuleiro.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 350, 200,
				new TabelaAluguel(35, 175, 500, 1100, 1300, 1500)));
		this.casasTabuleiro.add(new CasaEspecialComTaxa(new AcaoLucrosEDividendos(), 200));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 400, 200,
				new TabelaAluguel(50, 200, 600, 1400, 1700, 2000)));
		this.casasTabuleiro.add(new CasaEspecial(new AcaoParadaLivre()));

		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 120, 50,
				new TabelaAluguel(8, 40, 100, 300, 450, 600)));
		this.casasTabuleiro.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 100, 50,
				new TabelaAluguel(6, 30, 90, 270, 400, 500)));
		this.casasTabuleiro.add(new CasaEspecialComTaxa(new AcaoImpostoDeRenda(), 200));
		this.casasTabuleiro.add(new Companhia(Banco.getInstance(), new AcaoImovel(), 200, 40));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 160, 100,
				new TabelaAluguel(12, 60, 180, 500, 700, 900)));
		this.casasTabuleiro.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 140, 100,
				new TabelaAluguel(10, 50, 150, 450, 625, 750)));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 140, 100,
				new TabelaAluguel(10, 50, 150, 450, 325, 750)));
		this.casasTabuleiro.add(new CasaEspecial(new AcaoVaParaAPrisao()));

		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 260, 150,
				new TabelaAluguel(22, 110, 330, 800, 975, 1150)));
		this.casasTabuleiro.add(new Companhia(Banco.getInstance(), new AcaoImovel(), 200, 50));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 320, 200,
				new TabelaAluguel(28, 150, 450, 1000, 1200, 1400)));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 300, 200,
				new TabelaAluguel(26, 130, 390, 900, 1100, 1275)));
		this.casasTabuleiro.add(new Companhia(Banco.getInstance(), new AcaoImovel(), 200, 50));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 300, 200,
				new TabelaAluguel(26, 130, 390, 900, 1100, 1275)));
		this.casasTabuleiro.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 280, 150,
				new TabelaAluguel(24, 120, 360, 850, 1025, 1200)));
		this.casasTabuleiro.add(new Terreno(Banco.getInstance(), new AcaoImovel(), 260, 150,
				new TabelaAluguel(22, 110, 330, 800, 975, 1150)));
	}

	public static RepositorioCasasTabuleiro getInstance() {
		if (repositorioCasas == null) {
			repositorioCasas = new RepositorioCasasTabuleiro();
		}

		return repositorioCasas;
	}

}
