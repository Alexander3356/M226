
public class Temperature {
	public static void main(String[] args) { 
		int[] temperature = {10,20,22,25,28,8};
		float media = 0;
		for (int i = 0; i < temperature.length; i++) {
			System.out.println("temp" + i + ": " + temperature[i]);
			media += temperature[i];
		}
		media = media/(temperature.length);
		System.out.println("media: " + (int)media);
	}
}