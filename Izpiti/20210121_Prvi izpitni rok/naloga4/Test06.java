
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 194, 222), 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(196, 115, 33), 82),
            new Cetrta.Krog(new Cetrta.Barva(242, 73, 65), 57),
            new Cetrta.Pravokotnik(new Cetrta.Barva(212, 202, 62), 77, 81),
            new Cetrta.Pravokotnik(new Cetrta.Barva(208, 17, 245), 58, 39),
            new Cetrta.Kvadrat(new Cetrta.Barva(217, 152, 28), 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(29, 252, 68), 19),
            new Cetrta.Kvadrat(new Cetrta.Barva(45, 95, 166), 2),
            new Cetrta.Kvadrat(new Cetrta.Barva(185, 77, 255), 13),
            new Cetrta.Pravokotnik(new Cetrta.Barva(11, 151, 17), 71, 39),
            new Cetrta.Krog(new Cetrta.Barva(142, 107, 249), 30),
            new Cetrta.Kvadrat(new Cetrta.Barva(249, 177, 3), 70),
            new Cetrta.Kvadrat(new Cetrta.Barva(27, 178, 7), 42)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
