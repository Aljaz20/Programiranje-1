
import java.util.*;

public class Test37 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 5), 88),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 4), 84),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 4), 54),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 2), 23),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 3), 27),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 5), 98, 46),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 5), 12),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 5), 6),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 3), 30),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 3), 92),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 4, 5), 37, 14),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 4), 31, 65),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 5), 30),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 1), 62, 19),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 5), 19, 93),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 5), 62),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 4), 10),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 5), 77),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 5), 10, 48),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 3), 58),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 5), 39),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 2), 81),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 2), 50, 60),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 2), 70),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 1), 30),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 2), 21),
            new Cetrta.Krog(new Cetrta.Barva(3, 2, 4), 90),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 1), 94),
            new Cetrta.Krog(new Cetrta.Barva(3, 2, 1), 60),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 5, 5), 34, 18),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 5), 55),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 5), 33),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 4), 70),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 3), 45, 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 1), 56)
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
