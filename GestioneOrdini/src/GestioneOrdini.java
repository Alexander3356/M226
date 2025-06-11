import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class GestioneOrdini {

    private ArrayList<Ordine> ordini = new ArrayList<>();

    public void aggiungiOrdini(Ordine ordine){
        this.ordini.add(ordine);
    }

    public void visualizzaOrdini(){
        String risposta = "";
        while (risposta != "fine") {
            ArrayList<Ordine> filtrati = new ArrayList<>(ordini);
            Scanner sc = new Scanner(System.in);
            System.out.println("Quali ordini vuoi visualizzare? (Premi Enter se vuoi visualizzarli tutti)");
            System.out.println("[0] Cliente/i specifico/i");
            System.out.println("[1] Prodotto/i specifico/i");
            System.out.println("[2] Stato (spediti/in attesa)");
            System.out.println("[3] Prezzo (>/<)");
            System.out.println("[4] Data (>/<)");
            System.out.println("[5] Esci");
            risposta = sc.nextLine();
            if (risposta.equals("")) {
                ordiniSelezionati(risposta, sc, filtrati);
                risposta = continua(sc);
            } else if (risposta.equals("0")) { //Cliente
                filtraPerCliente(risposta, sc, filtrati);
                risposta = continua(sc);
            } else if (risposta.equals("1")) { //Prodotto
                filtraPerProdotto(risposta, sc, filtrati);
                risposta = continua(sc);
            } else if (risposta.equals("2")) { //Stato
                filtraPerStato(risposta, sc, filtrati);
                risposta = continua(sc);
            } else if (risposta.equals("3")) { //Prezzo
                filtraPerPrezzo(risposta, sc, filtrati);
                risposta = continua(sc);
            } else if (risposta.equals("4")) { //Data
                filtraPerData(risposta, sc, filtrati);
                risposta = continua(sc);
            } else if(risposta.equals("5")) {
                risposta = "fine";
            } else {
                System.out.println("\ninput non valido, riprovare\n");
            }
        }
    }

    private void filtraPerCliente(String risposta, Scanner sc, ArrayList<Ordine> filtrati) {
        System.out.println("Quale cliente? (nome o id)");
        String nome = sc.nextLine();
        if (nome.matches("\\d+(,\\d+)?")) { //Da stackoverflow
            for (Ordine o : ordini) {
                if (!(o.getCliente().getId() == Integer.parseInt(nome))) {
                    filtrati.remove(o);
                }
            }
        } else {
            for (Ordine o : ordini) {
                if (!o.getCliente().getNome().equalsIgnoreCase(nome)) {
                    filtrati.remove(o);
                }
            }
        }
        if (filtrati.isEmpty()) {
            System.out.println("\ncliente non trovato");
        } else {
            ordiniSelezionati(risposta, sc, filtrati);
        }
    }

    private void filtraPerProdotto(String risposta, Scanner sc, ArrayList<Ordine> filtrati) {
        System.out.println("Quale prodotto? (nome)");
        String nome = sc.nextLine();
        for (Ordine o : ordini) {
            if (!o.getProdotto().getNome().equalsIgnoreCase(nome)) {
                filtrati.remove(o);
            }
        }
        if (filtrati.isEmpty()) {
            System.out.println("\nprodotto non trovato");
        } else {
            ordiniSelezionati(risposta, sc, filtrati);
        }
    }

    private void filtraPerStato(String risposta, Scanner sc, ArrayList<Ordine> filtrati) {
        System.out.println("Spediti o in attesa?");
        System.out.println("[0] Spediti");
        System.out.println("[1] In attesa");
        String stato = sc.nextLine();
        if (stato.equals("0")) {
            stato = "spedito";
        } else if (stato.equals("1")) {
            stato = "in attesa";
        }
        for (Ordine o : ordini) {
            if (!o.getStato().equalsIgnoreCase(stato)) {
                filtrati.remove(o);
            }
        }
        if (filtrati.isEmpty() && stato.equals("in attesa")) {
            System.out.println("\nnessun ordine in attesa");
        } else if (filtrati.isEmpty()) {
            System.out.println("\ninput non valido");
        } else {
            ordiniSelezionati(risposta, sc, filtrati);
        }
    }

    private void filtraPerPrezzo(String risposta, Scanner sc, ArrayList<Ordine> filtrati) {
        System.out.println("Prezzo minimo? (Enter -> 0)");
        String minimo = sc.nextLine();
        System.out.println("Prezzo massimo? (Enter -> nessun massimo)");
        String massimo = sc.nextLine();
        if (minimo.isEmpty()) {
            minimo = "0";
        }
        try {
            for (Ordine o : ordini) {
                double prezzo = o.getPrezzoTotale();
                if (massimo.isEmpty()) {
                    if (prezzo < Double.parseDouble(minimo)) {
                        filtrati.remove(o);
                    }
                } else {
                    if (prezzo < Double.parseDouble(minimo) || prezzo > Double.parseDouble(massimo)) {
                        filtrati.remove(o);
                    }
                }
            }
            if (filtrati.isEmpty()) {
                System.out.println("\nnessun ordine trovato in questo range");
            } else {
                ordiniSelezionati(risposta, sc, filtrati);
            }
        } catch (NumberFormatException e) {
            System.out.println("\ninput non valido");
        }
    }

    private void filtraPerData(String risposta, Scanner sc, ArrayList<Ordine> filtrati) {
        Date minimo = null;
        Date massimo = null;
        System.out.println("Data minima (formato: dd.MM.yyyy)? (Enter -> 01.01.0001)");
        String rispostaDataMin = sc.nextLine();
        if (rispostaDataMin.isEmpty()) {
            try {
                minimo = new SimpleDateFormat("dd.MM.yyyy").parse("01.01.2001");
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                minimo = new SimpleDateFormat("dd.MM.yyyy").parse(rispostaDataMin);
            } catch (ParseException e) {
                System.out.println("\ninput non valido");
                risposta = continua(sc);
            }
        }
        System.out.println("Data massima (formato: dd.MM.yyyy)? (Enter -> nessun massimo)");
        String rispostaDataMax = sc.nextLine();
        if (!rispostaDataMax.isEmpty()) {
            try {
                massimo = new SimpleDateFormat("dd.MM.yyyy").parse(rispostaDataMax);
            } catch (ParseException e) {
                System.out.println("\ninput non valido");
                risposta = continua(sc);
            }
        }
        try {
            for (Ordine o : ordini) {
                String dataSpedizione = o.getDataSpedizione();
                if (dataSpedizione.isEmpty()) {
                    continue;
                }
                Date date1 = new SimpleDateFormat("dd.MM.yyyy").parse(dataSpedizione);
                if (rispostaDataMax.isEmpty()) {
                    if (date1.before(minimo)) {
                        filtrati.remove(o);
                    }
                } else {
                    if (date1.before(minimo) || date1.after(massimo)) {
                        filtrati.remove(o);
                    }
                }
            }
            if (filtrati.isEmpty()) {
                System.out.println("\nnessun ordine trovato in questo range");
            } else {
                ordiniSelezionati(risposta, sc, filtrati);
            }
        } catch (NumberFormatException | ParseException e) {
            System.out.println("\ninput non valido");
            System.out.println("Minimo: " + minimo);
            System.out.println("Massimo: " + massimo);
        }
    }

    public void ordiniSelezionati(String risposta, Scanner sc, ArrayList<Ordine> filtrati){
        while (!risposta.equals("fine")) {
            System.out.println("Come vuoi ordinarli? (Enter -> data spedizione decrescente)");
            System.out.println("[0] Id cliente");
            System.out.println("[1] data");
            System.out.println("[2] prezzo");
            System.out.println("[3] Esci");
            risposta = sc.nextLine();
            if (risposta.isEmpty()) { // data spedizione decrescente
                riordinaOrdini(risposta, filtrati, sc);
                risposta = "fine";
            } else if (risposta.equals("0") || risposta.equals("1") || risposta.equals("2") ) { // id cliente, data, prezzo
                System.out.println("crescente o decrescente?");
                System.out.println("[0] decrescente");
                System.out.println("[1] crescente");
                risposta += sc.nextLine();
                riordinaOrdini(risposta, filtrati, sc);
                risposta = "fine";
            } else if (risposta.equals("3")) { // esci
                break;
            } else {
                System.out.println("\ninput non valido, riprovare\n");
            }
        }
    }

    public void riordinaOrdini(String risposta, ArrayList<Ordine> filtrati, Scanner sc){
        ArrayList<Ordine> ordini2 = new ArrayList<>(filtrati);
        if (risposta.startsWith("0")) {  //Id
            ordinaPerId(risposta, ordini2);
        } else if (risposta.startsWith("1")) {  //Data
            ordinaPerData(risposta, ordini2);
        } else if (risposta.startsWith("2")) {  //Prezzo
            ordinaPerPrezzo(risposta, ordini2);
        }
        for (Ordine o : ordini2) {
            System.out.println(o);
        }
        scritturaFile(sc,ordini2);
    }

    public void ordinaPerData(String risposta, ArrayList<Ordine> ordini2){ //Data
        for (int i = 0; i < ordini2.size(); i++) {
            for (int j = 0; j < ordini2.size() - i - 1; j++) {
                try {
                    Date date1 = new SimpleDateFormat("dd.MM.yyyy").parse(ordini2.get(j).getDataSpedizione()); //da stackoverflow
                    Date date2 = new SimpleDateFormat("dd.MM.yyyy").parse(ordini2.get(j + 1).getDataSpedizione()); //da stackoverflow
                    if (risposta.endsWith("0") || risposta.equals("")) {
                        if (date1.before(date2)) {
                            scambiaOrdini(j, ordini2);
                        }
                    } else if (risposta.endsWith("1")) {
                        if (date1.after(date2)) {
                            scambiaOrdini(j, ordini2);
                        }
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
    }

    public void ordinaPerId(String risposta, ArrayList<Ordine> ordini2){ //Id
        for (int i = 0; i < ordini2.size(); i++) {
            for (int j = 0; j < ordini2.size() - i - 1; j++) {
                try {
                    int id1 = ordini2.get(j).getCliente().getId();
                    int id2 = ordini2.get(j + 1).getCliente().getId();
                    if (risposta.endsWith("0")) {
                        if (id1 <= id2) {
                            scambiaOrdini(j, ordini2);
                        }
                    } else if (risposta.endsWith("1")) {
                        if (id1 >= id2) {
                            scambiaOrdini(j, ordini2);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void ordinaPerPrezzo(String risposta, ArrayList<Ordine> ordini2){ //Prezzo
        for (int i = 0; i < ordini2.size(); i++) {
            for (int j = 0; j < ordini2.size() - i - 1; j++) {
                try {
                    double prezzo1 = ordini2.get(j).getPrezzoTotale();
                    double prezzo2 = ordini2.get(j + 1).getPrezzoTotale();
                    if (risposta.endsWith("0")) {
                        if (prezzo1 <= prezzo2) {
                            scambiaOrdini(j, ordini2);
                        }
                    } else if (risposta.endsWith("1")) {
                        if (prezzo1 >= prezzo2) {
                            scambiaOrdini(j, ordini2);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void scambiaOrdini (int j, ArrayList<Ordine> ordini2) {
        Ordine temp = ordini2.get(j);
        ordini2.set(j, ordini2.get(j + 1));
        ordini2.set(j + 1, temp);
    }

    public String continua(Scanner sc){
        String risposta;
        while (true) {
            System.out.println("\nVuoi continuare? (S/N)");
            risposta = sc.nextLine();
            if (risposta.equalsIgnoreCase("N")) {
                return "fine";
            } else if (risposta.equalsIgnoreCase("S")) {
                return "continua";
            } else {
                System.out.println("\nInput non valido, riprovare");
            }
        }
    }

    public void scritturaFile(Scanner sc, ArrayList<Ordine> ordini2) {
        while (true) {
            System.out.println("\nVuoi salvare gli ordini filtrati su file? (S/N)");
            String risposta = sc.nextLine();
            if (risposta.equalsIgnoreCase("S")) {
                System.out.println("Inserisci il nome del file:");
                Path path = Paths.get("D:\\2° Anno\\226\\Git\\M226\\GestioneOrdini\\" + sc.nextLine() + ".txt");
                List<String> lines = new ArrayList<>();
                for (Ordine o : ordini2) {
                    lines.add(o.toString());
                }
                try {
                    Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.out.println("Errore nella scrittura");
                }
                break;
            } else if (risposta.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("\nInput non valido, riprovare");
            }
        }
    }
}
