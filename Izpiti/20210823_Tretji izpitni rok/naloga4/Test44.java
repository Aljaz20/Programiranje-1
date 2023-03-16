
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(10, 32, "aaab"),
            new Cetrta.Prostor(2, 15, "aaab"),
            new Cetrta.Prostor(7, 1, "abbab"),
            new Cetrta.Prostor(3, 89, "aaab"),
            new Cetrta.Prostor(5, 37, "aaaa"),
            new Cetrta.Prostor(1, 32, "aaab"),
            new Cetrta.Prostor(7, 70, "abbab"),
            new Cetrta.Prostor(3, 34, "aaaa"),
            new Cetrta.Prostor(10, 14, "aaaa"),
            new Cetrta.Prostor(2, 29, "aaaa"),
            new Cetrta.Prostor(5, 54, "abbab"),
            new Cetrta.Prostor(6, 78, "aaab"),
            new Cetrta.Prostor(2, 19, "aaaa"),
            new Cetrta.Prostor(2, 52, "aaab"),
            new Cetrta.Prostor(3, 48, "abbab"),
            new Cetrta.Prostor(5, 38, "aaaa"),
            new Cetrta.Prostor(9, 24, "aaaa"),
            new Cetrta.Prostor(7, 23, "aaaa"),
            new Cetrta.Prostor(7, 84, "abbab"),
            new Cetrta.Prostor(2, 42, "abbab"),
            new Cetrta.Prostor(6, 42, "abbab"),
            new Cetrta.Prostor(7, 8, "aaab"),
            new Cetrta.Prostor(10, 69, "aaab"),
            new Cetrta.Prostor(9, 99, "aaaa"),
            new Cetrta.Prostor(8, 15, "abbab"),
            new Cetrta.Prostor(5, 42, "abbab"),
            new Cetrta.Prostor(10, 29, "aaab"),
            new Cetrta.Prostor(7, 56, "abbab"),
            new Cetrta.Prostor(5, 87, "abbab"),
            new Cetrta.Prostor(5, 93, "abbab"),
            new Cetrta.Prostor(4, 59, "aaab"),
            new Cetrta.Prostor(10, 16, "aaab"),
            new Cetrta.Prostor(9, 6, "aaab"),
            new Cetrta.Prostor(4, 31, "abbab"),
            new Cetrta.Prostor(7, 50, "abbab"),
            new Cetrta.Prostor(7, 16, "aaab"),
            new Cetrta.Prostor(10, 37, "abbab"),
            new Cetrta.Prostor(2, 9, "abbab"),
            new Cetrta.Prostor(1, 12, "aaab"),
            new Cetrta.Prostor(10, 75, "aaaa"),
            new Cetrta.Prostor(7, 4, "aaaa"),
            new Cetrta.Prostor(5, 80, "aaab"),
            new Cetrta.Prostor(2, 92, "aaaa"),
            new Cetrta.Prostor(3, 24, "aaaa"),
            new Cetrta.Prostor(2, 76, "abbab"),
            new Cetrta.Prostor(1, 92, "aaaa"),
            new Cetrta.Prostor(6, 89, "aaaa"),
            new Cetrta.Prostor(1, 68, "aaaa"),
            new Cetrta.Prostor(10, 29, "abbab"),
            new Cetrta.Prostor(2, 44, "aaab"),
            new Cetrta.Prostor(4, 92, "aaaa"),
            new Cetrta.Prostor(2, 39, "aaab"),
            new Cetrta.Prostor(7, 23, "aaab"),
            new Cetrta.Prostor(1, 17, "aaaa"),
            new Cetrta.Prostor(7, 26, "abbab"),
            new Cetrta.Prostor(1, 37, "aaaa"),
            new Cetrta.Prostor(2, 89, "aaab"),
            new Cetrta.Prostor(7, 59, "abbab"),
            new Cetrta.Prostor(8, 75, "aaab"),
            new Cetrta.Prostor(4, 58, "abbab"),
            new Cetrta.Prostor(9, 86, "abbab"),
            new Cetrta.Prostor(1, 86, "aaaa"),
            new Cetrta.Prostor(9, 94, "aaaa"),
            new Cetrta.Prostor(9, 8, "aaaa"),
            new Cetrta.Prostor(10, 66, "aaaa"),
            new Cetrta.Prostor(7, 86, "aaab"),
            new Cetrta.Prostor(1, 73, "abbab"),
            new Cetrta.Prostor(2, 93, "abbab"),
            new Cetrta.Prostor(9, 4, "aaaa"),
            new Cetrta.Prostor(8, 13, "aaab"),
            new Cetrta.Prostor(3, 19, "abbab"),
            new Cetrta.Prostor(2, 81, "abbab"),
            new Cetrta.Prostor(5, 50, "aaab"),
            new Cetrta.Prostor(5, 39, "aaab"),
            new Cetrta.Prostor(9, 82, "aaaa"),
            new Cetrta.Prostor(4, 15, "aaab"),
            new Cetrta.Prostor(3, 42, "abbab"),
            new Cetrta.Prostor(1, 63, "aaaa"),
            new Cetrta.Prostor(6, 90, "aaaa"),
            new Cetrta.Prostor(4, 82, "abbab"),
            new Cetrta.Prostor(10, 69, "aaaa"),
            new Cetrta.Prostor(4, 13, "aaab"),
            new Cetrta.Prostor(8, 26, "aaaa"),
            new Cetrta.Prostor(10, 13, "aaab"),
            new Cetrta.Prostor(4, 18, "aaab"),
            new Cetrta.Prostor(10, 53, "aaaa"),
            new Cetrta.Prostor(5, 23, "aaab"),
            new Cetrta.Prostor(6, 46, "aaab"),
            new Cetrta.Prostor(9, 7, "aaaa"),
            new Cetrta.Prostor(2, 81, "aaaa"),
            new Cetrta.Prostor(7, 44, "abbab")
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
