
import java.util.Arrays;

public class Test30 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[0];

        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(s.starosta() == null);
    }
}
