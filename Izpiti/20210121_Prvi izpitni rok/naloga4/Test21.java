
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Krog(new Cetrta.Barva(155, 90, 12), 85),
            new Cetrta.Krog(new Cetrta.Barva(96, 13, 95), 56),
            new Cetrta.Krog(new Cetrta.Barva(214, 106, 58), 35),
            new Cetrta.Krog(new Cetrta.Barva(235, 74, 49), 43),
            new Cetrta.Krog(new Cetrta.Barva(169, 229, 59), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(18, 36, 51), 1, 60),
            new Cetrta.Krog(new Cetrta.Barva(236, 237, 245), 15),
            new Cetrta.Krog(new Cetrta.Barva(58, 167, 179), 54),
            new Cetrta.Pravokotnik(new Cetrta.Barva(246, 58, 234), 21, 79),
            new Cetrta.Pravokotnik(new Cetrta.Barva(225, 187, 30), 97, 67),
            new Cetrta.Pravokotnik(new Cetrta.Barva(20, 230, 230), 6, 76),
            new Cetrta.Pravokotnik(new Cetrta.Barva(105, 48, 169), 63, 21),
            new Cetrta.Krog(new Cetrta.Barva(179, 179, 67), 67),
            new Cetrta.Pravokotnik(new Cetrta.Barva(84, 208, 192), 80, 68),
            new Cetrta.Pravokotnik(new Cetrta.Barva(242, 167, 147), 6, 53),
            new Cetrta.Krog(new Cetrta.Barva(43, 215, 12), 42),
            new Cetrta.Pravokotnik(new Cetrta.Barva(119, 215, 241), 85, 49),
            new Cetrta.Krog(new Cetrta.Barva(208, 8, 82), 86),
            new Cetrta.Pravokotnik(new Cetrta.Barva(50, 228, 129), 91, 28),
            new Cetrta.Pravokotnik(new Cetrta.Barva(59, 150, 68), 88, 92),
            new Cetrta.Kvadrat(new Cetrta.Barva(108, 226, 72), 75),
            new Cetrta.Pravokotnik(new Cetrta.Barva(8, 173, 204), 78, 38),
            new Cetrta.Kvadrat(new Cetrta.Barva(110, 183, 158), 21),
            new Cetrta.Pravokotnik(new Cetrta.Barva(214, 116, 51), 75, 45),
            new Cetrta.Pravokotnik(new Cetrta.Barva(227, 106, 228), 57, 79),
            new Cetrta.Kvadrat(new Cetrta.Barva(222, 37, 242), 50),
            new Cetrta.Pravokotnik(new Cetrta.Barva(128, 23, 16), 86, 90),
            new Cetrta.Pravokotnik(new Cetrta.Barva(67, 125, 138), 50, 25),
            new Cetrta.Krog(new Cetrta.Barva(34, 193, 239), 24),
            new Cetrta.Kvadrat(new Cetrta.Barva(18, 35, 169), 98),
            new Cetrta.Krog(new Cetrta.Barva(152, 235, 204), 83),
            new Cetrta.Kvadrat(new Cetrta.Barva(242, 15, 166), 20),
            new Cetrta.Krog(new Cetrta.Barva(29, 177, 91), 41),
            new Cetrta.Pravokotnik(new Cetrta.Barva(192, 218, 115), 18, 9),
            new Cetrta.Krog(new Cetrta.Barva(139, 124, 134), 60),
            new Cetrta.Krog(new Cetrta.Barva(153, 126, 98), 74)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
