
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>();
        seznam.add("mobitelkapitalist");
        seznam.add("spermalen");
        seznam.add("minimum");
        seznam.add("enonog");
        seznam.add("braskljav");
        seznam.add("strok");
        seznam.add("samorazvijati");
        seznam.add("proislamski");
        seznam.add("lovljen");
        seznam.add("viscerozen");
        seznam.add("antipuntar");
        seznam.add("sramen");

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<String> it = Cetrta.razmnozevalnik(seznam, 15);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) + "_antikancerogen");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
