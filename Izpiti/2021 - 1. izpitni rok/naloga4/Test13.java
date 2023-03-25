
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(176, 57, 218), 34, 11),
            new Cetrta.Kvadrat(new Cetrta.Barva(226, 201, 214), 30),
            new Cetrta.Krog(new Cetrta.Barva(49, 58, 155), 35),
            new Cetrta.Pravokotnik(new Cetrta.Barva(157, 134, 179), 59, 22),
            new Cetrta.Kvadrat(new Cetrta.Barva(116, 211, 250), 15),
            new Cetrta.Kvadrat(new Cetrta.Barva(127, 246, 10), 68),
            new Cetrta.Krog(new Cetrta.Barva(255, 237, 117), 77),
            new Cetrta.Krog(new Cetrta.Barva(237, 246, 25), 59),
            new Cetrta.Pravokotnik(new Cetrta.Barva(177, 177, 49), 29, 95),
            new Cetrta.Kvadrat(new Cetrta.Barva(43, 39, 109), 2),
            new Cetrta.Kvadrat(new Cetrta.Barva(51, 50, 64), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(106, 41, 231), 9, 50),
            new Cetrta.Kvadrat(new Cetrta.Barva(49, 6, 149), 18),
            new Cetrta.Krog(new Cetrta.Barva(4, 224, 157), 92),
            new Cetrta.Krog(new Cetrta.Barva(196, 123, 25), 78),
            new Cetrta.Kvadrat(new Cetrta.Barva(226, 108, 101), 4),
            new Cetrta.Kvadrat(new Cetrta.Barva(208, 198, 142), 63)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
