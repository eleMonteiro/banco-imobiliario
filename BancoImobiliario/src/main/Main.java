package main;

import igu.MenuInicial;
import jplay.Window;

public class Main {

	public static void main(String[] args) {
		MenuInicial menuInicial = new MenuInicial(new Window(704, 704));
		menuInicial.iniciar();
	}

}
