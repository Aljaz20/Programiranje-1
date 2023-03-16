import java.util.*;

public class Maksimum1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int s = sc.nextInt();
        int[][] stevilke = new int[v][s];
        int[] maksimum = new int[s];
		

        for (int i = 0; i < v; i++){
            for (int j = 0; j < s; j++){
                stevilke[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < s; i++){
            for (int j = 0; j < v; j++){
                if (j == 0){
                    maksimum[i] = stevilke[j][i];
                }else{
                    if (maksimum[i] < stevilke[j][i]){
                        maksimum[i] = stevilke[j][i];
                    }
                }
            }
        }

        System.out.println(Arrays.toString(maksimum));
	}
	
	
}



