
import java.util.*;

public class Test45 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 5), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 3), 69, 92),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 2), 30),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 3), 76),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 3), 65),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 1), 91, 54),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 5), 55, 71),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 2), 70),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 4), 11),
            new Cetrta.Krog(new Cetrta.Barva(1, 3, 1), 84),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 3), 15),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 3), 66),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 5), 55, 33),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 4, 4), 95, 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 4), 13, 96),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 4), 77),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 5), 75),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 1), 54),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 5), 74),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 3), 12),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 3), 44, 1),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 4), 36),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 5), 24, 59),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 5), 5),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 4), 67),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 3), 97)
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
