/**
*Esercizio 2.14
*Programma che calcola la media di 4 note
*
* @author Alexander Mascaro
* @version 03.02.2025
*/

public class NotaModulo {
	public static void main(String[] args) { 
		
		float N1 = Float.parseFloat(args[0]);
		float N2 = Float.parseFloat(args[1]);
		float N3 = Float.parseFloat(args[2]);
		float N4 = Float.parseFloat(args[3]);
		
		System.out.println("nota finale: " + String.format("%.2f",(N1 + N2 + N3 + N4)/4));
		
	}
}