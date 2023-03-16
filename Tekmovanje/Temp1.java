import java.util.*;
public class Temp1 {
  public static void main(String[] b) {
    Scanner a=new Scanner(System.in);
    int i=a.nextInt();
    char[] c = a.next().toCharArray();
    int k=2, m=0, x=0, d = c.length, j = 0, g = 48;
    while (i>1){
      g = m % 10 + 48;
      if(i%k==0){
        i/=k;
        m++;
        continue;
      }else if(m!=0){
          c[d - k%(d - x) - 1] = (char)(g);
          if (g == 48)x++;
          m=0;
      }
      k++;
    }
    c[d - k%(d - x) - 1] = (char)(g);
    for(j = 0; j < d; j++) i = 10* i + (c[j] - 48);
    System.out.print(i-10);
  }
}