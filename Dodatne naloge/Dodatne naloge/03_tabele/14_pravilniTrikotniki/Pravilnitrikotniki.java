import java.util.*;

public class Pravilnitrikotniki {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
        double dt = d * (- 1.0);
        int n = sc.nextInt();
        int[][] stevilke = new int[n][2];
        
		

        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                stevilke[i][j] = sc.nextInt();
            }
        }
        boolean izpis = true;
       for(int i = 0; i < n; i++){
            for (int j = i + 1; j < n ; j++){
                for (int k = j + 1 ; k < n; k++){
                    double razdaljaIJ = Math.sqrt(Math.pow(stevilke[i][0] - stevilke[j][0], 2) + Math.pow(stevilke[i][1] - stevilke[j][1],2));
                    double razdaljaIK = Math.sqrt(Math.pow(stevilke[i][0] - stevilke[k][0], 2) + Math.pow(stevilke[i][1] - stevilke[k][1],2));
                    double razdaljaJK = Math.sqrt(Math.pow(stevilke[k][0] - stevilke[j][0], 2) + Math.pow(stevilke[k][1] - stevilke[j][1],2));
                    
                    double maks = Math.max(Math.max(razdaljaIJ, razdaljaIK), razdaljaJK);
                    double min = Math.min(Math.min(razdaljaIJ,razdaljaIK), razdaljaJK);
                    if (maks - min < Math.pow(10, dt) * min){
                        System.out.println(i + " " + j + " " + k);
                        izpis = false;
                    }
                }
            }
       }
       if(izpis){
        System.out.println("BREZ");
       }

	}
	
	
}