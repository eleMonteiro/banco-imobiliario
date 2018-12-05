package controladores;

import modelos.Partida;
import modelos.dado.Dado;
import modelos.dado.FaceDadosSorteado;
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
