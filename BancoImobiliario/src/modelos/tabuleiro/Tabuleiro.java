package modelos.tabuleiro;

import java.util.ArrayList;
import java.util.List;

import acoes.AcaoCasaSorteOuReves;
import acoes.AcaoCasaCompanhia;
import acoes.AcaoCasaPrisao;
import acoes.AcaoCasaImpostoDeRenda;
import acoes.AcaoCasaInicio;
import acoes.AcaoCasaLucrosEDividendos;
import acoes.AcaoCasaParadaLivre;
import acoes.AcaoCasaTerreno;
import acoes.AcaoVaParaAPrisao;
import modelos.banco.Banco;
import modelos.jogador.Jogador;

public class Tabuleiro {

	private List<Casa> casas;
	private List<Terreno> terrenos;
	private Casa prisao;
	private CasaEspecial casaInicial;

	public Tabuleiro() {
		this.setCasas(new ArrayList<>());
		this.setTerrenos(new ArrayList<>());
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
	
	public int getIndiceCasaComSalto(Casa casaAtual, int numeroDeCasasASaltar) {
		int indiceCasaAtual = 0, indiceNovaCasa;

		for (Casa casa : casas) {
			if (casa == casaAtual) {
				break;
			}

			indiceCasaAtual++;
		}

		indiceNovaCasa = indiceCasaAtual + numeroDeCasasASaltar;
		return indiceNovaCasa;
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

	public Casa getPrisao() {
		return prisao;
	}

	public void setPrisao(Casa prisao) {
		this.prisao = prisao;
	}

	public List<Terreno> getTerrenos() {
		return terrenos;
	}

	public void setTerrenos(List<Terreno> terrenos) {
		this.terrenos = terrenos;
	}

	public List<Terreno> getTerrenosPorCor(String cor) {
		List<Terreno> terrenos = new ArrayList<>();

		for (Terreno terreno : terrenos) {
			if (terreno.getCor().equals(cor)) {
				terrenos.add(terreno);
			}
		}

		return terrenos;
	}

	private void adicionarCasas() {
		CasaEspecial casaInicial = new CasaEspecial(200);
		casaInicial.setAcao(new AcaoCasaInicio());
		this.casas.add(casaInicial);
		this.setCasaInicial(casaInicial);

		Terreno terrenoLilas1 = new Terreno(Banco.getInstance(), 100, 50, "Lilas",
				new TabelaAluguel(6, 30, 90, 270, 400, 500));
		terrenoLilas1.setAcao(new AcaoCasaTerreno(terrenoLilas1));
		this.casas.add(terrenoLilas1);
		this.terrenos.add(terrenoLilas1);
		
		Casa sorteOuReves1 = new Casa();
		sorteOuReves1.setAcao(new AcaoCasaSorteOuReves());
		this.casas.add(sorteOuReves1);

		Terreno terrenoLilas2 = new Terreno(Banco.getInstance(), 60, 50, "Lilas",
				new TabelaAluguel(2, 10, 30, 90, 160, 250));
		terrenoLilas2.setAcao(new AcaoCasaTerreno(terrenoLilas2));
		this.casas.add(terrenoLilas2);
		this.terrenos.add(terrenoLilas2);

		Terreno terrenoLilas3 = new Terreno(Banco.getInstance(), 60, 50, "Lilas",
				new TabelaAluguel(4, 20, 60, 180, 320, 450));
		terrenoLilas3.setAcao(new AcaoCasaTerreno(terrenoLilas3));
		this.casas.add(terrenoLilas3);
		this.terrenos.add(terrenoLilas3);

		Companhia companhia1 = new Companhia(Banco.getInstance(), 200, 50);
		companhia1.setAcao(new AcaoCasaCompanhia(companhia1));
		this.casas.add(companhia1);

		Terreno terrenoAzulClaro1 = new Terreno(Banco.getInstance(), 240, 150, "Azul Claro",
				new TabelaAluguel(20, 100, 300, 750, 925, 1100));
		terrenoAzulClaro1.setAcao(new AcaoCasaTerreno(terrenoAzulClaro1));
		this.casas.add(terrenoAzulClaro1);
		this.terrenos.add(terrenoAzulClaro1);

		Companhia companhia2 = new Companhia(Banco.getInstance(), 200, 50);
		companhia2.setAcao(new AcaoCasaCompanhia(companhia2));
		this.casas.add(companhia2);

		Terreno terrenoAzulClaro2 = new Terreno(Banco.getInstance(), 220, 150, "Azul Claro",
				new TabelaAluguel(18, 90, 250, 700, 875, 1050));
		terrenoAzulClaro2.setAcao(new AcaoCasaTerreno(terrenoAzulClaro2));
		this.casas.add(terrenoAzulClaro2);
		this.terrenos.add(terrenoAzulClaro2);

		Terreno terrenoAzulClaro3 = new Terreno(Banco.getInstance(), 220, 150, "Azul Claro",
				new TabelaAluguel(18, 90, 250, 700, 875, 1050));
		terrenoAzulClaro3.setAcao(new AcaoCasaTerreno(terrenoAzulClaro3));
		this.casas.add(terrenoAzulClaro3);
		this.terrenos.add(terrenoAzulClaro3);

		Casa prisao = new Casa();
		prisao.setAcao(new AcaoCasaPrisao());
		this.casas.add(prisao);
		this.setPrisao(prisao);

		Terreno terrenoVioleta1 = new Terreno(Banco.getInstance(), 200, 100, "Violeta",
				new TabelaAluguel(16, 80, 220, 600, 800, 1000));
		terrenoVioleta1.setAcao(new AcaoCasaTerreno(terrenoVioleta1));
		this.casas.add(terrenoVioleta1);
		this.terrenos.add(terrenoVioleta1);
		
		Casa sorteOuReves2 = new Casa();
		sorteOuReves2.setAcao(new AcaoCasaSorteOuReves());
		this.casas.add(sorteOuReves2);

		Terreno terrenoVioleta2 = new Terreno(Banco.getInstance(), 180, 100, "Violeta",
				new TabelaAluguel(14, 70, 200, 550, 750, 950));
		terrenoVioleta2.setAcao(new AcaoCasaTerreno(terrenoVioleta2));
		this.casas.add(terrenoVioleta2);
		this.terrenos.add(terrenoVioleta2);
				
		Terreno terrenoVioleta3 = new Terreno(Banco.getInstance(), 180, 100, "Violeta",
				new TabelaAluguel(14, 70, 200, 550, 750, 950));
		terrenoVioleta3.setAcao(new AcaoCasaTerreno(terrenoVioleta3));
		this.casas.add(terrenoVioleta3);
		this.terrenos.add(terrenoVioleta3);
		
		Companhia companhia3 = new Companhia(Banco.getInstance(), 150, 40);
		companhia3.setAcao(new AcaoCasaCompanhia(companhia3));
		this.casas.add(companhia3);

		Casa sorteOuReves3 = new Casa();
		sorteOuReves3.setAcao(new AcaoCasaSorteOuReves());
		this.casas.add(sorteOuReves3);

		Terreno terrenoLaranja1 = new Terreno(Banco.getInstance(), 350, 200, "Laranja",
				new TabelaAluguel(35, 175, 500, 1100, 1300, 1500));
		terrenoLaranja1.setAcao(new AcaoCasaTerreno(terrenoLaranja1));
		this.casas.add(terrenoLaranja1);
		this.terrenos.add(terrenoLaranja1);
		
		CasaEspecial casaEspecialComTaxa1 = new CasaEspecial(200);
		casaEspecialComTaxa1.setAcao(new AcaoCasaLucrosEDividendos(casaEspecialComTaxa1));
		this.casas.add(casaEspecialComTaxa1);

		Terreno terrenoLaranja2 = new Terreno(Banco.getInstance(), 400, 200, "Laranja",
				new TabelaAluguel(50, 200, 600, 1400, 1700, 2000));
		terrenoLaranja2.setAcao(new AcaoCasaTerreno(terrenoLaranja2));
		this.casas.add(terrenoLaranja2);
		this.terrenos.add(terrenoLaranja2);
		
		Casa casaEspecial1 = new Casa();
		casaEspecial1.setAcao(new AcaoCasaParadaLivre());
		this.casas.add(casaEspecial1);

		Terreno terrenoVermelho1 = new Terreno(Banco.getInstance(), 120, 50, "Vermelho",
				new TabelaAluguel(8, 40, 100, 300, 450, 600));
		terrenoVermelho1.setAcao(new AcaoCasaTerreno(terrenoVermelho1));
		this.casas.add(terrenoVermelho1);
		this.terrenos.add(terrenoVermelho1);

		Casa sorteOuReves4 = new Casa();
		sorteOuReves4.setAcao(new AcaoCasaSorteOuReves());
		this.casas.add(sorteOuReves4);

		Terreno terrenoVermelho2 = new Terreno(Banco.getInstance(), 100, 50, "Vermelho",
				new TabelaAluguel(6, 30, 90, 270, 400, 500));
		terrenoVermelho2.setAcao(new AcaoCasaTerreno(terrenoVermelho2));
		this.casas.add(terrenoVermelho2);
		this.terrenos.add(terrenoVermelho2);

		CasaEspecial casaEspecialComTaxa2 = new CasaEspecial(200);
		casaEspecialComTaxa2.setAcao(new AcaoCasaImpostoDeRenda(casaEspecialComTaxa2));
		this.casas.add(casaEspecialComTaxa2);

		Companhia companhia4 = new Companhia(Banco.getInstance(), 200, 40);
		companhia4.setAcao(new AcaoCasaCompanhia(companhia4));
		this.casas.add(companhia4);

		Terreno terrenoAmarelo1 = new Terreno(Banco.getInstance(), 160, 100, "Amarelo",
				new TabelaAluguel(12, 60, 180, 500, 700, 900));
		terrenoAmarelo1.setAcao(new AcaoCasaTerreno(terrenoAmarelo1));
		this.casas.add(terrenoAmarelo1);
		this.terrenos.add(terrenoAmarelo1);

		Casa sorteOuReves5 = new Casa();
		sorteOuReves5.setAcao(new AcaoCasaSorteOuReves());
		this.casas.add(sorteOuReves5);

		Terreno terrenoAmarelo2 = new Terreno(Banco.getInstance(), 140, 100, "Amarelo",
				new TabelaAluguel(10, 50, 150, 450, 625, 750));
		terrenoAmarelo2.setAcao(new AcaoCasaTerreno(terrenoAmarelo2));
		this.casas.add(terrenoAmarelo2);
		this.terrenos.add(terrenoAmarelo2);
		
		Terreno terrenoAmarelo3 = new Terreno(Banco.getInstance(), 140, 100, "Amarelo",
				new TabelaAluguel(10, 50, 150, 450, 325, 750));
		terrenoAmarelo3.setAcao(new AcaoCasaTerreno(terrenoAmarelo3));
		this.casas.add(terrenoAmarelo3);
		this.terrenos.add(terrenoAmarelo3);
		
		Casa casaEspecial3 = new Casa();
		casaEspecial3.setAcao(new AcaoVaParaAPrisao());
		this.casas.add(casaEspecial3);

		Terreno terrenoVerde1 = new Terreno(Banco.getInstance(), 260, 150, "Verde",
				new TabelaAluguel(22, 110, 330, 800, 975, 1150));
		terrenoVerde1.setAcao(new AcaoCasaTerreno(terrenoVerde1));
		this.casas.add(terrenoVerde1);
		this.terrenos.add(terrenoVerde1);

		Companhia companhia5 = new Companhia(Banco.getInstance(), 200, 50);
		companhia5.setAcao(new AcaoCasaCompanhia(companhia5));
		this.casas.add(companhia5);

		Terreno terrenoVerde2 = new Terreno(Banco.getInstance(), 320, 200, "Verde",
				new TabelaAluguel(28, 150, 450, 1000, 1200, 1400));
		terrenoVerde2.setAcao(new AcaoCasaTerreno(terrenoVerde2));
		this.casas.add(terrenoVerde2);
		this.terrenos.add(terrenoVerde2);

		Terreno terrenoVerde3 = new Terreno(Banco.getInstance(), 300, 200, "Verde",
				new TabelaAluguel(26, 130, 390, 900, 1100, 1275));
		terrenoVerde3.setAcao(new AcaoCasaTerreno(terrenoVerde3));
		this.casas.add(terrenoVerde3);
		this.terrenos.add(terrenoVerde3);

		Companhia companhia6 = new Companhia(Banco.getInstance(), 200, 50);
		companhia6.setAcao(new AcaoCasaCompanhia(companhia6));
		this.casas.add(companhia6);

		Terreno terrenoVerde4 = new Terreno(Banco.getInstance(), 300, 200, "Verde",
				new TabelaAluguel(26, 130, 390, 900, 1100, 1275));
		terrenoVerde4.setAcao(new AcaoCasaTerreno(terrenoVerde4));
		this.casas.add(terrenoVerde4);
		this.terrenos.add(terrenoVerde4);

		Casa casaEspecial4 = new Casa();
		casaEspecial4.setAcao(new AcaoCasaSorteOuReves());
		this.casas.add(casaEspecial4);

		Terreno terrenoAzulEs1 = new Terreno(Banco.getInstance(), 280, 150, "Azul Escuro",
				new TabelaAluguel(24, 120, 360, 850, 1025, 1200));
		terrenoAzulEs1.setAcao(new AcaoCasaTerreno(terrenoAzulEs1));
		this.casas.add(terrenoAzulEs1);
		this.terrenos.add(terrenoAzulEs1);

		Terreno terrenoAzulEs2 = new Terreno(Banco.getInstance(), 260, 150, "Azul Escuro",
				new TabelaAluguel(22, 110, 330, 800, 975, 1150));
		terrenoAzulEs2.setAcao(new AcaoCasaTerreno(terrenoAzulEs2));
		this.casas.add(terrenoAzulEs2);
		this.terrenos.add(terrenoAzulEs2);
	}
}
