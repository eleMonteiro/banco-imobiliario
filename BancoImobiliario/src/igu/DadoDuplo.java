package igu;

import jplay.Sprite;
import jplay.URL;

public class DadoDuplo {

	private Sprite dadoDireita;
	private Sprite dadoEsquerda;

	public DadoDuplo() {

	}

	public void setValorDadoDireita(int valor) {
		this.dadoDireita = new Sprite(URL.sprite("dado-" + valor + ".png"));
		this.dadoDireita.x = 544;
		this.dadoDireita.y = 544;
		this.dadoDireita.draw();
	}

	public void setValorDadoEsquerda(int valor) {
		this.dadoEsquerda = new Sprite(URL.sprite("dado-" + valor + ".png"));
		this.dadoEsquerda.x = 448;
		this.dadoEsquerda.y = 544;
		this.dadoEsquerda.draw();
	}

}
