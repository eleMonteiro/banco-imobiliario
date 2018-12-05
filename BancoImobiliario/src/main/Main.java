package main;

import controladores.ControladorElementosGraficos;
import igu.MenuInicial;
import igu.PainelDeMensagensDoJogo;
import jplay.Window;

public class Main {

	public static void main(String[] args) {
		ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
		controladorElementosGraficos.setiPainelDeMensagensDoJogo(new PainelDeMensagensDoJogo());

		MenuInicial menuInicial = new MenuInicial(new Window(704, 704));
		menuInicial.iniciar();
	}

}
