
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(8, 78, "aaa"),
            new Cetrta.Prostor(5, 63, "aaa"),
            new Cetrta.Prostor(2, 75, "aaa"),
            new Cetrta.Prostor(5, 1, "aaa"),
            new Cetrta.Prostor(8, 18, "baaaa"),
            new Cetrta.Prostor(5, 92, "aaa"),
            new Cetrta.Prostor(4, 97, "baaaa"),
            new Cetrta.Prostor(5, 73, "baaaa"),
            new Cetrta.Prostor(2, 33, "baaaa"),
            new Cetrta.Prostor(7, 64, "baaaa"),
            new Cetrta.Prostor(4, 66, "baaaa"),
            new Cetrta.Prostor(4, 3, "baaaa"),
            new Cetrta.Prostor(3, 37, "aaa"),
            new Cetrta.Prostor(2, 87, "aaa"),
            new Cetrta.Prostor(3, 51, "baaaa"),
            new Cetrta.Prostor(3, 77, "aaa"),
            new Cetrta.Prostor(2, 36, "aaa"),
            new Cetrta.Prostor(4, 60, "baaaa"),
            new Cetrta.Prostor(7, 30, "aaa"),
            new Cetrta.Prostor(8, 72, "baaaa"),
            new Cetrta.Prostor(7, 23, "aaa"),
            new Cetrta.Prostor(7, 54, "aaa"),
            new Cetrta.Prostor(1, 16, "baaaa"),
            new Cetrta.Prostor(6, 25, "baaaa"),
            new Cetrta.Prostor(7, 90, "baaaa"),
            new Cetrta.Prostor(7, 73, "aaa"),
            new Cetrta.Prostor(8, 78, "baaaa"),
            new Cetrta.Prostor(8, 68, "baaaa"),
            new Cetrta.Prostor(2, 65, "baaaa"),
            new Cetrta.Prostor(6, 20, "baaaa"),
            new Cetrta.Prostor(6, 93, "aaa"),
            new Cetrta.Prostor(6, 81, "aaa"),
            new Cetrta.Prostor(4, 47, "baaaa"),
            new Cetrta.Prostor(3, 71, "baaaa"),
            new Cetrta.Prostor(8, 71, "baaaa"),
            new Cetrta.Prostor(4, 1, "aaa"),
            new Cetrta.Prostor(6, 78, "baaaa"),
            new Cetrta.Prostor(8, 46, "aaa"),
            new Cetrta.Prostor(3, 83, "aaa"),
            new Cetrta.Prostor(7, 57, "aaa"),
            new Cetrta.Prostor(4, 48, "baaaa"),
            new Cetrta.Prostor(5, 56, "baaaa"),
            new Cetrta.Prostor(7, 49, "baaaa"),
            new Cetrta.Prostor(3, 13, "baaaa"),
            new Cetrta.Prostor(4, 97, "baaaa"),
            new Cetrta.Prostor(8, 42, "baaaa"),
            new Cetrta.Prostor(5, 49, "baaaa"),
            new Cetrta.Prostor(7, 36, "baaaa"),
            new Cetrta.Prostor(5, 22, "aaa"),
            new Cetrta.Prostor(5, 48, "baaaa"),
            new Cetrta.Prostor(4, 62, "baaaa"),
            new Cetrta.Prostor(4, 78, "aaa"),
            new Cetrta.Prostor(3, 62, "baaaa"),
            new Cetrta.Prostor(1, 5, "aaa"),
            new Cetrta.Prostor(2, 62, "aaa"),
            new Cetrta.Prostor(4, 84, "aaa"),
            new Cetrta.Prostor(7, 33, "aaa"),
            new Cetrta.Prostor(8, 80, "aaa"),
            new Cetrta.Prostor(6, 7, "aaa"),
            new Cetrta.Prostor(8, 10, "baaaa"),
            new Cetrta.Prostor(5, 40, "baaaa"),
            new Cetrta.Prostor(3, 16, "aaa"),
            new Cetrta.Prostor(8, 14, "aaa"),
            new Cetrta.Prostor(7, 52, "baaaa"),
            new Cetrta.Prostor(8, 69, "baaaa"),
            new Cetrta.Prostor(3, 83, "baaaa"),
            new Cetrta.Prostor(7, 22, "aaa"),
            new Cetrta.Prostor(2, 37, "aaa"),
            new Cetrta.Prostor(5, 54, "aaa"),
            new Cetrta.Prostor(7, 47, "baaaa"),
            new Cetrta.Prostor(4, 17, "aaa"),
            new Cetrta.Prostor(3, 9, "baaaa"),
            new Cetrta.Prostor(2, 67, "aaa"),
            new Cetrta.Prostor(8, 47, "aaa"),
            new Cetrta.Prostor(2, 23, "baaaa"),
            new Cetrta.Prostor(1, 32, "aaa"),
            new Cetrta.Prostor(7, 22, "baaaa"),
            new Cetrta.Prostor(8, 1, "baaaa"),
            new Cetrta.Prostor(6, 13, "baaaa"),
            new Cetrta.Prostor(2, 83, "aaa"),
            new Cetrta.Prostor(3, 9, "baaaa"),
            new Cetrta.Prostor(5, 70, "aaa"),
            new Cetrta.Prostor(7, 37, "baaaa")
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
