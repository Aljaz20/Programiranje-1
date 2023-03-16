
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(37, 162, 157), 7, 60),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 40, 94), 18, 34),
            new Cetrta.Kvadrat(new Cetrta.Barva(204, 30, 108), 72),
            new Cetrta.Kvadrat(new Cetrta.Barva(198, 91, 45), 9),
            new Cetrta.Krog(new Cetrta.Barva(108, 73, 137), 7),
            new Cetrta.Pravokotnik(new Cetrta.Barva(226, 137, 159), 18, 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(204, 225, 141), 66),
            new Cetrta.Pravokotnik(new Cetrta.Barva(200, 38, 2), 20, 99),
            new Cetrta.Krog(new Cetrta.Barva(5, 97, 120), 63),
            new Cetrta.Pravokotnik(new Cetrta.Barva(126, 58, 103), 4, 29),
            new Cetrta.Kvadrat(new Cetrta.Barva(157, 154, 247), 8),
            new Cetrta.Krog(new Cetrta.Barva(83, 66, 25), 13),
            new Cetrta.Pravokotnik(new Cetrta.Barva(134, 251, 246), 73, 98),
            new Cetrta.Krog(new Cetrta.Barva(102, 176, 115), 92),
            new Cetrta.Pravokotnik(new Cetrta.Barva(169, 120, 253), 23, 55),
            new Cetrta.Pravokotnik(new Cetrta.Barva(156, 96, 238), 93, 6),
            new Cetrta.Krog(new Cetrta.Barva(149, 167, 234), 15),
            new Cetrta.Kvadrat(new Cetrta.Barva(137, 183, 163), 36),
            new Cetrta.Kvadrat(new Cetrta.Barva(168, 2, 41), 33),
            new Cetrta.Kvadrat(new Cetrta.Barva(206, 41, 34), 96),
            new Cetrta.Krog(new Cetrta.Barva(150, 2, 129), 26),
            new Cetrta.Kvadrat(new Cetrta.Barva(165, 142, 171), 13),
            new Cetrta.Krog(new Cetrta.Barva(53, 69, 50), 76),
            new Cetrta.Pravokotnik(new Cetrta.Barva(215, 158, 160), 91, 82),
            new Cetrta.Pravokotnik(new Cetrta.Barva(74, 53, 253), 28, 27),
            new Cetrta.Pravokotnik(new Cetrta.Barva(81, 98, 197), 46, 17),
            new Cetrta.Krog(new Cetrta.Barva(127, 11, 144), 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(56, 152, 166), 62, 2),
            new Cetrta.Kvadrat(new Cetrta.Barva(197, 80, 14), 85),
            new Cetrta.Krog(new Cetrta.Barva(47, 178, 108), 38)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
