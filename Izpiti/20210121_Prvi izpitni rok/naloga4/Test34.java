
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 1), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 4), 85, 10),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 4), 64, 19),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 4), 33, 5),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 3), 66),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 1), 47),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 5), 15, 84),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 3), 13, 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 1), 47, 5),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 5), 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 5), 10),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 1), 46),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 1), 18, 86),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 5), 15),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 4), 9),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 4), 4),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 3), 46),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 4), 74),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 3), 53),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 3), 78),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 1), 23),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 4), 92, 82),
            new Cetrta.Krog(new Cetrta.Barva(4, 5, 2), 82),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 2), 26),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 3), 96),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 4), 82, 29),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 1), 75),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 5), 91),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 3), 44),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 2), 70),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 5), 52),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 1), 87),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 3), 11, 57),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 5), 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 2), 77),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 1), 20, 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 3), 58),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 3), 72),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 4), 84, 10),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 5), 65),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 5), 61),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 1), 29),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 5), 64),
            new Cetrta.Krog(new Cetrta.Barva(4, 3, 4), 53),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 2), 23),
            new Cetrta.Krog(new Cetrta.Barva(4, 3, 1), 12),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 1), 24),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 2), 26, 43),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 2), 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 5), 69),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 2), 51),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 1), 66, 8),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 1), 99),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 4), 99),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 2), 39),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 3), 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 2), 100),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 5), 84),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 4), 48),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 1), 21),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 3), 20),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 2), 55, 24),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 1), 47),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 2), 21),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 2), 21, 18),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 5), 97, 21),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 3), 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 3), 8, 83),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 3), 94),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 4), 67)
        ));

        Collection<Cetrta.Lik> urejena = Cetrta.poTipuInBarvi(liki);
        for (Cetrta.Lik lik: urejena) {
            System.out.println(lik);
        }
        System.out.println("----------");
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
