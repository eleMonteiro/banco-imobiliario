package main;

import IGU.MenuInicial;
import IGU.MensagensDoJogo;
import controladores.ControladorElementosGraficos;
import jplay.Window;

public class Main {

	public static void main(String[] args) {
		ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
		controladorElementosGraficos.setiPainelDeMensagensDoJogo(new MensagensDoJogo());

		MenuInicial menuInicial = new MenuInicial(new Window(704, 704));
		menuInicial.iniciar();
	}

}
