
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>();
        seznam.add("pribahati");
        seznam.add("nokturn");
        seznam.add("manjko");
        seznam.add("domovinskovzgojen");
        seznam.add("bencolov");
        seznam.add("konfiskacijski");
        seznam.add("baretica");
        seznam.add("likopen");
        seznam.add("oduhovitev");
        seznam.add("natolcevalsko");
        seznam.add("kvazipitijski");
        seznam.add("peklarski");
        seznam.add("protiidejen");
        seznam.add("zoprstvo");
        seznam.add("vrtelja");
        seznam.add("hodoma");
        seznam.add("amanski");
        seznam.add("oslikovitenost");
        seznam.add("polietilendioksitiofen");
        seznam.add("pladnjevka");
        seznam.add("evrosvet");
        seznam.add("poise");
        seznam.add("enantiomeren");
        seznam.add("naravovarstvo");
        seznam.add("zafatiti");
        seznam.add("organizirljiv");
        seznam.add("tunjevina");
        seznam.add("receptek");
        seznam.add("povabljenec");
        seznam.add("tezavrirati");
        seznam.add("reliefski");
        seznam.add("kovinskosivomoder");
        seznam.add("osabljati");
        seznam.add("logonevroza");
        seznam.add("podebelitev");
        seznam.add("dezintegracijski");
        seznam.add("titracija");
        seznam.add("tamil");
        seznam.add("osposobljenje");
        seznam.add("aglikacija");
        seznam.add("sovrh");
        seznam.add("nevrohumoralen");

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<String> it = Cetrta.razmnozevalnik(seznam, 9);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) + "_prisopotati");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
