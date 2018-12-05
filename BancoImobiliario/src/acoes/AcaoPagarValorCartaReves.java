package acoes;

import controladores.ControladorPartida;
import excecoes.SaldoInsufucienteException;
import modelos.jogador.Jogador;

public class AcaoPagarValorCartaReves implements IAcao {

	private int valor;

	public AcaoPagarValorCartaReves(int valor) {
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
