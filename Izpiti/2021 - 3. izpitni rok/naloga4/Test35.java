
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(4, 7, "aaaab"),
            new Cetrta.Prostor(7, 34, "aa"),
            new Cetrta.Prostor(5, 11, "aa"),
            new Cetrta.Prostor(5, 42, "aab"),
            new Cetrta.Prostor(3, 59, "bbb"),
            new Cetrta.Prostor(6, 22, "aab"),
            new Cetrta.Prostor(1, 35, "aa"),
            new Cetrta.Prostor(5, 6, "aa"),
            new Cetrta.Prostor(1, 38, "aa"),
            new Cetrta.Prostor(7, 24, "bbb"),
            new Cetrta.Prostor(2, 5, "aaaab"),
            new Cetrta.Prostor(3, 79, "aa"),
            new Cetrta.Prostor(8, 25, "aab"),
            new Cetrta.Prostor(8, 3, "aaaab"),
            new Cetrta.Prostor(6, 98, "bbb"),
            new Cetrta.Prostor(1, 57, "aa"),
            new Cetrta.Prostor(3, 14, "aab"),
            new Cetrta.Prostor(1, 57, "ba"),
            new Cetrta.Prostor(1, 71, "baa"),
            new Cetrta.Prostor(3, 8, "aab"),
            new Cetrta.Prostor(5, 84, "aaaab"),
            new Cetrta.Prostor(1, 29, "baa"),
            new Cetrta.Prostor(2, 86, "bbb"),
            new Cetrta.Prostor(8, 76, "aaaab"),
            new Cetrta.Prostor(4, 49, "aa"),
            new Cetrta.Prostor(2, 90, "aa"),
            new Cetrta.Prostor(8, 2, "baa"),
            new Cetrta.Prostor(8, 38, "aaaab"),
            new Cetrta.Prostor(4, 53, "ba"),
            new Cetrta.Prostor(4, 53, "ba"),
            new Cetrta.Prostor(1, 45, "aaaab"),
            new Cetrta.Prostor(5, 88, "aa"),
            new Cetrta.Prostor(3, 10, "aaaab"),
            new Cetrta.Prostor(1, 4, "aa"),
            new Cetrta.Prostor(3, 13, "aaaab"),
            new Cetrta.Prostor(7, 38, "aa"),
            new Cetrta.Prostor(7, 55, "baa"),
            new Cetrta.Prostor(2, 68, "aa"),
            new Cetrta.Prostor(4, 18, "ba"),
            new Cetrta.Prostor(5, 20, "aa"),
            new Cetrta.Prostor(8, 50, "ba"),
            new Cetrta.Prostor(4, 69, "aaaab"),
            new Cetrta.Prostor(2, 8, "aaaab"),
            new Cetrta.Prostor(8, 67, "aab"),
            new Cetrta.Prostor(4, 50, "ba"),
            new Cetrta.Prostor(3, 96, "aa"),
            new Cetrta.Prostor(1, 91, "aa"),
            new Cetrta.Prostor(8, 84, "ba"),
            new Cetrta.Prostor(1, 12, "ba"),
            new Cetrta.Prostor(5, 11, "bbb"),
            new Cetrta.Prostor(7, 12, "aa"),
            new Cetrta.Prostor(5, 83, "aa"),
            new Cetrta.Prostor(4, 2, "aaaab"),
            new Cetrta.Prostor(2, 90, "baa"),
            new Cetrta.Prostor(5, 12, "aa"),
            new Cetrta.Prostor(3, 20, "aaaab"),
            new Cetrta.Prostor(5, 57, "baa"),
            new Cetrta.Prostor(5, 13, "aa"),
            new Cetrta.Prostor(1, 16, "aa"),
            new Cetrta.Prostor(8, 51, "aa"),
            new Cetrta.Prostor(4, 38, "ba"),
            new Cetrta.Prostor(3, 23, "bbb"),
            new Cetrta.Prostor(5, 99, "aab"),
            new Cetrta.Prostor(8, 18, "aa"),
            new Cetrta.Prostor(1, 98, "bbb"),
            new Cetrta.Prostor(1, 51, "ba"),
            new Cetrta.Prostor(2, 17, "baa"),
            new Cetrta.Prostor(5, 93, "aa"),
            new Cetrta.Prostor(3, 53, "bbb"),
            new Cetrta.Prostor(7, 22, "aaaab"),
            new Cetrta.Prostor(3, 5, "aab"),
            new Cetrta.Prostor(1, 43, "bbb"),
            new Cetrta.Prostor(4, 84, "baa"),
            new Cetrta.Prostor(4, 76, "aa"),
            new Cetrta.Prostor(7, 18, "bbb"),
            new Cetrta.Prostor(2, 5, "aaaab"),
            new Cetrta.Prostor(8, 52, "bbb"),
            new Cetrta.Prostor(5, 70, "aa"),
            new Cetrta.Prostor(4, 13, "aab"),
            new Cetrta.Prostor(6, 12, "baa"),
            new Cetrta.Prostor(3, 71, "aaaab"),
            new Cetrta.Prostor(1, 55, "ba"),
            new Cetrta.Prostor(4, 65, "ba"),
            new Cetrta.Prostor(3, 90, "aaaab"),
            new Cetrta.Prostor(6, 19, "aaaab"),
            new Cetrta.Prostor(5, 68, "baa"),
            new Cetrta.Prostor(3, 91, "aab"),
            new Cetrta.Prostor(7, 3, "aaaab"),
            new Cetrta.Prostor(7, 10, "aaaab")
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
