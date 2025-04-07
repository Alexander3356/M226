import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Playlist {

    private String Titolo;
    private List<Brano> brani;
    private int Index;

    public Playlist(String titolo, List<Brano> brani, int index) {
        Titolo = titolo;
        this.brani = brani;
        Index = index;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public List<Brano> getBrani() {
        return brani;
    }

    public void setBrani(List<Brano> brani) {
        this.brani = brani;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Index == playlist.Index && Objects.equals(Titolo, playlist.Titolo) && Objects.equals(brani, playlist.brani);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Titolo, brani, Index);
    }
}
