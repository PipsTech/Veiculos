package business;

public enum Combustivel {
	DIESEL(1),
	ALCOOL(2),
	GASOLINA(3);
	
	private int comb;
	
	Combustivel(int comb) {
		this.comb = comb;
	}
	
	public double precoMedio() {
		int comb = this.getComb();
		double valor;
		if(comb == 1)
		{
			valor = 4.49;
		} else if(comb == 2)
		{
			valor = 5.79;
		}
		else
		{
			valor = 4.34;
		}
		return valor;	}
	
	public double ConsumoMedio() {
		int comb = this.getComb();
		int valor;
		if(comb == 1)
		{
			valor = 3;
		} else if(comb == 2)
		{
			valor = 7;
		}
		else
		{
			valor = 10;
		}
		return valor;
	}

	public int getComb() {
		return comb;
	}
	public void setComb(int comb) {
		this.comb = comb;
	}
	public String getCombustivelNome() {
		int comb = this.getComb();
		String valor;
		if(comb == 1)
		{
			valor = "Diesel";
		} else if(comb == 2)
		{
			valor = "Alcool";
		}
		else
		{
			valor = "Gasolina";
		}	
	return valor;	
	}
}
