package modelos;

public class TabelaAluguel {

	private int semCasa;
	private int comUmaCasa;
	private int comDuasCasas;
	private int comTresCasas;
	private int comQuatroCasas;
	private int hotel;
	
	public TabelaAluguel(int semCasa, int comUmaCasa, int comDuasCasas, int comTresCasas, int comQuatroCasas, int hotel) {
		this.semCasa = semCasa;
		this.comUmaCasa = comUmaCasa;
		this.comDuasCasas = comDuasCasas;
		this.comTresCasas = comTresCasas;
		this.comQuatroCasas = comQuatroCasas;
		this.hotel = hotel;
	}

	public int getSemCasa() {
		return semCasa;
	}

	public int getComUmaCasa() {
		return comUmaCasa;
	}

	public int getComDuasCasas() {
		return comDuasCasas;
	}

	public int getComTresCasas() {
		return comTresCasas;
	}

	public int getComQuatroCasas() {
		return comQuatroCasas;
	}

	public int getHotel() {
		return hotel;
	}
	
	
}
