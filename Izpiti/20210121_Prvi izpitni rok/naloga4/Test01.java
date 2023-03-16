
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(19, 193, 108), 92, 15),
            new Cetrta.Krog(new Cetrta.Barva(21, 165, 129), 86),
            new Cetrta.Krog(new Cetrta.Barva(102, 224, 21), 47),
            new Cetrta.Kvadrat(new Cetrta.Barva(202, 222, 104), 29),
            new Cetrta.Krog(new Cetrta.Barva(185, 187, 220), 19),
            new Cetrta.Kvadrat(new Cetrta.Barva(194, 42, 36), 48),
            new Cetrta.Krog(new Cetrta.Barva(116, 44, 39), 100),
            new Cetrta.Kvadrat(new Cetrta.Barva(230, 43, 55), 32),
            new Cetrta.Kvadrat(new Cetrta.Barva(173, 136, 164), 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(65, 252, 94), 8, 57),
            new Cetrta.Kvadrat(new Cetrta.Barva(57, 214, 23), 3),
            new Cetrta.Krog(new Cetrta.Barva(228, 119, 52), 53),
            new Cetrta.Krog(new Cetrta.Barva(67, 74, 159), 82),
            new Cetrta.Pravokotnik(new Cetrta.Barva(146, 122, 251), 15, 69),
            new Cetrta.Krog(new Cetrta.Barva(162, 68, 145), 38),
            new Cetrta.Pravokotnik(new Cetrta.Barva(25, 48, 152), 56, 47),
            new Cetrta.Kvadrat(new Cetrta.Barva(216, 156, 226), 63),
            new Cetrta.Pravokotnik(new Cetrta.Barva(195, 9, 106), 21, 43),
            new Cetrta.Pravokotnik(new Cetrta.Barva(82, 159, 76), 28, 75),
            new Cetrta.Kvadrat(new Cetrta.Barva(88, 85, 150), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(147, 86, 123), 73, 24),
            new Cetrta.Pravokotnik(new Cetrta.Barva(7, 140, 89), 72, 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(46, 86, 73), 62),
            new Cetrta.Kvadrat(new Cetrta.Barva(203, 188, 143), 58),
            new Cetrta.Kvadrat(new Cetrta.Barva(153, 113, 146), 28),
            new Cetrta.Krog(new Cetrta.Barva(197, 198, 201), 78),
            new Cetrta.Krog(new Cetrta.Barva(128, 26, 167), 6),
            new Cetrta.Kvadrat(new Cetrta.Barva(136, 117, 0), 14),
            new Cetrta.Pravokotnik(new Cetrta.Barva(170, 238, 236), 38, 56),
            new Cetrta.Krog(new Cetrta.Barva(113, 135, 5), 60),
            new Cetrta.Krog(new Cetrta.Barva(243, 81, 30), 83),
            new Cetrta.Krog(new Cetrta.Barva(156, 12, 93), 72),
            new Cetrta.Pravokotnik(new Cetrta.Barva(198, 27, 128), 85, 78),
            new Cetrta.Pravokotnik(new Cetrta.Barva(187, 104, 230), 32, 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(213, 123, 8), 18, 99),
            new Cetrta.Pravokotnik(new Cetrta.Barva(75, 169, 99), 3, 56),
            new Cetrta.Krog(new Cetrta.Barva(193, 11, 68), 28),
            new Cetrta.Kvadrat(new Cetrta.Barva(29, 122, 83), 40),
            new Cetrta.Pravokotnik(new Cetrta.Barva(249, 15, 178), 94, 68),
            new Cetrta.Krog(new Cetrta.Barva(34, 255, 122), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(39, 249, 20), 75, 8),
            new Cetrta.Krog(new Cetrta.Barva(199, 31, 5), 22),
            new Cetrta.Kvadrat(new Cetrta.Barva(208, 143, 178), 50),
            new Cetrta.Krog(new Cetrta.Barva(249, 254, 44), 71),
            new Cetrta.Krog(new Cetrta.Barva(184, 254, 62), 17),
            new Cetrta.Kvadrat(new Cetrta.Barva(107, 88, 137), 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(107, 79, 190), 66),
            new Cetrta.Krog(new Cetrta.Barva(160, 204, 238), 13),
            new Cetrta.Krog(new Cetrta.Barva(145, 6, 27), 64),
            new Cetrta.Pravokotnik(new Cetrta.Barva(215, 33, 43), 1, 86),
            new Cetrta.Kvadrat(new Cetrta.Barva(172, 78, 6), 42),
            new Cetrta.Pravokotnik(new Cetrta.Barva(223, 178, 133), 86, 35),
            new Cetrta.Kvadrat(new Cetrta.Barva(74, 200, 219), 21),
            new Cetrta.Krog(new Cetrta.Barva(12, 38, 201), 3),
            new Cetrta.Krog(new Cetrta.Barva(63, 192, 84), 51),
            new Cetrta.Krog(new Cetrta.Barva(20, 148, 136), 24),
            new Cetrta.Pravokotnik(new Cetrta.Barva(76, 170, 104), 50, 49),
            new Cetrta.Kvadrat(new Cetrta.Barva(194, 189, 188), 97),
            new Cetrta.Krog(new Cetrta.Barva(58, 137, 85), 27),
            new Cetrta.Pravokotnik(new Cetrta.Barva(140, 104, 110), 12, 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(229, 68, 160), 23),
            new Cetrta.Krog(new Cetrta.Barva(233, 157, 122), 52),
            new Cetrta.Kvadrat(new Cetrta.Barva(85, 56, 127), 38),
            new Cetrta.Pravokotnik(new Cetrta.Barva(192, 248, 100), 2, 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(93, 101, 137), 33),
            new Cetrta.Krog(new Cetrta.Barva(1, 142, 104), 40)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
