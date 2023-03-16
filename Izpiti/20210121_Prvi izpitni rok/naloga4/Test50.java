
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 4), 50, 13),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 2), 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 1), 78),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 3), 56),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 1), 9, 15),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 2), 21, 7),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 5), 22),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 3), 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 5), 65),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 4), 91),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 5), 25, 75),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 1), 72),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 1), 98),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 4), 30, 9),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 3), 5, 6),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 1), 7),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 3), 80),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 1), 97, 82),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 3), 73),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 1), 36),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 4), 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 4), 34),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 5), 65),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 2), 47)
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
