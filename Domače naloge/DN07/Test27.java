
import java.util.Arrays;

public class Test27 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[10];
        os[0] = new Oseba("a b", 'Z', 15);
        os[1] = new Oseba("a b", 'M', 65);
        os[2] = new Oseba("a b", 'M', 8);
        os[3] = new Oseba("a b", 'M', 63);
        os[4] = new Oseba("a b", 'M', 80);
        os[5] = new Oseba("a b", 'M', 31);
        os[6] = new Oseba("a b", 'M', 9);
        os[7] = new Oseba("a b", 'Z', 93);
        os[8] = new Oseba("a b", 'M', 23);
        os[9] = new Oseba("a b", 'M', 33);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(s.starosta() == os[7]);
    }
}
