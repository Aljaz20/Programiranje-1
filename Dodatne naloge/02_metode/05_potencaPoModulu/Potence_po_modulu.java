import java.util.Scanner;

public class Potence_po_modulu {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(Funkcija(a, b, m));
	}
	
	public static long Funkcija(int a, int b, int m){
		long modul = a % m;
		int zmnozek = 1;
		if (b == 0){
			zmnozek = 1;
			modul = zmnozek % m;
		}else{
			for (int i = 1; i < b; i++){
				if (i * 2 < b){
					modul = (modul * modul) % m;
					i = 2 * i - 1;
				}else if (i + 2 < b){
					modul = (modul * (a % m) * (a % m)) % m;
					i++;
				}else{
					modul = (modul * (a % m)) % m;
				}
				
			}
		}
		return modul;
	}
	
}



