
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(4, 93, "aabb"),
            new Cetrta.Prostor(1, 40, "aabb"),
            new Cetrta.Prostor(5, 95, "aabb"),
            new Cetrta.Prostor(5, 86, "aabb"),
            new Cetrta.Prostor(6, 95, "aabb"),
            new Cetrta.Prostor(4, 88, "aabb"),
            new Cetrta.Prostor(1, 18, "aabb"),
            new Cetrta.Prostor(6, 93, "aabb"),
            new Cetrta.Prostor(3, 37, "aabb"),
            new Cetrta.Prostor(1, 34, "aabb"),
            new Cetrta.Prostor(2, 56, "aabb"),
            new Cetrta.Prostor(7, 83, "aabb"),
            new Cetrta.Prostor(2, 42, "aabb"),
            new Cetrta.Prostor(8, 7, "aabb"),
            new Cetrta.Prostor(7, 90, "aabb"),
            new Cetrta.Prostor(4, 62, "aabb"),
            new Cetrta.Prostor(5, 36, "aabb"),
            new Cetrta.Prostor(5, 62, "aabb"),
            new Cetrta.Prostor(6, 2, "aabb"),
            new Cetrta.Prostor(2, 53, "aabb"),
            new Cetrta.Prostor(5, 18, "aabb"),
            new Cetrta.Prostor(6, 32, "aabb"),
            new Cetrta.Prostor(1, 86, "aabb"),
            new Cetrta.Prostor(8, 23, "aabb"),
            new Cetrta.Prostor(3, 11, "aabb"),
            new Cetrta.Prostor(8, 87, "aabb"),
            new Cetrta.Prostor(3, 92, "aabb"),
            new Cetrta.Prostor(3, 29, "aabb"),
            new Cetrta.Prostor(5, 85, "aabb"),
            new Cetrta.Prostor(7, 41, "aabb"),
            new Cetrta.Prostor(5, 58, "aabb"),
            new Cetrta.Prostor(2, 61, "aabb"),
            new Cetrta.Prostor(7, 61, "aabb"),
            new Cetrta.Prostor(6, 68, "aabb"),
            new Cetrta.Prostor(7, 29, "aabb"),
            new Cetrta.Prostor(1, 41, "aabb"),
            new Cetrta.Prostor(1, 96, "aabb"),
            new Cetrta.Prostor(5, 92, "aabb"),
            new Cetrta.Prostor(4, 49, "aabb"),
            new Cetrta.Prostor(4, 54, "aabb"),
            new Cetrta.Prostor(6, 85, "aabb"),
            new Cetrta.Prostor(7, 75, "aabb"),
            new Cetrta.Prostor(5, 10, "aabb"),
            new Cetrta.Prostor(8, 69, "aabb"),
            new Cetrta.Prostor(1, 19, "aabb"),
            new Cetrta.Prostor(8, 95, "aabb"),
            new Cetrta.Prostor(1, 65, "aabb"),
            new Cetrta.Prostor(4, 13, "aabb"),
            new Cetrta.Prostor(3, 91, "aabb"),
            new Cetrta.Prostor(1, 82, "aabb"),
            new Cetrta.Prostor(2, 55, "aabb"),
            new Cetrta.Prostor(1, 4, "aabb"),
            new Cetrta.Prostor(2, 2, "aabb"),
            new Cetrta.Prostor(8, 48, "aabb"),
            new Cetrta.Prostor(5, 97, "aabb"),
            new Cetrta.Prostor(3, 73, "aabb"),
            new Cetrta.Prostor(8, 6, "aabb"),
            new Cetrta.Prostor(8, 16, "aabb"),
            new Cetrta.Prostor(5, 42, "aabb"),
            new Cetrta.Prostor(4, 89, "aabb"),
            new Cetrta.Prostor(7, 93, "aabb"),
            new Cetrta.Prostor(3, 82, "aabb"),
            new Cetrta.Prostor(8, 38, "aabb"),
            new Cetrta.Prostor(4, 81, "aabb")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
