import java.util.*;

public class Pogostost{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> ponavaljanje = new TreeMap<>();
        while(sc.hasNext()){
            String beseda = sc.next();
            if(ponavaljanje.containsKey(beseda)){
                ponavaljanje.put(beseda, ponavaljanje.get(beseda) + 1);
            }else{
                ponavaljanje.put(beseda, 1);
            }

        }
        Object[] vrednosti = new Object[ponavaljanje.size()];
        Integer[] vrednost = new Integer[ponavaljanje.size()];
        Set<String> kljuc = new HashSet<>();
        kljuc = ponavaljanje.keySet();
        vrednosti = ponavaljanje.values().toArray();
        Arrays.sort(vrednosti, Collections.reverseOrder());
        for(int i = 0; i < ponavaljanje.size(); i++){
            vrednost[i] = (Integer)vrednosti[i];
        }
        
        for(Integer element: vrednost){
            for(String kljuci : kljuc){
                if(element == ponavaljanje.get(kljuci)){
                    System.out.println(kljuci + " (" + element + ")");
                    kljuc.remove(kljuci);
                    break;
                }
            }
            
        }
    }
}