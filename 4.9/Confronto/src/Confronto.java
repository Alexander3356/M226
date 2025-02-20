
/**
 *Esercizio 4.9
 *
 * @author Alexander Mascaro
 * @version 20.02.2025
 */

public class Confronto {
    public static void main(String[] args) {


        for (int i = 0; i < args.length - 1; i++) {

            for (int j = 0; j < args.length - 1 ; j++) {

                if (args[j].length() > args[j + 1].length()) {
                    String parola = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = parola;
                }

            }
        }

        System.out.println("Array: ");
        for (String elemento : args) {
            System.out.println(elemento);
        }

    }
}