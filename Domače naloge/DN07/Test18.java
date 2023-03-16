
public class Test18 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[50];
        os[0] = new Oseba("a b", 'Z', 63);
        os[1] = new Oseba("a b", 'M', 85);
        os[2] = new Oseba("a b", 'Z', 5);
        os[3] = new Oseba("a b", 'M', 91);
        os[4] = new Oseba("a b", 'Z', 80);
        os[5] = new Oseba("a b", 'Z', 3);
        os[6] = new Oseba("a b", 'Z', 75);
        os[7] = new Oseba("a b", 'M', 36);
        os[8] = new Oseba("a b", 'Z', 67);
        os[9] = new Oseba("a b", 'Z', 55);
        os[10] = new Oseba("a b", 'M', 63);
        os[11] = new Oseba("a b", 'M', 27);
        os[12] = new Oseba("a b", 'M', 39);
        os[13] = new Oseba("a b", 'M', 39);
        os[14] = new Oseba("a b", 'Z', 67);
        os[15] = new Oseba("a b", 'Z', 57);
        os[16] = new Oseba("a b", 'Z', 15);
        os[17] = new Oseba("a b", 'M', 43);
        os[18] = new Oseba("a b", 'Z', 3);
        os[19] = new Oseba("a b", 'Z', 16);
        os[20] = new Oseba("a b", 'Z', 93);
        os[21] = new Oseba("a b", 'Z', 18);
        os[22] = new Oseba("a b", 'Z', 25);
        os[23] = new Oseba("a b", 'M', 38);
        os[24] = new Oseba("a b", 'Z', 42);
        os[25] = new Oseba("a b", 'Z', 66);
        os[26] = new Oseba("a b", 'M', 58);
        os[27] = new Oseba("a b", 'Z', 11);
        os[28] = new Oseba("a b", 'M', 96);
        os[29] = new Oseba("a b", 'Z', 78);
        os[30] = new Oseba("a b", 'Z', 30);
        os[31] = new Oseba("a b", 'Z', 76);
        os[32] = new Oseba("a b", 'M', 63);
        os[33] = new Oseba("a b", 'Z', 71);
        os[34] = new Oseba("a b", 'Z', 13);
        os[35] = new Oseba("a b", 'M', 21);
        os[36] = new Oseba("a b", 'M', 28);
        os[37] = new Oseba("a b", 'Z', 71);
        os[38] = new Oseba("a b", 'Z', 3);
        os[39] = new Oseba("a b", 'Z', 98);
        os[40] = new Oseba("a b", 'Z', 26);
        os[41] = new Oseba("a b", 'M', 83);
        os[42] = new Oseba("a b", 'Z', 49);
        os[43] = new Oseba("a b", 'Z', 68);
        os[44] = new Oseba("a b", 'M', 81);
        os[45] = new Oseba("a b", 'Z', 41);
        os[46] = new Oseba("a b", 'Z', 30);
        os[47] = new Oseba("a b", 'M', 38);
        os[48] = new Oseba("a b", 'Z', 30);
        os[49] = new Oseba("a b", 'M', 13);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(s.steviloStarejsihOd(os[10]) == 17);
    }
}
