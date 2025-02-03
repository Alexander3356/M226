
/**
*Esercizio 2.11
*
* @author Alexander Mascaro
* @version 03.02.2025
*/

public class Codice {
	public static void main(String[] args) { 
		
		String parola = args[0]; 
		char prima = parola.charAt(0);
		char terza = parola.charAt(2);
		char ultima = parola.charAt(parola.length() -1);
		char penultima = parola.charAt(parola.length() -2);
		
		System.out.println(prima + "" +terza + ultima + penultima);
	}
}