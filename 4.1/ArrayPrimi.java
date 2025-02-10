
/**
*Esercizio 4.1
*
* @author Alexander Mascaro
* @version 10.02.2025
*/

public class ArrayPrimi {
	public static void main(String[] args) { 
		int primi[] = {2,4,4,5,6,7,8,9};
		int conta = 0;
		for (int i = 0; i < primi.length; i++)
		{
			int numero = primi[i];
			boolean isPrimo = true;
			for (int n = 2; n < numero; n++)
			{
				if (numero%n == 0)
				{
					isPrimo = false;
				}
			}
			if (isPrimo) 
			{
				System.out.print(primi[i] + " ");
				conta++;
			}			
		}
		System.out.println();
		System.out.println( "Quantità primi: " + conta );
	}
}