
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(3, 46, "aba"),
            new Cetrta.Prostor(6, 81, "baaab"),
            new Cetrta.Prostor(8, 49, "baaab"),
            new Cetrta.Prostor(6, 49, "baaab"),
            new Cetrta.Prostor(3, 83, "aba"),
            new Cetrta.Prostor(1, 44, "aba"),
            new Cetrta.Prostor(1, 64, "aba"),
            new Cetrta.Prostor(4, 83, "baaab"),
            new Cetrta.Prostor(1, 88, "baaab"),
            new Cetrta.Prostor(4, 66, "aba"),
            new Cetrta.Prostor(1, 80, "baaab"),
            new Cetrta.Prostor(3, 97, "baaab"),
            new Cetrta.Prostor(3, 21, "aba"),
            new Cetrta.Prostor(1, 23, "aba"),
            new Cetrta.Prostor(7, 35, "baaab"),
            new Cetrta.Prostor(1, 46, "aba"),
            new Cetrta.Prostor(6, 1, "baaab"),
            new Cetrta.Prostor(7, 11, "aba"),
            new Cetrta.Prostor(1, 57, "baaab"),
            new Cetrta.Prostor(7, 76, "aba"),
            new Cetrta.Prostor(2, 57, "baaab"),
            new Cetrta.Prostor(1, 8, "baaab"),
            new Cetrta.Prostor(7, 72, "baaab"),
            new Cetrta.Prostor(1, 9, "baaab"),
            new Cetrta.Prostor(8, 88, "baaab"),
            new Cetrta.Prostor(5, 85, "aba"),
            new Cetrta.Prostor(3, 47, "baaab"),
            new Cetrta.Prostor(5, 96, "baaab"),
            new Cetrta.Prostor(2, 17, "aba"),
            new Cetrta.Prostor(6, 68, "baaab"),
            new Cetrta.Prostor(7, 41, "baaab"),
            new Cetrta.Prostor(3, 62, "aba"),
            new Cetrta.Prostor(8, 35, "aba"),
            new Cetrta.Prostor(8, 76, "aba"),
            new Cetrta.Prostor(5, 97, "aba"),
            new Cetrta.Prostor(5, 28, "aba"),
            new Cetrta.Prostor(6, 47, "baaab"),
            new Cetrta.Prostor(4, 78, "aba"),
            new Cetrta.Prostor(8, 54, "baaab"),
            new Cetrta.Prostor(4, 93, "baaab"),
            new Cetrta.Prostor(4, 60, "baaab"),
            new Cetrta.Prostor(2, 19, "baaab"),
            new Cetrta.Prostor(5, 39, "aba"),
            new Cetrta.Prostor(8, 35, "aba"),
            new Cetrta.Prostor(3, 84, "baaab"),
            new Cetrta.Prostor(8, 89, "aba"),
            new Cetrta.Prostor(4, 16, "aba"),
            new Cetrta.Prostor(1, 39, "aba"),
            new Cetrta.Prostor(3, 39, "aba"),
            new Cetrta.Prostor(8, 74, "baaab"),
            new Cetrta.Prostor(6, 57, "baaab"),
            new Cetrta.Prostor(4, 20, "baaab"),
            new Cetrta.Prostor(8, 87, "baaab"),
            new Cetrta.Prostor(7, 100, "aba"),
            new Cetrta.Prostor(8, 20, "aba"),
            new Cetrta.Prostor(6, 8, "aba"),
            new Cetrta.Prostor(3, 58, "baaab"),
            new Cetrta.Prostor(4, 22, "baaab")
        ));

        List<String> namembnosti = new ArrayList<>(Cetrta.namembnosti(prostori));
        namembnosti.sort(null);
        System.out.println(namembnosti);
    }
}
