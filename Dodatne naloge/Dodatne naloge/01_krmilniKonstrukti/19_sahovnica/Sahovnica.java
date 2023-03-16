import java.util.Scanner;

public class Sahovnica {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int visina = sc.nextInt();
		int sirina = sc.nextInt();
		int velikost = sc.nextInt();
		sirina = velikost * sirina;
		visina = velikost * visina;
		boolean risi = false;
		
		
		for (int i = 0; i < visina + 2; i++){
			if ( i == 0 || i == visina + 1 ){
				for (int m = 0; m < (sirina + 1) * 2 + 1; m++){
					if (m == 0 || m == (sirina + 1) * 2){
						System.out.print("+");
					}else{
						if (m % 2 == 1){
							System.out.print(" ");
						}else{
							System.out.print("-");
						}						
					}
				}
			}else{
				if ((i + velikost * 2 - 1) % (velikost * 2) < velikost){
					for (int j = 0; j < (sirina + 2) * 2 - 1; j++){
						if (j == 0 || j == (sirina + 2) * 2 - 2){
								System.out.print("|");
								risi = false;
						}else{
							if (j % 2 == 1){
								System.out.print(" ");
							}else{
								if (risi == false){
									for (int n = 0; n < ((2 * velikost) - 1); n++){
										System.out.print(" ");
									}
									for (int n = 0; n < ((2 * velikost) - 2); n++){
										j = j + 1;
									}
									risi = true;
								}else{
									for (int o = 0; o < 2 * velikost - 1; o++){
										if (o % 2 == 1){
											System.out.print(" ");
										}else{
											System.out.print("*");
										}
									}
									for (int o = 0; o < 2 * velikost - 2; o++){
										j = j + 1;
									}
									risi = false;
								}
							}
						}
					}
				}else{
					for (int j = 0; j < (sirina + 2) * 2 - 1; j++){
						if (j == 0 || j == (sirina + 2) * 2 - 2){
								System.out.print("|");
								risi = true;
						}else{
							if (j % 2 == 1){
								System.out.print(" ");
							}else{
								if (risi == false){
									for (int n = 0; n < ((2 * velikost) - 1); n++){
										System.out.print(" ");
									}
									for (int n = 0; n < ((2 * velikost) - 2); n++){
										j = j + 1;
									}
									risi = true;
								}else{
									for (int o = 0; o < 2 * velikost - 1; o++){
										if (o % 2 == 1){
											System.out.print(" ");
										}else{
											System.out.print("*");
										}
									}
									for (int o = 0; o < 2 * velikost - 2; o++){
										j = j + 1;
									}
									risi = false;
								}
							}
						}
					}
				}
			}
			System.out.println();
		}
		
	}
	
}


