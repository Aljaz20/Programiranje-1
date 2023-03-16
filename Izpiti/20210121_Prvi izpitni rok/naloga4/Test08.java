
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(0, 32, 7), 35, 100),
            new Cetrta.Krog(new Cetrta.Barva(158, 68, 186), 92),
            new Cetrta.Kvadrat(new Cetrta.Barva(96, 7, 45), 30),
            new Cetrta.Pravokotnik(new Cetrta.Barva(127, 139, 94), 78, 76),
            new Cetrta.Kvadrat(new Cetrta.Barva(64, 91, 218), 18),
            new Cetrta.Kvadrat(new Cetrta.Barva(245, 254, 174), 64),
            new Cetrta.Kvadrat(new Cetrta.Barva(111, 252, 156), 67),
            new Cetrta.Kvadrat(new Cetrta.Barva(209, 130, 30), 8),
            new Cetrta.Krog(new Cetrta.Barva(152, 190, 103), 56),
            new Cetrta.Kvadrat(new Cetrta.Barva(188, 168, 19), 66),
            new Cetrta.Pravokotnik(new Cetrta.Barva(178, 74, 147), 5, 58),
            new Cetrta.Kvadrat(new Cetrta.Barva(19, 237, 105), 86),
            new Cetrta.Krog(new Cetrta.Barva(23, 216, 84), 16),
            new Cetrta.Pravokotnik(new Cetrta.Barva(155, 15, 182), 60, 42),
            new Cetrta.Kvadrat(new Cetrta.Barva(167, 132, 140), 26),
            new Cetrta.Kvadrat(new Cetrta.Barva(139, 223, 100), 84),
            new Cetrta.Krog(new Cetrta.Barva(4, 184, 235), 12),
            new Cetrta.Pravokotnik(new Cetrta.Barva(239, 249, 225), 76, 32),
            new Cetrta.Krog(new Cetrta.Barva(211, 246, 170), 97),
            new Cetrta.Pravokotnik(new Cetrta.Barva(232, 86, 175), 6, 8),
            new Cetrta.Krog(new Cetrta.Barva(36, 54, 220), 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(108, 181, 125), 58, 19),
            new Cetrta.Kvadrat(new Cetrta.Barva(40, 106, 252), 91),
            new Cetrta.Pravokotnik(new Cetrta.Barva(242, 176, 200), 50, 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(143, 189, 13), 38),
            new Cetrta.Krog(new Cetrta.Barva(206, 110, 191), 90),
            new Cetrta.Kvadrat(new Cetrta.Barva(80, 150, 178), 36),
            new Cetrta.Pravokotnik(new Cetrta.Barva(74, 52, 74), 69, 62),
            new Cetrta.Kvadrat(new Cetrta.Barva(204, 136, 183), 60),
            new Cetrta.Kvadrat(new Cetrta.Barva(209, 21, 174), 78),
            new Cetrta.Kvadrat(new Cetrta.Barva(22, 228, 114), 22),
            new Cetrta.Pravokotnik(new Cetrta.Barva(238, 53, 213), 83, 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(190, 41, 186), 57),
            new Cetrta.Krog(new Cetrta.Barva(105, 17, 16), 49),
            new Cetrta.Krog(new Cetrta.Barva(255, 173, 209), 23),
            new Cetrta.Kvadrat(new Cetrta.Barva(194, 124, 25), 61),
            new Cetrta.Krog(new Cetrta.Barva(50, 47, 221), 63),
            new Cetrta.Kvadrat(new Cetrta.Barva(255, 185, 63), 25),
            new Cetrta.Krog(new Cetrta.Barva(180, 26, 46), 75),
            new Cetrta.Kvadrat(new Cetrta.Barva(17, 223, 201), 6),
            new Cetrta.Kvadrat(new Cetrta.Barva(153, 172, 88), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(176, 88, 192), 59, 71),
            new Cetrta.Krog(new Cetrta.Barva(15, 28, 89), 25),
            new Cetrta.Pravokotnik(new Cetrta.Barva(166, 82, 212), 53, 76),
            new Cetrta.Pravokotnik(new Cetrta.Barva(37, 46, 142), 14, 87),
            new Cetrta.Pravokotnik(new Cetrta.Barva(100, 106, 24), 77, 54),
            new Cetrta.Krog(new Cetrta.Barva(241, 124, 214), 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(118, 13, 91), 71),
            new Cetrta.Krog(new Cetrta.Barva(186, 120, 16), 79),
            new Cetrta.Krog(new Cetrta.Barva(102, 173, 66), 72),
            new Cetrta.Kvadrat(new Cetrta.Barva(99, 70, 16), 100),
            new Cetrta.Pravokotnik(new Cetrta.Barva(237, 129, 145), 15, 92),
            new Cetrta.Krog(new Cetrta.Barva(169, 218, 150), 96),
            new Cetrta.Pravokotnik(new Cetrta.Barva(194, 74, 181), 49, 49),
            new Cetrta.Kvadrat(new Cetrta.Barva(0, 220, 225), 93),
            new Cetrta.Kvadrat(new Cetrta.Barva(30, 25, 206), 17),
            new Cetrta.Krog(new Cetrta.Barva(237, 199, 0), 58),
            new Cetrta.Kvadrat(new Cetrta.Barva(238, 209, 207), 31),
            new Cetrta.Pravokotnik(new Cetrta.Barva(187, 216, 183), 88, 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(171, 81, 45), 51),
            new Cetrta.Pravokotnik(new Cetrta.Barva(24, 129, 67), 67, 39)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
