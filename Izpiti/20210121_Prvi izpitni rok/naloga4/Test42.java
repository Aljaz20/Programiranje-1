
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 2), 26),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 1), 65),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 4), 53, 2),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 4), 31),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 2), 97, 4),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 4), 89),
            new Cetrta.Krog(new Cetrta.Barva(4, 5, 4), 69),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 4), 30),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 4), 48),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 5), 93),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 3), 56, 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 3), 87),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 3), 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 1), 85)
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
