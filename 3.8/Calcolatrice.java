
/**
*Esercizio 3.8 
*
* @author Alexander Mascaro
* @version 15.02.2025 
*/

public class Calcolatrice {
	public static void main(String[] args) { 
		
		float N1 = Float.parseFloat(args[0]);
		float N2 = Float.parseFloat(args[1]);
		String Op = args[2];
		
		if (Op.equals("+")) {
			System.out.println(N1 + " + " + N2 + " = " + (N1 + N2));
		} else if (Op.equals("-")) {
			System.out.println(N1 + " - " + N2 + " = " + (N1 - N2));
		} else if (Op.equals("x")) {
			System.out.println(N1 + " x " + N2 + " = " + (N1 * N2));
		} else if (Op.equals("/")) {
			if (N2 == 0) {
				System.out.println("impossibile dividere per 0");
			} else {
				System.out.println(N1 + " / " + N2 + " = " + (N1 / N2));
			}
		} else {
			System.out.println("operatore non valido");
		}
	}
}