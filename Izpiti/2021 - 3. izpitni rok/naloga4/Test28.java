
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(1, 37, "ab"),
            new Cetrta.Prostor(1, 63, "ab"),
            new Cetrta.Prostor(1, 87, "ab"),
            new Cetrta.Prostor(1, 70, "ab"),
            new Cetrta.Prostor(1, 66, "ab"),
            new Cetrta.Prostor(1, 48, "ab"),
            new Cetrta.Prostor(1, 43, "ab"),
            new Cetrta.Prostor(1, 5, "ab"),
            new Cetrta.Prostor(1, 39, "ab"),
            new Cetrta.Prostor(1, 58, "ab"),
            new Cetrta.Prostor(1, 28, "ab"),
            new Cetrta.Prostor(1, 72, "ab"),
            new Cetrta.Prostor(1, 31, "ab"),
            new Cetrta.Prostor(1, 27, "ab"),
            new Cetrta.Prostor(1, 1, "ab"),
            new Cetrta.Prostor(1, 73, "ab"),
            new Cetrta.Prostor(1, 78, "ab"),
            new Cetrta.Prostor(1, 65, "ab"),
            new Cetrta.Prostor(1, 60, "ab"),
            new Cetrta.Prostor(1, 77, "ab"),
            new Cetrta.Prostor(1, 9, "ab"),
            new Cetrta.Prostor(1, 56, "ab"),
            new Cetrta.Prostor(1, 6, "ab"),
            new Cetrta.Prostor(1, 54, "ab"),
            new Cetrta.Prostor(1, 30, "ab"),
            new Cetrta.Prostor(1, 17, "ab"),
            new Cetrta.Prostor(1, 74, "ab"),
            new Cetrta.Prostor(1, 82, "ab"),
            new Cetrta.Prostor(1, 15, "ab"),
            new Cetrta.Prostor(1, 67, "ab"),
            new Cetrta.Prostor(1, 89, "ab"),
            new Cetrta.Prostor(1, 13, "ab"),
            new Cetrta.Prostor(1, 50, "ab"),
            new Cetrta.Prostor(1, 4, "ab"),
            new Cetrta.Prostor(1, 91, "ab"),
            new Cetrta.Prostor(1, 7, "ab"),
            new Cetrta.Prostor(1, 47, "ab"),
            new Cetrta.Prostor(1, 53, "ab"),
            new Cetrta.Prostor(1, 62, "ab"),
            new Cetrta.Prostor(1, 3, "ab"),
            new Cetrta.Prostor(1, 29, "ab"),
            new Cetrta.Prostor(1, 99, "ab"),
            new Cetrta.Prostor(1, 10, "ab"),
            new Cetrta.Prostor(1, 51, "ab"),
            new Cetrta.Prostor(1, 86, "ab"),
            new Cetrta.Prostor(1, 52, "ab"),
            new Cetrta.Prostor(1, 45, "ab"),
            new Cetrta.Prostor(1, 46, "ab"),
            new Cetrta.Prostor(1, 24, "ab"),
            new Cetrta.Prostor(1, 35, "ab"),
            new Cetrta.Prostor(1, 2, "ab"),
            new Cetrta.Prostor(1, 19, "ab"),
            new Cetrta.Prostor(1, 49, "ab"),
            new Cetrta.Prostor(1, 64, "ab"),
            new Cetrta.Prostor(1, 90, "ab"),
            new Cetrta.Prostor(1, 18, "ab"),
            new Cetrta.Prostor(1, 40, "ab"),
            new Cetrta.Prostor(1, 83, "ab"),
            new Cetrta.Prostor(1, 32, "ab"),
            new Cetrta.Prostor(1, 36, "ab"),
            new Cetrta.Prostor(1, 80, "ab"),
            new Cetrta.Prostor(1, 57, "ab"),
            new Cetrta.Prostor(1, 34, "ab"),
            new Cetrta.Prostor(1, 55, "ab"),
            new Cetrta.Prostor(1, 38, "ab"),
            new Cetrta.Prostor(1, 76, "ab")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
