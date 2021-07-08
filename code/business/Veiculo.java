package business;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public abstract class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String placa;
	private Tanque tanque;
	protected Set<Rota> rotas;
	protected double despesaAnual = 0;
	protected int kmRodados;
	protected Queue<Manutencao> manutencoes;

	public Veiculo(String placa, double capacidade, Combustivel combustivel, int kmRodados) {
		this.setPlaca(placa);
		this.setTanque(capacidade, combustivel);
		this.setKmRodados(kmRodados);
		this.rotas = new HashSet<Rota>();
		this.manutencoes = new LinkedList<Manutencao>();
	}

	public void addRota(LocalDate data, int KmTotal) throws ExcecaoRotaImpossivel, ExcecaoLitrosNegativos {
		if (this.getTanque().getCapacidade() * this.getTanque().getCombustivel().ConsumoMedio() >= KmTotal) {

			Rota rota1 = new Rota(data, KmTotal);
			this.rotas.add(rota1);
			
			if (this.getTanque().getQuantidade() * this.getTanque().getCombustivel().ConsumoMedio() <= KmTotal) {
				int a = (int) (this.getTanque().getCapacidade() - this.getTanque().getQuantidade());
				this.setDespesaAnual(this.getDespesaAnual() + this.getTanque().reabastecer(a));
			}
			this.getTanque().consumir(KmTotal);
			this.setKmRodados((int) (this.getKmRodados() + KmTotal));
		} else
			throw new ExcecaoRotaImpossivel();
	}

	public abstract double reabastecer(int Litros) throws ExcecaoLitrosNegativos;

	public abstract double fazerManutencao();

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Tanque getTanque() {
		return tanque;
	}

	public void setTanque(double capacidade, Combustivel combustivel) {
		this.tanque = new Tanque(capacidade, combustivel);
	}

	public Set<Rota> getRotas() {
		return rotas;
	}

	public void setRotas(Set<Rota> r1) {
		rotas = r1;
	}

	public double getDespesaAnual() {
		return despesaAnual;
	}

	public void setDespesaAnual(double despesaAnual) {
		this.despesaAnual = despesaAnual;
	}

	public int getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(int kmRod) {
		kmRodados = kmRod;
	}

	public Queue<Manutencao> getManutencoes() throws ExcecaoManutencaoInexistente {

		if (manutencoes.isEmpty())
			throw new ExcecaoManutencaoInexistente(this.placa);
		else
			return manutencoes;
	}

	public void setManutencoes(Queue<Manutencao> manutencoes) {
		this.manutencoes = manutencoes;
	}

	public int getKmManutencao() {
		    
		    int i = manutencoes.size();
			if(i == 0) {
				return 0;
			}
			else {
				return ((LinkedList<Manutencao>) manutencoes).getLast().getKmRodados();
			}
			
		
	}

	public void addmanutencao(Manutencao ma) {
		this.manutencoes.add(ma);
	}

	public Manutencao getUltimaManutencao() {
		return manutencoes.stream().reduce((first, second) -> second).orElse(null);
	}
}
