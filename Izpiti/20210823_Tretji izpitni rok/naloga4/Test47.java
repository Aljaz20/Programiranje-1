
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(6, 20, "aba"),
            new Cetrta.Prostor(2, 94, "aba"),
            new Cetrta.Prostor(5, 35, "abab"),
            new Cetrta.Prostor(4, 71, "abab"),
            new Cetrta.Prostor(9, 39, "abab"),
            new Cetrta.Prostor(6, 54, "aba"),
            new Cetrta.Prostor(9, 26, "aabb"),
            new Cetrta.Prostor(5, 9, "aba"),
            new Cetrta.Prostor(1, 45, "abab"),
            new Cetrta.Prostor(7, 14, "aabb"),
            new Cetrta.Prostor(1, 86, "aabb"),
            new Cetrta.Prostor(2, 13, "aba"),
            new Cetrta.Prostor(2, 97, "abab"),
            new Cetrta.Prostor(5, 44, "abab"),
            new Cetrta.Prostor(1, 45, "aabb"),
            new Cetrta.Prostor(8, 72, "aba"),
            new Cetrta.Prostor(9, 47, "aba"),
            new Cetrta.Prostor(4, 31, "abab"),
            new Cetrta.Prostor(7, 10, "aabb"),
            new Cetrta.Prostor(6, 92, "aabb"),
            new Cetrta.Prostor(7, 47, "aabb"),
            new Cetrta.Prostor(6, 91, "abab"),
            new Cetrta.Prostor(8, 26, "aba"),
            new Cetrta.Prostor(9, 23, "abab"),
            new Cetrta.Prostor(5, 3, "aba"),
            new Cetrta.Prostor(4, 67, "abab"),
            new Cetrta.Prostor(5, 15, "aabb"),
            new Cetrta.Prostor(1, 84, "aabb"),
            new Cetrta.Prostor(2, 43, "aba"),
            new Cetrta.Prostor(7, 100, "abab"),
            new Cetrta.Prostor(3, 5, "abab"),
            new Cetrta.Prostor(8, 53, "aba"),
            new Cetrta.Prostor(1, 57, "abab"),
            new Cetrta.Prostor(8, 68, "abab"),
            new Cetrta.Prostor(1, 36, "aabb"),
            new Cetrta.Prostor(2, 89, "aabb"),
            new Cetrta.Prostor(7, 28, "aba"),
            new Cetrta.Prostor(4, 32, "aabb"),
            new Cetrta.Prostor(3, 20, "aabb"),
            new Cetrta.Prostor(9, 31, "abab"),
            new Cetrta.Prostor(8, 83, "aba"),
            new Cetrta.Prostor(2, 48, "abab"),
            new Cetrta.Prostor(1, 7, "abab"),
            new Cetrta.Prostor(8, 93, "aabb"),
            new Cetrta.Prostor(1, 95, "aba"),
            new Cetrta.Prostor(7, 44, "aabb"),
            new Cetrta.Prostor(5, 9, "abab"),
            new Cetrta.Prostor(8, 91, "abab"),
            new Cetrta.Prostor(1, 10, "aba"),
            new Cetrta.Prostor(9, 5, "aba"),
            new Cetrta.Prostor(4, 83, "aabb"),
            new Cetrta.Prostor(7, 18, "aba"),
            new Cetrta.Prostor(4, 84, "abab"),
            new Cetrta.Prostor(4, 11, "abab"),
            new Cetrta.Prostor(2, 17, "abab"),
            new Cetrta.Prostor(4, 92, "aabb"),
            new Cetrta.Prostor(5, 56, "aba"),
            new Cetrta.Prostor(1, 81, "abab"),
            new Cetrta.Prostor(7, 27, "aba"),
            new Cetrta.Prostor(8, 58, "aba"),
            new Cetrta.Prostor(1, 24, "abab"),
            new Cetrta.Prostor(2, 8, "aabb"),
            new Cetrta.Prostor(4, 77, "aabb"),
            new Cetrta.Prostor(1, 89, "abab"),
            new Cetrta.Prostor(9, 90, "aabb"),
            new Cetrta.Prostor(2, 20, "abab"),
            new Cetrta.Prostor(1, 67, "aba"),
            new Cetrta.Prostor(5, 16, "aba"),
            new Cetrta.Prostor(5, 45, "aabb"),
            new Cetrta.Prostor(7, 47, "aabb"),
            new Cetrta.Prostor(6, 55, "abab"),
            new Cetrta.Prostor(4, 31, "aabb"),
            new Cetrta.Prostor(4, 34, "aabb"),
            new Cetrta.Prostor(7, 67, "aabb"),
            new Cetrta.Prostor(5, 80, "abab"),
            new Cetrta.Prostor(8, 32, "aabb"),
            new Cetrta.Prostor(2, 85, "aba"),
            new Cetrta.Prostor(2, 62, "aabb"),
            new Cetrta.Prostor(4, 89, "aba"),
            new Cetrta.Prostor(4, 48, "aba"),
            new Cetrta.Prostor(2, 32, "abab"),
            new Cetrta.Prostor(4, 91, "abab"),
            new Cetrta.Prostor(6, 25, "abab"),
            new Cetrta.Prostor(2, 36, "aabb"),
            new Cetrta.Prostor(9, 90, "abab"),
            new Cetrta.Prostor(8, 49, "aba"),
            new Cetrta.Prostor(6, 100, "aba"),
            new Cetrta.Prostor(2, 7, "aabb"),
            new Cetrta.Prostor(7, 86, "aba"),
            new Cetrta.Prostor(7, 23, "abab"),
            new Cetrta.Prostor(6, 81, "abab"),
            new Cetrta.Prostor(9, 33, "aba"),
            new Cetrta.Prostor(6, 67, "aba"),
            new Cetrta.Prostor(9, 6, "aabb"),
            new Cetrta.Prostor(9, 86, "aabb"),
            new Cetrta.Prostor(5, 19, "aabb"),
            new Cetrta.Prostor(8, 79, "aabb"),
            new Cetrta.Prostor(4, 11, "aba"),
            new Cetrta.Prostor(8, 72, "aba")
        ));

        Map<Integer, Map<String, Integer>> statistika = Cetrta.statistika(prostori);
        List<Integer> nadstropja = new ArrayList<>(statistika.keySet());
        nadstropja.sort(null);

        for (int nadstropje: nadstropja) {
            Map<String, Integer> n2p = statistika.get(nadstropje);
            if (n2p != null) {
                List<String> namembnosti = new ArrayList<>(n2p.keySet());
                namembnosti.sort(null);
                for (String namembnost: namembnosti) {
                    System.out.printf("(%d, %s): %d%n",
                    nadstropje, namembnost, n2p.get(namembnost));
                }
            }
        }
    }
}
