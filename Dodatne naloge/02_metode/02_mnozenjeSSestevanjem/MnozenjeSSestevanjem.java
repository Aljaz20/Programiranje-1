import java.util.Scanner;

public class MnozenjeSSestevanjem {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int vsota = 0;
		
		for (int i = 0; i < b; i++) {
			vsota = Sestevanje(vsota, a);
		}
		System.out.println(vsota);
	}
	
	public static int Sestevanje(int a, int b){
		int vsota = a + b;
		return vsota;
	} 
	
}



