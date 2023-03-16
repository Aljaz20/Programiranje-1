
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(5, 31, "bb"),
            new Cetrta.Prostor(5, 91, "babbb"),
            new Cetrta.Prostor(2, 47, "babbb"),
            new Cetrta.Prostor(4, 95, "abbab"),
            new Cetrta.Prostor(1, 46, "abbab"),
            new Cetrta.Prostor(1, 95, "aba"),
            new Cetrta.Prostor(5, 66, "aa"),
            new Cetrta.Prostor(5, 82, "aa"),
            new Cetrta.Prostor(2, 52, "aa"),
            new Cetrta.Prostor(6, 66, "bb"),
            new Cetrta.Prostor(1, 37, "abbab"),
            new Cetrta.Prostor(1, 24, "aba"),
            new Cetrta.Prostor(1, 100, "babbb"),
            new Cetrta.Prostor(6, 20, "aaab"),
            new Cetrta.Prostor(6, 10, "aa"),
            new Cetrta.Prostor(5, 89, "aaab"),
            new Cetrta.Prostor(3, 28, "aa"),
            new Cetrta.Prostor(1, 46, "bb"),
            new Cetrta.Prostor(1, 95, "bb"),
            new Cetrta.Prostor(2, 46, "aba"),
            new Cetrta.Prostor(6, 12, "abbab"),
            new Cetrta.Prostor(4, 33, "bb"),
            new Cetrta.Prostor(6, 29, "babbb"),
            new Cetrta.Prostor(2, 65, "aaab"),
            new Cetrta.Prostor(5, 22, "bb"),
            new Cetrta.Prostor(4, 72, "aa"),
            new Cetrta.Prostor(4, 68, "aa"),
            new Cetrta.Prostor(5, 22, "babbb"),
            new Cetrta.Prostor(6, 35, "aa"),
            new Cetrta.Prostor(2, 68, "aa"),
            new Cetrta.Prostor(5, 8, "aa"),
            new Cetrta.Prostor(3, 87, "bb"),
            new Cetrta.Prostor(4, 96, "aaab"),
            new Cetrta.Prostor(5, 57, "abbab"),
            new Cetrta.Prostor(3, 2, "aba"),
            new Cetrta.Prostor(3, 58, "aa"),
            new Cetrta.Prostor(6, 21, "aa"),
            new Cetrta.Prostor(1, 3, "aaab"),
            new Cetrta.Prostor(6, 3, "babbb"),
            new Cetrta.Prostor(6, 20, "bb"),
            new Cetrta.Prostor(2, 54, "aa"),
            new Cetrta.Prostor(1, 7, "aaab"),
            new Cetrta.Prostor(6, 41, "bb"),
            new Cetrta.Prostor(1, 64, "aba"),
            new Cetrta.Prostor(4, 41, "aa"),
            new Cetrta.Prostor(1, 23, "babbb"),
            new Cetrta.Prostor(4, 51, "aaab"),
            new Cetrta.Prostor(2, 64, "aba"),
            new Cetrta.Prostor(4, 46, "bb"),
            new Cetrta.Prostor(1, 47, "babbb"),
            new Cetrta.Prostor(3, 32, "aa"),
            new Cetrta.Prostor(3, 46, "aaab"),
            new Cetrta.Prostor(5, 29, "babbb"),
            new Cetrta.Prostor(3, 72, "abbab"),
            new Cetrta.Prostor(3, 69, "aa"),
            new Cetrta.Prostor(4, 61, "babbb"),
            new Cetrta.Prostor(3, 12, "aba"),
            new Cetrta.Prostor(6, 39, "aba"),
            new Cetrta.Prostor(3, 9, "bb"),
            new Cetrta.Prostor(2, 13, "aba"),
            new Cetrta.Prostor(5, 29, "aba"),
            new Cetrta.Prostor(4, 84, "aa"),
            new Cetrta.Prostor(3, 42, "aba"),
            new Cetrta.Prostor(4, 38, "abbab"),
            new Cetrta.Prostor(4, 61, "aa"),
            new Cetrta.Prostor(1, 77, "aaab"),
            new Cetrta.Prostor(6, 60, "aa"),
            new Cetrta.Prostor(1, 38, "aa"),
            new Cetrta.Prostor(3, 10, "babbb"),
            new Cetrta.Prostor(6, 80, "aa"),
            new Cetrta.Prostor(5, 35, "bb"),
            new Cetrta.Prostor(3, 53, "aba"),
            new Cetrta.Prostor(3, 39, "aaab"),
            new Cetrta.Prostor(5, 83, "aa"),
            new Cetrta.Prostor(2, 43, "abbab"),
            new Cetrta.Prostor(4, 43, "abbab"),
            new Cetrta.Prostor(5, 45, "aa"),
            new Cetrta.Prostor(1, 75, "aa"),
            new Cetrta.Prostor(2, 98, "babbb"),
            new Cetrta.Prostor(1, 85, "aa"),
            new Cetrta.Prostor(1, 6, "bb"),
            new Cetrta.Prostor(5, 43, "aa"),
            new Cetrta.Prostor(2, 24, "aa"),
            new Cetrta.Prostor(1, 99, "aa"),
            new Cetrta.Prostor(2, 34, "aa"),
            new Cetrta.Prostor(6, 11, "abbab")
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
