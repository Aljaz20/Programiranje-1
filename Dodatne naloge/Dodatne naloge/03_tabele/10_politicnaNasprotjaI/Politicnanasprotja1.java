import java.util.Scanner;

public class Politicnanasprotja1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculate the total number of possible sequences
        int totalSequences = 1;
        for (int i = 1; i <= a + b + c; i++) {
            totalSequences *= i;
        }

        // Calculate the number of sequences where a is directly next to b
        int abSequences = 1;
        for (int i = 1; i <= a; i++) {
            abSequences *= i;
        }
        for (int i = 1; i <= b; i++) {
            abSequences *= i;
        }
        abSequences = abSequences* 2* (c + 1);

        // Calculate the number of sequences where a is not directly next to b
        int sequences = totalSequences - abSequences;


        System.out.println(sequences);
    }
}
