package business;

public class ExcecaoRotaImpossivel extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ExcecaoRotaImpossivel() {
		super("Essa rota n�o pode ser adicionada");
	}
	

}
