package business;

public class Van extends Veiculo{
	private static final long serialVersionUID = 1L;

	public Van(String placa, Combustivel combustivel, int kmRodados) {
		super(placa, 60, combustivel, kmRodados);
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
		super.setDespesaAnual(super.getDespesaAnual() + 3000);
		return 3000;
	}
	
	@Override
	public String toString() {
		return "Van [Placa: " + super.getPlaca() + "// Combustivel: " + super.getTanque().getCombustivel().getCombustivelNome() + "// Km Rodados: " + super.getKmRodados() + "]\n";
	}

}
