import java.util.Scanner;

public class Kvadrati {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int kvadrat = 0;
		
		for (int i = a; i <= b; i++){
			kvadrat = i * i;
			System.out.println(kvadrat);
		}
		
    }

}
