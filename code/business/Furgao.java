package business;

public class Furgao extends Veiculo{
	private static final long serialVersionUID = 1L;

	public Furgao(String placa, Combustivel combustivel, int kmRodados) {
		super(placa, 80, combustivel, kmRodados);
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
		Manutencao m = new Manutencao(new Media());
		m.registraManutencao(man);
		super.addmanutencao(m);
		super.setDespesaAnual(super.getDespesaAnual() + 2500);
		return 2500;
	}

	@Override
	public String toString() {
		return "Furgão [Placa: " + super.getPlaca() + "// Combustivel: " + super.getTanque().getCombustivel().getCombustivelNome() + "// Km Rodados: " + super.getKmRodados() + "]\n";
	}
	
}
