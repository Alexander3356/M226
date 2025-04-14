import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Figurina> figurine = new HashSet<>();
        figurine.add(new Figurina("1","Ronaldo", "2024"));
        figurine.add(new Figurina("2","Ronaldo", "2024"));
        figurine.add(new Figurina("1","Ronaldo", "2024"));
        System.out.println("figurine: " + figurine);
    }
}