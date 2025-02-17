
// Alexander Mascaro
// Esercizio: Rettangolo
// 17.02.2025

public class Rettangolo { 
	public static void main(String[] args) { 
		
		int N1 = Integer.parseInt(args[0]);
		int N2 = Integer.parseInt(args[1]);
		
		if (N1 > 0 & N2 > 0) {
		
			for (int i = 1; i <= N1; i++){ //ciclo per le righe
			
				if (i == 1 || N1 == i){
					for (int j = 1; j <= N2; j++){ // ciclo per le colonne per prima e ultima riga
						System.out.print("*");
					}
				} else {
					for (int j = 1; j <= N2; j++){ // ciclo per le colonne per le righe in mezzo
						if (j == 1 || N2 == j) {
							System.out.print("*");
						} else {
							System.out.print(" "); 
						}
					}
				}
				System.out.println(); // per andare a capo
			}
			
		} else {
			System.out.println("Valori non validi");
		}
		
	
	}
}
