package business;

public class ExcecaoManutencaoInexistente extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ExcecaoManutencaoInexistente(String placa) {
		super("O veiculo com a placa " + placa + " n�o possui manuten��es cadastradas");
	}

}
