
import java.util.ArrayList;
import java.util.List;

public class Magazzino {

    private ArrayList<Articolo> articoli = new ArrayList<>();



    public void aggiungiArticolo(Articolo articolo) {
        this.articoli.add(articolo);
    }

    public void rimuoviArticolo(Articolo articolo) {
        this.articoli.remove(articolo);
    }

    public void modificaQuantita(int numeroArticolo, int quantita) {
        this.articoli.get(numeroArticolo).setQuantita(quantita);
    }

    public void ricercaArticolo(String id) {
        for(int i=0; i<articoli.size(); i++){
            if (articoli.get(i).getIdentifier().equals(id)) {
                System.out.println(articoli.get(i));
            }
        }
    }

    public void listaArticoli(){
        for(int i=0; i<articoli.size(); i++){
            System.out.println(articoli.get(i));
        }
    }


}
