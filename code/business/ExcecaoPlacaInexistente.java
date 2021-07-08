package business;

public class ExcecaoPlacaInexistente extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ExcecaoPlacaInexistente(String placa) {
		super("N�o existe um ve�culo com a placa: " + placa);
	}

}
