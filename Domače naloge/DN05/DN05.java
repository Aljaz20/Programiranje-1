import java.util.Scanner;

public class DN05_63220304 {
	static Scanner sc;
	public static void main (String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = 1000;
		int[][][] liki = {{{1},{1},{1},{1}},
						{{4}},
						{{2},{2}},
						{{1},{2},{1}},
						{{0,1},{3}},
						{{0,1},{2},{0,1}},
						{{3},{0,1}},
						{{3},{1}},
						{{1},{1},{2}},
						{{0,0,1},{3}},
						{{2},{0,1},{0,1}},
						{{1},{3}},
						{{0,1},{0,1},{2}},
						{{3},{0,0,1}},
						{{2},{1},{1}},
						{{0,1},{2},{1}},
						{{2},{0,2}},
						{{1},{2},{0,1}},
						{{0,2},{2}}};
		int[] zaslon = new int[2004];
		
		
		for(int i = 0; i < n; i++){
			int l = sc.nextInt();
			int poz = sc.nextInt();
			int dolzina = liki[l].length;
			int maks = 0;
			int maksk = 0;
			int[] visine = {0,0,0,0};
			for (int z = 0; z < dolzina; z++){
				int visina = 0;
				for (int k = 0; k < liki[l][z].length; k++){
					if(liki[l][z][k] == 0){
						visine[z] += 1;
						visina -= 1;
					}else{
						visina = visina + zaslon[poz+w+z];
						visine[z] += liki[l][z][k];
					}
				}
				if(visina > maks){
					maks = visina;
					maksk = z;
				}
			}
			for (int j = 0; j < dolzina; j++){
				zaslon[poz+w+j] = maks + visine[j]; 
			}
		}
		for (int p = 0; p < zaslon.length; p++){
			if (zaslon[p] != 0){
				System.out.printf("%d: %d%n", p - w, zaslon[p]);
			}
		}
	}
}