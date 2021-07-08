package business;

public class Caminhao extends Veiculo{
	private static final long serialVersionUID = 1L;

	public Caminhao(String placa, Combustivel combustivel, int kmRodados) {
		super(placa, 250, combustivel, kmRodados);
	}


	@Override
	public double reabastecer(int litros) throws ExcecaoLitrosNegativos {
		double quantidade = super.getTanque().getQuantidade();
		super.getTanque().reabastecer(litros);
		double reabastecido = this.getTanque().getQuantidade() - quantidade;
		return reabastecido;
	}

	@Override
	public double fazerManutencao() {
		int man = super.getKmManutencao();
		Manutencao m = new Manutencao(new Longa());
		m.registraManutencao(man);
		super.addmanutencao(m);
		super.setDespesaAnual(super.getDespesaAnual() + 5000);
		return 5000;
	}
	
	@Override
	public String toString() {
		return "Caminhão [Placa: " + super.getPlaca() + "// Combustivel: " + super.getTanque().getCombustivel().getCombustivelNome() + "// Km Rodados: " + super.getKmRodados() + "]\n";
	}

}
