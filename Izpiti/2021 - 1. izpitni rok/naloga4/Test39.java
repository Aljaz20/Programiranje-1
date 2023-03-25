
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 1), 95),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 1), 62, 39),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 3), 30),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 4), 80),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 1), 49, 84),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 2), 28, 81),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 5), 74),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 2), 29),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 4), 29),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 3), 26),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 2), 29),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 3), 27),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 4), 83, 92),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 3), 98),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 1), 61, 24),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 3), 39, 90),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 3), 19),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 5), 29),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 1), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 5, 4), 78, 26),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 3), 36, 21),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 3), 20),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 1), 30),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 5), 26),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 4), 84),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 2), 84),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 3), 96),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 5), 39),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 2), 31),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 5), 77, 56),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 5, 1), 32, 99),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 2), 10, 65),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 2), 89),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 5), 6),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 4), 70, 18),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 5), 89, 89),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 2), 19),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 3), 20),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 4), 75),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 2), 92, 58),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 4), 27, 34),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 1), 2),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 2), 22),
            new Cetrta.Krog(new Cetrta.Barva(3, 2, 2), 16),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 5), 22),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 3), 31),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 5), 21),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 3), 3, 93),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 1), 76, 54),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 5), 50),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 4), 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 3), 87),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 5), 36, 55),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 4), 38),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 3), 33, 95),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 5), 60, 2),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 5), 4),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 3), 99),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 4), 36, 46),
            new Cetrta.Krog(new Cetrta.Barva(4, 5, 1), 91),
            new Cetrta.Krog(new Cetrta.Barva(3, 2, 1), 96),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 4), 10),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 4), 62, 13),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 3), 83, 33),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 3), 93),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 3), 56),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 4, 4), 70, 7),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 3), 15, 4),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 5), 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 4), 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 4), 53),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 2), 49, 33),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 4), 59, 35),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 2), 44),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 4), 41, 55),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 4), 84),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 2), 16),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 3), 44),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 2), 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 3), 29),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 4), 13),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 1), 31),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 5), 100)
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
