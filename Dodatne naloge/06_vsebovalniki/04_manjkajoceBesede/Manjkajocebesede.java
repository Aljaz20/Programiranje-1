import java.util.*;

public class Manjkajocebesede{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Set<String> prva = new HashSet<>();
        Set<String> druga = new HashSet<>();

        for (int i = 0; i < m; i++){
            prva.add(sc.next());
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            druga.add(sc.next());
        }


        Set<String> novi = new TreeSet();
        novi.addAll(prva);
        novi.addAll(druga);
        novi.removeAll(druga);


        for(String element: novi){
            
            System.out.println( element);
            
        }
    }
}