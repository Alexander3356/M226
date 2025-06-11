
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1,"Mario","Rossi","mario.rossi@gmail.com","14.05.2009");
        Cliente cliente2 = new Cliente(2,"Luca","Verdi","luca.verdi@gmail.com","27.02.2004");
        Prodotto prodotto1 = new Prodotto("Palla", 8.95, "Sport", false);
        Prodotto prodotto2 = new Prodotto("Sapone", 12.95, "Bagno", false);
        Ordine ordine1 = new Ordine(cliente1, prodotto1, 2, "spedito","02.05.2025");
        Ordine ordine2 = new Ordine(cliente2, prodotto1, 4, "spedito","05.05.2025");
        Ordine ordine3 = new Ordine(cliente2, prodotto2, 1, "spedito", "05.06.2025");
        Ordine ordine4 = new Ordine(cliente1, prodotto2, 2, "in attesa", "");
        Ordine ordine5 = new Ordine(cliente2, prodotto1, 1, "in attesa", "");
        GestioneOrdini gestione = new GestioneOrdini();
        gestione.aggiungiOrdini(ordine1);
        gestione.aggiungiOrdini(ordine2);
        gestione.aggiungiOrdini(ordine3);
        gestione.aggiungiOrdini(ordine4);
        gestione.aggiungiOrdini(ordine5);
        gestione.visualizzaOrdini();
    }
}