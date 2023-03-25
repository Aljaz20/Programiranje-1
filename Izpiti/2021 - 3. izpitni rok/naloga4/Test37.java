
import java.util.*;

public class Test37 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(7, 17, "ba"),
            new Cetrta.Prostor(6, 60, "aa"),
            new Cetrta.Prostor(2, 73, "ba"),
            new Cetrta.Prostor(1, 98, "ba"),
            new Cetrta.Prostor(1, 68, "ababb"),
            new Cetrta.Prostor(7, 68, "ababa"),
            new Cetrta.Prostor(6, 13, "ababa"),
            new Cetrta.Prostor(6, 85, "ba"),
            new Cetrta.Prostor(2, 33, "ba"),
            new Cetrta.Prostor(7, 51, "ababb"),
            new Cetrta.Prostor(3, 29, "ba"),
            new Cetrta.Prostor(3, 90, "aa"),
            new Cetrta.Prostor(3, 96, "ab"),
            new Cetrta.Prostor(7, 84, "ab"),
            new Cetrta.Prostor(1, 50, "abbab"),
            new Cetrta.Prostor(2, 78, "ba"),
            new Cetrta.Prostor(8, 80, "bbbaa"),
            new Cetrta.Prostor(1, 69, "ab"),
            new Cetrta.Prostor(3, 34, "abbab"),
            new Cetrta.Prostor(3, 64, "bbaab"),
            new Cetrta.Prostor(1, 57, "ababa"),
            new Cetrta.Prostor(2, 92, "ab"),
            new Cetrta.Prostor(1, 94, "abbab"),
            new Cetrta.Prostor(5, 36, "ab"),
            new Cetrta.Prostor(2, 57, "bbbaa"),
            new Cetrta.Prostor(4, 26, "bbaab"),
            new Cetrta.Prostor(5, 44, "ba"),
            new Cetrta.Prostor(7, 83, "ababb"),
            new Cetrta.Prostor(8, 1, "aa"),
            new Cetrta.Prostor(2, 17, "ab"),
            new Cetrta.Prostor(3, 76, "bbbaa"),
            new Cetrta.Prostor(7, 97, "ab"),
            new Cetrta.Prostor(1, 34, "ab"),
            new Cetrta.Prostor(3, 71, "abbab"),
            new Cetrta.Prostor(3, 46, "ab"),
            new Cetrta.Prostor(3, 5, "ababa"),
            new Cetrta.Prostor(4, 14, "ba"),
            new Cetrta.Prostor(2, 98, "ba"),
            new Cetrta.Prostor(8, 87, "ba"),
            new Cetrta.Prostor(1, 30, "bbaab"),
            new Cetrta.Prostor(2, 91, "bbaab"),
            new Cetrta.Prostor(1, 72, "bbaab"),
            new Cetrta.Prostor(4, 70, "ababa"),
            new Cetrta.Prostor(1, 77, "ab"),
            new Cetrta.Prostor(2, 51, "ababb"),
            new Cetrta.Prostor(4, 44, "ababb"),
            new Cetrta.Prostor(2, 83, "abbab"),
            new Cetrta.Prostor(2, 60, "ba"),
            new Cetrta.Prostor(1, 4, "ababa"),
            new Cetrta.Prostor(1, 40, "ab"),
            new Cetrta.Prostor(8, 12, "bbaab"),
            new Cetrta.Prostor(5, 89, "ababa"),
            new Cetrta.Prostor(5, 6, "ababa"),
            new Cetrta.Prostor(7, 56, "ab"),
            new Cetrta.Prostor(7, 84, "ababa"),
            new Cetrta.Prostor(5, 26, "bbbaa"),
            new Cetrta.Prostor(3, 74, "bbbaa"),
            new Cetrta.Prostor(5, 1, "aa"),
            new Cetrta.Prostor(3, 33, "bbaab"),
            new Cetrta.Prostor(8, 3, "bbaab"),
            new Cetrta.Prostor(8, 63, "ababb"),
            new Cetrta.Prostor(8, 46, "ababb"),
            new Cetrta.Prostor(1, 43, "ba"),
            new Cetrta.Prostor(5, 10, "bbbaa"),
            new Cetrta.Prostor(6, 67, "bbaab"),
            new Cetrta.Prostor(8, 46, "bbaab"),
            new Cetrta.Prostor(6, 99, "bbbaa"),
            new Cetrta.Prostor(4, 15, "ababb"),
            new Cetrta.Prostor(2, 28, "ababa"),
            new Cetrta.Prostor(6, 6, "bbaab"),
            new Cetrta.Prostor(1, 57, "abbab"),
            new Cetrta.Prostor(1, 30, "bbaab")
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
