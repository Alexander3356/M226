
public class Pitagora {
	public static void main(String[] args) { 
		
		float N1 = Float.parseFloat(args[0]);
		float N2 = Float.parseFloat(args[1]);
		
		System.out.println("ipotenusa: " + String.format("%.2f",(Math.sqrt(Math.pow(N1, 2) + Math.pow(N2, 2)))));
		
	}
}