
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(2, 35, "babab"),
            new Cetrta.Prostor(1, 33, "babab"),
            new Cetrta.Prostor(2, 69, "abb"),
            new Cetrta.Prostor(1, 37, "babb"),
            new Cetrta.Prostor(2, 33, "babb"),
            new Cetrta.Prostor(3, 11, "babb"),
            new Cetrta.Prostor(3, 20, "bab"),
            new Cetrta.Prostor(2, 58, "abb"),
            new Cetrta.Prostor(1, 47, "babb"),
            new Cetrta.Prostor(3, 65, "babab"),
            new Cetrta.Prostor(3, 23, "babb"),
            new Cetrta.Prostor(2, 37, "babab"),
            new Cetrta.Prostor(3, 9, "abb"),
            new Cetrta.Prostor(2, 84, "bab"),
            new Cetrta.Prostor(1, 69, "babab"),
            new Cetrta.Prostor(2, 71, "abb"),
            new Cetrta.Prostor(2, 67, "abb"),
            new Cetrta.Prostor(1, 76, "abb"),
            new Cetrta.Prostor(3, 65, "abb"),
            new Cetrta.Prostor(1, 21, "babab"),
            new Cetrta.Prostor(3, 25, "abb"),
            new Cetrta.Prostor(3, 45, "abb"),
            new Cetrta.Prostor(3, 9, "babab"),
            new Cetrta.Prostor(3, 47, "babab"),
            new Cetrta.Prostor(2, 84, "babab"),
            new Cetrta.Prostor(2, 62, "bab"),
            new Cetrta.Prostor(2, 74, "babb"),
            new Cetrta.Prostor(3, 78, "babb"),
            new Cetrta.Prostor(3, 89, "babb"),
            new Cetrta.Prostor(3, 75, "babab"),
            new Cetrta.Prostor(2, 14, "abb"),
            new Cetrta.Prostor(2, 3, "babab"),
            new Cetrta.Prostor(2, 3, "babb"),
            new Cetrta.Prostor(2, 42, "babab"),
            new Cetrta.Prostor(2, 89, "babb"),
            new Cetrta.Prostor(2, 8, "babab"),
            new Cetrta.Prostor(1, 16, "abb"),
            new Cetrta.Prostor(3, 72, "babb"),
            new Cetrta.Prostor(2, 89, "babab"),
            new Cetrta.Prostor(1, 99, "babab"),
            new Cetrta.Prostor(1, 88, "bab"),
            new Cetrta.Prostor(2, 35, "bab"),
            new Cetrta.Prostor(3, 79, "bab"),
            new Cetrta.Prostor(1, 7, "abb"),
            new Cetrta.Prostor(3, 17, "bab"),
            new Cetrta.Prostor(3, 23, "babb"),
            new Cetrta.Prostor(3, 40, "babab"),
            new Cetrta.Prostor(2, 40, "babb"),
            new Cetrta.Prostor(2, 70, "bab"),
            new Cetrta.Prostor(2, 64, "bab"),
            new Cetrta.Prostor(2, 92, "babb"),
            new Cetrta.Prostor(2, 45, "abb"),
            new Cetrta.Prostor(3, 81, "babb"),
            new Cetrta.Prostor(2, 88, "bab"),
            new Cetrta.Prostor(3, 62, "bab"),
            new Cetrta.Prostor(1, 22, "abb"),
            new Cetrta.Prostor(1, 28, "babb"),
            new Cetrta.Prostor(2, 72, "abb"),
            new Cetrta.Prostor(1, 31, "babb"),
            new Cetrta.Prostor(3, 96, "babb"),
            new Cetrta.Prostor(3, 41, "babb"),
            new Cetrta.Prostor(1, 18, "babb"),
            new Cetrta.Prostor(2, 10, "babb"),
            new Cetrta.Prostor(3, 96, "babab"),
            new Cetrta.Prostor(3, 73, "bab"),
            new Cetrta.Prostor(2, 34, "babb"),
            new Cetrta.Prostor(2, 38, "babb"),
            new Cetrta.Prostor(2, 5, "bab"),
            new Cetrta.Prostor(3, 93, "bab"),
            new Cetrta.Prostor(3, 52, "abb"),
            new Cetrta.Prostor(2, 40, "bab"),
            new Cetrta.Prostor(2, 31, "bab"),
            new Cetrta.Prostor(3, 1, "babab"),
            new Cetrta.Prostor(2, 95, "bab"),
            new Cetrta.Prostor(3, 2, "abb"),
            new Cetrta.Prostor(1, 14, "abb"),
            new Cetrta.Prostor(3, 91, "babab"),
            new Cetrta.Prostor(3, 87, "bab"),
            new Cetrta.Prostor(3, 18, "bab"),
            new Cetrta.Prostor(3, 67, "abb"),
            new Cetrta.Prostor(2, 14, "bab"),
            new Cetrta.Prostor(2, 47, "abb"),
            new Cetrta.Prostor(2, 42, "bab"),
            new Cetrta.Prostor(2, 27, "abb"),
            new Cetrta.Prostor(3, 81, "babb"),
            new Cetrta.Prostor(1, 61, "babb"),
            new Cetrta.Prostor(1, 54, "babab"),
            new Cetrta.Prostor(1, 60, "abb"),
            new Cetrta.Prostor(2, 10, "abb"),
            new Cetrta.Prostor(3, 39, "abb"),
            new Cetrta.Prostor(1, 53, "bab"),
            new Cetrta.Prostor(3, 28, "babab"),
            new Cetrta.Prostor(3, 33, "babb")
        ));

        List<String> namembnosti = new ArrayList<>(Cetrta.namembnosti(prostori));
        namembnosti.sort(null);
        System.out.println(namembnosti);
    }
}
