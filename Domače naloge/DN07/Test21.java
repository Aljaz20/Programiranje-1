
import java.util.Arrays;

public class Test21 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[0];
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(Arrays.equals(s.mz(), new int[]{0, 0}));
    }
}
