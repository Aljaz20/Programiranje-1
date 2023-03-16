import java.util.Scanner;

public class Stetje_klicev2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int counter = 0;
        int[] ponovitev = new int[n+1];
		
		System.out.println(Funkcija(a, b, n, counter, ponovitev));
	}
	
	public static int Funkcija(int a, int b, int n, int vsota, int[] ponovitev){
        if(ponovitev[n] == 0){
            vsota++;
            ponovitev[n] = 1;
        }
 
		if (n == 0){
			return vsota;
		}else{
			int n1 = n / b;
			n = n / a;
			vsota = Funkcija(a, b, n, vsota, ponovitev);
			return  Funkcija(a, b, n1, vsota, ponovitev);
		}
	}
	
}



