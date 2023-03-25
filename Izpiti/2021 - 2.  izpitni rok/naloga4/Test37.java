
import java.util.*;

public class Test37 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();
        seznam.add(12);
        seznam.add(897);
        seznam.add(339);
        seznam.add(661);
        seznam.add(96);
        seznam.add(703);
        seznam.add(545);

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Integer> it = Cetrta.razmnozevalnik(seznam, 4);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) * 9);
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
