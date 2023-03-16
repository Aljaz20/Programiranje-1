
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(43, 242, 245), 43, 33),
            new Cetrta.Kvadrat(new Cetrta.Barva(248, 181, 167), 2),
            new Cetrta.Krog(new Cetrta.Barva(158, 183, 154), 90),
            new Cetrta.Kvadrat(new Cetrta.Barva(33, 136, 180), 15),
            new Cetrta.Pravokotnik(new Cetrta.Barva(201, 186, 210), 92, 48),
            new Cetrta.Krog(new Cetrta.Barva(161, 43, 233), 82),
            new Cetrta.Pravokotnik(new Cetrta.Barva(104, 221, 34), 56, 16),
            new Cetrta.Krog(new Cetrta.Barva(3, 42, 240), 36),
            new Cetrta.Pravokotnik(new Cetrta.Barva(17, 195, 92), 37, 59),
            new Cetrta.Kvadrat(new Cetrta.Barva(240, 201, 130), 98),
            new Cetrta.Krog(new Cetrta.Barva(1, 35, 7), 41),
            new Cetrta.Pravokotnik(new Cetrta.Barva(140, 221, 37), 12, 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(75, 221, 112), 56),
            new Cetrta.Kvadrat(new Cetrta.Barva(107, 0, 206), 1),
            new Cetrta.Kvadrat(new Cetrta.Barva(49, 48, 58), 51),
            new Cetrta.Kvadrat(new Cetrta.Barva(40, 69, 55), 66),
            new Cetrta.Krog(new Cetrta.Barva(66, 220, 43), 72),
            new Cetrta.Kvadrat(new Cetrta.Barva(148, 224, 175), 62),
            new Cetrta.Krog(new Cetrta.Barva(135, 151, 72), 55),
            new Cetrta.Krog(new Cetrta.Barva(212, 132, 118), 84),
            new Cetrta.Krog(new Cetrta.Barva(95, 169, 97), 63),
            new Cetrta.Krog(new Cetrta.Barva(17, 49, 120), 5),
            new Cetrta.Kvadrat(new Cetrta.Barva(222, 196, 18), 14),
            new Cetrta.Kvadrat(new Cetrta.Barva(143, 177, 110), 58),
            new Cetrta.Pravokotnik(new Cetrta.Barva(140, 16, 200), 50, 2),
            new Cetrta.Krog(new Cetrta.Barva(198, 193, 55), 18),
            new Cetrta.Pravokotnik(new Cetrta.Barva(80, 225, 164), 10, 11),
            new Cetrta.Krog(new Cetrta.Barva(153, 13, 240), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(162, 142, 238), 89, 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(197, 231, 57), 87, 40),
            new Cetrta.Pravokotnik(new Cetrta.Barva(95, 130, 51), 60, 66),
            new Cetrta.Pravokotnik(new Cetrta.Barva(9, 247, 236), 82, 98),
            new Cetrta.Pravokotnik(new Cetrta.Barva(184, 150, 129), 34, 48),
            new Cetrta.Kvadrat(new Cetrta.Barva(121, 131, 140), 68),
            new Cetrta.Kvadrat(new Cetrta.Barva(179, 2, 126), 94),
            new Cetrta.Krog(new Cetrta.Barva(193, 208, 85), 88),
            new Cetrta.Kvadrat(new Cetrta.Barva(233, 133, 169), 48),
            new Cetrta.Kvadrat(new Cetrta.Barva(17, 59, 49), 35),
            new Cetrta.Kvadrat(new Cetrta.Barva(197, 131, 118), 18),
            new Cetrta.Kvadrat(new Cetrta.Barva(238, 137, 247), 34),
            new Cetrta.Pravokotnik(new Cetrta.Barva(96, 13, 122), 45, 20),
            new Cetrta.Krog(new Cetrta.Barva(21, 3, 200), 92),
            new Cetrta.Krog(new Cetrta.Barva(30, 250, 100), 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(50, 9, 154), 78),
            new Cetrta.Pravokotnik(new Cetrta.Barva(157, 149, 4), 55, 49),
            new Cetrta.Pravokotnik(new Cetrta.Barva(138, 44, 97), 79, 32),
            new Cetrta.Krog(new Cetrta.Barva(114, 154, 169), 35),
            new Cetrta.Pravokotnik(new Cetrta.Barva(0, 200, 125), 31, 83),
            new Cetrta.Pravokotnik(new Cetrta.Barva(48, 89, 19), 100, 69),
            new Cetrta.Krog(new Cetrta.Barva(229, 31, 129), 80),
            new Cetrta.Krog(new Cetrta.Barva(77, 156, 213), 99),
            new Cetrta.Kvadrat(new Cetrta.Barva(96, 156, 116), 44),
            new Cetrta.Pravokotnik(new Cetrta.Barva(213, 3, 244), 19, 79),
            new Cetrta.Kvadrat(new Cetrta.Barva(213, 110, 123), 70),
            new Cetrta.Krog(new Cetrta.Barva(137, 58, 66), 76),
            new Cetrta.Kvadrat(new Cetrta.Barva(202, 31, 94), 93),
            new Cetrta.Krog(new Cetrta.Barva(24, 19, 22), 13),
            new Cetrta.Kvadrat(new Cetrta.Barva(209, 36, 112), 50)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
