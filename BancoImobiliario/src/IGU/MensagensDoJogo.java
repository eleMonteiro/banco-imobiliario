package IGU;

import javax.swing.JOptionPane;

import interfacesIGU.IMensagensDoJogo;

public class MensagensDoJogo implements IMensagensDoJogo {

	@Override
	public int solicitarConfirmacao(String mensagem) {
		return JOptionPane.showConfirmDialog(null, mensagem, "ATENCAO", JOptionPane.YES_NO_OPTION);
	}

	@Override
	public void mostrarMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
