
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stevlo = 0;
        int x = 0;
        int y = 0;
        boolean prvic = true;
        for(int i = 0; i < n; i++){
            int x1 = 0;
            int y1 = 0;
            if(prvic){
                x = sc.nextInt();
                y = sc.nextInt();
                prvic = false;
                continue;
            }else{
                x1 = sc.nextInt();
                y1 = sc.nextInt();
            }

            if(x == x1 && y==y1){
                stevlo++;
                prvic = true;
            }

        }

        System.out.print(stevlo);
    }
}
