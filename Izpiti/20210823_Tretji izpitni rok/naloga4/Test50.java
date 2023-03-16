
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(5, 68, "babba"),
            new Cetrta.Prostor(7, 90, "babba"),
            new Cetrta.Prostor(4, 19, "babba"),
            new Cetrta.Prostor(7, 79, "babba"),
            new Cetrta.Prostor(1, 90, "abbba"),
            new Cetrta.Prostor(2, 48, "babba"),
            new Cetrta.Prostor(2, 83, "abbba"),
            new Cetrta.Prostor(5, 43, "babba"),
            new Cetrta.Prostor(2, 37, "babba"),
            new Cetrta.Prostor(3, 87, "ab"),
            new Cetrta.Prostor(6, 49, "ab"),
            new Cetrta.Prostor(2, 83, "ab"),
            new Cetrta.Prostor(7, 69, "abbba"),
            new Cetrta.Prostor(3, 86, "abbba"),
            new Cetrta.Prostor(5, 71, "abbba"),
            new Cetrta.Prostor(4, 75, "babba"),
            new Cetrta.Prostor(3, 91, "ab"),
            new Cetrta.Prostor(7, 74, "abbba"),
            new Cetrta.Prostor(5, 31, "abbba"),
            new Cetrta.Prostor(5, 71, "ab"),
            new Cetrta.Prostor(4, 76, "abbba"),
            new Cetrta.Prostor(8, 24, "ab"),
            new Cetrta.Prostor(7, 35, "abbba"),
            new Cetrta.Prostor(7, 26, "ab"),
            new Cetrta.Prostor(4, 26, "babba"),
            new Cetrta.Prostor(5, 25, "ab"),
            new Cetrta.Prostor(5, 11, "abbba"),
            new Cetrta.Prostor(6, 52, "babba"),
            new Cetrta.Prostor(2, 81, "ab"),
            new Cetrta.Prostor(1, 72, "abbba"),
            new Cetrta.Prostor(8, 51, "babba"),
            new Cetrta.Prostor(4, 57, "babba"),
            new Cetrta.Prostor(1, 34, "babba"),
            new Cetrta.Prostor(6, 34, "babba"),
            new Cetrta.Prostor(3, 83, "babba"),
            new Cetrta.Prostor(3, 55, "babba"),
            new Cetrta.Prostor(4, 47, "ab"),
            new Cetrta.Prostor(6, 54, "abbba"),
            new Cetrta.Prostor(2, 69, "abbba"),
            new Cetrta.Prostor(2, 89, "abbba"),
            new Cetrta.Prostor(4, 72, "abbba"),
            new Cetrta.Prostor(2, 80, "babba"),
            new Cetrta.Prostor(8, 55, "abbba"),
            new Cetrta.Prostor(7, 82, "ab"),
            new Cetrta.Prostor(5, 58, "abbba"),
            new Cetrta.Prostor(4, 21, "babba"),
            new Cetrta.Prostor(4, 76, "abbba"),
            new Cetrta.Prostor(1, 60, "ab"),
            new Cetrta.Prostor(8, 61, "abbba"),
            new Cetrta.Prostor(6, 49, "abbba"),
            new Cetrta.Prostor(3, 25, "ab")
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
