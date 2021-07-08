package business;

import java.io.Serializable;
import java.time.LocalDate;

public class Manutencao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private LocalDate data;
	private int kmRodados;
	private IManutencao plano;
	
	public int proximaManutencao() {
		return plano.proximaManutencao(kmRodados);
	}
	public void registraManutencao(int kmRodados) {
		this.setKmRodados(kmRodados);
		this.setData(LocalDate.now());
	}
	
	public Manutencao(IManutencao plano) {
		this.setPlano(plano);
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public int getKmRodados() {
		return kmRodados;
	}
	
	public void setKmRodados(int kmRodados) {
		this.kmRodados = kmRodados;
	}
	
	public IManutencao getPlano() {
		return plano;
	}
	
	public void setPlano(IManutencao plano) {
		this.plano = plano;
	}
	@Override
	public String toString() {
		return "Manutencao [data = " + data + ", kmRodados = " + kmRodados + "]";
	}
	
}