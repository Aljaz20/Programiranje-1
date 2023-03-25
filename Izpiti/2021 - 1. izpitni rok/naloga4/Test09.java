
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(215, 188, 121), 64),
            new Cetrta.Kvadrat(new Cetrta.Barva(72, 103, 244), 35),
            new Cetrta.Pravokotnik(new Cetrta.Barva(190, 94, 72), 26, 25),
            new Cetrta.Kvadrat(new Cetrta.Barva(15, 193, 125), 89),
            new Cetrta.Kvadrat(new Cetrta.Barva(25, 110, 69), 91),
            new Cetrta.Krog(new Cetrta.Barva(121, 236, 160), 7),
            new Cetrta.Kvadrat(new Cetrta.Barva(88, 20, 173), 92),
            new Cetrta.Pravokotnik(new Cetrta.Barva(58, 88, 57), 4, 22),
            new Cetrta.Krog(new Cetrta.Barva(7, 159, 28), 86),
            new Cetrta.Pravokotnik(new Cetrta.Barva(93, 6, 159), 67, 17),
            new Cetrta.Krog(new Cetrta.Barva(167, 128, 76), 23),
            new Cetrta.Pravokotnik(new Cetrta.Barva(174, 203, 168), 56, 86),
            new Cetrta.Kvadrat(new Cetrta.Barva(214, 57, 95), 41),
            new Cetrta.Kvadrat(new Cetrta.Barva(241, 90, 14), 67),
            new Cetrta.Pravokotnik(new Cetrta.Barva(63, 255, 198), 72, 12),
            new Cetrta.Pravokotnik(new Cetrta.Barva(126, 19, 56), 52, 67),
            new Cetrta.Pravokotnik(new Cetrta.Barva(12, 102, 235), 99, 27),
            new Cetrta.Krog(new Cetrta.Barva(131, 140, 29), 59),
            new Cetrta.Krog(new Cetrta.Barva(142, 105, 160), 61),
            new Cetrta.Krog(new Cetrta.Barva(63, 177, 197), 85),
            new Cetrta.Kvadrat(new Cetrta.Barva(59, 117, 116), 24),
            new Cetrta.Kvadrat(new Cetrta.Barva(227, 42, 238), 10),
            new Cetrta.Krog(new Cetrta.Barva(18, 222, 236), 44),
            new Cetrta.Kvadrat(new Cetrta.Barva(175, 14, 111), 55),
            new Cetrta.Pravokotnik(new Cetrta.Barva(83, 240, 12), 68, 6),
            new Cetrta.Pravokotnik(new Cetrta.Barva(196, 137, 248), 67, 54),
            new Cetrta.Kvadrat(new Cetrta.Barva(191, 72, 61), 20),
            new Cetrta.Kvadrat(new Cetrta.Barva(200, 64, 28), 97),
            new Cetrta.Kvadrat(new Cetrta.Barva(64, 81, 196), 74),
            new Cetrta.Pravokotnik(new Cetrta.Barva(153, 235, 156), 2, 97),
            new Cetrta.Krog(new Cetrta.Barva(206, 48, 134), 70),
            new Cetrta.Krog(new Cetrta.Barva(227, 150, 190), 43)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
