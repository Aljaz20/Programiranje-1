import java.util.*;
import java.util.function.Predicate;

public class ZadnjeUjemanje{

    public static <T> T zadnji(Collection<T> zbirka, Predicate<T> pogoj){
        T predzadnji = null;
        for(T element: zbirka){
            T zadnji = element;
            if(pogoj.test(element)){
                predzadnji = zadnji;
            }
        }

        return predzadnji;
    }
}