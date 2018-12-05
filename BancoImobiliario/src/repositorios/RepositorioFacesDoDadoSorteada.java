package repositorios;

import java.util.ArrayList;
import java.util.List;

import dado.FaceDadosSorteado;

public class RepositorioFacesDoDadoSorteada {

	private static RepositorioFacesDoDadoSorteada repositorio = null;
	private List<FaceDadosSorteado> facesSorteadas;

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
		return facesSorteadas.get(facesSorteadas.size() - 1);
	}

	public void adicionarFacesSorteadas(FaceDadosSorteado faceDadoSorteados) {
		this.facesSorteadas.add(faceDadoSorteados);
	}
}
