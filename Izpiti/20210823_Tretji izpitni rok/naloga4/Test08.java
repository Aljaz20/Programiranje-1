
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(3, 55, "abaab"),
            new Cetrta.Prostor(3, 10, "abaab"),
            new Cetrta.Prostor(3, 75, "abaab"),
            new Cetrta.Prostor(3, 20, "abaab"),
            new Cetrta.Prostor(2, 71, "abaab"),
            new Cetrta.Prostor(3, 87, "bba"),
            new Cetrta.Prostor(2, 80, "bba"),
            new Cetrta.Prostor(2, 67, "abaab"),
            new Cetrta.Prostor(3, 93, "abaab"),
            new Cetrta.Prostor(1, 82, "bba"),
            new Cetrta.Prostor(3, 73, "bba"),
            new Cetrta.Prostor(3, 50, "bba"),
            new Cetrta.Prostor(2, 22, "bba"),
            new Cetrta.Prostor(1, 72, "abaab"),
            new Cetrta.Prostor(2, 36, "bba"),
            new Cetrta.Prostor(1, 73, "abaab"),
            new Cetrta.Prostor(3, 16, "bba"),
            new Cetrta.Prostor(3, 6, "abaab"),
            new Cetrta.Prostor(2, 58, "bba"),
            new Cetrta.Prostor(2, 42, "abaab"),
            new Cetrta.Prostor(2, 95, "abaab"),
            new Cetrta.Prostor(1, 24, "abaab"),
            new Cetrta.Prostor(2, 60, "abaab"),
            new Cetrta.Prostor(3, 33, "bba"),
            new Cetrta.Prostor(1, 68, "bba"),
            new Cetrta.Prostor(3, 100, "bba"),
            new Cetrta.Prostor(2, 6, "bba"),
            new Cetrta.Prostor(2, 17, "bba"),
            new Cetrta.Prostor(1, 26, "abaab"),
            new Cetrta.Prostor(3, 32, "abaab"),
            new Cetrta.Prostor(3, 88, "abaab"),
            new Cetrta.Prostor(2, 54, "bba"),
            new Cetrta.Prostor(1, 52, "bba"),
            new Cetrta.Prostor(1, 36, "abaab"),
            new Cetrta.Prostor(3, 79, "bba"),
            new Cetrta.Prostor(1, 2, "bba"),
            new Cetrta.Prostor(2, 17, "bba"),
            new Cetrta.Prostor(2, 37, "bba"),
            new Cetrta.Prostor(1, 89, "bba"),
            new Cetrta.Prostor(1, 85, "abaab"),
            new Cetrta.Prostor(2, 75, "abaab"),
            new Cetrta.Prostor(2, 57, "abaab"),
            new Cetrta.Prostor(2, 81, "abaab"),
            new Cetrta.Prostor(2, 63, "abaab"),
            new Cetrta.Prostor(1, 7, "abaab"),
            new Cetrta.Prostor(3, 74, "bba"),
            new Cetrta.Prostor(2, 74, "bba"),
            new Cetrta.Prostor(1, 91, "bba"),
            new Cetrta.Prostor(1, 62, "abaab"),
            new Cetrta.Prostor(1, 83, "bba"),
            new Cetrta.Prostor(1, 28, "bba"),
            new Cetrta.Prostor(3, 78, "bba"),
            new Cetrta.Prostor(2, 25, "abaab"),
            new Cetrta.Prostor(1, 41, "abaab"),
            new Cetrta.Prostor(2, 92, "abaab"),
            new Cetrta.Prostor(2, 31, "bba"),
            new Cetrta.Prostor(1, 73, "abaab"),
            new Cetrta.Prostor(1, 35, "bba"),
            new Cetrta.Prostor(2, 32, "bba"),
            new Cetrta.Prostor(3, 41, "abaab"),
            new Cetrta.Prostor(3, 47, "abaab"),
            new Cetrta.Prostor(1, 16, "abaab"),
            new Cetrta.Prostor(3, 9, "abaab"),
            new Cetrta.Prostor(1, 98, "bba"),
            new Cetrta.Prostor(1, 3, "abaab"),
            new Cetrta.Prostor(1, 90, "abaab"),
            new Cetrta.Prostor(3, 84, "bba"),
            new Cetrta.Prostor(3, 76, "bba"),
            new Cetrta.Prostor(2, 75, "bba"),
            new Cetrta.Prostor(1, 100, "bba"),
            new Cetrta.Prostor(1, 36, "abaab"),
            new Cetrta.Prostor(2, 29, "bba")
        ));

        List<String> namembnosti = new ArrayList<>(Cetrta.namembnosti(prostori));
        namembnosti.sort(null);
        System.out.println(namembnosti);
    }
}