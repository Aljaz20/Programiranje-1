
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 2), 83, 35),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 4), 80),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 3), 12),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 3), 66),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 5), 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 3), 54),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 4), 23),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 1), 7),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 5), 66),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 3), 91),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 5), 78),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 2), 39),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 2), 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 2), 91),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 5), 33),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 3), 7),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 1), 21),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 2), 100),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 2), 60),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 3), 99),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 5), 36),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 5), 52, 20),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 3), 8, 17),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 3), 6),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 2), 3, 48),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 1), 90),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 4), 69)
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
