package controladores;

import dado.Dado;
import dado.FaceDadosSorteado;
import modelos.Partida;
import repositorios.RepositorioFacesDoDadoSorteada;

public class ControladorDado {

	public FaceDadosSorteado lancarDado() {
		FaceDadosSorteado facesSorteadas = new Dado().lancar();
		facesSorteadas.setJogador(Partida.getInstance().getJogadorDaVez());
		RepositorioFacesDoDadoSorteada repositorioFacesDoDadoSorteada = RepositorioFacesDoDadoSorteada.getInstance();
		repositorioFacesDoDadoSorteada.adicionarFacesSorteadas(facesSorteadas);

		return facesSorteadas;
	}

}
