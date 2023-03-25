
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 3), 19),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 3), 10),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 4), 15),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 3), 58),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 5), 94),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 1), 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 4), 66, 7),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 3), 52, 14),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 5), 62),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 3), 35),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 3), 28),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 4), 9),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 5, 1), 80, 18),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 5), 25),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 4), 36, 53),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 2), 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 1), 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 1), 72, 51),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 3), 58),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 5), 48, 13),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 2), 83),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 2), 78, 64),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 3), 56, 63),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 1), 14),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 5), 95),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 2), 60),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 4), 71),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 4), 19),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 3), 58),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 2), 72),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 1), 97),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 4), 39),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 5), 66),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 2), 67),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 3), 82),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 1), 57, 83),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 5), 17),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 3), 29),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 3), 42),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 3), 77),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 4, 5), 74, 58),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 1), 57, 91),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 4), 82, 68),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 3), 17),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 2), 89),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 5), 99),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 3), 54, 87),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 5), 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 5), 95),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 3), 85),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 5), 59),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 5), 97),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 1), 76, 84),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 2), 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 5), 11, 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 5), 92, 84),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 5), 12, 99),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 5), 59, 5),
            new Cetrta.Krog(new Cetrta.Barva(4, 3, 3), 79),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 3), 86),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 5), 96),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 5), 84, 8),
            new Cetrta.Krog(new Cetrta.Barva(4, 3, 5), 58),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 1), 68, 13),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 4), 76, 42),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 4), 92),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 5), 92, 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 2), 25),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 1), 42),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 3), 53),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 2), 30, 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 1), 14)
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
