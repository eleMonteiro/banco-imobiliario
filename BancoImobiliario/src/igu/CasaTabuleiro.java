package igu;

import java.util.ArrayList;
import java.util.List;

public class CasaTabuleiro {

	private List<Peao> peoes;

	public CasaTabuleiro() {
		peoes = new ArrayList<>();
	}

	public List<Peao> getPeoes() {
		return peoes;
	}

	public void setPeoes(List<Peao> peoes) {
		this.peoes = peoes;
	}

}
