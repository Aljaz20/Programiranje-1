
import java.util.*;

public class Test48 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 1), 28, 98),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 5), 5),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 4), 28),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 3), 94),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 1), 39, 89),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 3), 1),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 3), 93),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 3), 95),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 5), 56, 26),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 4), 99),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 4), 49, 22),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 5), 29, 74),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 3), 96),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 2), 23)
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
