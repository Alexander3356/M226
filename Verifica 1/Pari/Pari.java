
// Alexander Mascaro
// Esercizio: Pari
// 17.02.2025

public class Pari { 
	public static void main(String[] args) { 
		
		int[] numeri = new int[args.length];
		int pari = 0;
		int dispari = 0;
		
		for (int i = 0; i < args.length; i++) { // ciclo per salvare gli args in un altro array (opzionale)
			numeri[i] = Integer.parseInt(args[i]);
		}
		
		for (int i = 0; i < numeri.length; i++){ // ciclo per controllare se un numero è pari o dispari
			int numero = numeri[i];
			if (numero % 2 == 0){
				pari++;
			} else {
				dispari++;
			}
		}
		
		System.out.println("\nQuantità pari: " + pari);
		System.out.println("Quantità dispari: " + dispari);
		
	}
}
