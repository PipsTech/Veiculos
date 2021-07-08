package business;

import java.io.Serializable;
import java.time.LocalDate;


public class Rota implements Serializable {
	private LocalDate Data;
	private int Km;

	public Rota(LocalDate data, int km) {
		this.setData(data);
		this.setKm(km);
	}

	public LocalDate getData() {
		return Data;
	}

	public int getKm() {
		return Km;
	}

	public void setData(LocalDate data) {
		Data = data;
	}

	public void setKm(int km) {
		Km = km;
	}

	@Override
	public String toString() {
		return "Rota [Data= " + Data + ", Km= " + Km + "]";
	}

}
