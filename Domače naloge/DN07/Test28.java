
import java.util.Arrays;

public class Test28 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[32];
        os[0] = new Oseba("a b", 'M', 75);
        os[1] = new Oseba("a b", 'Z', 49);
        os[2] = new Oseba("a b", 'Z', 35);
        os[3] = new Oseba("a b", 'M', 19);
        os[4] = new Oseba("a b", 'M', 26);
        os[5] = new Oseba("a b", 'M', 61);
        os[6] = new Oseba("a b", 'M', 43);
        os[7] = new Oseba("a b", 'M', 74);
        os[8] = new Oseba("a b", 'Z', 66);
        os[9] = new Oseba("a b", 'M', 93);
        os[10] = new Oseba("a b", 'M', 7);
        os[11] = new Oseba("a b", 'Z', 83);
        os[12] = new Oseba("a b", 'M', 59);
        os[13] = new Oseba("a b", 'M', 23);
        os[14] = new Oseba("a b", 'M', 9);
        os[15] = new Oseba("a b", 'M', 33);
        os[16] = new Oseba("a b", 'M', 48);
        os[17] = new Oseba("a b", 'M', 77);
        os[18] = new Oseba("a b", 'Z', 1);
        os[19] = new Oseba("a b", 'M', 37);
        os[20] = new Oseba("a b", 'Z', 44);
        os[21] = new Oseba("a b", 'Z', 98);
        os[22] = new Oseba("a b", 'M', 95);
        os[23] = new Oseba("a b", 'Z', 96);
        os[24] = new Oseba("a b", 'Z', 3);
        os[25] = new Oseba("a b", 'M', 69);
        os[26] = new Oseba("a b", 'M', 73);
        os[27] = new Oseba("a b", 'M', 31);
        os[28] = new Oseba("a b", 'Z', 14);
        os[29] = new Oseba("a b", 'M', 84);
        os[30] = new Oseba("a b", 'M', 29);
        os[31] = new Oseba("a b", 'M', 86);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(s.starosta() == os[21]);
    }
}
