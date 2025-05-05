import java.util.Objects;

public class Gatto {

    private String nome;
    private int anni;
    private String tipologia;

    public Gatto(String nome, int anni, String tipologia) {
        this.nome = nome;
        this.anni = anni;
        this.tipologia = tipologia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnni() {
        return anni;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gatto gatto = (Gatto) o;
        return Objects.equals(nome, gatto.nome) && Objects.equals(anni, gatto.anni) && Objects.equals(tipologia, gatto.tipologia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anni, tipologia);
    }

    @Override
    public String toString() {
        return "Gatto{" +
                "nome='" + nome + '\'' +
                ", anni=" + anni +
                ", tipologia='" + tipologia + '\'' +
                '}';
    }
}
