package acoes;

import controladores.ControladorPartida;
import excecoes.SaldoInsufucienteException;
import modelos.Jogador;

public class AcaoPagarValor implements IAcao {

	private int valor;

	public AcaoPagarValor(int valor) {
		this.valor = valor;
	}

	@Override
	public void iniciarAcao(Jogador jogador) {
		try {
			jogador.getConta().sacar(valor);
		} catch (SaldoInsufucienteException e) {
			new ControladorPartida().removerJogadorDaPartida(jogador);
		}
	}

}
