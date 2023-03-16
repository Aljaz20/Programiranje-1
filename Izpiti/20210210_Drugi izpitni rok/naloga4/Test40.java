
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();
        seznam.add(77);
        seznam.add(379);
        seznam.add(780);
        seznam.add(23);
        seznam.add(11);
        seznam.add(29);
        seznam.add(690);
        seznam.add(752);
        seznam.add(626);
        seznam.add(924);
        seznam.add(555);
        seznam.add(760);

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Integer> it = Cetrta.razmnozevalnik(seznam, 5);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) * 16);
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
