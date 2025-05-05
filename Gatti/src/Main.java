import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        List<Gatto> gatti = new ArrayList<Gatto>();
        Path sorgente = Paths.get("ListaGatti.txt");
        try {
            List<String> lines = Files.readAllLines(sorgente);
            for (String line : lines) {
                String[] riga = line.split(",");
                gatti.add(new Gatto( riga[0], Integer.parseInt(riga[1]), riga[2]));
            }
        } catch (IOException ex){
            System.out.println("Errore nella lettura del file");
        }

        for (Gatto g : gatti) {
            System.out.println(g);
        }

    }
}