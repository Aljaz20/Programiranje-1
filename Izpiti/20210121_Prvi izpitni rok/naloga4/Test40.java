
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 1), 54),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 4), 6, 17),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 3), 34),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 3), 76, 35),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 3), 79),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 5, 1), 38, 82),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 3), 46),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 1), 97, 63),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 1), 73, 22),
            new Cetrta.Krog(new Cetrta.Barva(4, 3, 5), 24),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 5), 85, 11),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 5), 53),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 3), 97, 18),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 5), 17, 22),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 1), 79)
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
