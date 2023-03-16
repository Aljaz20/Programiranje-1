
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 5), 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 4, 2), 74, 45),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 4), 93),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 4), 8, 29),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 3), 51),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 1), 17),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 1), 29),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 4), 1, 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 2), 49),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 5), 17),
            new Cetrta.Krog(new Cetrta.Barva(4, 5, 3), 51),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 4), 8),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 5), 53),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 3), 72, 20),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 4), 83),
            new Cetrta.Krog(new Cetrta.Barva(4, 3, 3), 16),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 5), 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 1), 18),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 4, 5), 54, 23),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 5), 13),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 3), 7),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 1), 40),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 5), 52),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 4), 38),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 1), 38, 57),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 2), 79),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 4, 4), 39, 40),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 1), 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 3), 31),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 2), 15),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 5), 19),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 5), 42),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 2), 21, 44),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 1), 29),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 4), 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 1), 47, 56),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 5), 55),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 4), 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 5), 6),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 4), 37),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 5), 20),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 5), 40, 24),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 4), 26, 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 3), 38, 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 4), 81, 20),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 1), 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 3), 16, 50),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 4), 67),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 1), 97),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 2), 94),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 4), 45),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 3), 15, 27),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 3), 35, 22),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 3), 17),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 3), 66),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 3), 43),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 3), 19),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 2), 99, 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 3), 100, 21),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 1), 58),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 3), 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 5), 17),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 3), 79),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 4), 14),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 2), 15, 10),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 5), 86, 46),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 2), 22),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 5), 1, 79),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 2), 68),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 4), 84),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 4, 1), 69, 93),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 3), 98, 13),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 5), 68),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 5), 25, 59),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 1), 57, 46),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 2), 10)
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
