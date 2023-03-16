
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Collection<String> klubi = List.of(
            "Rdeci", "Zeleni", "Crni", "Beli"
        );

        Collection<Tekma> tekme = List.of(
            new Tekma("Crni",   "Beli",   3, 0),
            new Tekma("Rdeci",  "Zeleni", 1, 1),
            new Tekma("Zeleni", "Crni",   1, 0),
            new Tekma("Beli",   "Rdeci",  1, 0),
            new Tekma("Crni",   "Rdeci",  2, 5),
            new Tekma("Zeleni", "Beli",   2, 0),
            new Tekma("Beli",   "Crni",   5, 1),
            new Tekma("Zeleni", "Rdeci",  3, 3),
            new Tekma("Crni",   "Zeleni", 0, 2),
            new Tekma("Rdeci",  "Beli",   2, 1),
            new Tekma("Rdeci",  "Crni",   2, 2),
            new Tekma("Beli",   "Zeleni", 3, 1)
        );

        Liga liga = new Liga(klubi, tekme);

        for (int minGR = 4;  minGR >= 2;  minGR--) {
            System.out.printf("minGR = %d:%n", minGR);
            Iterator<Tekma> iterator = liga.poTekmah(minGR);
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println();
        }
    }
}
