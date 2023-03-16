import java.util.*;
public class Temp2 {
  public static void main(String[] b) {
    Scanner a=new Scanner(System.in);
    int i=a.nextInt(), j=a.nextInt();
    int k=2, m=0;
    while (i>1){
      if(i%k==0){
        i/=k;
        m++;
      }else{
        j=h(j,k++,m);
        m = 0;
      }
    }
    System.out.println(h(j,k,m));
  }
  private static int h(int a, int b, int c) {
    if (c == 0) {
      return a;
    }
    int j=(int)Math.pow(10, b%(int)(Math.log10(a)+1));
    int k = a / j;
    return (k - k % 10 + c % 10) * j + a % j;
  }
}