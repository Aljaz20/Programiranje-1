import java.util.*;
import java.util.function.BinaryOperator;

public class Komulativa{

    public static <T> List<T> kumulativa(List<T> seznam, BinaryOperator<T> operator){
        List<T> novi = new ArrayList<>();
        
        for(int i = 0; i<seznam.size(); i++){
            if(i == 0){
                novi.add(seznam.get(0));
            }else{
                novi.add(i, operator.apply(novi.get(i-1), seznam.get(i)));
            }
        }

        return novi;
    }

    public static <T> List<T> doslejNajvecji(List<T> seznam, Comparator<T> primerjalnik){
        
    }
}