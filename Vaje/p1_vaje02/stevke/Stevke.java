import java.util.Scanner;

public class Stevke {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		long a = sc.nextLong();
		long stevilka = 0;
		
		for (long i = a; i > 0; i = i / 10){
			stevilka = i % 10;
			System.out.println(stevilka);
			
		}
		
    }

}
