
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(3, 95, "ba"),
            new Cetrta.Prostor(2, 45, "ba"),
            new Cetrta.Prostor(2, 68, "abb"),
            new Cetrta.Prostor(3, 62, "bbaba"),
            new Cetrta.Prostor(4, 76, "abb"),
            new Cetrta.Prostor(3, 43, "aab"),
            new Cetrta.Prostor(5, 90, "aab"),
            new Cetrta.Prostor(2, 79, "abb"),
            new Cetrta.Prostor(4, 51, "bbaba"),
            new Cetrta.Prostor(4, 50, "ba"),
            new Cetrta.Prostor(2, 3, "aab"),
            new Cetrta.Prostor(5, 21, "bbaba"),
            new Cetrta.Prostor(5, 92, "bbaba"),
            new Cetrta.Prostor(4, 20, "aab"),
            new Cetrta.Prostor(5, 88, "abb"),
            new Cetrta.Prostor(4, 13, "ba"),
            new Cetrta.Prostor(3, 83, "ba"),
            new Cetrta.Prostor(3, 93, "aab"),
            new Cetrta.Prostor(4, 53, "abb"),
            new Cetrta.Prostor(3, 50, "bbaba"),
            new Cetrta.Prostor(3, 87, "abb"),
            new Cetrta.Prostor(5, 35, "bbaba"),
            new Cetrta.Prostor(2, 59, "bbaba"),
            new Cetrta.Prostor(5, 51, "bbaba"),
            new Cetrta.Prostor(4, 7, "abb"),
            new Cetrta.Prostor(3, 94, "bbaba"),
            new Cetrta.Prostor(2, 61, "bbaba"),
            new Cetrta.Prostor(4, 94, "bbaba"),
            new Cetrta.Prostor(3, 66, "bbaba"),
            new Cetrta.Prostor(3, 96, "bbaba"),
            new Cetrta.Prostor(4, 86, "aab"),
            new Cetrta.Prostor(4, 64, "abb"),
            new Cetrta.Prostor(3, 100, "ba"),
            new Cetrta.Prostor(5, 72, "aab"),
            new Cetrta.Prostor(1, 50, "bbaba"),
            new Cetrta.Prostor(1, 62, "bbaba"),
            new Cetrta.Prostor(5, 22, "aab"),
            new Cetrta.Prostor(5, 75, "abb"),
            new Cetrta.Prostor(4, 25, "abb"),
            new Cetrta.Prostor(3, 41, "abb"),
            new Cetrta.Prostor(2, 17, "abb"),
            new Cetrta.Prostor(5, 29, "bbaba"),
            new Cetrta.Prostor(4, 40, "bbaba"),
            new Cetrta.Prostor(5, 31, "bbaba"),
            new Cetrta.Prostor(1, 76, "aab"),
            new Cetrta.Prostor(5, 48, "ba"),
            new Cetrta.Prostor(2, 90, "ba"),
            new Cetrta.Prostor(2, 81, "ba"),
            new Cetrta.Prostor(5, 87, "bbaba"),
            new Cetrta.Prostor(1, 85, "bbaba"),
            new Cetrta.Prostor(1, 47, "abb"),
            new Cetrta.Prostor(2, 61, "ba"),
            new Cetrta.Prostor(2, 55, "bbaba"),
            new Cetrta.Prostor(3, 53, "bbaba"),
            new Cetrta.Prostor(3, 90, "bbaba"),
            new Cetrta.Prostor(1, 59, "aab"),
            new Cetrta.Prostor(4, 42, "aab"),
            new Cetrta.Prostor(2, 10, "aab"),
            new Cetrta.Prostor(4, 96, "abb"),
            new Cetrta.Prostor(3, 26, "bbaba"),
            new Cetrta.Prostor(2, 47, "aab"),
            new Cetrta.Prostor(1, 88, "ba"),
            new Cetrta.Prostor(2, 21, "abb"),
            new Cetrta.Prostor(1, 86, "abb")
        ));

        List<String> namembnosti = new ArrayList<>(Cetrta.namembnosti(prostori));
        namembnosti.sort(null);
        System.out.println(namembnosti);
    }
}
