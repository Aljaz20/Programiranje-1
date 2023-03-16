
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 3, 5), 46),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 4), 41),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 4, 2), 31),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 5, 3), 73, 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 1), 51),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 5, 2), 57, 36),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 5), 41, 46),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 1), 93),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 1, 2), 69, 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 4), 40),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 4, 2), 41, 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 5), 14, 25),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 5, 5), 12),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 1), 67),
            new Cetrta.Krog(new Cetrta.Barva(5, 1, 3), 30),
            new Cetrta.Krog(new Cetrta.Barva(2, 1, 1), 38),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 4), 90),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 2), 62, 92),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 4), 6),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 2, 2), 46),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 2), 51),
            new Cetrta.Krog(new Cetrta.Barva(5, 5, 3), 32),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 4), 56, 39),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 3, 3), 78, 66),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 5), 98, 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 3), 65, 68),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 2, 3), 65)
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
