
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();
        seznam.add(10);
        seznam.add(806);
        seznam.add(919);
        seznam.add(930);
        seznam.add(638);
        seznam.add(718);
        seznam.add(696);
        seznam.add(10);
        seznam.add(193);
        seznam.add(353);
        seznam.add(933);
        seznam.add(298);

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Integer> it = Cetrta.razmnozevalnik(seznam, 12);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) * 5);
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
