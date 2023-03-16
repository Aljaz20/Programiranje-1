
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 5), 96, 23),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 2), 23),
            new Cetrta.Krog(new Cetrta.Barva(3, 5, 4), 9),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 2), 98, 79),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 3), 40),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 3), 50),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 4), 74, 63),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 3), 22),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 3), 64, 3),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 4), 4),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 1), 22, 86),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 5), 33),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 4), 78),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 1), 23),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 1), 12),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 4), 19, 48),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 4), 69),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 1), 78),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 2), 7),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 5), 24),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 2), 92),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 5), 38),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 4), 85, 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 3), 98),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 5), 41, 47),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 4), 72),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 1), 97, 7),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 2), 34),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 2), 69),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 2), 89),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 2), 52, 100),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 2), 17),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 1), 60),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 1), 43, 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 4), 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 5), 96),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 3), 15),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 1), 25),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 5), 6),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 2), 70, 50),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 1), 1),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 4, 5), 26, 2),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 2), 26),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 2), 59),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 1), 72),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 4), 51),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 5), 52, 16),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 5), 62),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 2), 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 4), 95),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 4), 91, 100),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 2), 1),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 4), 62),
            new Cetrta.Krog(new Cetrta.Barva(4, 5, 4), 38),
            new Cetrta.Krog(new Cetrta.Barva(4, 3, 4), 80),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 4), 98)
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
