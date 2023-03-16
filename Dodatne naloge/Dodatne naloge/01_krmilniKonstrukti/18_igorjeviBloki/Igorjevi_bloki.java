import java.util.Scanner;

public class Igorjevi_bloki {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int prva = sc.nextInt();
		int druga = sc.nextInt();
		int tretja = sc.nextInt();
		int najvec = Math.max(prva, druga);
		najvec = Math.max(najvec, tretja);
		String ena = "";
		String dva = "";
		String tri = "";
		
		for (int j = 0; j < prva; j++){
			ena = ena + prva;
		}
		for (int k = 0; k < druga; k++){
			dva = dva + druga;
		}
		for (int l = 0; l < tretja; l++){
			tri = tri + tretja;
		}
		
		for (int i = 0; i < najvec; i++){
			if (i >= prva){
				ena = "";
			}
			if (i < druga || i < tretja){
				if (i < druga){
					if (i < tretja){
						System.out.printf("%" + prva + "s %" + druga + "s %" + tretja + "s%n", ena, dva, tri);
					}else{
						System.out.printf("%" + prva + "s %" + druga + "s%n", ena, dva);
					}
				}else{
					dva = "";
					System.out.printf("%" + prva + "s %" + druga + "s %" + tretja + "s%n", ena, dva, tri);
				}
			}else{
				System.out.printf("%" + prva + "s%n", ena);
			}
		}
		
	}
	
}


