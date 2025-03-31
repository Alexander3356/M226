
public class Main {
    public static void main(String[] args) {
        Veicolo veicolo = new Veicolo("A","Audi","123");
        Sede sede = new Sede(6800, "via della via", "0123456789");
        Autista autista = new Autista("Marco", "rossi", veicolo, sede);

        Veicolo veicolo2 = new Veicolo("B","Ferrari","456");
        Sede sede2 = new Sede(6800, "via del fiume", "055557777");
        Autista autista2 = new Autista("Luca", "verdi", veicolo2, sede2);

        System.out.println(autista);
        System.out.println(autista2);
    }
}