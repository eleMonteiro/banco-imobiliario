package modelos.dado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dado {

	
	public Dado() {
	}

	public FaceDadosSorteado lancar() {
		List<Integer> facesDadoUm =  new ArrayList<>();
		List<Integer> facesDadoDois = new ArrayList<>();	

		for (int i = 1; i <= 6; i++) {
			facesDadoUm.add(i);
			facesDadoDois.add(i);
		}

		Collections.shuffle(facesDadoUm);
		Collections.shuffle(facesDadoDois);

		return new FaceDadosSorteado(facesDadoUm.get(0), facesDadoDois.get(0));
	}

}
