
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 3), 47, 13),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 2), 65),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 3), 86, 44),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 1), 84, 33),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 3), 1),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 1), 22),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 3), 69),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 2), 70),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 4), 21),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 5), 24),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 3), 88),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 2), 55),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 4), 64),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 2), 71),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 1), 68),
            new Cetrta.Krog(new Cetrta.Barva(3, 5, 4), 15),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 4), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 4), 22, 50),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 4), 58),
            new Cetrta.Krog(new Cetrta.Barva(4, 5, 2), 54),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 4, 3), 99, 87),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 5), 34)
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
