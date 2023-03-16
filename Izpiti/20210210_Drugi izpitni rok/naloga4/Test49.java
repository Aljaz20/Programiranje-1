
import java.util.*;

public class Test49 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();
        seznam.add(297);
        seznam.add(970);
        seznam.add(111);
        seznam.add(852);
        seznam.add(385);
        seznam.add(495);
        seznam.add(236);
        seznam.add(851);
        seznam.add(316);
        seznam.add(750);
        seznam.add(841);
        seznam.add(977);
        seznam.add(61);
        seznam.add(386);
        seznam.add(209);
        seznam.add(121);
        seznam.add(803);
        seznam.add(386);
        seznam.add(453);
        seznam.add(226);
        seznam.add(994);
        seznam.add(869);
        seznam.add(83);
        seznam.add(254);
        seznam.add(159);
        seznam.add(704);
        seznam.add(540);
        seznam.add(670);
        seznam.add(377);
        seznam.add(816);
        seznam.add(248);
        seznam.add(755);
        seznam.add(796);
        seznam.add(609);
        seznam.add(213);
        seznam.add(970);
        seznam.add(57);
        seznam.add(325);
        seznam.add(360);
        seznam.add(475);
        seznam.add(410);
        seznam.add(901);

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Integer> it = Cetrta.razmnozevalnik(seznam, 6);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) * 6);
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
