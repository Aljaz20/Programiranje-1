import java.util.*;

public class Sah {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[][] stevilke = new int[n][2];
        int[] temp = new int[2];
        for(int i = 0; i < n; i++){
            stevilke[i][0] = i+1;
        }
		
        while(sc.hasNext()){
            int prvi = sc.nextInt();
            int drugi = sc.nextInt();
            int tocke = sc.nextInt();
            if(tocke == -1){
                stevilke[drugi-1][1] += 2;
            }else if(tocke == 0){
                stevilke[drugi-1][1] += 1;
                stevilke[prvi-1][1] += 1;
            }else{
                stevilke[prvi-1][1] += 2;
            }
        }
        
        
        for(int i = 0; i < n; i++){
            for(int j = i-1; j >=0; j--){
                if(stevilke[j+1][1] > stevilke[j][1]){
                    temp = stevilke[j+1];
                    stevilke[j+1] = stevilke[j];
                    stevilke[j] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%d %d%n", stevilke[i][0], stevilke[i][1]);
        }

	}
	
	
}