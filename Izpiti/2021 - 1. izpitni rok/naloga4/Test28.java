
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 4, 5), 93, 47),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 2), 65),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 5, 3), 90, 33),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 4), 55, 3),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 4), 4),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 4), 71, 16),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 2), 91),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 2), 41),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 1), 79, 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 4), 13),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 4), 75),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 2), 45),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 4), 30),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 1), 3, 63),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 2), 2, 48),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 2), 1),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 1), 91, 47),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 3), 100),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 1), 18),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 1), 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 3), 57),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 2), 70, 28),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 5), 36, 57),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 1), 22),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 3), 26),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 2), 19, 72),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 4), 55),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 2), 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 3), 9),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 5), 49, 40),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 4), 50),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 5), 89),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 1), 77)
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
