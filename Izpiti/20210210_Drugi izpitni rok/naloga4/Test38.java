
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>();
        seznam.add("nekultura");
        seznam.add("zapovedba");
        seznam.add("dogojiti");
        seznam.add("mikrotransakcija");
        seznam.add("radikal");
        seznam.add("miomektomija");
        seznam.add("piskavost");
        seznam.add("topolovje");
        seznam.add("neutrt");
        seznam.add("vraginja");
        seznam.add("kuminovka");
        seznam.add("obranjen");

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<String> it = Cetrta.razmnozevalnik(seznam, 1);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) + "_vesniti");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
