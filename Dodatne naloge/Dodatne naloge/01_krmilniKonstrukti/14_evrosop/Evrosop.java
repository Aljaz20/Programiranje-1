import java.util.Scanner;

public class Evrosop {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int enevro = 0;
		int dvaevra = 0;
		int a = 0;
		
		while (sc.hasNext()) {
			a = sc.nextInt();
			if (enevro == -1){
				break;
			}
			else if (a == 1){
				enevro = enevro + 1;
			}else{
				dvaevra = dvaevra +1;
				enevro = enevro - 1;
			}
		}
		if (enevro == -1){
			System.out.println("BANKROT");
		}else{
		System.out.println(enevro);
		System.out.println(dvaevra);
		}
	}
	
}


