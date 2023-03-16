import java.util.*;

public class Maksimum2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[][] stevilke = new int[n][100];
        int[] d = new int[n];
        
        int maks = 0;
		

        for (int i = 0; i < n; i++){
            int k = sc.nextInt();
            d[i] = k;
            if (k > maks){
                maks = k;
            }
            for (int j = 0; j < k; j++){
                stevilke[i][j] = sc.nextInt();
            }
        }
        int[] maksimum = new int[maks];
        boolean prvic = true;
        for (int i = 0; i < maks; i++){
            for (int j = 0; j < n; j++){
                if(d[j] < i+1){
                }else{
                    if (prvic){
                        maksimum[i] = stevilke[j][i];
                        prvic = false;
                    }else{
                        if (maksimum[i] < stevilke[j][i]){
                            maksimum[i] = stevilke[j][i];
                        }
                    }
                }
                
            }
            prvic = true;
        }

        System.out.println(Arrays.toString(maksimum));
	}
	
	
}



