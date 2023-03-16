
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(1, 65, "bbb"),
            new Cetrta.Prostor(1, 4, "aa"),
            new Cetrta.Prostor(1, 85, "bab"),
            new Cetrta.Prostor(1, 78, "abbb"),
            new Cetrta.Prostor(1, 29, "bbb"),
            new Cetrta.Prostor(1, 61, "bbb"),
            new Cetrta.Prostor(1, 28, "babaa"),
            new Cetrta.Prostor(1, 76, "bab"),
            new Cetrta.Prostor(1, 99, "aa"),
            new Cetrta.Prostor(1, 70, "bbb"),
            new Cetrta.Prostor(1, 75, "abbb"),
            new Cetrta.Prostor(1, 40, "abbb"),
            new Cetrta.Prostor(1, 24, "bab"),
            new Cetrta.Prostor(1, 13, "bb"),
            new Cetrta.Prostor(1, 93, "aa"),
            new Cetrta.Prostor(1, 64, "aa"),
            new Cetrta.Prostor(1, 21, "ab"),
            new Cetrta.Prostor(1, 44, "aa"),
            new Cetrta.Prostor(1, 30, "ab"),
            new Cetrta.Prostor(1, 75, "babaa"),
            new Cetrta.Prostor(1, 84, "aa"),
            new Cetrta.Prostor(1, 44, "bb"),
            new Cetrta.Prostor(1, 95, "bab"),
            new Cetrta.Prostor(1, 23, "ab"),
            new Cetrta.Prostor(1, 4, "bb"),
            new Cetrta.Prostor(1, 70, "bab"),
            new Cetrta.Prostor(1, 70, "aa"),
            new Cetrta.Prostor(1, 93, "bb"),
            new Cetrta.Prostor(1, 8, "abbb"),
            new Cetrta.Prostor(1, 25, "abbb"),
            new Cetrta.Prostor(1, 62, "abbb"),
            new Cetrta.Prostor(1, 38, "bab"),
            new Cetrta.Prostor(1, 52, "babaa"),
            new Cetrta.Prostor(1, 8, "aa"),
            new Cetrta.Prostor(1, 43, "abbb"),
            new Cetrta.Prostor(1, 48, "abbb"),
            new Cetrta.Prostor(1, 19, "bbb"),
            new Cetrta.Prostor(1, 12, "abbb"),
            new Cetrta.Prostor(1, 80, "aa"),
            new Cetrta.Prostor(1, 72, "bb"),
            new Cetrta.Prostor(1, 5, "aa"),
            new Cetrta.Prostor(1, 92, "bab"),
            new Cetrta.Prostor(1, 36, "bab"),
            new Cetrta.Prostor(1, 57, "babaa"),
            new Cetrta.Prostor(1, 59, "aa"),
            new Cetrta.Prostor(1, 45, "bbb"),
            new Cetrta.Prostor(1, 15, "aa"),
            new Cetrta.Prostor(1, 58, "babaa"),
            new Cetrta.Prostor(1, 49, "bb"),
            new Cetrta.Prostor(1, 15, "bab"),
            new Cetrta.Prostor(1, 74, "bb"),
            new Cetrta.Prostor(1, 75, "aa"),
            new Cetrta.Prostor(1, 61, "bb"),
            new Cetrta.Prostor(1, 48, "ab"),
            new Cetrta.Prostor(1, 46, "bb"),
            new Cetrta.Prostor(1, 46, "bbb"),
            new Cetrta.Prostor(1, 76, "babaa"),
            new Cetrta.Prostor(1, 45, "babaa"),
            new Cetrta.Prostor(1, 10, "bb"),
            new Cetrta.Prostor(1, 66, "babaa"),
            new Cetrta.Prostor(1, 96, "aa"),
            new Cetrta.Prostor(1, 31, "bab"),
            new Cetrta.Prostor(1, 38, "babaa"),
            new Cetrta.Prostor(1, 91, "ab"),
            new Cetrta.Prostor(1, 71, "babaa"),
            new Cetrta.Prostor(1, 87, "bb"),
            new Cetrta.Prostor(1, 52, "aa"),
            new Cetrta.Prostor(1, 87, "bb"),
            new Cetrta.Prostor(1, 80, "abbb"),
            new Cetrta.Prostor(1, 75, "abbb"),
            new Cetrta.Prostor(1, 78, "bab"),
            new Cetrta.Prostor(1, 93, "bbb"),
            new Cetrta.Prostor(1, 12, "babaa"),
            new Cetrta.Prostor(1, 31, "bab"),
            new Cetrta.Prostor(1, 79, "bab"),
            new Cetrta.Prostor(1, 40, "ab"),
            new Cetrta.Prostor(1, 49, "aa"),
            new Cetrta.Prostor(1, 61, "aa"),
            new Cetrta.Prostor(1, 61, "abbb"),
            new Cetrta.Prostor(1, 51, "ab"),
            new Cetrta.Prostor(1, 8, "abbb"),
            new Cetrta.Prostor(1, 37, "bab"),
            new Cetrta.Prostor(1, 27, "bbb"),
            new Cetrta.Prostor(1, 84, "babaa"),
            new Cetrta.Prostor(1, 25, "babaa"),
            new Cetrta.Prostor(1, 89, "bb"),
            new Cetrta.Prostor(1, 46, "abbb"),
            new Cetrta.Prostor(1, 53, "aa"),
            new Cetrta.Prostor(1, 70, "bab"),
            new Cetrta.Prostor(1, 62, "babaa"),
            new Cetrta.Prostor(1, 11, "ab")
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
