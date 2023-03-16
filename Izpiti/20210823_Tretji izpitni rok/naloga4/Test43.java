
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(5, 7, "babaa"),
            new Cetrta.Prostor(4, 92, "ba"),
            new Cetrta.Prostor(1, 22, "abbaa"),
            new Cetrta.Prostor(1, 67, "ab"),
            new Cetrta.Prostor(4, 89, "babaa"),
            new Cetrta.Prostor(2, 10, "ba"),
            new Cetrta.Prostor(5, 96, "ba"),
            new Cetrta.Prostor(3, 6, "aaba"),
            new Cetrta.Prostor(4, 83, "ba"),
            new Cetrta.Prostor(4, 18, "abbaa"),
            new Cetrta.Prostor(2, 18, "aaba"),
            new Cetrta.Prostor(3, 62, "aaba"),
            new Cetrta.Prostor(1, 84, "aaba"),
            new Cetrta.Prostor(3, 99, "ab"),
            new Cetrta.Prostor(2, 94, "ab"),
            new Cetrta.Prostor(5, 51, "ab"),
            new Cetrta.Prostor(5, 63, "babaa"),
            new Cetrta.Prostor(1, 29, "aaba"),
            new Cetrta.Prostor(4, 86, "babaa"),
            new Cetrta.Prostor(2, 88, "ab"),
            new Cetrta.Prostor(3, 93, "babaa"),
            new Cetrta.Prostor(1, 35, "ab"),
            new Cetrta.Prostor(1, 70, "aaba"),
            new Cetrta.Prostor(5, 29, "ba"),
            new Cetrta.Prostor(5, 16, "ba"),
            new Cetrta.Prostor(4, 64, "ba"),
            new Cetrta.Prostor(1, 47, "babaa"),
            new Cetrta.Prostor(1, 89, "babaa"),
            new Cetrta.Prostor(2, 74, "ab"),
            new Cetrta.Prostor(2, 13, "ba"),
            new Cetrta.Prostor(3, 6, "ba"),
            new Cetrta.Prostor(1, 24, "abbaa"),
            new Cetrta.Prostor(5, 95, "abbaa"),
            new Cetrta.Prostor(5, 31, "ba"),
            new Cetrta.Prostor(5, 77, "ab"),
            new Cetrta.Prostor(1, 74, "babaa"),
            new Cetrta.Prostor(4, 77, "abbaa"),
            new Cetrta.Prostor(3, 91, "aaba"),
            new Cetrta.Prostor(4, 3, "ba"),
            new Cetrta.Prostor(3, 50, "ba"),
            new Cetrta.Prostor(3, 51, "ab"),
            new Cetrta.Prostor(1, 46, "aaba"),
            new Cetrta.Prostor(5, 73, "abbaa"),
            new Cetrta.Prostor(2, 98, "abbaa"),
            new Cetrta.Prostor(4, 22, "ba"),
            new Cetrta.Prostor(1, 38, "babaa"),
            new Cetrta.Prostor(4, 100, "babaa"),
            new Cetrta.Prostor(3, 70, "ba"),
            new Cetrta.Prostor(1, 1, "ab"),
            new Cetrta.Prostor(2, 67, "babaa"),
            new Cetrta.Prostor(5, 74, "ba"),
            new Cetrta.Prostor(1, 61, "ba"),
            new Cetrta.Prostor(5, 79, "babaa"),
            new Cetrta.Prostor(1, 73, "abbaa"),
            new Cetrta.Prostor(4, 77, "aaba"),
            new Cetrta.Prostor(1, 91, "aaba"),
            new Cetrta.Prostor(3, 90, "ab"),
            new Cetrta.Prostor(4, 38, "ba"),
            new Cetrta.Prostor(3, 25, "abbaa"),
            new Cetrta.Prostor(3, 49, "babaa"),
            new Cetrta.Prostor(5, 13, "ab"),
            new Cetrta.Prostor(4, 100, "babaa"),
            new Cetrta.Prostor(1, 79, "aaba"),
            new Cetrta.Prostor(1, 59, "ba"),
            new Cetrta.Prostor(1, 54, "ba"),
            new Cetrta.Prostor(4, 17, "abbaa"),
            new Cetrta.Prostor(5, 91, "ba"),
            new Cetrta.Prostor(4, 54, "ab"),
            new Cetrta.Prostor(1, 44, "aaba"),
            new Cetrta.Prostor(1, 45, "ba"),
            new Cetrta.Prostor(3, 5, "ba"),
            new Cetrta.Prostor(5, 14, "abbaa"),
            new Cetrta.Prostor(2, 39, "ab"),
            new Cetrta.Prostor(3, 26, "aaba"),
            new Cetrta.Prostor(3, 97, "abbaa"),
            new Cetrta.Prostor(3, 14, "babaa"),
            new Cetrta.Prostor(3, 92, "abbaa"),
            new Cetrta.Prostor(3, 9, "ba"),
            new Cetrta.Prostor(1, 8, "babaa"),
            new Cetrta.Prostor(5, 10, "ba"),
            new Cetrta.Prostor(4, 22, "abbaa"),
            new Cetrta.Prostor(4, 100, "ba"),
            new Cetrta.Prostor(3, 36, "ab"),
            new Cetrta.Prostor(1, 75, "babaa"),
            new Cetrta.Prostor(3, 60, "babaa"),
            new Cetrta.Prostor(1, 16, "ba"),
            new Cetrta.Prostor(1, 28, "ba"),
            new Cetrta.Prostor(5, 69, "ba"),
            new Cetrta.Prostor(2, 89, "ba"),
            new Cetrta.Prostor(5, 45, "ab"),
            new Cetrta.Prostor(4, 5, "ba"),
            new Cetrta.Prostor(2, 26, "ba"),
            new Cetrta.Prostor(5, 10, "babaa")
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
