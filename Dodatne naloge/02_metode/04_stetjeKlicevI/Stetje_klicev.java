import java.util.Scanner;

public class Stetje_klicev {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int counter = 0;
		
		System.out.println(Funkcija(a, b, n, counter)); //nevem zakaj taka formula?
	}
	
	public static int Funkcija(int a, int b, int n, int vsota){
		vsota++;
 
		if (n == 0){
			return vsota;
		}else{
			int n1 = n / b;
			n = n / a;
			vsota = Funkcija(a, b, n, vsota);
			return  Funkcija(a, b, n1, vsota);
		}
	}
	
}



