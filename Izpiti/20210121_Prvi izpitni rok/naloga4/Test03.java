
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(240, 127, 179), 70),
            new Cetrta.Krog(new Cetrta.Barva(237, 4, 17), 28),
            new Cetrta.Krog(new Cetrta.Barva(79, 71, 251), 100),
            new Cetrta.Krog(new Cetrta.Barva(64, 159, 32), 93),
            new Cetrta.Kvadrat(new Cetrta.Barva(87, 223, 247), 21),
            new Cetrta.Pravokotnik(new Cetrta.Barva(122, 254, 148), 29, 17),
            new Cetrta.Pravokotnik(new Cetrta.Barva(244, 201, 244), 38, 53),
            new Cetrta.Krog(new Cetrta.Barva(202, 225, 184), 4),
            new Cetrta.Krog(new Cetrta.Barva(177, 141, 146), 19),
            new Cetrta.Pravokotnik(new Cetrta.Barva(220, 35, 178), 72, 39),
            new Cetrta.Krog(new Cetrta.Barva(50, 43, 10), 27),
            new Cetrta.Krog(new Cetrta.Barva(39, 102, 252), 48),
            new Cetrta.Krog(new Cetrta.Barva(73, 234, 154), 51),
            new Cetrta.Kvadrat(new Cetrta.Barva(114, 215, 242), 4),
            new Cetrta.Kvadrat(new Cetrta.Barva(173, 90, 92), 44),
            new Cetrta.Pravokotnik(new Cetrta.Barva(65, 24, 32), 22, 94),
            new Cetrta.Kvadrat(new Cetrta.Barva(125, 120, 160), 95),
            new Cetrta.Kvadrat(new Cetrta.Barva(252, 187, 233), 46),
            new Cetrta.Krog(new Cetrta.Barva(142, 208, 168), 56),
            new Cetrta.Krog(new Cetrta.Barva(8, 1, 79), 43),
            new Cetrta.Kvadrat(new Cetrta.Barva(73, 147, 223), 81),
            new Cetrta.Kvadrat(new Cetrta.Barva(218, 95, 174), 40),
            new Cetrta.Pravokotnik(new Cetrta.Barva(28, 127, 2), 38, 55),
            new Cetrta.Krog(new Cetrta.Barva(40, 230, 191), 92),
            new Cetrta.Pravokotnik(new Cetrta.Barva(95, 161, 221), 76, 26),
            new Cetrta.Krog(new Cetrta.Barva(175, 63, 97), 32),
            new Cetrta.Pravokotnik(new Cetrta.Barva(24, 155, 201), 92, 82),
            new Cetrta.Krog(new Cetrta.Barva(128, 60, 61), 1),
            new Cetrta.Krog(new Cetrta.Barva(118, 194, 159), 42),
            new Cetrta.Pravokotnik(new Cetrta.Barva(22, 164, 129), 20, 98),
            new Cetrta.Kvadrat(new Cetrta.Barva(11, 230, 96), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(108, 200, 17), 81, 47),
            new Cetrta.Pravokotnik(new Cetrta.Barva(151, 229, 166), 89, 47),
            new Cetrta.Pravokotnik(new Cetrta.Barva(39, 26, 202), 72, 26),
            new Cetrta.Krog(new Cetrta.Barva(198, 28, 134), 33),
            new Cetrta.Kvadrat(new Cetrta.Barva(36, 200, 39), 85),
            new Cetrta.Krog(new Cetrta.Barva(34, 13, 111), 50),
            new Cetrta.Pravokotnik(new Cetrta.Barva(22, 89, 30), 76, 85),
            new Cetrta.Krog(new Cetrta.Barva(7, 213, 91), 17),
            new Cetrta.Kvadrat(new Cetrta.Barva(12, 39, 103), 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(129, 111, 120), 72),
            new Cetrta.Pravokotnik(new Cetrta.Barva(20, 183, 18), 72, 84),
            new Cetrta.Krog(new Cetrta.Barva(167, 113, 87), 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(177, 42, 33), 18, 2),
            new Cetrta.Kvadrat(new Cetrta.Barva(136, 117, 21), 19),
            new Cetrta.Pravokotnik(new Cetrta.Barva(217, 16, 155), 33, 90),
            new Cetrta.Pravokotnik(new Cetrta.Barva(67, 53, 214), 44, 94),
            new Cetrta.Kvadrat(new Cetrta.Barva(24, 174, 182), 76)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
