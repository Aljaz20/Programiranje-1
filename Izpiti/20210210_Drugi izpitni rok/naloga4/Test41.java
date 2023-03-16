
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>();
        seznam.add("hemitoraks");
        seznam.add("landrati");
        seznam.add("pomaratonski");
        seznam.add("prengati");
        seznam.add("kost");
        seznam.add("individuacijski");
        seznam.add("obcesten");
        seznam.add("parateater");
        seznam.add("belga");
        seznam.add("kmetijskoobdelovalen");
        seznam.add("grenovija");
        seznam.add("rava");

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<String> it = Cetrta.razmnozevalnik(seznam, 9);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) + "_plaumontag");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
