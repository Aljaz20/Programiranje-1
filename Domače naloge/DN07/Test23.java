
import java.util.Arrays;

public class Test23 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[36];
        os[0] = new Oseba("a b", 'Z', 42);
        os[1] = new Oseba("a b", 'Z', 59);
        os[2] = new Oseba("a b", 'Z', 34);
        os[3] = new Oseba("a b", 'M', 37);
        os[4] = new Oseba("a b", 'M', 20);
        os[5] = new Oseba("a b", 'M', 59);
        os[6] = new Oseba("a b", 'Z', 92);
        os[7] = new Oseba("a b", 'Z', 97);
        os[8] = new Oseba("a b", 'M', 88);
        os[9] = new Oseba("a b", 'Z', 51);
        os[10] = new Oseba("a b", 'Z', 67);
        os[11] = new Oseba("a b", 'M', 82);
        os[12] = new Oseba("a b", 'M', 77);
        os[13] = new Oseba("a b", 'Z', 77);
        os[14] = new Oseba("a b", 'M', 57);
        os[15] = new Oseba("a b", 'Z', 87);
        os[16] = new Oseba("a b", 'Z', 30);
        os[17] = new Oseba("a b", 'Z', 14);
        os[18] = new Oseba("a b", 'M', 56);
        os[19] = new Oseba("a b", 'Z', 35);
        os[20] = new Oseba("a b", 'M', 63);
        os[21] = new Oseba("a b", 'M', 54);
        os[22] = new Oseba("a b", 'M', 21);
        os[23] = new Oseba("a b", 'Z', 70);
        os[24] = new Oseba("a b", 'M', 64);
        os[25] = new Oseba("a b", 'M', 77);
        os[26] = new Oseba("a b", 'Z', 98);
        os[27] = new Oseba("a b", 'Z', 66);
        os[28] = new Oseba("a b", 'M', 32);
        os[29] = new Oseba("a b", 'Z', 14);
        os[30] = new Oseba("a b", 'Z', 82);
        os[31] = new Oseba("a b", 'M', 33);
        os[32] = new Oseba("a b", 'Z', 5);
        os[33] = new Oseba("a b", 'M', 30);
        os[34] = new Oseba("a b", 'Z', 56);
        os[35] = new Oseba("a b", 'Z', 60);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(Arrays.equals(s.mz(), new int[]{16, 20}));
    }
}
