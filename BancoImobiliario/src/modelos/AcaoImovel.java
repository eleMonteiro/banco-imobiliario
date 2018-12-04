package modelos;

public class AcaoImovel implements Acao {

	private Terreno terreno;
	
	public void iniciarAcao(Jogador jogador) {
		Terreno imovel = this.getTerreno();
		Dono dono = imovel.getDono();
	
		if(Banco.getInstance().equals(dono)) {
			
		}
		
	}

	public Terreno getTerreno() {
		return terreno;
	}

	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}

}
