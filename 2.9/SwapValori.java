
/**
*Esercizio 2.9
*
* @author Alexander Mascaro
* @version 03.02.2025
*/

public class SwapValori {
	public static void main(String[] args) { 
		
		int varA = Integer.parseInt(args[0]);
		int varB = Integer.parseInt(args[1]);
		int varC = varA;
		varA = varB;
		varB = varC;
		
		System.out.println(varA + " " + varB);
		
	}
}