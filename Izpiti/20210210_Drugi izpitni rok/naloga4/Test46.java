
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();
        seznam.add(438);
        seznam.add(73);
        seznam.add(213);
        seznam.add(708);
        seznam.add(258);
        seznam.add(392);
        seznam.add(132);
        seznam.add(454);
        seznam.add(295);
        seznam.add(641);
        seznam.add(890);
        seznam.add(529);
        seznam.add(631);
        seznam.add(649);
        seznam.add(665);
        seznam.add(637);
        seznam.add(197);
        seznam.add(266);
        seznam.add(848);
        seznam.add(270);
        seznam.add(182);

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Integer> it = Cetrta.razmnozevalnik(seznam, 7);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) * 82);
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
