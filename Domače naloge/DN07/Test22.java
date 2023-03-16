
import java.util.Arrays;

public class Test22 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[10];
        os[0] = new Oseba("a b", 'Z', 79);
        os[1] = new Oseba("a b", 'Z', 29);
        os[2] = new Oseba("a b", 'M', 38);
        os[3] = new Oseba("a b", 'M', 7);
        os[4] = new Oseba("a b", 'M', 3);
        os[5] = new Oseba("a b", 'Z', 48);
        os[6] = new Oseba("a b", 'Z', 81);
        os[7] = new Oseba("a b", 'Z', 82);
        os[8] = new Oseba("a b", 'M', 37);
        os[9] = new Oseba("a b", 'Z', 49);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(Arrays.equals(s.mz(), new int[]{4, 6}));
    }
}
