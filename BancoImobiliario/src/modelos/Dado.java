package modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dado {

	private List<Integer> facesDadoUm;
	private List<Integer> facesDadoDois;
	
	public Dado() {
		this.facesDadoUm = new ArrayList<>();
		this.facesDadoDois = new ArrayList<>();
	}
	
	public FaceDadosSorteado lancar() {
		
		for (int i = 1; i <= 6; i++) {
			this.facesDadoUm.add(i);
			this.facesDadoDois.add(i);
		}
		
		Collections.shuffle(facesDadoUm);
		Collections.shuffle(facesDadoDois);
		
		return new FaceDadosSorteado(this.facesDadoUm.get(0), this.facesDadoDois.get(0));
	}
	
}
