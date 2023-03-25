
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 4), 29),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 1), 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 4), 88),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 5), 88, 94),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 2), 48),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 3), 50),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 2), 49, 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 5), 66, 16),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 1), 1),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 2), 93),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 5), 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 5), 47, 63),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 5), 18),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 2), 1),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 1), 33),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 3), 25),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 3), 1, 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 2), 39),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 1), 56),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 2), 6),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 2), 16, 24),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 3), 13, 45),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 1), 3, 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 3), 14),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 4, 3), 83, 10),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 1), 63),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 1), 50)
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
