
/**
*Esercizio 3.1
*
* @author Alexander Mascaro
* @version 10.02.2025 
*/

public class Multipli {
	public static void main(String[] args) { 
		
		int n = Integer.parseInt(args[0]);
		
		if (n%5 == 0)
		{
			System.out.println(n + " è multiplo di 5");
		} else {
			System.out.println(n + " non è multiplo di 5");
		}
		
	}
}