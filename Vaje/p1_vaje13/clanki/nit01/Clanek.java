
import java.util.*;

public class Clanek {
    private List<Avtor> avtorji;
    private String naslov;
    private int leto;

    public Clanek(List<Avtor> avtorji, String naslov, int leto) {
        this.avtorji = avtorji;
        this.naslov = naslov;
        this.leto = leto;
    }

    @Override
    public String toString() {
        String strAvtorji = this.avtorji.toString();
        return String.format("%s: %s (%d)",
                strAvtorji.substring(1, strAvtorji.length() - 1), this.naslov, this.leto);
    }

    public List<Avtor> avtorji(){
        return this.avtorji;
    }

    

    public static Comparator<Clanek> primerjalnikpoletihinnaslovu() {
        return (Clanek prva, Clanek druga) -> {
            if (prva.leto == druga.leto) {
                return prva.naslov.compareTo(druga.naslov);
            }
            return druga.leto - prva.leto;
        };
    }

}
