import java.util.Scanner;

public class DN01_63220304 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int manjse = (a < b) ? (a) : (b);
		int count = 0;
		
		for (int i = 0; i < manjse; i++){
			count = count + (a - 1 - i) * (b - 1 - i);
		}
		System.out.print(count);
	}	
}


