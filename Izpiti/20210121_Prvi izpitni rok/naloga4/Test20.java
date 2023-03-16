
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(122, 117, 23), 38),
            new Cetrta.Kvadrat(new Cetrta.Barva(38, 213, 28), 39),
            new Cetrta.Kvadrat(new Cetrta.Barva(125, 34, 41), 57),
            new Cetrta.Kvadrat(new Cetrta.Barva(134, 206, 247), 11),
            new Cetrta.Krog(new Cetrta.Barva(88, 8, 38), 63),
            new Cetrta.Kvadrat(new Cetrta.Barva(239, 114, 182), 96),
            new Cetrta.Pravokotnik(new Cetrta.Barva(102, 205, 30), 15, 5),
            new Cetrta.Pravokotnik(new Cetrta.Barva(113, 153, 245), 53, 34),
            new Cetrta.Krog(new Cetrta.Barva(61, 139, 127), 91),
            new Cetrta.Krog(new Cetrta.Barva(29, 207, 38), 64),
            new Cetrta.Pravokotnik(new Cetrta.Barva(200, 128, 237), 23, 63),
            new Cetrta.Kvadrat(new Cetrta.Barva(221, 170, 140), 62),
            new Cetrta.Pravokotnik(new Cetrta.Barva(72, 20, 181), 54, 32),
            new Cetrta.Kvadrat(new Cetrta.Barva(0, 92, 3), 33),
            new Cetrta.Pravokotnik(new Cetrta.Barva(253, 113, 157), 71, 68),
            new Cetrta.Kvadrat(new Cetrta.Barva(141, 132, 19), 45),
            new Cetrta.Krog(new Cetrta.Barva(103, 122, 175), 24),
            new Cetrta.Pravokotnik(new Cetrta.Barva(202, 204, 44), 26, 40),
            new Cetrta.Kvadrat(new Cetrta.Barva(190, 180, 148), 25),
            new Cetrta.Krog(new Cetrta.Barva(172, 4, 0), 89),
            new Cetrta.Pravokotnik(new Cetrta.Barva(139, 142, 56), 17, 51),
            new Cetrta.Pravokotnik(new Cetrta.Barva(115, 122, 88), 80, 42),
            new Cetrta.Pravokotnik(new Cetrta.Barva(119, 187, 217), 92, 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(125, 153, 7), 98, 74),
            new Cetrta.Pravokotnik(new Cetrta.Barva(232, 45, 33), 94, 30),
            new Cetrta.Krog(new Cetrta.Barva(47, 200, 70), 87),
            new Cetrta.Krog(new Cetrta.Barva(143, 142, 251), 69),
            new Cetrta.Pravokotnik(new Cetrta.Barva(73, 15, 212), 43, 71),
            new Cetrta.Pravokotnik(new Cetrta.Barva(209, 223, 143), 94, 12),
            new Cetrta.Pravokotnik(new Cetrta.Barva(229, 19, 95), 75, 41),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 209, 45), 14),
            new Cetrta.Krog(new Cetrta.Barva(160, 197, 39), 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(211, 221, 210), 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(174, 107, 162), 69),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 222, 44), 34),
            new Cetrta.Kvadrat(new Cetrta.Barva(235, 100, 224), 70),
            new Cetrta.Pravokotnik(new Cetrta.Barva(171, 83, 191), 25, 8),
            new Cetrta.Krog(new Cetrta.Barva(136, 70, 120), 57),
            new Cetrta.Krog(new Cetrta.Barva(64, 16, 230), 31),
            new Cetrta.Pravokotnik(new Cetrta.Barva(180, 4, 109), 13, 14),
            new Cetrta.Pravokotnik(new Cetrta.Barva(118, 210, 212), 47, 89),
            new Cetrta.Krog(new Cetrta.Barva(20, 131, 105), 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(98, 71, 100), 92),
            new Cetrta.Krog(new Cetrta.Barva(128, 102, 129), 98),
            new Cetrta.Krog(new Cetrta.Barva(86, 47, 102), 28),
            new Cetrta.Krog(new Cetrta.Barva(223, 135, 157), 80),
            new Cetrta.Pravokotnik(new Cetrta.Barva(147, 243, 206), 30, 15),
            new Cetrta.Pravokotnik(new Cetrta.Barva(181, 164, 104), 9, 37),
            new Cetrta.Krog(new Cetrta.Barva(13, 243, 202), 51),
            new Cetrta.Krog(new Cetrta.Barva(188, 139, 169), 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(90, 13, 15), 91),
            new Cetrta.Pravokotnik(new Cetrta.Barva(234, 91, 148), 60, 73),
            new Cetrta.Pravokotnik(new Cetrta.Barva(182, 242, 61), 56, 52),
            new Cetrta.Krog(new Cetrta.Barva(251, 128, 172), 41),
            new Cetrta.Pravokotnik(new Cetrta.Barva(163, 110, 71), 24, 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(14, 61, 57), 89, 69),
            new Cetrta.Kvadrat(new Cetrta.Barva(110, 169, 50), 10),
            new Cetrta.Pravokotnik(new Cetrta.Barva(19, 94, 184), 23, 20),
            new Cetrta.Krog(new Cetrta.Barva(111, 17, 198), 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(199, 142, 199), 21),
            new Cetrta.Kvadrat(new Cetrta.Barva(64, 205, 168), 15),
            new Cetrta.Kvadrat(new Cetrta.Barva(64, 220, 47), 52),
            new Cetrta.Pravokotnik(new Cetrta.Barva(226, 94, 53), 60, 18),
            new Cetrta.Krog(new Cetrta.Barva(29, 221, 10), 88),
            new Cetrta.Pravokotnik(new Cetrta.Barva(172, 56, 92), 80, 36),
            new Cetrta.Kvadrat(new Cetrta.Barva(104, 252, 31), 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(244, 163, 74), 97),
            new Cetrta.Krog(new Cetrta.Barva(96, 110, 152), 65)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
