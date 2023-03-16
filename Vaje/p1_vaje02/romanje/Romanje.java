import java.util.Scanner;

public class Romanje {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int d = sc.nextInt();
		int p = sc.nextInt();
		int z = sc.nextInt();
		int D = 1;
		int d1= 0;
		
		while (d > 0 && p > 0){
			d1 = d;
			d = d - p;
			if (d < 0){
				d = 0;
			}
			System.out.println(D + ": " + d1 + " -> " + d);
			D = D + 1;
			p = p - z;
		}
		
    }

}
