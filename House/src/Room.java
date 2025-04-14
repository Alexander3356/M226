import java.util.Objects;

public class Room {

    private String nome;
    private int superficie;

    public Room(String nome, int superficie) {
        this.nome = nome;
        this.superficie = superficie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return superficie == room.superficie && Objects.equals(nome, room.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, superficie);
    }
}
