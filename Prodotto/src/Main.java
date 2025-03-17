
public class Main {
    public static void main(String[] args) {

        Prodotto tel = new Prodotto("telefono",234,4,399.90);
        tel.aggiornaQuantita(3);
        System.out.println(tel);

        Prodotto pane = new Prodotto("pane",45,7,3.90);
        pane.aggiornaQuantita(-13);
        System.out.println(pane);

    }
}