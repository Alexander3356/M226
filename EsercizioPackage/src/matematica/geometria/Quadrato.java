package matematica.geometria;

public class Quadrato {
    public static void main(int a) {
        int lato = a;
        if (lato <= 0) {
            System.out.println("Il lato deve essere positivo.");
        }
        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

