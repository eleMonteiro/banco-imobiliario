package cartasSorteOuReves;

public class CartaSorteOuReves {

	private String nome;
	private String descricao;
	private int taxa;
	
	public CartaSorteOuReves(String nome, String descricao, int taxa) {
		this.descricao = descricao;
		this.taxa = taxa;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
