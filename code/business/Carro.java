package business;

public class Carro extends Veiculo{
	private static final long serialVersionUID = 1L;

	public Carro(String placa, Combustivel combustivel, int kmRodados) {
		super(placa, 50, combustivel, kmRodados);
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
		int a = super.getKmRodados();
		int man = super.getKmManutencao();
		Manutencao m = new Manutencao(new Curta());
		m.registraManutencao(a);
		super.addmanutencao(m);
		super.setDespesaAnual(super.getDespesaAnual() + 1500);
		return 1500;
	}

	@Override
	public String toString() {
		return "Carro [Placa: " + super.getPlaca() + "// Combustivel: " + super.getTanque().getCombustivel().getCombustivelNome() + "// Km Rodados: " + super.getKmRodados() + "]\n";
	}

}
