package business;

import java.io.Serializable;

public class Tanque implements Serializable {
	private static final long serialVersionUID = 1L;

	private double capacidade;
	private double quantidade;
	private Combustivel combustivel;

	public Tanque(double capacidade, Combustivel combustivel) {
		this.setCapacidade(capacidade);
		this.setCombustivel(combustivel);
		this.setQuantidade(capacidade);
	}

	public void consumir(int kmRodados) {
		this.setQuantidade(this.getQuantidade() - (this.combustivel.ConsumoMedio() * kmRodados));
	}

	public double reabastecer(int litros) throws ExcecaoLitrosNegativos {
		double resultado = 0;
		if (litros > 0) {
			if (litros + this.quantidade <= this.capacidade) {
				double faltantes = capacidade - (this.quantidade + litros);
				double preco = this.getCombustivel().precoMedio();
				resultado = (faltantes * preco);
			} else {
				double faltantes = this.capacidade - this.quantidade;
				double preco = this.getCombustivel().precoMedio();
				resultado = (faltantes * preco);
			}
		} else
			throw new ExcecaoLitrosNegativos(litros);
		return resultado;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

}
