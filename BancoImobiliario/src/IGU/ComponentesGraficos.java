package IGU;

import javax.swing.JOptionPane;

public class ComponentesGraficos {

	public int desejaComprarTerrenoOuPagarAluguel() {
		return JOptionPane.showConfirmDialog(null, "DEJESA COMPRAR ESTE IMOVEL?", "ATENCAO", JOptionPane.YES_NO_OPTION);
	}

	public void mostrarTexto(String titulo, String conteudo) {
		JOptionPane.showMessageDialog(null, conteudo, titulo, JOptionPane.PLAIN_MESSAGE);
	}

}
