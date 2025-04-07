import java.util.Objects;

public class Brano {

    private String Titolo;
    private String Autore;

    public Brano(String autore, String titolo) {
        Autore = autore;
        Titolo = titolo;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public String getAutore() {
        return Autore;
    }

    public void setAutore(String autore) {
        Autore = autore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brano brano = (Brano) o;
        return Objects.equals(Titolo, brano.Titolo) && Objects.equals(Autore, brano.Autore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Titolo, Autore);
    }

}
