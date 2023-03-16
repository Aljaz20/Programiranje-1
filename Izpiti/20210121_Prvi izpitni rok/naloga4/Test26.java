
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 5), 40),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 1), 60),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 2), 36, 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 4), 6, 87),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 3), 43),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 4), 63),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 1), 3),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 4), 15),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 5), 94),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 4), 11),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 1), 30),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 1), 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 5), 17, 69),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 4), 16, 88),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 2), 70),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 2), 63),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 1), 50),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 3), 56),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 5), 38, 74),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 4), 82),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 4), 48),
            new Cetrta.Krog(new Cetrta.Barva(3, 2, 3), 77),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 2), 53),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 5), 35, 54),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 5), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 2), 18, 7),
            new Cetrta.Krog(new Cetrta.Barva(3, 5, 2), 69),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 4), 72),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 2), 86),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 4), 63, 51),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 5, 3), 38, 28),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 2), 85),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 1), 24),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 1), 12),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 4), 89, 25),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 4), 47),
            new Cetrta.Krog(new Cetrta.Barva(4, 3, 2), 50),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 1), 84),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 4), 28),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 5), 35, 7),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 3), 89, 28),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 5), 39, 49),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 4), 38),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 4), 12),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 5), 50, 62),
            new Cetrta.Krog(new Cetrta.Barva(3, 5, 5), 78),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 3), 69),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 1), 71, 17),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 2), 74),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 3), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 3), 52, 92),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 2), 40),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 3), 97),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 5, 1), 98, 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 5), 4, 45),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 4), 21, 93),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 5), 74),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 5), 69),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 4), 9),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 4), 76),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 2), 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 4), 21, 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 4), 88),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 2), 5, 17),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 4), 91),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 3), 95, 79),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 5), 72),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 5, 4), 58, 54),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 2), 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 2), 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 3), 17, 99),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 4), 60),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 1), 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 4), 92),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 1), 77, 20)
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
