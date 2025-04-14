import java.util.List;
import java.util.Objects;

public class House {

    private List<Room> rooms;

    public House(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void aggiungi(String nome, int superficie) {
        rooms.add(new Room(nome, superficie));
    }

    public void visualizza(){
        for (Room room : rooms) {
            System.out.println("Nome: "+ room.getNome() + "; Superficie: " + room.getSuperficie());
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(rooms, house.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rooms);
    }
}
