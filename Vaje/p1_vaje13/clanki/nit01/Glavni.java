
import java.util.*;

public class Glavni {

    public static void urediPoLetuInNaslovu(List<Clanek> clanki) {
        clanki.sort(Clanek.primerjalnikpoletihinnaslovu());
    }

    public static Set<Avtor> vsiAvtorji(Collection<Clanek> clanki) {
        Set<Avtor> vsi = new HashSet();
        for(Clanek element: clanki){
            vsi.addAll(element.avtorji());
        }
        return vsi;
    }

    public static Map<Avtor, List<Clanek>> clankiPoAvtorjih(Collection<Clanek> clanki) {
        Map<Avtor, List<Clanek>> nova = new HashMap();
        Set<Avtor> avtorji = new HashSet();
        avtorji = vsiAvtorji(clanki);
        for(Avtor vsak: avtorji){
            List<Clanek> vsi = new ArrayList();
            for(Clanek cl: clanki){
                if(cl.avtorji().contains(vsak)){
                    vsi.add(cl);
                }
            }
            urediPoLetuInNaslovu(vsi);
            nova.put(vsak, vsi);
        }
        return nova;
    }

    public static Avtor najplodnejsiAvtor(Collection<Clanek> clanki) {
        Map<Avtor, List<Clanek>> slovar = clankiPoAvtorjih(clanki);
        return Collections.max(slovar.keySet(), (avtorA, avtorB) -> slovar.get(avtorA).size() - slovar.get(avtorB).size());
    }

        
}
