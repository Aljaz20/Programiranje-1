
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 4), 67),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 4), 71),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 1), 64),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 2), 84),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 4), 50),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 2), 39),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 5), 62),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 1), 94),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 4), 74, 100),
            new Cetrta.Krog(new Cetrta.Barva(3, 5, 2), 77),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 5), 39),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 5), 91),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 4), 83),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 2), 7, 2),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 4), 79),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 2), 56),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 2), 66),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 4), 1, 54),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 2), 99, 48),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 5), 28),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 4), 91, 22),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 1), 22),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 3), 74),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 4, 2), 90, 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 4), 9),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 2), 98),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 4), 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 5, 3), 31, 42),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 2), 97, 76),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 5), 96),
            new Cetrta.Krog(new Cetrta.Barva(3, 5, 4), 33),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 2), 86),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 4), 89),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 4), 84, 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 4), 33),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 2), 1)
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
