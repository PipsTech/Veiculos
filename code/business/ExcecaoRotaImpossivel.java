package business;

public class ExcecaoRotaImpossivel extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ExcecaoRotaImpossivel() {
		super("Essa rota não pode ser adicionada");
	}
	

}
