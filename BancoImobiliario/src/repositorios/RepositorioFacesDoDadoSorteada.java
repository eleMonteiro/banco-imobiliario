package repositorios;

import java.util.ArrayList;
import java.util.List;

import modelos.FaceDadosSorteado;

public class RepositorioFacesDoDadoSorteada {

	private static RepositorioFacesDoDadoSorteada repositorio = null;
	private List<FaceDadosSorteado> facesSorteadas;
	private static int ultimaCasa = 0;

	private RepositorioFacesDoDadoSorteada() {
		this.facesSorteadas = new ArrayList<>();
	}

	public List<FaceDadosSorteado> getFacesDadosSorteado() {
		return facesSorteadas;
	}

	public static RepositorioFacesDoDadoSorteada getInstance() {
		if (repositorio == null) {
			repositorio = new RepositorioFacesDoDadoSorteada();
		}
		return repositorio;
	}

	public FaceDadosSorteado ultimasFacesSorteadas() {
		return this.facesSorteadas.get(ultimaCasa);
	}

	public void adicionarFacesSorteadas(FaceDadosSorteado faceDadoSorteados) {
		this.facesSorteadas.add(faceDadoSorteados);
		ultimaCasa++;
	}
}
