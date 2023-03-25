
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(163, 92, 29), 82),
            new Cetrta.Kvadrat(new Cetrta.Barva(213, 241, 221), 42),
            new Cetrta.Pravokotnik(new Cetrta.Barva(19, 15, 87), 77, 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(49, 83, 179), 59, 65),
            new Cetrta.Pravokotnik(new Cetrta.Barva(174, 12, 100), 10, 99),
            new Cetrta.Pravokotnik(new Cetrta.Barva(64, 81, 103), 23, 43),
            new Cetrta.Pravokotnik(new Cetrta.Barva(222, 174, 49), 2, 36),
            new Cetrta.Krog(new Cetrta.Barva(168, 34, 113), 2),
            new Cetrta.Pravokotnik(new Cetrta.Barva(245, 196, 36), 98, 47),
            new Cetrta.Kvadrat(new Cetrta.Barva(197, 137, 115), 32),
            new Cetrta.Krog(new Cetrta.Barva(102, 225, 169), 22),
            new Cetrta.Krog(new Cetrta.Barva(194, 248, 124), 84),
            new Cetrta.Pravokotnik(new Cetrta.Barva(34, 136, 165), 35, 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(236, 136, 154), 26, 46),
            new Cetrta.Pravokotnik(new Cetrta.Barva(110, 115, 87), 3, 95),
            new Cetrta.Pravokotnik(new Cetrta.Barva(124, 167, 88), 84, 93),
            new Cetrta.Pravokotnik(new Cetrta.Barva(8, 232, 170), 97, 44),
            new Cetrta.Pravokotnik(new Cetrta.Barva(131, 85, 11), 86, 100),
            new Cetrta.Krog(new Cetrta.Barva(97, 208, 248), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(127, 187, 102), 46, 15),
            new Cetrta.Krog(new Cetrta.Barva(178, 255, 17), 54),
            new Cetrta.Pravokotnik(new Cetrta.Barva(63, 23, 75), 80, 46),
            new Cetrta.Kvadrat(new Cetrta.Barva(247, 116, 214), 40),
            new Cetrta.Pravokotnik(new Cetrta.Barva(177, 222, 54), 13, 55),
            new Cetrta.Krog(new Cetrta.Barva(197, 253, 150), 71),
            new Cetrta.Pravokotnik(new Cetrta.Barva(99, 216, 168), 68, 85),
            new Cetrta.Krog(new Cetrta.Barva(75, 112, 169), 51),
            new Cetrta.Krog(new Cetrta.Barva(157, 15, 154), 94),
            new Cetrta.Kvadrat(new Cetrta.Barva(195, 13, 164), 93),
            new Cetrta.Krog(new Cetrta.Barva(9, 38, 81), 59),
            new Cetrta.Krog(new Cetrta.Barva(75, 224, 29), 33),
            new Cetrta.Pravokotnik(new Cetrta.Barva(21, 134, 137), 21, 92),
            new Cetrta.Pravokotnik(new Cetrta.Barva(33, 15, 0), 96, 80),
            new Cetrta.Pravokotnik(new Cetrta.Barva(155, 253, 68), 70, 57),
            new Cetrta.Krog(new Cetrta.Barva(82, 165, 95), 86),
            new Cetrta.Pravokotnik(new Cetrta.Barva(88, 132, 146), 87, 94),
            new Cetrta.Pravokotnik(new Cetrta.Barva(211, 20, 201), 44, 91),
            new Cetrta.Pravokotnik(new Cetrta.Barva(47, 212, 48), 30, 3),
            new Cetrta.Kvadrat(new Cetrta.Barva(40, 173, 168), 46),
            new Cetrta.Pravokotnik(new Cetrta.Barva(182, 231, 198), 17, 98),
            new Cetrta.Kvadrat(new Cetrta.Barva(97, 91, 31), 53),
            new Cetrta.Krog(new Cetrta.Barva(253, 56, 103), 57),
            new Cetrta.Pravokotnik(new Cetrta.Barva(229, 219, 84), 58, 65),
            new Cetrta.Kvadrat(new Cetrta.Barva(212, 88, 245), 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(183, 185, 242), 51, 56),
            new Cetrta.Kvadrat(new Cetrta.Barva(170, 88, 162), 90),
            new Cetrta.Kvadrat(new Cetrta.Barva(104, 8, 188), 83),
            new Cetrta.Kvadrat(new Cetrta.Barva(31, 3, 30), 60),
            new Cetrta.Pravokotnik(new Cetrta.Barva(139, 89, 117), 37, 25)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
