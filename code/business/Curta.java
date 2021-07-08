package business;

import java.io.Serializable;

public class Curta implements IManutencao, Serializable{
	
	private static final int MAN = 10000;
	
	
	@Override
	public int proximaManutencao(int kmManutencao) {
		int prox = 0;
		
		
			prox = MAN + kmManutencao;
		
		return prox;
	}

}
