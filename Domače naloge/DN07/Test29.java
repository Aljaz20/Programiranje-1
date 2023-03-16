
import java.util.Arrays;

public class Test29 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[26];
        os[0] = new Oseba("a b", 'M', 19);
        os[1] = new Oseba("a b", 'Z', 82);
        os[2] = new Oseba("a b", 'M', 89);
        os[3] = new Oseba("a b", 'Z', 91);
        os[4] = new Oseba("a b", 'Z', 81);
        os[5] = new Oseba("a b", 'M', 38);
        os[6] = new Oseba("a b", 'Z', 53);
        os[7] = new Oseba("a b", 'Z', 100);
        os[8] = new Oseba("a b", 'Z', 56);
        os[9] = new Oseba("a b", 'Z', 34);
        os[10] = new Oseba("a b", 'M', 33);
        os[11] = new Oseba("a b", 'M', 22);
        os[12] = new Oseba("a b", 'M', 73);
        os[13] = new Oseba("a b", 'M', 26);
        os[14] = new Oseba("a b", 'M', 35);
        os[15] = new Oseba("a b", 'Z', 3);
        os[16] = new Oseba("a b", 'M', 85);
        os[17] = new Oseba("a b", 'Z', 20);
        os[18] = new Oseba("a b", 'Z', 31);
        os[19] = new Oseba("a b", 'Z', 49);
        os[20] = new Oseba("a b", 'M', 62);
        os[21] = new Oseba("a b", 'M', 61);
        os[22] = new Oseba("a b", 'Z', 47);
        os[23] = new Oseba("a b", 'M', 65);
        os[24] = new Oseba("a b", 'M', 76);
        os[25] = new Oseba("a b", 'Z', 17);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(s.starosta() == os[7]);
    }
}
