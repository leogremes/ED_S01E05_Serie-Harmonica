package controller;

public class SerieHarmonica
{
	public SerieHarmonica() {
		super();
	}
	
	public double resolverSerie(int n)
	{
		//CONDI��O DE PARADAS -> quando n = 1, retornar 1
		//CHAMADA DE PASSOS -> 1 / N atual + a fun��o do n�mero anterior
		
		if (n == 1) return (double) 1;
		return (1 / (double)n) + resolverSerie(n -1 );
	}
}
