package business;

import java.io.Serializable;

public class Longa implements IManutencao, Serializable {

	private static final int MAN = 20000;

	@Override
	public int proximaManutencao(int kmManutencao) {
		int prox;

		prox = MAN + kmManutencao;
		return prox;
	}

}
