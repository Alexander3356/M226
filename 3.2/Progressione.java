
/**
*Esercizio 3.2
*
* @author Alexander Mascaro
* @version 10.02.2025
*/

public class Progressione {
	public static void main(String[] args) { 
		
		int N1 = Integer.parseInt(args[0]);
		int N2 = Integer.parseInt(args[1]);
		int N3 = Integer.parseInt(args[2]);
		
		if ((N2 - N1) == (N3 - N2))
		{
			System.out.println("i tre numeri sono in progressione aritmetica (differenza costante di " + (N2 - N1) + ")");
		} else {
			System.out.println("i tre numeri non sono in progressione aritmetica");
		}
		
	}
}