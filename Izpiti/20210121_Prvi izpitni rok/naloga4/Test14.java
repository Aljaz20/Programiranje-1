
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(243, 176, 55), 80),
            new Cetrta.Kvadrat(new Cetrta.Barva(130, 156, 55), 66),
            new Cetrta.Krog(new Cetrta.Barva(104, 42, 113), 28),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 87, 228), 37, 18),
            new Cetrta.Pravokotnik(new Cetrta.Barva(62, 190, 241), 85, 17),
            new Cetrta.Krog(new Cetrta.Barva(109, 43, 34), 100),
            new Cetrta.Kvadrat(new Cetrta.Barva(234, 192, 15), 6),
            new Cetrta.Krog(new Cetrta.Barva(43, 54, 189), 51),
            new Cetrta.Kvadrat(new Cetrta.Barva(178, 84, 130), 39),
            new Cetrta.Krog(new Cetrta.Barva(86, 106, 30), 1),
            new Cetrta.Krog(new Cetrta.Barva(131, 62, 139), 21),
            new Cetrta.Krog(new Cetrta.Barva(49, 51, 96), 79),
            new Cetrta.Krog(new Cetrta.Barva(60, 72, 251), 90),
            new Cetrta.Kvadrat(new Cetrta.Barva(139, 42, 72), 35),
            new Cetrta.Pravokotnik(new Cetrta.Barva(54, 237, 160), 31, 32),
            new Cetrta.Krog(new Cetrta.Barva(34, 157, 22), 11),
            new Cetrta.Pravokotnik(new Cetrta.Barva(109, 133, 101), 9, 13),
            new Cetrta.Krog(new Cetrta.Barva(185, 138, 8), 24),
            new Cetrta.Kvadrat(new Cetrta.Barva(250, 120, 95), 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(85, 226, 118), 16),
            new Cetrta.Pravokotnik(new Cetrta.Barva(99, 10, 204), 30, 34),
            new Cetrta.Kvadrat(new Cetrta.Barva(64, 152, 5), 32),
            new Cetrta.Pravokotnik(new Cetrta.Barva(160, 150, 206), 38, 69),
            new Cetrta.Pravokotnik(new Cetrta.Barva(218, 174, 33), 53, 32),
            new Cetrta.Pravokotnik(new Cetrta.Barva(212, 66, 252), 8, 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(82, 142, 206), 99, 49),
            new Cetrta.Krog(new Cetrta.Barva(47, 94, 23), 33),
            new Cetrta.Pravokotnik(new Cetrta.Barva(39, 146, 110), 46, 61),
            new Cetrta.Kvadrat(new Cetrta.Barva(150, 147, 49), 56),
            new Cetrta.Krog(new Cetrta.Barva(233, 118, 140), 23),
            new Cetrta.Kvadrat(new Cetrta.Barva(40, 230, 206), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(71, 113, 200), 8, 53),
            new Cetrta.Krog(new Cetrta.Barva(192, 9, 12), 59),
            new Cetrta.Pravokotnik(new Cetrta.Barva(187, 35, 186), 69, 19),
            new Cetrta.Kvadrat(new Cetrta.Barva(197, 22, 156), 17),
            new Cetrta.Kvadrat(new Cetrta.Barva(143, 6, 232), 78),
            new Cetrta.Kvadrat(new Cetrta.Barva(172, 97, 222), 41),
            new Cetrta.Pravokotnik(new Cetrta.Barva(118, 94, 140), 81, 84),
            new Cetrta.Kvadrat(new Cetrta.Barva(246, 53, 147), 59)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
