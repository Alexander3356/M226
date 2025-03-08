
/**
 *Esercizio 1 Classe Punto
 *
 * @author Alexander Mascaro
 * @version 24.02.2025
 */

public class Main {
    public static void main(String[] args) {

    Square q1 = new Square();
    Square q2 = new Square(4);
    Square q3 = new Square(0);
    System.out.println(q1.toString());
    q1.draw();
    System.out.println(q2.toString());
    q2.draw();
    System.out.println(q3.toString());
    q3.draw();


    }
}