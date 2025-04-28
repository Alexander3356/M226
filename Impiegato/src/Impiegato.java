import java.util.Objects;

public class Impiegato {

    private String nome;
    private String cognome;
    private String dataNascita;
    private double identificativo;

    public Impiegato(String nome, String cognome, String dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        setIdentificativo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Impiegato impiegato = (Impiegato) o;
        return Objects.equals(nome, impiegato.nome) && Objects.equals(cognome, impiegato.cognome) && Objects.equals(dataNascita, impiegato.dataNascita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, dataNascita);
    }

    public void setIdentificativo() {
        this.identificativo = nome.hashCode() + cognome.hashCode() + dataNascita.hashCode();
    }

    public double getIdentificativo() {
        return identificativo;
    }
}
