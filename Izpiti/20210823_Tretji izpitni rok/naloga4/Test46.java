
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(2, 29, "abab"),
            new Cetrta.Prostor(5, 66, "abab"),
            new Cetrta.Prostor(3, 96, "aabb"),
            new Cetrta.Prostor(2, 34, "abab"),
            new Cetrta.Prostor(1, 10, "abab"),
            new Cetrta.Prostor(2, 13, "abab"),
            new Cetrta.Prostor(4, 51, "aabb"),
            new Cetrta.Prostor(3, 86, "aabb"),
            new Cetrta.Prostor(3, 44, "aabb"),
            new Cetrta.Prostor(1, 75, "abab"),
            new Cetrta.Prostor(4, 6, "abab"),
            new Cetrta.Prostor(3, 70, "baa"),
            new Cetrta.Prostor(3, 9, "abab"),
            new Cetrta.Prostor(1, 12, "baa"),
            new Cetrta.Prostor(1, 7, "baa"),
            new Cetrta.Prostor(4, 44, "bbbab"),
            new Cetrta.Prostor(4, 12, "baa"),
            new Cetrta.Prostor(1, 32, "abab"),
            new Cetrta.Prostor(4, 66, "baa"),
            new Cetrta.Prostor(1, 43, "baa"),
            new Cetrta.Prostor(3, 84, "bbbab"),
            new Cetrta.Prostor(5, 31, "bbbab"),
            new Cetrta.Prostor(4, 49, "aabb"),
            new Cetrta.Prostor(1, 30, "aabb"),
            new Cetrta.Prostor(3, 15, "aabb"),
            new Cetrta.Prostor(2, 88, "abab"),
            new Cetrta.Prostor(5, 21, "baa"),
            new Cetrta.Prostor(4, 66, "aabb"),
            new Cetrta.Prostor(4, 76, "baa"),
            new Cetrta.Prostor(4, 34, "bbbab"),
            new Cetrta.Prostor(2, 89, "baa"),
            new Cetrta.Prostor(2, 66, "abab"),
            new Cetrta.Prostor(1, 72, "bbbab"),
            new Cetrta.Prostor(3, 69, "baa"),
            new Cetrta.Prostor(2, 90, "aabb"),
            new Cetrta.Prostor(4, 33, "aabb"),
            new Cetrta.Prostor(4, 78, "aabb"),
            new Cetrta.Prostor(5, 92, "bbbab"),
            new Cetrta.Prostor(1, 13, "abab"),
            new Cetrta.Prostor(5, 11, "aabb"),
            new Cetrta.Prostor(1, 27, "aabb"),
            new Cetrta.Prostor(1, 71, "bbbab"),
            new Cetrta.Prostor(2, 48, "bbbab"),
            new Cetrta.Prostor(3, 35, "baa"),
            new Cetrta.Prostor(4, 75, "aabb"),
            new Cetrta.Prostor(2, 18, "aabb"),
            new Cetrta.Prostor(3, 37, "bbbab"),
            new Cetrta.Prostor(2, 37, "aabb"),
            new Cetrta.Prostor(1, 5, "abab"),
            new Cetrta.Prostor(2, 33, "abab"),
            new Cetrta.Prostor(1, 20, "baa"),
            new Cetrta.Prostor(5, 22, "aabb"),
            new Cetrta.Prostor(2, 66, "aabb"),
            new Cetrta.Prostor(2, 65, "abab"),
            new Cetrta.Prostor(4, 11, "baa"),
            new Cetrta.Prostor(2, 18, "aabb"),
            new Cetrta.Prostor(1, 60, "bbbab"),
            new Cetrta.Prostor(4, 22, "bbbab"),
            new Cetrta.Prostor(3, 36, "abab"),
            new Cetrta.Prostor(1, 17, "bbbab"),
            new Cetrta.Prostor(4, 94, "abab"),
            new Cetrta.Prostor(1, 97, "bbbab"),
            new Cetrta.Prostor(1, 81, "bbbab"),
            new Cetrta.Prostor(2, 35, "bbbab")
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
