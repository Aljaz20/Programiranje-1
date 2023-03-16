import java.util.*;

public class Iztopajocielement {
	public static void main (String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] stevila = new int[n];
        for (int i = 0; i < n; i++){
            stevila[i] = sc.nextInt();                        
        }
        boolean nic = true;
        for(int d = 0; d < n; d++){
            if(stevila[d] % gcdvsi(d, stevila) != 0){
                nic = false;
                System.out.println(stevila[d]);
            }
        }
        if(nic){
            System.out.println("NIC");
        }

	}

    public static int gcd(int a, int b) {
		if (b == 0) {
		return a;
		}
		return gcd(b, a % b);
	}

    public static int gcdvsi(int a, int[] stevila) {
        int b=0;
        if(a != 0){
            b = stevila[0];
        }else{
            b = stevila[1];
        }
		for(int i = 0; i< stevila.length; i++){
            if(i != a){
                b = gcd(b, stevila[i]);
            }
        }
        return b;
	}
}
