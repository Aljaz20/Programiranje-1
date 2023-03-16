import java.util.Scanner;
import java.util.Random;

public class Mojca {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int k = sc.nextInt();
		int d = sc.nextInt();
		Random rand = new Random(s);
		
		for (int i = 1; i <= d; i++){
			System.out.printf("%d. dan:%n", i);
			int vsota = 0;
			int met = 1;
			String pike = "";
			
			while (Prastevilo(vsota) == false){
				vsota = 0;
				pike = "";
				for (int j = 1; j <= k; j++){
					int stPik = rand.nextInt(6) + 1;
					pike = pike + " " + stPik;
					vsota = vsota + stPik;
				}
				System.out.printf("    %d. met:%s | vsota = %d%n", met, pike, vsota);
				met++;
			}
			
			
		}
	}
	
	public static boolean Prastevilo(int vsota){
		if ((vsota % 2 == 1 && vsota > 1) || vsota == 2){
			for (int d = 3; d <= (int) Math.round(Math.sqrt(vsota)); d += 2) {
				if (vsota % d == 0) {
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}
}



