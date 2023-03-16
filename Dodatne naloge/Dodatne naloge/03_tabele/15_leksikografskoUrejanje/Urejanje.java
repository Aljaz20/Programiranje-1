import java.util.*;

public class Urejanje {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] stevilke = new int[n][d];
        int[] temp = new int[d];
		

        for (int i = 0; i < n; i++){
            for (int j = 0; j < d; j++){
                stevilke[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = i-1; j >=0; j--){
                for(int k = 0; k < d; k++){
                    if(stevilke[j+1][k] < stevilke[j][k]){
                        temp = stevilke[j+1];
                        stevilke[j+1] = stevilke[j];
                        stevilke[j] = temp;
                        break;
                    }else if(stevilke[j+1][k] > stevilke[j][k]){
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(Arrays.toString(stevilke[i]));
        }

	}
	
	
}