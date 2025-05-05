
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1,"Mario","Rossi","mario.rossi@gmail.com","14.05.2009");
        Prodotto prodotto1 = new Prodotto("Palla", 8.95, "Sport", false);
        Ordine ordine1 = new Ordine(cliente1, prodotto1, 2, "spedito", "28.04.2025","02.05.2025");
        GestioneOrdini gestione = new GestioneOrdini();
        gestione.aggiungiOrdini(ordine1);
        gestione.visualizzaOrdini();

    }
}