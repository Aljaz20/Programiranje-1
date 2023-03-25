
import java.util.*;

public class Test48 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(9, 20, "aab"),
            new Cetrta.Prostor(6, 16, "ba"),
            new Cetrta.Prostor(6, 67, "aaa"),
            new Cetrta.Prostor(8, 21, "aaa"),
            new Cetrta.Prostor(3, 44, "bba"),
            new Cetrta.Prostor(5, 56, "aab"),
            new Cetrta.Prostor(4, 81, "aba"),
            new Cetrta.Prostor(1, 70, "ba"),
            new Cetrta.Prostor(3, 58, "baa"),
            new Cetrta.Prostor(4, 9, "bba"),
            new Cetrta.Prostor(1, 20, "bba"),
            new Cetrta.Prostor(5, 23, "ba"),
            new Cetrta.Prostor(7, 95, "bba"),
            new Cetrta.Prostor(7, 37, "ba"),
            new Cetrta.Prostor(3, 46, "aba"),
            new Cetrta.Prostor(3, 18, "aaa"),
            new Cetrta.Prostor(5, 32, "ba"),
            new Cetrta.Prostor(1, 46, "ba"),
            new Cetrta.Prostor(2, 42, "aaa"),
            new Cetrta.Prostor(9, 68, "aab"),
            new Cetrta.Prostor(4, 56, "bba"),
            new Cetrta.Prostor(5, 91, "baa"),
            new Cetrta.Prostor(8, 15, "aba"),
            new Cetrta.Prostor(1, 61, "bba"),
            new Cetrta.Prostor(5, 80, "ba"),
            new Cetrta.Prostor(3, 91, "aba"),
            new Cetrta.Prostor(8, 22, "baa"),
            new Cetrta.Prostor(4, 92, "aba"),
            new Cetrta.Prostor(7, 9, "ba"),
            new Cetrta.Prostor(3, 19, "aab"),
            new Cetrta.Prostor(3, 55, "baa"),
            new Cetrta.Prostor(8, 32, "ba"),
            new Cetrta.Prostor(8, 40, "ba"),
            new Cetrta.Prostor(1, 67, "ba"),
            new Cetrta.Prostor(9, 82, "aab"),
            new Cetrta.Prostor(8, 36, "ba"),
            new Cetrta.Prostor(6, 11, "baa"),
            new Cetrta.Prostor(8, 46, "ba"),
            new Cetrta.Prostor(9, 4, "aba"),
            new Cetrta.Prostor(5, 62, "bba"),
            new Cetrta.Prostor(7, 22, "aaa"),
            new Cetrta.Prostor(5, 41, "baa"),
            new Cetrta.Prostor(3, 29, "bba"),
            new Cetrta.Prostor(2, 43, "bba"),
            new Cetrta.Prostor(9, 3, "ba"),
            new Cetrta.Prostor(2, 92, "aba"),
            new Cetrta.Prostor(3, 58, "bba"),
            new Cetrta.Prostor(9, 81, "bba"),
            new Cetrta.Prostor(7, 94, "ba"),
            new Cetrta.Prostor(9, 36, "ba"),
            new Cetrta.Prostor(5, 9, "bba"),
            new Cetrta.Prostor(5, 80, "aaa"),
            new Cetrta.Prostor(7, 21, "aaa"),
            new Cetrta.Prostor(7, 22, "baa"),
            new Cetrta.Prostor(7, 56, "baa"),
            new Cetrta.Prostor(3, 56, "baa"),
            new Cetrta.Prostor(8, 76, "aab"),
            new Cetrta.Prostor(5, 15, "aab"),
            new Cetrta.Prostor(6, 13, "aab"),
            new Cetrta.Prostor(3, 95, "aba"),
            new Cetrta.Prostor(1, 11, "ba"),
            new Cetrta.Prostor(3, 95, "ba"),
            new Cetrta.Prostor(5, 9, "bba")
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
