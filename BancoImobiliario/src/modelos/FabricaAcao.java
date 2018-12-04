package modelos;

public class FabricaAcao {

	private static FabricaAcao fabricaAcao = null;
	
	private FabricaAcao() {
		
	}
	
	public FabricaAcao getInstance() {
		
		if( fabricaAcao == null ) {
			fabricaAcao = new FabricaAcao();
		}
		
		return fabricaAcao;
	}
	
	public Acao criarNovaAcao(String tipoDaAcao) {
		
		if(tipoDaAcao.equals("AcaoImovel")) {
			return new AcaoTerreno();
		}else if(tipoDaAcao.equals("AcaoImpostoDeRenda")) {
			return new AcaoImpostoDeRenda();
		}else if(tipoDaAcao.equals("AcaoLucrosEDividendos")) {
			return new AcaoLucrosEDividendos();
		}else if(tipoDaAcao.equals("AcaoInicio")) {
			return new AcaoInicio();
		}else if(tipoDaAcao.equals("AcaoParadaLivre")) {
			return new AcaoParadaLivre();
		}else if(tipoDaAcao.equals("AcaoPrisao")) {
			return new AcaoPrisao();
		}else if(tipoDaAcao.equals("AcaoSorteOuReves")) {
			return new AcaoSorteOuReves();
		}else if(tipoDaAcao.equals("AcaoVaParaAPrisao")) {
			return new AcaoVaParaAPrisao();
		}
		
		return null;
	}
	
}
