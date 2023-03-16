import java.util.*;

public class PresekMnozic{

    public static <T> Set<T> presek(Collection<Set<T>> mnozice){

        Set<T> novi = new HashSet<>();
        for(Set<T> mnozica: mnozice){
            novi.addAll(mnozica);
            
        }
        for(Set<T> mnozica: mnozice){
            novi.retainAll(mnozica);
            
        }
        return novi;
    }
}