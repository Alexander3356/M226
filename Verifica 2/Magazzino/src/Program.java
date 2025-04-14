
public class Program {
    public static void main(String[] args) {
        Produttore produttore = new Produttore("Bianchi Sport", "via del fiume 25");
        Articolo articolo1 = new Articolo("Racchetta",produttore,2013,"Racchetta per giocare a tennis",3);
        Articolo articolo2 = new Articolo("Palla da calcio",produttore,2017,"Palla per giocare a calcio",5);
        Magazzino magazzino = new Magazzino();
        System.out.println(articolo1.toString());
        System.out.println(articolo1.getIdentifier());
        magazzino.aggiungiArticolo(articolo1);
        magazzino.listaArticoli();
        System.out.println(articolo1.getQuantita());
        magazzino.modificaQuantita(0,2);
        System.out.println(articolo1.getQuantita());
        magazzino.ricercaArticolo("RB2013");
        magazzino.aggiungiArticolo(articolo2);
        magazzino.listaArticoli();
        magazzino.rimuoviArticolo(articolo1);
        magazzino.listaArticoli();
        //Articolo articolo3 = new Articolo(null,null,2013,"Racchetta per giocare a tennis",3);

    }
}