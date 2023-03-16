
import java.util.Arrays;

public class Test26 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[1];
        os[0] = new Oseba("a b", 'M', 100);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(s.starosta() == os[0]);
    }
}
