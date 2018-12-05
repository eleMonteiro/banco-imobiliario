package controladores;

import interfacesiug.IPainelDeMensagensDoJogo;

public class ControladorElementosGraficos {

	private static ControladorElementosGraficos controladorElementosGraficos = null;
	private IPainelDeMensagensDoJogo iPainelDeMensagensDoJogo;

	private ControladorElementosGraficos() {

	}

	public IPainelDeMensagensDoJogo getiPainelDeMensagensDoJogo() {
		return iPainelDeMensagensDoJogo;
	}

	public void setiPainelDeMensagensDoJogo(IPainelDeMensagensDoJogo iPainelDeMensagensDoJogo) {
		this.iPainelDeMensagensDoJogo = iPainelDeMensagensDoJogo;
	}

	public static ControladorElementosGraficos getInstance() {
		if (controladorElementosGraficos == null) {
			controladorElementosGraficos = new ControladorElementosGraficos();
		}

		return controladorElementosGraficos;
	}

}
