package modelos;

public class CasaEspecialComTaxa extends Casa {

	private int taxa;

	public CasaEspecialComTaxa(Dono dono, Acao acao, int taxa) {
		super(dono, acao);
		this.taxa = taxa;
	}

	public int getTaxa() {
		return taxa;
	}

}
