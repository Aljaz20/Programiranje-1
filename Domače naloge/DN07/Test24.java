
import java.util.Arrays;

public class Test24 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[1];
        os[0] = new Oseba("a b", 'Z', 4);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(Arrays.equals(s.mz(), new int[]{0, 1}));
    }
}
