
// Alexander Mascaro
// Esercizio: Matrice
// 17.02.2025

import java.util.Random;

public class Matrice { 
	public static void main(String[] args) { 
		
		int N1 = Integer.parseInt(args[0]);
		int N2 = Integer.parseInt(args[1]);
		Random rnd = new Random(); 
		
		if (N1 > 0 & N2 > 0) {
			String[][] matrice = new String[N1][N2];
			for (int i = 0; i < N1; i++){ //ciclo per le righe
				for (int j = 0; j < N2; j++){ // ciclo per le colonne
					int numero = rnd.nextInt(0,2);
					if (numero == 0) {
						matrice[i][j] = "X";
						System.out.print(matrice[i][j]);
					} else {
						matrice[i][j] = "Y";
						System.out.print(matrice[i][j]);
					}
				}
				System.out.println(); // per andare a capo
				
			}
			
				
		} else {
			System.out.println("Valori non validi");
		}
		
		
	}
}
