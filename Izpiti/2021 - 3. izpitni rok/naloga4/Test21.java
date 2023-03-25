
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(1, 71, "aabb"),
            new Cetrta.Prostor(3, 94, "aabb"),
            new Cetrta.Prostor(1, 93, "aabb"),
            new Cetrta.Prostor(3, 8, "aabb"),
            new Cetrta.Prostor(2, 81, "aabb"),
            new Cetrta.Prostor(3, 91, "aabb"),
            new Cetrta.Prostor(5, 82, "bb"),
            new Cetrta.Prostor(4, 97, "bb"),
            new Cetrta.Prostor(5, 42, "aabb"),
            new Cetrta.Prostor(5, 53, "aabb"),
            new Cetrta.Prostor(4, 96, "aabb"),
            new Cetrta.Prostor(1, 70, "aabb"),
            new Cetrta.Prostor(1, 21, "bb"),
            new Cetrta.Prostor(4, 33, "aabb"),
            new Cetrta.Prostor(3, 67, "bb"),
            new Cetrta.Prostor(5, 50, "bb"),
            new Cetrta.Prostor(4, 58, "aabb"),
            new Cetrta.Prostor(3, 80, "bb"),
            new Cetrta.Prostor(3, 63, "bb"),
            new Cetrta.Prostor(1, 32, "bb"),
            new Cetrta.Prostor(4, 100, "aabb"),
            new Cetrta.Prostor(2, 70, "bb"),
            new Cetrta.Prostor(5, 35, "bb"),
            new Cetrta.Prostor(5, 40, "aabb"),
            new Cetrta.Prostor(5, 55, "aabb"),
            new Cetrta.Prostor(1, 97, "bb"),
            new Cetrta.Prostor(1, 1, "aabb"),
            new Cetrta.Prostor(3, 43, "bb"),
            new Cetrta.Prostor(3, 44, "aabb"),
            new Cetrta.Prostor(3, 32, "bb"),
            new Cetrta.Prostor(5, 14, "aabb"),
            new Cetrta.Prostor(5, 92, "bb"),
            new Cetrta.Prostor(1, 28, "bb"),
            new Cetrta.Prostor(1, 76, "aabb"),
            new Cetrta.Prostor(5, 16, "aabb"),
            new Cetrta.Prostor(5, 48, "bb"),
            new Cetrta.Prostor(5, 7, "bb"),
            new Cetrta.Prostor(1, 56, "bb"),
            new Cetrta.Prostor(1, 62, "bb"),
            new Cetrta.Prostor(4, 89, "aabb"),
            new Cetrta.Prostor(1, 26, "bb"),
            new Cetrta.Prostor(4, 99, "aabb"),
            new Cetrta.Prostor(5, 74, "aabb"),
            new Cetrta.Prostor(4, 25, "aabb"),
            new Cetrta.Prostor(4, 85, "bb"),
            new Cetrta.Prostor(5, 69, "aabb"),
            new Cetrta.Prostor(4, 34, "aabb"),
            new Cetrta.Prostor(4, 20, "bb"),
            new Cetrta.Prostor(3, 98, "aabb"),
            new Cetrta.Prostor(1, 2, "bb"),
            new Cetrta.Prostor(4, 53, "aabb"),
            new Cetrta.Prostor(1, 30, "bb"),
            new Cetrta.Prostor(5, 34, "bb"),
            new Cetrta.Prostor(2, 87, "bb"),
            new Cetrta.Prostor(2, 47, "bb"),
            new Cetrta.Prostor(4, 80, "aabb"),
            new Cetrta.Prostor(1, 78, "aabb"),
            new Cetrta.Prostor(5, 28, "aabb"),
            new Cetrta.Prostor(1, 61, "aabb"),
            new Cetrta.Prostor(5, 90, "aabb"),
            new Cetrta.Prostor(2, 73, "aabb"),
            new Cetrta.Prostor(2, 55, "aabb"),
            new Cetrta.Prostor(2, 9, "aabb")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
