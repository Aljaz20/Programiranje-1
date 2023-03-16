
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(3, 76, "bbbb"),
            new Cetrta.Prostor(1, 81, "ab"),
            new Cetrta.Prostor(4, 84, "aa"),
            new Cetrta.Prostor(2, 95, "ab"),
            new Cetrta.Prostor(1, 73, "aaaa"),
            new Cetrta.Prostor(6, 58, "baa"),
            new Cetrta.Prostor(4, 38, "bab"),
            new Cetrta.Prostor(5, 48, "bbbb"),
            new Cetrta.Prostor(1, 73, "ab"),
            new Cetrta.Prostor(6, 13, "bb"),
            new Cetrta.Prostor(5, 16, "bb"),
            new Cetrta.Prostor(5, 98, "bb"),
            new Cetrta.Prostor(4, 49, "ab"),
            new Cetrta.Prostor(5, 37, "bb"),
            new Cetrta.Prostor(2, 94, "baa"),
            new Cetrta.Prostor(4, 19, "bab"),
            new Cetrta.Prostor(5, 88, "ab"),
            new Cetrta.Prostor(3, 11, "aaaa"),
            new Cetrta.Prostor(4, 42, "bbbb"),
            new Cetrta.Prostor(6, 87, "aaaa"),
            new Cetrta.Prostor(1, 30, "ab"),
            new Cetrta.Prostor(1, 58, "baa"),
            new Cetrta.Prostor(2, 21, "abb"),
            new Cetrta.Prostor(6, 92, "bb"),
            new Cetrta.Prostor(4, 68, "baa"),
            new Cetrta.Prostor(3, 64, "ab"),
            new Cetrta.Prostor(5, 84, "bbbb"),
            new Cetrta.Prostor(1, 11, "bb"),
            new Cetrta.Prostor(4, 49, "bbbb"),
            new Cetrta.Prostor(1, 59, "bbbb"),
            new Cetrta.Prostor(4, 64, "baa"),
            new Cetrta.Prostor(6, 37, "abb"),
            new Cetrta.Prostor(3, 17, "baa"),
            new Cetrta.Prostor(2, 73, "aa"),
            new Cetrta.Prostor(5, 58, "bb"),
            new Cetrta.Prostor(5, 94, "aa"),
            new Cetrta.Prostor(4, 100, "baa"),
            new Cetrta.Prostor(6, 52, "baa"),
            new Cetrta.Prostor(1, 73, "aaaa"),
            new Cetrta.Prostor(3, 29, "aaaa"),
            new Cetrta.Prostor(4, 28, "bb"),
            new Cetrta.Prostor(2, 49, "ab"),
            new Cetrta.Prostor(2, 67, "ab"),
            new Cetrta.Prostor(3, 40, "bbbb"),
            new Cetrta.Prostor(5, 41, "bab"),
            new Cetrta.Prostor(2, 17, "ab"),
            new Cetrta.Prostor(5, 59, "baa"),
            new Cetrta.Prostor(6, 9, "bb"),
            new Cetrta.Prostor(3, 90, "ab"),
            new Cetrta.Prostor(5, 67, "ab"),
            new Cetrta.Prostor(6, 91, "baa"),
            new Cetrta.Prostor(5, 42, "bbbb"),
            new Cetrta.Prostor(6, 98, "ab"),
            new Cetrta.Prostor(5, 62, "baa"),
            new Cetrta.Prostor(1, 64, "abb"),
            new Cetrta.Prostor(2, 25, "bb"),
            new Cetrta.Prostor(5, 86, "baa"),
            new Cetrta.Prostor(3, 23, "bbbb"),
            new Cetrta.Prostor(5, 43, "bab"),
            new Cetrta.Prostor(6, 76, "bab"),
            new Cetrta.Prostor(1, 92, "abb"),
            new Cetrta.Prostor(5, 42, "ab"),
            new Cetrta.Prostor(2, 7, "baa"),
            new Cetrta.Prostor(3, 67, "bb"),
            new Cetrta.Prostor(6, 34, "ab"),
            new Cetrta.Prostor(4, 7, "abb"),
            new Cetrta.Prostor(5, 19, "aa"),
            new Cetrta.Prostor(1, 90, "bbbb"),
            new Cetrta.Prostor(6, 35, "baa"),
            new Cetrta.Prostor(1, 17, "ab"),
            new Cetrta.Prostor(3, 60, "bb"),
            new Cetrta.Prostor(3, 25, "bbbb"),
            new Cetrta.Prostor(4, 31, "ab"),
            new Cetrta.Prostor(6, 58, "ab"),
            new Cetrta.Prostor(4, 96, "abb"),
            new Cetrta.Prostor(2, 10, "bbbb"),
            new Cetrta.Prostor(3, 85, "aa")
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
