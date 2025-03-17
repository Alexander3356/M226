import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int riga = -1;
        int colonna = -1;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("inserire la coordinata riga [0;4]: ");
            try {
                riga = in.nextInt();
                if (riga > 4) {
                    System.out.println("Valore troppo grande " + riga);
                }
                else if (riga < 0) {
                    System.out.println("Valore troppo piccolo " + riga);
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inserire solo numeri interi");
                in.next();
            }

        }
        while (true) {
            System.out.println("inserire la coordinata colonna [0;4]: ");
            try {
                colonna = in.nextInt();
                if (colonna > 4) {
                    System.out.println("Valore troppo grande " + colonna);
                }
                else if (colonna < 0) {
                    System.out.println("Valore troppo piccolo " + colonna);
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inserire solo numeri interi");
                in.next();
            }

        }
        Coordinator punto = new Coordinator(riga, colonna);
        System.out.println(punto);

    }
}