import java.util.Objects;

public class Prodotto {
    private String nome;
    private double prezzo;
    private String categoria;
    private boolean maggiorenne;

    public Prodotto(String nome, double prezzo, String categoria, boolean maggiorenne) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.categoria = categoria;
        this.maggiorenne = maggiorenne;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean getMaggiorenne() {
        return maggiorenne;
    }

    public void setMaggiorenne(boolean maggiorenne) {
        this.maggiorenne = maggiorenne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return Double.compare(prezzo, prodotto.prezzo) == 0 && Objects.equals(nome, prodotto.nome) && Objects.equals(categoria, prodotto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, prezzo, categoria);
    }
}
