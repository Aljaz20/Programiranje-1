
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 4), 64, 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 2), 10, 45),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 5), 56, 35),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 3), 16),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 4), 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 4), 78, 66),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 5), 90),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 2), 92),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 3), 66),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 4), 48),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 2), 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 1), 86),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 5), 65),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 4), 56, 35),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 3), 39),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 4), 64, 51),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 1), 27),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 3), 3),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 1), 46),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 3, 2), 97, 33),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 1), 28, 85),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 4), 49),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 1), 65),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 4), 57),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 1), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 5), 20, 20),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 5), 31, 27),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 5), 10, 62),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 1), 3),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 4), 31),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 4), 2),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 5), 29),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 2), 99),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 4), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 5), 37, 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 5), 43, 59),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 1), 99, 100),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 5), 51),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 5), 4),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 4), 20, 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 2), 6, 2)
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
