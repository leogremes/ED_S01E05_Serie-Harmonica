package view;

import java.util.Scanner;
import controller.SerieHarmonica;

public class Principal
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		SerieHarmonica sh = new SerieHarmonica();
		int n;
		
		System.out.print("Digite um n�mero: ");
		n = s.nextInt();
		System.out.println("O resultado da s�rie �: " + sh.resolverSerie(n));		
	}

}
