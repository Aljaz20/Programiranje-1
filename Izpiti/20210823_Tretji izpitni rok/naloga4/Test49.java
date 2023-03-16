
import java.util.*;

public class Test49 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(1, 62, "bb"),
            new Cetrta.Prostor(7, 85, "abb"),
            new Cetrta.Prostor(8, 10, "bb"),
            new Cetrta.Prostor(4, 92, "bbbb"),
            new Cetrta.Prostor(3, 48, "bab"),
            new Cetrta.Prostor(3, 54, "bab"),
            new Cetrta.Prostor(1, 82, "abb"),
            new Cetrta.Prostor(3, 47, "bb"),
            new Cetrta.Prostor(7, 3, "bb"),
            new Cetrta.Prostor(6, 14, "bb"),
            new Cetrta.Prostor(5, 55, "abb"),
            new Cetrta.Prostor(8, 98, "abb"),
            new Cetrta.Prostor(8, 82, "bb"),
            new Cetrta.Prostor(5, 88, "bab"),
            new Cetrta.Prostor(2, 47, "abb"),
            new Cetrta.Prostor(3, 67, "bab"),
            new Cetrta.Prostor(6, 62, "bbbb"),
            new Cetrta.Prostor(7, 18, "bbbb"),
            new Cetrta.Prostor(3, 18, "abb"),
            new Cetrta.Prostor(8, 26, "abb"),
            new Cetrta.Prostor(6, 9, "bbbb"),
            new Cetrta.Prostor(8, 41, "bab"),
            new Cetrta.Prostor(5, 4, "bab"),
            new Cetrta.Prostor(6, 72, "bab"),
            new Cetrta.Prostor(5, 60, "bab"),
            new Cetrta.Prostor(4, 47, "bb"),
            new Cetrta.Prostor(4, 25, "bbbb"),
            new Cetrta.Prostor(1, 29, "bbbb"),
            new Cetrta.Prostor(4, 33, "bab"),
            new Cetrta.Prostor(1, 71, "bb"),
            new Cetrta.Prostor(3, 72, "bb"),
            new Cetrta.Prostor(3, 66, "bb"),
            new Cetrta.Prostor(5, 69, "bab"),
            new Cetrta.Prostor(5, 89, "bab"),
            new Cetrta.Prostor(6, 23, "bb"),
            new Cetrta.Prostor(6, 89, "abb"),
            new Cetrta.Prostor(3, 87, "bb"),
            new Cetrta.Prostor(8, 8, "bab"),
            new Cetrta.Prostor(5, 25, "bbbb"),
            new Cetrta.Prostor(4, 2, "bb"),
            new Cetrta.Prostor(7, 40, "bbbb"),
            new Cetrta.Prostor(1, 76, "bab"),
            new Cetrta.Prostor(2, 16, "abb"),
            new Cetrta.Prostor(4, 30, "abb"),
            new Cetrta.Prostor(6, 66, "bbbb"),
            new Cetrta.Prostor(2, 59, "bb"),
            new Cetrta.Prostor(7, 42, "bb"),
            new Cetrta.Prostor(5, 51, "bb"),
            new Cetrta.Prostor(2, 71, "bab"),
            new Cetrta.Prostor(7, 53, "bb"),
            new Cetrta.Prostor(1, 92, "bbbb"),
            new Cetrta.Prostor(5, 49, "bbbb"),
            new Cetrta.Prostor(6, 55, "bb"),
            new Cetrta.Prostor(1, 49, "abb"),
            new Cetrta.Prostor(8, 100, "bbbb"),
            new Cetrta.Prostor(8, 22, "abb"),
            new Cetrta.Prostor(1, 64, "abb"),
            new Cetrta.Prostor(5, 30, "abb"),
            new Cetrta.Prostor(6, 33, "bb"),
            new Cetrta.Prostor(5, 77, "bab"),
            new Cetrta.Prostor(1, 80, "abb"),
            new Cetrta.Prostor(1, 82, "bb"),
            new Cetrta.Prostor(2, 68, "bb"),
            new Cetrta.Prostor(7, 91, "bab"),
            new Cetrta.Prostor(5, 77, "bbbb"),
            new Cetrta.Prostor(4, 83, "bbbb"),
            new Cetrta.Prostor(3, 30, "bb"),
            new Cetrta.Prostor(4, 73, "abb"),
            new Cetrta.Prostor(5, 80, "bab"),
            new Cetrta.Prostor(3, 44, "bab"),
            new Cetrta.Prostor(1, 2, "abb"),
            new Cetrta.Prostor(7, 57, "bab"),
            new Cetrta.Prostor(3, 5, "bbbb"),
            new Cetrta.Prostor(3, 28, "bbbb"),
            new Cetrta.Prostor(1, 96, "abb"),
            new Cetrta.Prostor(2, 86, "bbbb"),
            new Cetrta.Prostor(5, 93, "bab"),
            new Cetrta.Prostor(6, 6, "bab"),
            new Cetrta.Prostor(6, 20, "bbbb"),
            new Cetrta.Prostor(8, 60, "bb"),
            new Cetrta.Prostor(2, 100, "abb"),
            new Cetrta.Prostor(1, 44, "bab"),
            new Cetrta.Prostor(1, 34, "bb"),
            new Cetrta.Prostor(2, 94, "bab"),
            new Cetrta.Prostor(5, 10, "abb"),
            new Cetrta.Prostor(6, 46, "bab"),
            new Cetrta.Prostor(7, 68, "bab"),
            new Cetrta.Prostor(4, 23, "bb"),
            new Cetrta.Prostor(6, 100, "abb"),
            new Cetrta.Prostor(2, 34, "bab"),
            new Cetrta.Prostor(6, 32, "abb"),
            new Cetrta.Prostor(1, 55, "bb"),
            new Cetrta.Prostor(1, 35, "bb")
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
