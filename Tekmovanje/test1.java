import java.io.PrintStream;
import java.util.Scanner;

public class test1 {

  public static void main(String[] paramArrayOfString) {
    Scanner a=new Scanner(System.in);
    int c=a.next(), b=a.next();
    int paramInt1 = c;
    int paramInt2 = b;
    int paramInt3 = 243212134;
    
    if (paramInt3 == 0) {
        System.out.println( paramInt1);
      }
      int i = paramInt2 % f(paramInt1); // ostanek pri deljenju s stevilom stevk v paramInt1
      int j = (int) Math.pow(10,i); // j is 10 to the power of i
      int k = paramInt1 / j; // k is paramInt1 without the last i digits
      System.out.println( (k - k % 10 + paramInt3 % 10) * j + paramInt1 % j); // zadnjo stevko k zamenjamo z zadnjo stevko
                                                                // paramInt3, dodamo i stevk paramInt1 na levo stran

    }

  private static int f(int paramInt) {// returns the number of digits in paramInt
    return paramInt == 0 ? 0 : f(paramInt / 10) + 1;
  }

  private static int g(int paramInt1, int paramInt2) {// returns paramInt1 to the power of paramInt2
    return paramInt2 == 0 ? 1 : paramInt1 * g(paramInt1, paramInt2 - 1);
  }

  private static int h(int paramInt1, int paramInt2, int paramInt3) { // i-to stevko paramInt1 zamenjamo s zadnjo stevko
                                                                      // paramInt3
    if (paramInt3 == 0) {
      return paramInt1;
    }
    int i = paramInt2 % f(paramInt1); // ostanek pri deljenju s stevilom stevk v paramInt1
    int j = g(10, i); // j is 10 to the power of i
    int k = paramInt1 / j; // k is paramInt1 without the last i digits
    return (k - k % 10 + paramInt3 % 10) * j + paramInt1 % j; // zadnjo stevko k zamenjamo z zadnjo stevko
                                                              // paramInt3, dodamo i stevk paramInt1 na levo stran
  }
}
