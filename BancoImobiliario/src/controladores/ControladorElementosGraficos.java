package controladores;

import interfacesIGU.IMensagensDoJogo;

public class ControladorElementosGraficos {

	private static ControladorElementosGraficos controladorElementosGraficos = null;
	private IMensagensDoJogo iPainelDeMensagensDoJogo;

	private ControladorElementosGraficos() {

	}

	public IMensagensDoJogo getiPainelDeMensagensDoJogo() {
		return iPainelDeMensagensDoJogo;
	}

	public void setiPainelDeMensagensDoJogo(IMensagensDoJogo iPainelDeMensagensDoJogo) {
		this.iPainelDeMensagensDoJogo = iPainelDeMensagensDoJogo;
	}

	public static ControladorElementosGraficos getInstance() {
		if (controladorElementosGraficos == null) {
			controladorElementosGraficos = new ControladorElementosGraficos();
		}

		return controladorElementosGraficos;
	}

}
