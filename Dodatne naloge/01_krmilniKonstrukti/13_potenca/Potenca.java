import java.util.Scanner;

public class Potenca {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 0;
		int rezultat = 1;
		
		while (i < b) {
			rezultat = rezultat * a;			
			i = i + 1;
		}
		System.out.println(rezultat);
	}
	
}


