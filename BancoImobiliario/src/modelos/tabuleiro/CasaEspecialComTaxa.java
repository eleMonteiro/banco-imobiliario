package modelos.tabuleiro;

public class CasaEspecialComTaxa extends Casa {

	private int taxa;

	public CasaEspecialComTaxa(int taxa) {
		this.taxa = taxa;
	}

	public int getTaxa() {
		return taxa;
	}

}
