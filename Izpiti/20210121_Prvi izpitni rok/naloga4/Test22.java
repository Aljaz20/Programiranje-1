
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(114, 106, 140), 54),
            new Cetrta.Kvadrat(new Cetrta.Barva(52, 128, 246), 44),
            new Cetrta.Kvadrat(new Cetrta.Barva(189, 165, 53), 55),
            new Cetrta.Pravokotnik(new Cetrta.Barva(15, 102, 28), 6, 57),
            new Cetrta.Pravokotnik(new Cetrta.Barva(73, 16, 14), 24, 38),
            new Cetrta.Krog(new Cetrta.Barva(51, 39, 22), 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(105, 217, 69), 29),
            new Cetrta.Pravokotnik(new Cetrta.Barva(232, 138, 107), 62, 29),
            new Cetrta.Kvadrat(new Cetrta.Barva(231, 217, 217), 36),
            new Cetrta.Kvadrat(new Cetrta.Barva(54, 72, 168), 51),
            new Cetrta.Pravokotnik(new Cetrta.Barva(206, 134, 231), 89, 10),
            new Cetrta.Krog(new Cetrta.Barva(123, 249, 22), 39),
            new Cetrta.Pravokotnik(new Cetrta.Barva(28, 238, 194), 34, 2),
            new Cetrta.Pravokotnik(new Cetrta.Barva(153, 226, 249), 37, 63),
            new Cetrta.Krog(new Cetrta.Barva(60, 159, 61), 53),
            new Cetrta.Pravokotnik(new Cetrta.Barva(103, 40, 25), 83, 1),
            new Cetrta.Pravokotnik(new Cetrta.Barva(176, 192, 133), 98, 93),
            new Cetrta.Krog(new Cetrta.Barva(82, 112, 15), 18),
            new Cetrta.Krog(new Cetrta.Barva(87, 77, 31), 72),
            new Cetrta.Pravokotnik(new Cetrta.Barva(231, 175, 12), 93, 38),
            new Cetrta.Krog(new Cetrta.Barva(107, 244, 143), 95),
            new Cetrta.Kvadrat(new Cetrta.Barva(111, 209, 234), 45),
            new Cetrta.Pravokotnik(new Cetrta.Barva(162, 24, 182), 91, 67),
            new Cetrta.Krog(new Cetrta.Barva(140, 188, 33), 33),
            new Cetrta.Kvadrat(new Cetrta.Barva(22, 246, 175), 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(193, 21, 239), 50),
            new Cetrta.Krog(new Cetrta.Barva(42, 158, 68), 12),
            new Cetrta.Krog(new Cetrta.Barva(205, 194, 149), 6),
            new Cetrta.Kvadrat(new Cetrta.Barva(94, 192, 73), 5),
            new Cetrta.Kvadrat(new Cetrta.Barva(178, 76, 145), 49),
            new Cetrta.Pravokotnik(new Cetrta.Barva(210, 210, 123), 10, 42),
            new Cetrta.Krog(new Cetrta.Barva(10, 163, 142), 59),
            new Cetrta.Krog(new Cetrta.Barva(85, 72, 59), 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(77, 118, 100), 59),
            new Cetrta.Kvadrat(new Cetrta.Barva(167, 172, 136), 90),
            new Cetrta.Pravokotnik(new Cetrta.Barva(21, 142, 98), 54, 34),
            new Cetrta.Pravokotnik(new Cetrta.Barva(65, 194, 214), 84, 25),
            new Cetrta.Pravokotnik(new Cetrta.Barva(102, 25, 213), 97, 49),
            new Cetrta.Kvadrat(new Cetrta.Barva(145, 152, 215), 57),
            new Cetrta.Pravokotnik(new Cetrta.Barva(215, 85, 186), 11, 92),
            new Cetrta.Krog(new Cetrta.Barva(113, 215, 69), 50),
            new Cetrta.Krog(new Cetrta.Barva(12, 82, 40), 54),
            new Cetrta.Krog(new Cetrta.Barva(185, 108, 40), 10),
            new Cetrta.Krog(new Cetrta.Barva(164, 84, 136), 90),
            new Cetrta.Kvadrat(new Cetrta.Barva(111, 82, 221), 56),
            new Cetrta.Krog(new Cetrta.Barva(186, 122, 214), 40),
            new Cetrta.Pravokotnik(new Cetrta.Barva(153, 187, 17), 34, 1),
            new Cetrta.Kvadrat(new Cetrta.Barva(25, 127, 43), 93),
            new Cetrta.Kvadrat(new Cetrta.Barva(236, 105, 242), 37),
            new Cetrta.Krog(new Cetrta.Barva(241, 87, 250), 97),
            new Cetrta.Krog(new Cetrta.Barva(244, 144, 86), 81),
            new Cetrta.Pravokotnik(new Cetrta.Barva(116, 217, 197), 100, 84),
            new Cetrta.Kvadrat(new Cetrta.Barva(131, 66, 70), 12),
            new Cetrta.Kvadrat(new Cetrta.Barva(25, 56, 252), 64),
            new Cetrta.Kvadrat(new Cetrta.Barva(53, 132, 19), 18),
            new Cetrta.Krog(new Cetrta.Barva(27, 136, 19), 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(182, 119, 180), 21),
            new Cetrta.Krog(new Cetrta.Barva(203, 234, 36), 5),
            new Cetrta.Kvadrat(new Cetrta.Barva(206, 167, 232), 17)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
