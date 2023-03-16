
import java.util.Arrays;

public class Test31 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[1][];
        os[0] = new Oseba[4];
        os[0][0] = new Oseba("a b", 'M', 653);
        os[0][1] = new Oseba("a b", 'M', 8861);
        os[0][2] = new Oseba("a b", 'Z', 9139);
        os[0][3] = new Oseba("a b", 'M', 4475);
        
        Stanovanje[] st = new Stanovanje[1];
        st[0] = new Stanovanje(os[0]);
        st[0].nastaviSosede(null, null, null, null);
        
        TestSkupno.preveri(st[0].starostaSosescine() == os[0][2]);
    }
}
