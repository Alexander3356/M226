
/**
*Esercizio 4.6
*
* @author Alexander Mascaro
* @version 10.02.2025
*/
import java.util.Random;

public class Matrice {
	public static void main(String[] args) { 
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int casuali[][] = new int[n][n];
		Random rnd = new Random();
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				casuali[i][j] = rnd.nextInt(0,m + 1);
				System.out.print(casuali[i][j] + " ");
			}
			System.out.println();
		}
	}
}