import java.util.Objects;

public class Figurina {

    private String idFigurina;
    private String nomeGiocatore;
    private String stagione;

    public Figurina(String idFigurina, String nomeGiocatore, String stagione) {
        this.idFigurina = idFigurina;
        this.nomeGiocatore = nomeGiocatore;
        this.stagione = stagione;
    }

    public String getIdFigurina() {
        return idFigurina;
    }

    public void setIdFigurina(String idFigurina) {
        this.idFigurina = idFigurina;
    }

    public String getNomeGiocatore() {
        return nomeGiocatore;
    }

    public void setNomeGiocatore(String nomeGiocatore) {
        this.nomeGiocatore = nomeGiocatore;
    }

    public String getStagione() {
        return stagione;
    }

    public void setStagione(String stagione) {
        this.stagione = stagione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figurina figurina = (Figurina) o;
        return Objects.equals(idFigurina, figurina.idFigurina);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idFigurina);
    }

    @Override
    public String toString() {
        return "Figurina{" +
                "idFigurina='" + idFigurina + '\'' +
                ", nomeGiocatore='" + nomeGiocatore + '\'' +
                ", stagione='" + stagione + '\'' +
                '}';
    }
}
