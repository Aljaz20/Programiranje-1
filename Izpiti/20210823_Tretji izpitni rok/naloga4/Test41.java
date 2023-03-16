
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(1, 59, "aabba"),
            new Cetrta.Prostor(1, 64, "baba"),
            new Cetrta.Prostor(1, 7, "ba"),
            new Cetrta.Prostor(1, 69, "aab"),
            new Cetrta.Prostor(1, 51, "abb"),
            new Cetrta.Prostor(1, 74, "bba"),
            new Cetrta.Prostor(1, 88, "aab"),
            new Cetrta.Prostor(1, 21, "bba"),
            new Cetrta.Prostor(1, 99, "bba"),
            new Cetrta.Prostor(1, 17, "abb"),
            new Cetrta.Prostor(1, 22, "baba"),
            new Cetrta.Prostor(1, 5, "aab"),
            new Cetrta.Prostor(1, 64, "ba"),
            new Cetrta.Prostor(1, 76, "ba"),
            new Cetrta.Prostor(1, 66, "aab"),
            new Cetrta.Prostor(1, 43, "baaa"),
            new Cetrta.Prostor(1, 68, "baba"),
            new Cetrta.Prostor(1, 65, "abb"),
            new Cetrta.Prostor(1, 5, "ba"),
            new Cetrta.Prostor(1, 30, "aab"),
            new Cetrta.Prostor(1, 58, "aabba"),
            new Cetrta.Prostor(1, 94, "baba"),
            new Cetrta.Prostor(1, 89, "baaa"),
            new Cetrta.Prostor(1, 7, "abb"),
            new Cetrta.Prostor(1, 15, "ba"),
            new Cetrta.Prostor(1, 29, "abb"),
            new Cetrta.Prostor(1, 55, "aabba"),
            new Cetrta.Prostor(1, 22, "aab"),
            new Cetrta.Prostor(1, 83, "bba"),
            new Cetrta.Prostor(1, 100, "bba"),
            new Cetrta.Prostor(1, 63, "baaa"),
            new Cetrta.Prostor(1, 31, "aab"),
            new Cetrta.Prostor(1, 75, "aa"),
            new Cetrta.Prostor(1, 35, "abb"),
            new Cetrta.Prostor(1, 27, "bba"),
            new Cetrta.Prostor(1, 29, "baaa"),
            new Cetrta.Prostor(1, 18, "abb"),
            new Cetrta.Prostor(1, 38, "bba"),
            new Cetrta.Prostor(1, 46, "abb"),
            new Cetrta.Prostor(1, 54, "aab"),
            new Cetrta.Prostor(1, 14, "aab"),
            new Cetrta.Prostor(1, 18, "bba"),
            new Cetrta.Prostor(1, 69, "aa"),
            new Cetrta.Prostor(1, 7, "abb"),
            new Cetrta.Prostor(1, 97, "aab"),
            new Cetrta.Prostor(1, 60, "baba"),
            new Cetrta.Prostor(1, 9, "aab"),
            new Cetrta.Prostor(1, 30, "aa"),
            new Cetrta.Prostor(1, 12, "baaa"),
            new Cetrta.Prostor(1, 15, "bba"),
            new Cetrta.Prostor(1, 5, "baaa"),
            new Cetrta.Prostor(1, 61, "aa"),
            new Cetrta.Prostor(1, 31, "aabba"),
            new Cetrta.Prostor(1, 4, "baba"),
            new Cetrta.Prostor(1, 28, "baaa"),
            new Cetrta.Prostor(1, 34, "baaa"),
            new Cetrta.Prostor(1, 69, "aa"),
            new Cetrta.Prostor(1, 78, "aa"),
            new Cetrta.Prostor(1, 40, "ba"),
            new Cetrta.Prostor(1, 54, "baaa"),
            new Cetrta.Prostor(1, 57, "aab"),
            new Cetrta.Prostor(1, 58, "bba"),
            new Cetrta.Prostor(1, 31, "ba"),
            new Cetrta.Prostor(1, 87, "aabba")
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
