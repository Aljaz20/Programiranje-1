
import java.util.*;

public class Test45 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(2, 13, "abbaa"),
            new Cetrta.Prostor(1, 99, "baa"),
            new Cetrta.Prostor(6, 19, "aa"),
            new Cetrta.Prostor(5, 5, "aa"),
            new Cetrta.Prostor(4, 54, "aa"),
            new Cetrta.Prostor(3, 38, "abbaa"),
            new Cetrta.Prostor(5, 100, "bbbb"),
            new Cetrta.Prostor(6, 35, "ba"),
            new Cetrta.Prostor(5, 69, "baa"),
            new Cetrta.Prostor(3, 98, "baa"),
            new Cetrta.Prostor(1, 21, "baa"),
            new Cetrta.Prostor(5, 54, "ba"),
            new Cetrta.Prostor(6, 80, "ba"),
            new Cetrta.Prostor(6, 15, "ba"),
            new Cetrta.Prostor(5, 39, "ba"),
            new Cetrta.Prostor(1, 70, "abbaa"),
            new Cetrta.Prostor(3, 36, "bbbb"),
            new Cetrta.Prostor(5, 56, "abbaa"),
            new Cetrta.Prostor(3, 12, "bbbb"),
            new Cetrta.Prostor(3, 28, "baa"),
            new Cetrta.Prostor(5, 78, "bbbb"),
            new Cetrta.Prostor(5, 11, "baa"),
            new Cetrta.Prostor(4, 63, "ba"),
            new Cetrta.Prostor(4, 77, "baa"),
            new Cetrta.Prostor(4, 38, "baa"),
            new Cetrta.Prostor(2, 96, "aa"),
            new Cetrta.Prostor(2, 91, "baa"),
            new Cetrta.Prostor(6, 61, "baa"),
            new Cetrta.Prostor(2, 86, "abbaa"),
            new Cetrta.Prostor(5, 26, "bbbb"),
            new Cetrta.Prostor(3, 61, "bbbb"),
            new Cetrta.Prostor(2, 52, "ba"),
            new Cetrta.Prostor(2, 73, "abbaa"),
            new Cetrta.Prostor(1, 98, "ba"),
            new Cetrta.Prostor(3, 29, "abbaa"),
            new Cetrta.Prostor(5, 74, "abbaa"),
            new Cetrta.Prostor(5, 30, "ba"),
            new Cetrta.Prostor(5, 14, "aa"),
            new Cetrta.Prostor(6, 44, "baa"),
            new Cetrta.Prostor(4, 43, "ba"),
            new Cetrta.Prostor(4, 53, "abbaa"),
            new Cetrta.Prostor(6, 42, "baa"),
            new Cetrta.Prostor(1, 19, "aa"),
            new Cetrta.Prostor(2, 33, "ba"),
            new Cetrta.Prostor(2, 14, "bbbb"),
            new Cetrta.Prostor(6, 81, "bbbb"),
            new Cetrta.Prostor(6, 94, "ba"),
            new Cetrta.Prostor(2, 74, "bbbb"),
            new Cetrta.Prostor(3, 32, "ba"),
            new Cetrta.Prostor(4, 63, "ba"),
            new Cetrta.Prostor(3, 52, "ba"),
            new Cetrta.Prostor(3, 57, "aa"),
            new Cetrta.Prostor(1, 40, "bbbb"),
            new Cetrta.Prostor(6, 29, "abbaa"),
            new Cetrta.Prostor(2, 14, "ba"),
            new Cetrta.Prostor(4, 28, "baa"),
            new Cetrta.Prostor(5, 88, "bbbb"),
            new Cetrta.Prostor(3, 31, "baa"),
            new Cetrta.Prostor(5, 80, "baa"),
            new Cetrta.Prostor(1, 66, "ba"),
            new Cetrta.Prostor(3, 61, "ba"),
            new Cetrta.Prostor(5, 97, "aa"),
            new Cetrta.Prostor(2, 17, "abbaa"),
            new Cetrta.Prostor(1, 40, "abbaa"),
            new Cetrta.Prostor(3, 29, "ba"),
            new Cetrta.Prostor(1, 74, "ba"),
            new Cetrta.Prostor(6, 65, "bbbb"),
            new Cetrta.Prostor(4, 99, "ba"),
            new Cetrta.Prostor(3, 67, "bbbb"),
            new Cetrta.Prostor(6, 45, "aa"),
            new Cetrta.Prostor(5, 68, "bbbb"),
            new Cetrta.Prostor(1, 20, "baa"),
            new Cetrta.Prostor(5, 9, "abbaa"),
            new Cetrta.Prostor(1, 91, "baa"),
            new Cetrta.Prostor(4, 54, "abbaa"),
            new Cetrta.Prostor(4, 18, "abbaa"),
            new Cetrta.Prostor(1, 43, "ba"),
            new Cetrta.Prostor(1, 99, "ba"),
            new Cetrta.Prostor(5, 36, "bbbb"),
            new Cetrta.Prostor(1, 67, "ba"),
            new Cetrta.Prostor(5, 62, "abbaa"),
            new Cetrta.Prostor(4, 74, "abbaa"),
            new Cetrta.Prostor(6, 47, "abbaa"),
            new Cetrta.Prostor(1, 47, "baa"),
            new Cetrta.Prostor(3, 37, "ba"),
            new Cetrta.Prostor(5, 36, "baa"),
            new Cetrta.Prostor(2, 87, "aa"),
            new Cetrta.Prostor(1, 36, "ba"),
            new Cetrta.Prostor(2, 97, "baa"),
            new Cetrta.Prostor(4, 80, "bbbb"),
            new Cetrta.Prostor(6, 78, "ba"),
            new Cetrta.Prostor(3, 98, "ba"),
            new Cetrta.Prostor(5, 34, "abbaa"),
            new Cetrta.Prostor(1, 11, "abbaa")
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
