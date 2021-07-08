package business;

public class ExcecaoPlacaInexistente extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ExcecaoPlacaInexistente(String placa) {
		super("Não existe um veículo com a placa: " + placa);
	}

}
