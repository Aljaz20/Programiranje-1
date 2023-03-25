
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int v = sc.nextInt();
        v= v-1;

        String rezulatat = "";
        for(int i = 0; i < d; i++){
            int max = 0;
            if(v < 10){
                max = v;
                v=0;
            }else{
                max = 9;
                v = v -9;
            }

            if(i == d-1){
                max = max +1;
            }

            rezulatat = String.valueOf(max) + rezulatat;
            
        }

        System.out.print(rezulatat);
    }
}
