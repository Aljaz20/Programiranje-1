import java.util.*;

public class ZrcalnaSlikaSeznama{

    public static <T> List<T> zrcalnaSlika(List<T> seznam){

        List<T> novi = new ArrayList();
        for(int i = 0; i < seznam.size(); i++){
            novi.add(i, seznam.get(seznam.size()-i-1));
        }
        return novi;
    }
}