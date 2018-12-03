package main;

import igu.MenuInicial;
import jplay.Window;

public class Main {

	public static void main(String[] args) {
		Window janela = new Window(704, 704);
		new MenuInicial(janela);
	}

}
