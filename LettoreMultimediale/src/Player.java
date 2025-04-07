import java.util.Objects;

public class Player {

    private String Modello;
    private String Marca;
    private Playlist playlist;

    public Player(String modello, String marca, Playlist playlist) {
        Modello = modello;
        Marca = marca;
        this.playlist = playlist;
    }

    public void play(){
        System.out.println("Titolo: " + playlist.getBrani().get(playlist.getIndex()).getTitolo() + "; posizione: " + playlist.getIndex() );;
    }

    public void successivo(){
        if ((playlist.getIndex() + 1) >= playlist.getBrani().size()){
            playlist.setIndex(0);
        } else {
            playlist.setIndex(playlist.getIndex() + 1);
        }
    }

    public void precedente(){
        if ((playlist.getIndex() + -1) < 0){
            playlist.setIndex(playlist.getBrani().size() - 1);
        } else {
            playlist.setIndex(playlist.getIndex() + -1);
        }
    }

    public void selezionaBrano(int n){
        if (n < 0 || n >= playlist.getBrani().size()){
            System.out.println("Brano non trovato");
        } else {
            playlist.setIndex(n);
        }
    }

    public String getModello() {
        return Modello;
    }

    public void setModello(String modello) {
        Modello = modello;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(Modello, player.Modello) && Objects.equals(Marca, player.Marca) && Objects.equals(playlist, player.playlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Modello, Marca, playlist);
    }
}
