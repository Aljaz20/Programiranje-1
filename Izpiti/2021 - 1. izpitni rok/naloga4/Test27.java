
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 2), 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 1), 83),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 5), 7, 26),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 4), 52, 29),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 5, 5), 96, 22),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 5), 69),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 5), 41),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 3), 80, 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 2), 29, 33),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 4), 64),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 4), 94),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 3), 40, 95),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 4), 1),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 5), 98),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 5), 23),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 1), 69),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 2), 20),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 2), 52),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 5), 7, 10),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 4, 1), 95, 25),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 1), 95),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 1), 78),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 3), 32, 18),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 4), 31, 100),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 2), 10),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 2), 31),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 5), 37, 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 3), 60, 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 5), 80),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 4), 10, 95),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 4), 36),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 2), 15),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 1), 62),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 3), 55),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 3), 58, 10),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 1), 24),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 5), 16),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 4), 67, 54),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 4), 11, 88),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 3), 88),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 3), 41),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 4), 91, 16),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 1), 40),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 2), 65, 54),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 4), 61),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 1), 96, 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 3), 41),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 1), 81),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 5), 70, 79),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 2), 62),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 2), 73),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 1), 64, 47),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 5), 18),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 4), 57, 87),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 5), 7, 60),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 3), 45),
            new Cetrta.Krog(new Cetrta.Barva(4, 5, 4), 70),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 1), 31)
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
