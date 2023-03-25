
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(19, 123, 196), 63),
            new Cetrta.Pravokotnik(new Cetrta.Barva(172, 241, 50), 8, 65)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
