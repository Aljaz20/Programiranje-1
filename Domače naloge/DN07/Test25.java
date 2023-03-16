
import java.util.Arrays;

public class Test25 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[75];
        os[0] = new Oseba("a b", 'Z', 27);
        os[1] = new Oseba("a b", 'M', 86);
        os[2] = new Oseba("a b", 'Z', 5);
        os[3] = new Oseba("a b", 'M', 47);
        os[4] = new Oseba("a b", 'M', 51);
        os[5] = new Oseba("a b", 'Z', 81);
        os[6] = new Oseba("a b", 'Z', 47);
        os[7] = new Oseba("a b", 'M', 26);
        os[8] = new Oseba("a b", 'M', 5);
        os[9] = new Oseba("a b", 'M', 44);
        os[10] = new Oseba("a b", 'Z', 16);
        os[11] = new Oseba("a b", 'M', 29);
        os[12] = new Oseba("a b", 'M', 54);
        os[13] = new Oseba("a b", 'M', 24);
        os[14] = new Oseba("a b", 'M', 43);
        os[15] = new Oseba("a b", 'Z', 56);
        os[16] = new Oseba("a b", 'Z', 97);
        os[17] = new Oseba("a b", 'Z', 15);
        os[18] = new Oseba("a b", 'Z', 67);
        os[19] = new Oseba("a b", 'Z', 38);
        os[20] = new Oseba("a b", 'M', 7);
        os[21] = new Oseba("a b", 'Z', 96);
        os[22] = new Oseba("a b", 'Z', 87);
        os[23] = new Oseba("a b", 'M', 74);
        os[24] = new Oseba("a b", 'Z', 37);
        os[25] = new Oseba("a b", 'M', 59);
        os[26] = new Oseba("a b", 'Z', 11);
        os[27] = new Oseba("a b", 'M', 17);
        os[28] = new Oseba("a b", 'Z', 96);
        os[29] = new Oseba("a b", 'M', 73);
        os[30] = new Oseba("a b", 'Z', 49);
        os[31] = new Oseba("a b", 'Z', 85);
        os[32] = new Oseba("a b", 'M', 16);
        os[33] = new Oseba("a b", 'M', 28);
        os[34] = new Oseba("a b", 'M', 81);
        os[35] = new Oseba("a b", 'M', 47);
        os[36] = new Oseba("a b", 'M', 48);
        os[37] = new Oseba("a b", 'M', 48);
        os[38] = new Oseba("a b", 'Z', 70);
        os[39] = new Oseba("a b", 'Z', 12);
        os[40] = new Oseba("a b", 'M', 28);
        os[41] = new Oseba("a b", 'Z', 7);
        os[42] = new Oseba("a b", 'M', 81);
        os[43] = new Oseba("a b", 'Z', 67);
        os[44] = new Oseba("a b", 'M', 87);
        os[45] = new Oseba("a b", 'Z', 75);
        os[46] = new Oseba("a b", 'M', 32);
        os[47] = new Oseba("a b", 'Z', 60);
        os[48] = new Oseba("a b", 'Z', 10);
        os[49] = new Oseba("a b", 'Z', 76);
        os[50] = new Oseba("a b", 'M', 82);
        os[51] = new Oseba("a b", 'Z', 17);
        os[52] = new Oseba("a b", 'Z', 13);
        os[53] = new Oseba("a b", 'Z', 59);
        os[54] = new Oseba("a b", 'M', 23);
        os[55] = new Oseba("a b", 'M', 9);
        os[56] = new Oseba("a b", 'Z', 7);
        os[57] = new Oseba("a b", 'M', 45);
        os[58] = new Oseba("a b", 'M', 21);
        os[59] = new Oseba("a b", 'Z', 39);
        os[60] = new Oseba("a b", 'M', 59);
        os[61] = new Oseba("a b", 'Z', 18);
        os[62] = new Oseba("a b", 'M', 32);
        os[63] = new Oseba("a b", 'M', 67);
        os[64] = new Oseba("a b", 'Z', 87);
        os[65] = new Oseba("a b", 'M', 32);
        os[66] = new Oseba("a b", 'Z', 86);
        os[67] = new Oseba("a b", 'M', 62);
        os[68] = new Oseba("a b", 'Z', 28);
        os[69] = new Oseba("a b", 'Z', 24);
        os[70] = new Oseba("a b", 'M', 7);
        os[71] = new Oseba("a b", 'M', 40);
        os[72] = new Oseba("a b", 'M', 12);
        os[73] = new Oseba("a b", 'Z', 20);
        os[74] = new Oseba("a b", 'M', 46);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(Arrays.equals(s.mz(), new int[]{39, 36}));
    }
}
