
import java.util.*;

public class Druga {

    public static int steviloShranjenih(int[] h, int[] w, int[] a, int[] b) {
        int stevilo = 0;
        boolean jenotr = true;

        for(int i = 0; i < h.length; i++){
            if(!jenotr){
                break;
            }
            for(int j = 0; j < w.length; j++){
                int ploscina = h[i]*w[j];
                if(!jenotr){
                    break;
                }
                jenotr = false;
                for(int k = 0; k < a.length; k++){
                    int ploscina2 = a[k] * b[k];
                    if(ploscina2 == 0){
                        continue;
                    }else{
                        if(ploscina2 <= ploscina){
                            if((h[i] >= a[k] && w[j] >= b[k]) || (h[i] >= b[k] && w[j] >= a[k])){
                                stevilo++;
                                a[k] = 0;
                                jenotr = true;
                                break;
                            }else{
                                continue;
                            }
                        }else{
                            continue;
                        }
                    }
                }
            }

        }

        return stevilo;
    }
}
