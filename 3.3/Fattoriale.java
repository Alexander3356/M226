
/**
*Esercizio 3.3
*
* @author Alexander Mascaro
* @version 10.02.2025
*/

public class Fattoriale {
	public static void main(String[] args) { 
		
		int N = Integer.parseInt(args[0]);
		int risultato = 1;
		System.out.print("Fattoriale di " + N + ":  ");
		for (int conta = N; conta != 0; conta--) {
			System.out.print(conta + " * ");
			if (conta == 1) 
			{
				System.out.print(conta + " = ");
			}
			risultato *= conta;
		}
		System.out.println(risultato);
	
	}
}