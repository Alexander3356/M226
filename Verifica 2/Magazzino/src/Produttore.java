import java.util.Objects;

public class Produttore {
    private String nome;
    private String idirizzo;

    public Produttore(String nome, String idirizzo) {
        this.nome = nome;
        this.idirizzo = idirizzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdirizzo() {
        return idirizzo;
    }

    public void setIdirizzo(String idirizzo) {
        this.idirizzo = idirizzo;
    }

}
