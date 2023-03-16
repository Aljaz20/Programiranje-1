
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(237, 57, 65), 4),
            new Cetrta.Pravokotnik(new Cetrta.Barva(132, 36, 247), 13, 57),
            new Cetrta.Pravokotnik(new Cetrta.Barva(117, 83, 237), 71, 50),
            new Cetrta.Krog(new Cetrta.Barva(40, 193, 125), 48),
            new Cetrta.Kvadrat(new Cetrta.Barva(78, 233, 159), 62),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 163, 145), 93, 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(144, 107, 204), 34),
            new Cetrta.Pravokotnik(new Cetrta.Barva(223, 56, 134), 61, 62),
            new Cetrta.Pravokotnik(new Cetrta.Barva(57, 140, 5), 2, 10),
            new Cetrta.Krog(new Cetrta.Barva(184, 188, 226), 90),
            new Cetrta.Krog(new Cetrta.Barva(107, 29, 159), 9),
            new Cetrta.Krog(new Cetrta.Barva(11, 33, 255), 27),
            new Cetrta.Kvadrat(new Cetrta.Barva(199, 68, 118), 55),
            new Cetrta.Krog(new Cetrta.Barva(164, 110, 4), 16),
            new Cetrta.Kvadrat(new Cetrta.Barva(27, 140, 24), 51),
            new Cetrta.Kvadrat(new Cetrta.Barva(167, 234, 142), 90),
            new Cetrta.Pravokotnik(new Cetrta.Barva(34, 243, 139), 84, 89),
            new Cetrta.Krog(new Cetrta.Barva(55, 130, 134), 68),
            new Cetrta.Kvadrat(new Cetrta.Barva(171, 114, 9), 46),
            new Cetrta.Krog(new Cetrta.Barva(244, 122, 216), 65),
            new Cetrta.Kvadrat(new Cetrta.Barva(249, 242, 246), 33)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
