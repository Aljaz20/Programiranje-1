import java.util.*;

public class Vsi_razlicni1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] stevilke = new int[n];
        Integer[] ponovitev = new Integer[n];
        int c = 0;
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            for(int j = 0; j < i; j++){
                if(stevilke[j] == a){
                    ponovitev[c] = a;
                    c++;
                }
            }
           
            stevilke[i]=a;            
        }
        //System.out.println(Arrays.toString(stevilke) + Arrays.toString(ponovitev));
        Integer min = null;
        boolean t = true;
        for(Integer b: ponovitev){
            if(t==true && b != null){
              min = b;
              t = false;
            }else if (b!=null){
                min = Math.min(min, b);
            }
        }

        if(t == true){
            System.out.println("RAZLICNI");
        }else{
            System.out.println(min);
        }

	}
}
