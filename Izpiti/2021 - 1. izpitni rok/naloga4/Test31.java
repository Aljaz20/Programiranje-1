
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 1), 49),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 3), 2, 43),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 5), 56),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 4), 88),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 4), 43),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 1, 5), 57),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 3), 26),
            new Cetrta.Krog(new Cetrta.Barva(1, 5, 5), 13),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 5), 72),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 2), 49),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 1), 34),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 4), 98),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 1), 69),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 4), 28),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 1), 7),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 4), 67),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 5), 94, 7),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 5), 98, 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 3), 24, 35),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 1), 64),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 2), 25),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 3), 51),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 1), 90, 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 2), 91, 28),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 5, 3), 18, 61),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 4), 1, 49),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 5), 27, 5),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 2), 58),
            new Cetrta.Krog(new Cetrta.Barva(4, 5, 5), 82),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 3), 28),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 2), 60),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 1), 28),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 3), 87),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 3), 98, 82),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 4), 51, 47),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 3), 12)
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
