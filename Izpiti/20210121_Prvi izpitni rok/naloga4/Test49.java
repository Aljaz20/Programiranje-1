
import java.util.*;

public class Test49 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 2), 90),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 1), 33),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 2), 9),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 2), 69),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 2), 17, 10),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 1), 14),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 1, 2), 72, 66),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 4), 62),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 2), 7, 45),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 3), 28, 18)
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
