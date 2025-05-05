import java.util.ArrayList;
import java.util.Scanner;

public class GestioneOrdini {

    private ArrayList<Ordine> ordini = new ArrayList<>();

    public void aggiungiOrdini(Ordine ordine){
        this.ordini.add(ordine);
    }

    public void visualizzaOrdini(){
        String risposta = "";
        while (risposta != "fine") {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quali ordini vuoi visualizzare? (Premi Enter se vuoi visualizzarli tutti)");
            System.out.println("[0] Cliente/i specifico/i");
            System.out.println("[1] Prodotto/i specifico/i");
            System.out.println("[2] Stato (spediti/in attesa)");
            System.out.println("[3] Prezzo (>/</=)");
            System.out.println("[4] Data (>/</=)");
            risposta = sc.nextLine();
            if (risposta.equals("")) {
                while (risposta != "fine") {
                    System.out.println("Come vuoi ordinarli? (Enter -> data spedizione decrescente)");
                    System.out.println("[0] Id cliente");
                    System.out.println("[1] data");
                    System.out.println("[2] prezzo");
                    risposta = sc.nextLine();
                    if (risposta.equals("")) { // data spedizione decrescente
                        for (Ordine ordine : ordini) {
                            System.out.println(ordine.toString());
                        }
                        risposta = "fine";
                    } else if (risposta.equals("0")) { // id cliente
                        for(Ordine ordine : ordini){
                            System.out.println(ordine.toString());
                        }
                        risposta = "fine";
                    } else if (risposta.equals("1")) { // data
                        for(Ordine ordine : ordini){
                            System.out.println(ordine.toString());
                        }
                        risposta = "fine";
                    } else if (risposta.equals("2")) { // prezzo
                        for(Ordine ordine : ordini){
                            System.out.println(ordine.toString());
                        }
                        risposta = "fine";
                    } else {
                        System.out.println("\ninput non valido, riprovare\n");
                    }
                }

            } else {
                System.out.println("\ninput non valido, riprovare\n");
            }
        }
    }

}
