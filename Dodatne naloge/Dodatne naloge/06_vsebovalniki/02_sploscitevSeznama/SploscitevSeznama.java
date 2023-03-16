import java.util.*;

public class SploscitevSeznama{

    public static <T> List<T> splosci(List<List<T>> seznami){

        List<T> novi = new ArrayList();
        for(int i = 0; i < seznami.size(); i++){
            for(int j = 0; j < seznami.get(i).size(); j++){
                novi.add(seznami.get(i).get(j));
            }
            
        }
        return novi;
    }
}