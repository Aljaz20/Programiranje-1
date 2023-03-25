
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();
        seznam.add(249);

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Integer> it = Cetrta.razmnozevalnik(seznam, 1);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) * 66);
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
