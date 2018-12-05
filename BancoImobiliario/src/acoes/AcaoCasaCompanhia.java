package acoes;

import controladores.ControladorElementosGraficos;
import controladores.ControladorTabuleiro;
import excecoes.SaldoInsufucienteException;
import modelos.banco.Banco;
import modelos.jogador.Dono;
import modelos.jogador.Jogador;
import modelos.tabuleiro.Companhia;
import repositorios.RepositorioFacesDoDadoSorteada;

public class AcaoCasaCompanhia implements IAcao {

	private Companhia companhia;

	public AcaoCasaCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}

	public void iniciarAcao(Jogador jogador) {
		Dono donoTerreno = companhia.getDono();

		if (Banco.getInstance() == donoTerreno) {

			ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
			int respostaDoJogador = controladorElementosGraficos.getiPainelDeMensagensDoJogo()
					.solicitarConfirmacao("DESEJA COMPRAR ESTE IMOVEL?");

			if (respostaDoJogador == 0) {
				try {
					new ControladorTabuleiro().comprarImovel(companhia, jogador);
				} catch (SaldoInsufucienteException e) {
					controladorElementosGraficos.getiPainelDeMensagensDoJogo().mostrarMensagem(e.getMessage());

					new ControladorTabuleiro().pagarAluguel(companhia, jogador,
							RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
				}
			} else if (respostaDoJogador == 1) {
				new ControladorTabuleiro().pagarAluguel(companhia, jogador,
						RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
			}

		} else if (jogador != donoTerreno) {
			new ControladorTabuleiro().pagarAluguel(companhia, jogador,
					RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
		}

	}

	public Companhia getCompanhia() {
		return companhia;
	}

	public void setTerreno(Companhia companhia) {
		this.companhia = companhia;
	}
}
