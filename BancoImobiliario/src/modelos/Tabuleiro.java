package modelos;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

	private List<Casa> casas;
	private CasaEspecial prisao;
	private CasaEspecial casaInicial;

	public Tabuleiro() {
		this.setCasas(new ArrayList<>());
		adicionarCasas();
	}

	public List<Casa> getCasas() {
		return casas;
	}

	public void setCasas(List<Casa> casas) {
		this.casas = casas;
	}

	public Casa getCasaComSalto(Casa casaAtual, int numeroDeCasasASaltar) {
		int indiceCasaAtual = 0, indiceNovaCasa;

		for (Casa casa : casas) {
			if (casa == casaAtual) {
				break;
			}

			indiceCasaAtual++;
		}

		indiceNovaCasa = (indiceCasaAtual + numeroDeCasasASaltar) % casas.size();
		return casas.get(indiceNovaCasa);
	}

	public void fazerJogadorAndar(Jogador jogador, int numeroDeCasasAAndar) {
		Casa casaNova = getCasaComSalto(jogador.getCasaAtual(), numeroDeCasasAAndar);
		Casa casaAtual = jogador.getCasaAtual();
		casaAtual.removerJogadorDaCasa(jogador);
		casaNova.inserirJogadorNaCasa(jogador);
	}

	public CasaEspecial getCasaInicial() {
		return casaInicial;
	}

	public void setCasaInicial(CasaEspecial casaInicial) {
		this.casaInicial = casaInicial;
	}

	public CasaEspecial getPrisao() {
		return prisao;
	}

	public void setPrisao(CasaEspecial prisao) {
		this.prisao = prisao;
	}

	private void adicionarCasas() {
		CasaEspecial casaInicial = new CasaEspecial(new AcaoInicio());
		this.casas.add(casaInicial);
		this.setCasaInicial(casaInicial);

		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 100, 50,
				new TabelaAluguel(6, 30, 90, 270, 400, 500)));
		this.casas.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casas.add(
				new Terreno(Banco.getInstance(), new AcaoTerreno(), 60, 50, new TabelaAluguel(2, 10, 30, 90, 160, 250)));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 60, 50,
				new TabelaAluguel(4, 20, 60, 180, 320, 450)));
		this.casas.add(new Companhia(Banco.getInstance(), new AcaoTerreno(), 200, 50));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 240, 150,
				new TabelaAluguel(20, 100, 300, 750, 925, 1100)));
		this.casas.add(new Companhia(Banco.getInstance(), new AcaoTerreno(), 200, 50));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 220, 150,
				new TabelaAluguel(18, 90, 250, 700, 875, 1050)));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 220, 150,
				new TabelaAluguel(18, 90, 250, 700, 875, 1050)));

		CasaEspecial prisao = new CasaEspecial(new AcaoPrisao());
		this.casas.add(prisao);
		this.setPrisao(prisao);

		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 200, 100,
				new TabelaAluguel(16, 80, 220, 600, 800, 1000)));
		this.casas.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 180, 100,
				new TabelaAluguel(14, 70, 200, 550, 750, 950)));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 180, 100,
				new TabelaAluguel(14, 70, 200, 550, 750, 950)));
		this.casas.add(new Companhia(Banco.getInstance(), new AcaoTerreno(), 150, 40));
		this.casas.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 350, 200,
				new TabelaAluguel(35, 175, 500, 1100, 1300, 1500)));
		this.casas.add(new CasaEspecialComTaxa(new AcaoLucrosEDividendos(), 200));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 400, 200,
				new TabelaAluguel(50, 200, 600, 1400, 1700, 2000)));
		this.casas.add(new CasaEspecial(new AcaoParadaLivre()));

		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 120, 50,
				new TabelaAluguel(8, 40, 100, 300, 450, 600)));
		this.casas.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 100, 50,
				new TabelaAluguel(6, 30, 90, 270, 400, 500)));
		this.casas.add(new CasaEspecialComTaxa(new AcaoImpostoDeRenda(), 200));
		this.casas.add(new Companhia(Banco.getInstance(), new AcaoTerreno(), 200, 40));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 160, 100,
				new TabelaAluguel(12, 60, 180, 500, 700, 900)));
		this.casas.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 140, 100,
				new TabelaAluguel(10, 50, 150, 450, 625, 750)));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 140, 100,
				new TabelaAluguel(10, 50, 150, 450, 325, 750)));
		this.casas.add(new CasaEspecial(new AcaoVaParaAPrisao()));

		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 260, 150,
				new TabelaAluguel(22, 110, 330, 800, 975, 1150)));
		this.casas.add(new Companhia(Banco.getInstance(), new AcaoTerreno(), 200, 50));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 320, 200,
				new TabelaAluguel(28, 150, 450, 1000, 1200, 1400)));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 300, 200,
				new TabelaAluguel(26, 130, 390, 900, 1100, 1275)));
		this.casas.add(new Companhia(Banco.getInstance(), new AcaoTerreno(), 200, 50));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 300, 200,
				new TabelaAluguel(26, 130, 390, 900, 1100, 1275)));
		this.casas.add(new CasaEspecial(new AcaoSorteOuReves()));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 280, 150,
				new TabelaAluguel(24, 120, 360, 850, 1025, 1200)));
		this.casas.add(new Terreno(Banco.getInstance(), new AcaoTerreno(), 260, 150,
				new TabelaAluguel(22, 110, 330, 800, 975, 1150)));
	}

}
