import java.util.*;

public class Determinanta {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[][] stevilke = new int[n][n];
		
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                stevilke[i][j] = sc.nextInt();
            }
        }
        System.out.println(Det(stevilke, n));

	}

    private static int Det(int[][]stevilke, int n){
        int rezultat;
        if (n ==1){
            rezultat = stevilke[0][0];
        }else if(n ==2){
            rezultat = stevilke[0][0]*stevilke[1][1] - stevilke[1][0]*stevilke[0][1];       
        }else{
            rezultat = 0;
            for (int i = 0; i < n; i++){
                int[][] nova = new int[n-1][n-1];
                nova = novamatrika(stevilke, n, i);
                rezultat = rezultat + (int)Math.pow(-1, i)*stevilke[0][i]*Det(nova, n-1);
            }
        }
        return rezultat;

    }

    private static int[][] novamatrika(int stara[][], int n, int a){
            int[][] nova = new int[n-1][n-1];

            for(int i=1; i < n; i++){
                int j1= 0;
                for (int j = 0; j < n; j++){
                    if(j == a){
                        continue;
                    }else{
                        int b = stara[i][j];
                        nova[i-1][j1] = b;
                        j1++;
                    }
                }
            }
            return nova;

    }
	
	
}