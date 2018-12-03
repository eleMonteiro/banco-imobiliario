package modelos;

public class CasaEspecialComTaxa extends Casa {

	private int taxa;

	public CasaEspecialComTaxa(Acao acao, int taxa) {
		super(acao);
		this.taxa = taxa;
	}

	public int getTaxa() {
		return taxa;
	}

}
