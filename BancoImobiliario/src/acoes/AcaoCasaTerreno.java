package acoes;

import java.util.List;

import controladores.ControladorElementosGraficos;
import controladores.ControladorPartida;
import controladores.ControladorTabuleiro;
import excecoes.SaldoInsufucienteException;
import modelos.banco.Banco;
import modelos.jogador.Dono;
import modelos.jogador.Jogador;
import modelos.tabuleiro.Terreno;
import repositorios.RepositorioFacesDoDadoSorteada;

public class AcaoCasaTerreno implements IAcao {

	private Terreno terreno;

	public AcaoCasaTerreno(Terreno terreno) {
		this.terreno = terreno;
	}

	public void iniciarAcao(Jogador jogador) {
		Dono donoTerreno = terreno.getDono();

		if (Banco.getInstance() == donoTerreno) {
			ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
			int respostaDoJogador = controladorElementosGraficos.getiPainelDeMensagensDoJogo()
					.solicitarConfirmacao("DESEJA COMPRAR ESTE TERRENO?");

			if (respostaDoJogador == 0) {
				try {
					new ControladorTabuleiro().comprarImovel(terreno, jogador);
				} catch (SaldoInsufucienteException e) {
					controladorElementosGraficos.getiPainelDeMensagensDoJogo().mostrarMensagem(e.getMessage());

					new ControladorTabuleiro().pagarAluguel(terreno, jogador,
							RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
				}
			} else if (respostaDoJogador == 1) {
				new ControladorTabuleiro().pagarAluguel(terreno, jogador,
						RepositorioFacesDoDadoSorteada.getInstance().ultimasFacesSorteadas());
			}

		} else if (jogador == donoTerreno) {
			boolean jogadorEDonoDeTodosOsTerrenosDeMesmaCor = true;

			List<Terreno> terrenos = new ControladorPartida().getTabuleiro().getTerrenos();
			for (Terreno terreno : terrenos) {
				if (donoTerreno != terreno.getDono()) {
					jogadorEDonoDeTodosOsTerrenosDeMesmaCor = false;
				}
			}

			if (jogadorEDonoDeTodosOsTerrenosDeMesmaCor) {
				ControladorElementosGraficos controladorElementosGraficos = ControladorElementosGraficos.getInstance();
				int respostaDoJogador = controladorElementosGraficos.getiPainelDeMensagensDoJogo().solicitarConfirmacao(
						"DESEJA CONSTRUIR UMA CASA NESTE TERRENO POR ?" + terreno.getValorCadaCasa());

				if (respostaDoJogador == 0) {
					terreno.construirUmaCasa();
				}
			}
		}

	}

	public Terreno getTerreno() {
		return terreno;
	}

	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}

}
