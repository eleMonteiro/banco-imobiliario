package controladores;

import modelos.Dado;
import modelos.FaceDadosSorteado;

public class ControladorDado {

	public FaceDadosSorteado lancarDado() {
		return new Dado().lancar();
	}

}
