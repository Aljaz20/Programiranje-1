import java.util.Scanner;

public class Smucanje {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tekmovalci = sc.nextInt();
		int najmanjsicas = 0;
		int najmanjsicas_tekmovalec = 0;
		int cas1 = 0;
		int cas2 = 0;
		int casskupni = 0;
		
		for (int i = 0; i < tekmovalci; i++){
			cas1 = sc.nextInt();
			if (cas1 != 0){
				cas2 = sc.nextInt();
				if (cas2 != 0){
					casskupni = cas1 + cas2;
					if (najmanjsicas == 0){
						najmanjsicas = casskupni;
						najmanjsicas_tekmovalec = i + 1;
					} else if (casskupni < najmanjsicas){
						najmanjsicas = casskupni;
						najmanjsicas_tekmovalec = i + 1;
					}
				}
				
			}
			
			
		}
		if (najmanjsicas == 0){
			System.out.println("NIHCE");
		}else{
			System.out.println(najmanjsicas_tekmovalec);
			System.out.println(najmanjsicas);
		}
	}
	
}


