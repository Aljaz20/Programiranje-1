
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(3, 88, "bb"),
            new Cetrta.Prostor(1, 86, "baaa"),
            new Cetrta.Prostor(1, 4, "baaa"),
            new Cetrta.Prostor(3, 35, "baaa"),
            new Cetrta.Prostor(2, 79, "bb"),
            new Cetrta.Prostor(1, 42, "bb"),
            new Cetrta.Prostor(2, 49, "bbbb"),
            new Cetrta.Prostor(1, 89, "baaa"),
            new Cetrta.Prostor(1, 28, "bbbb"),
            new Cetrta.Prostor(3, 99, "bb"),
            new Cetrta.Prostor(1, 76, "bbbb"),
            new Cetrta.Prostor(3, 27, "bb"),
            new Cetrta.Prostor(3, 88, "aa"),
            new Cetrta.Prostor(3, 64, "aa"),
            new Cetrta.Prostor(2, 36, "bb"),
            new Cetrta.Prostor(3, 10, "bb"),
            new Cetrta.Prostor(3, 6, "bb"),
            new Cetrta.Prostor(2, 62, "bb"),
            new Cetrta.Prostor(3, 24, "bbbb"),
            new Cetrta.Prostor(3, 81, "bb"),
            new Cetrta.Prostor(1, 53, "bbbb"),
            new Cetrta.Prostor(2, 22, "bb"),
            new Cetrta.Prostor(1, 55, "bb"),
            new Cetrta.Prostor(1, 22, "aa"),
            new Cetrta.Prostor(1, 80, "baaa"),
            new Cetrta.Prostor(3, 12, "bb"),
            new Cetrta.Prostor(2, 25, "bbbb"),
            new Cetrta.Prostor(2, 67, "bb"),
            new Cetrta.Prostor(1, 84, "baaa"),
            new Cetrta.Prostor(1, 74, "aa"),
            new Cetrta.Prostor(2, 4, "baaa"),
            new Cetrta.Prostor(2, 30, "bb"),
            new Cetrta.Prostor(2, 43, "bbbb"),
            new Cetrta.Prostor(3, 42, "bb"),
            new Cetrta.Prostor(3, 64, "bb"),
            new Cetrta.Prostor(1, 96, "bbbb"),
            new Cetrta.Prostor(1, 48, "bb"),
            new Cetrta.Prostor(1, 49, "baaa"),
            new Cetrta.Prostor(3, 34, "bbbb"),
            new Cetrta.Prostor(1, 87, "bb"),
            new Cetrta.Prostor(3, 36, "bbbb"),
            new Cetrta.Prostor(3, 57, "baaa"),
            new Cetrta.Prostor(3, 25, "bbbb"),
            new Cetrta.Prostor(1, 100, "bbbb"),
            new Cetrta.Prostor(2, 5, "bb"),
            new Cetrta.Prostor(1, 23, "aa"),
            new Cetrta.Prostor(1, 21, "bb"),
            new Cetrta.Prostor(3, 91, "aa"),
            new Cetrta.Prostor(3, 47, "bb"),
            new Cetrta.Prostor(3, 52, "bb"),
            new Cetrta.Prostor(1, 97, "bbbb"),
            new Cetrta.Prostor(1, 97, "bb"),
            new Cetrta.Prostor(3, 96, "baaa"),
            new Cetrta.Prostor(2, 62, "baaa"),
            new Cetrta.Prostor(2, 5, "bb"),
            new Cetrta.Prostor(3, 25, "bb"),
            new Cetrta.Prostor(1, 3, "aa")
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
