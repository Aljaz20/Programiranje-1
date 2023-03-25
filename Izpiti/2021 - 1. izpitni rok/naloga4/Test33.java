
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 1), 51, 47),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 3), 46, 100),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 1), 10),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 2), 31),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 1), 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 1), 88),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 3), 93),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 5), 40),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 2), 39),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 2), 92),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 5), 43),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 4), 2),
            new Cetrta.Krog(new Cetrta.Barva(3, 3, 4), 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 4), 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 4), 52),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 4), 82),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 4), 21, 39),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 5), 66),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 3), 74),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 5, 3), 57, 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 4), 40),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 4), 34),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 4), 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 4), 67),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 3, 3), 74),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 4), 39),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 4, 5), 48),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 3), 66, 84),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 5), 80, 55),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 3), 39),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 3), 91, 23),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 2), 34),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 3), 63),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 5), 48, 22),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 1), 37, 52)
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
