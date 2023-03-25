
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 3), 17, 12),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 2), 54, 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 3), 89),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 5), 26, 59),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 3), 58, 3),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 3), 95),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 3), 98),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 1), 74, 43)
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
