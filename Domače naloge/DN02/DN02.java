import java.util.Scanner;

public class DN02_63220304 {
	static Scanner sc;
	public static void main (String[] args) {
		sc = new Scanner(System.in);
		int b = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		switch (b){
			case 1:	b1(n);
				break;
			case 2:	b2(n, d);
				break;
			case 3:	b3(n, d);
				break;
			case 4:	b4(n, d);
				break;
		}
	}
	public static void b1(int n){
		int razdalja = 0;
		int t = sc.nextInt();
		for (int i = 0; i < n - 1; i++){
			int tt = sc.nextInt();
			razdalja = razdalja + (int) Math.abs(tt - t);
			t = tt;
		}
		System.out.println(razdalja);
	}
	
	public static void b2(int n, int d){
		int razdalja = 0;
		int t = sc.nextInt();
		for (int i = 0; i < n - 1; i++){
			int tt = sc.nextInt();
			razdalja = razdalja + (int) Math.abs(tt % d - t % d) + (int) Math.abs(tt / d - t / d);
			t = tt;
		}
		System.out.println(razdalja);
	}
	
	public static void b3(int n, int d){
		int razdalja = 0;
		int vrstica = 0;
		int pozicija = 0;
		int vrstica1 = 0;
		int pozicija1 = 0;
		int t = sc.nextInt();
		for (int i = 0; i < n - 1; i++){
			int tt = sc.nextInt();
			vrstica = (int) Math.sqrt((double) tt);
			vrstica1 = (int) Math.sqrt((double) t);
			pozicija = tt - vrstica * vrstica + (d - 1) - vrstica;
			pozicija1 = t - vrstica1 * vrstica1 + (d - 1) - vrstica1;
			razdalja = razdalja + (int) Math.abs(vrstica - vrstica1) + (int) Math.abs(pozicija - pozicija1);
			t = tt;
		}
		System.out.println(razdalja);
	}
	
	public static void b4(int n, int d){
		int razdalja = 0;
		int vrstica = 0;
		int stolpec = 0;
		int vrstica1 = 0;
		int stolpec1 = 0;
		int t = sc.nextInt();
		for (int i = 0; i < n - 1; i++){
			int tt = sc.nextInt();
			vrstica = Vrstica(d, t);
			vrstica1 = Vrstica(d, tt);
			stolpec = Stolpec(d, t);
			stolpec1 = Stolpec(d, tt);
			razdalja = razdalja + (int) Math.abs(vrstica1 - vrstica) + (int) Math.abs(stolpec1 - stolpec);
			t = tt;			
		}
		System.out.println(razdalja);
	}
	
	public static int Vrstica(int d, int t){
		int spirala = (int) Math.sqrt((double) t);
		if (spirala % 2 == 1){
			spirala = spirala / 2 + 1;
		}else{
			spirala = spirala / 2;
		}
		int d1 = spirala * 2 + 1;;
		int vrstica = 0;
		if (d1 != 1){
			if (t >= ((d1 - 2) * (d1 - 2)) && t <= ((d1 - 2) * (d1 - 2) + d1 - 1)){
			vrstica = (d - d1) / 2;
			}else if (t >= ((d1 - 2) * (d1 - 2) + d1) && t <= ((d1 - 2) * (d1 - 2) + 2 * d1 - 3)){
				vrstica = (d - d1) / 2 - (d1 - 2) * (d1 - 2) - (d1 - 1) + t;
			}else if (t >= ((d1 - 2) * (d1 - 2) + 2 * d1 - 2) && t <= ((d1 - 2) * (d1 - 2) + 3 * d1 - 3)){
				vrstica = d - 1 - (d - d1) / 2;
			}else{
				vrstica = d1 * d1 - t + (d - d1) / 2;
			}
		}else{
			vrstica = d / 2;
		}
		
		return vrstica;
	}
	
	public static int Stolpec(int d, int t){
		int spirala = (int) Math.sqrt((double) t);
		if (spirala % 2 == 1){
			spirala = spirala / 2 + 1;
		}else{
			spirala = spirala / 2;
		}
		int d1 = spirala * 2 + 1;;
		int stolpec = 0;
		if (t >= ((d1 - 2) * (d1 - 2)) && t <= ((d1 - 2) * (d1 - 2) + d1 - 1)){
			stolpec = t - (d1 -  2) * (d1 - 2) + (d - d1) / 2;
		}else if (t >= ((d1 - 2) * (d1 - 2) + d1) && t <= ((d1 - 2) * (d1 - 2) + 2 * d1 - 3)){
			stolpec = d - 1 - (d - d1) / 2;
		}else if (t >= ((d1 - 2) * (d1 - 2) + 2 * d1 - 2) && t <= ((d1 - 2) * (d1 - 2) + 3 * d1 - 3)){
			stolpec = (d1 - 2) * (d1 - 2) + 3 * d1 - 3 - t + (d - d1) / 2;
		}else{
			stolpec = (d - d1) / 2;
		}
		return stolpec;
	}
}


