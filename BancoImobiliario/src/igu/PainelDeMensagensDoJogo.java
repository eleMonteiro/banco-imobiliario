package igu;

import javax.swing.JOptionPane;

import interfacesiug.IPainelDeMensagensDoJogo;

public class PainelDeMensagensDoJogo implements IPainelDeMensagensDoJogo {

	@Override
	public int solicitarConfirmacao(String mensagem) {
		return JOptionPane.showConfirmDialog(null, mensagem, "ATENCAO", JOptionPane.YES_NO_OPTION);
	}

	@Override
	public void mostrarMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
