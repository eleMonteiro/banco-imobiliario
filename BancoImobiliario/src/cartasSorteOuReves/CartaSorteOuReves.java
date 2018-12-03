package cartasSorteOuReves;

public class CartaSorteOuReves {

	private String descricao;
	private int taxa;

	public CartaSorteOuReves(String descricao, int taxa) {
		this.descricao = descricao;
		this.taxa = taxa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTaxa() {
		return taxa;
	}

	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}
	
	
}
