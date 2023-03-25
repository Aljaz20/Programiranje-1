
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(7, 143, 250), 38),
            new Cetrta.Pravokotnik(new Cetrta.Barva(46, 154, 252), 35, 81),
            new Cetrta.Kvadrat(new Cetrta.Barva(9, 154, 164), 53),
            new Cetrta.Pravokotnik(new Cetrta.Barva(45, 177, 197), 13, 33),
            new Cetrta.Pravokotnik(new Cetrta.Barva(112, 2, 13), 70, 94),
            new Cetrta.Krog(new Cetrta.Barva(2, 217, 15), 88),
            new Cetrta.Kvadrat(new Cetrta.Barva(181, 235, 231), 84),
            new Cetrta.Kvadrat(new Cetrta.Barva(119, 53, 15), 39),
            new Cetrta.Pravokotnik(new Cetrta.Barva(248, 168, 64), 76, 38),
            new Cetrta.Kvadrat(new Cetrta.Barva(143, 164, 199), 1),
            new Cetrta.Krog(new Cetrta.Barva(195, 95, 122), 52),
            new Cetrta.Kvadrat(new Cetrta.Barva(35, 104, 150), 28),
            new Cetrta.Krog(new Cetrta.Barva(143, 62, 180), 25),
            new Cetrta.Pravokotnik(new Cetrta.Barva(98, 244, 223), 83, 86),
            new Cetrta.Kvadrat(new Cetrta.Barva(175, 232, 125), 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(54, 25, 42), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(208, 17, 42), 79, 91),
            new Cetrta.Pravokotnik(new Cetrta.Barva(6, 123, 220), 69, 74),
            new Cetrta.Krog(new Cetrta.Barva(13, 230, 178), 53),
            new Cetrta.Kvadrat(new Cetrta.Barva(247, 81, 113), 75),
            new Cetrta.Kvadrat(new Cetrta.Barva(239, 182, 243), 7)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
