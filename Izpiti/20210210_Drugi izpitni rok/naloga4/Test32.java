
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>();
        seznam.add("ojladja");

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<String> it = Cetrta.razmnozevalnik(seznam, 3);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) + "_goroznanstvo");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
