
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>();
        seznam.add("ostrovoglat");
        seznam.add("stehneti");
        seznam.add("razzvedeti");

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<String> it = Cetrta.razmnozevalnik(seznam, 4);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) + "_dihidroksitriptamin");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
