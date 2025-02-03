
/**
*Esercizio 2.7
*
* @author Alexander Mascaro
* @version 03.02.2025
*/
import java.util.Random;

public class Dado {
	public static void main(String[] args) { 
		
		Random rnd = new Random();
		int numero = rnd.nextInt(1,7);
		
		System.out.println(numero);
		
	}
}