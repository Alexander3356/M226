import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Brano> brani = new ArrayList<>();
        brani.add(new Brano("Marco","ciao"));
        brani.add(new Brano("Davide","canzone"));
        Playlist playlist = new Playlist("musica", brani, 0);
        Player player = new Player("A1", "sony", playlist);

        player.play();
        player.successivo();
        player.play();
        player.precedente();
        player.play();
        player.precedente();
        player.play();
        player.selezionaBrano(0);
        player.play();
        player.selezionaBrano(5);
        player.play();
    }
}