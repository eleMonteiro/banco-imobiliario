package IGU;

public class Coordenada {

	private double x;
	private double y;

	public Coordenada(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public boolean equals(Coordenada coordenada) {
		if (this.getX() == coordenada.getX() && this.getY() == coordenada.getY()) {
			return true;
		}

		return false;
	}

}
