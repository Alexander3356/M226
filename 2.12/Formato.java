
/**
*Esercizio 2.12
*
* @author Alexander Mascaro
* @version 03.02.2025 
*/

public class Formato {
	public static void main(String[] args) { 
		
		double numero = Double.parseDouble(args[0]);
		
		System.out.println(String.format("%.6f", numero));
		System.out.println(String.format("%.2f", numero));
		System.out.println(String.format("%.0f", numero));
		System.out.println(String.format("%,.2f", numero));
		System.out.println(String.format("%.2e", numero));
	}
}