import java.util.Arrays;
import java.util.Scanner;

public class Kombinacije {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read in the values of n and k
    int n = scanner.nextInt();
    int k = scanner.nextInt();

    // Generate and print all strictly increasing sequences of k numbers between 1 and n
    generateSequences(n, k, new int[k], 0);
  }

  // Recursive function to generate strictly increasing sequences of k numbers between 1 and n
  public static void generateSequences(int n, int k, int[] sequence, int index) {
    if (index == k) {
      // Sequence is complete, print it
      System.out.println(Arrays.toString(sequence));
      return;
    }

    // Generate the next element in the sequence
    int start = (index == 0) ? 1 : sequence[index - 1] + 1;
    for (int i = start; i <= n; i++) {
      sequence[index] = i;
      generateSequences(n, k, sequence, index + 1);
    }
  }
}