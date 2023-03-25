
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>();
        seznam.add("metameren");
        seznam.add("suholjuben");
        seznam.add("postlociran");
        seznam.add("nabokel");
        seznam.add("zelenobel");
        seznam.add("hemometer");
        seznam.add("luciferijanstvo");
        seznam.add("antropogenetika");
        seznam.add("toplotnohidroizolacijski");
        seznam.add("vladstvo");
        seznam.add("dehidracija");
        seznam.add("nedoglednost");
        seznam.add("stupor");
        seznam.add("neoinformbirojevec");
        seznam.add("odgipsati");
        seznam.add("ponasloniti");
        seznam.add("kospric");
        seznam.add("samoodsvojitev");
        seznam.add("cankarjanka");
        seznam.add("kambrikov");
        seznam.add("zdiferencirati");
        seznam.add("nalivalec");

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<String> it = Cetrta.razmnozevalnik(seznam, 7);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) + "_enciklopedik");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
