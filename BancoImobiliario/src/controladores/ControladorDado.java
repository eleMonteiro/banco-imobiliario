package controladores;

import modelos.Dado;
import modelos.FaceDadosSorteado;
import modelos.Partida;

public class ControladorDado {

	public FaceDadosSorteado lancarDado() {
		FaceDadosSorteado facesSorteadas =  new Dado().lancar();
		facesSorteadas.setJogador(Partida.getInstance().getJogadorDaVez());
		
		return facesSorteadas;
	}

}
