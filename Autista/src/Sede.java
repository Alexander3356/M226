public class Sede {
    private int NPA;
    private String indirizzo;
    private String telefono;

    public Sede(int NPA, String indirizzo, String telefono) {
        this.NPA = NPA;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    public int getNPA() {
        return NPA;
    }

    public void setNPA(int NPA) {
        this.NPA = NPA;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "NPA=" + NPA +
                ", indirizzo='" + indirizzo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
