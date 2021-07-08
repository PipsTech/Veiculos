package business;

import java.io.Serializable;

public class Media implements IManutencao, Serializable {

	private static final int PERIODICA = 10000;
	private static final int TPECAS = 2000;
	private static boolean mantp = false;
	private static boolean manpe = false;

	@Override
	public int proximaManutencao(int kmManutencao) {
		int prox = 0;
		if (!Media.mantp && !Media.manpe) {
			prox = PERIODICA;
			Media.manpe = true;
		} else if (Media.manpe) {
			prox = TPECAS + kmManutencao;
			Media.manpe = false;
			Media.mantp = true;
		} else if (Media.mantp) {
			prox = kmManutencao + (PERIODICA - TPECAS);
			Media.manpe = true;
			Media.mantp = false;
		}
		return prox;
	}

}
