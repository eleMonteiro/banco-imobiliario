package cartasSorteOuReves;

import acoes.IAcao;

public class CartaSorteOuReves {

	private String nome;
	private String descricao;
	private IAcao acao;

	public CartaSorteOuReves(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
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

	public IAcao getAcao() {
		return acao;
	}

	public void setAcao(IAcao acao) {
		this.acao = acao;
	}

}
