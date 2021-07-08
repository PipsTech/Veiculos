package business;

public class ExcecaoLitrosNegativos extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ExcecaoLitrosNegativos(int litros) {
		super("Quantidade  " + litros + " litros não pode ser adicionada");
	}

}
