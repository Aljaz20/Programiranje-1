import java.util.*;

public class Vsi_razlicni2 {
    private static final int MAKS_STEVILO = 10000;
	public static void main (String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
        Random random = new Random(s);
        int n = sc.nextInt();
        int[] ponovitev = new int[2 * MAKS_STEVILO + 1];
        for (int i = 0; i < n; i++){
            int a =  random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
            ponovitev[a+MAKS_STEVILO]++;
                        
        }
        //System.out.println(Arrays.toString(stevilke) + Arrays.toString(ponovitev));
        int max = 1;
        Integer maxint = null;
        for(int d = 0; d < ponovitev.length; d++){
            if(ponovitev[d] > max){
                max = ponovitev[d];
                maxint = d;
            }
        }


        if(maxint == null){
            System.out.println("RAZLICNI");
        }else{
            System.out.println(maxint - MAKS_STEVILO);
        }

	}
}
