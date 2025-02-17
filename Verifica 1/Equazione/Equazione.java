
// Alexander Mascaro
// Esercizio: Equazione
// 17.02.2025

public class Equazione { 
	public static void main(String[] args) { 
		
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);
		
		double delta = Math.pow(b,2) - 4*a*c; //calcoliamo il delta
		
		if ( delta < 0) { // se delta < 0 -> nessuna soluzione
			System.out.println("Nessuna soluzione");
		} else if (delta == 0) { // se delta = 0 -> 1 soluzione
			double x = b*-1 / 2*a;
			System.out.println("\nX = " + x);
		} else { // se delta > 0 -> 2 soluzioni
			double x1 = (b*-1 + Math.sqrt(delta)) / 2*a;
			double x2 = (b*-1 - Math.sqrt(delta)) / 2*a;
			System.out.println("\nX1 = " + x1);
			System.out.println("X2 = " + x2);
		}
		
	}
}