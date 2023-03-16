
public class Test42 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[34];
        psi[0] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[1] = new Tretja.RodovniskiPes("aaab", null, null);
        psi[2] = new Tretja.RodovniskiPes("aabab", psi[1], psi[0]);
        psi[3] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[4] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[5] = new Tretja.RodovniskiPes("aabab", psi[4], psi[2]);
        psi[6] = new Tretja.RodovniskiPes("aabab", psi[3], psi[5]);
        psi[7] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[8] = new Tretja.RodovniskiPes("aabab", psi[6], psi[7]);
        psi[9] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[10] = new Tretja.RodovniskiPes("aaab", psi[9], psi[8]);
        psi[11] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[12] = new Tretja.RodovniskiPes("aabab", psi[11], psi[10]);
        psi[13] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[14] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[15] = new Tretja.RodovniskiPes("aabab", psi[13], psi[14]);
        psi[16] = new Tretja.RodovniskiPes("aabab", psi[12], psi[15]);
        psi[17] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[18] = new Tretja.RodovniskiPes("aaab", null, null);
        psi[19] = new Tretja.RodovniskiPes("aabab", psi[17], psi[16]);
        psi[20] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[21] = new Tretja.RodovniskiPes("aabab", psi[19], psi[20]);
        psi[22] = new Tretja.RodovniskiPes("aabab", psi[21], psi[18]);
        psi[23] = new Tretja.RodovniskiPes("aaab", null, null);
        psi[24] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[25] = new Tretja.RodovniskiPes("aaab", psi[23], psi[24]);
        psi[26] = new Tretja.RodovniskiPes("aabab", psi[22], psi[25]);
        psi[27] = new Tretja.RodovniskiPes("aaab", null, null);
        psi[28] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[29] = new Tretja.RodovniskiPes("aaab", null, null);
        psi[30] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[31] = new Tretja.RodovniskiPes("aabab", psi[27], psi[30]);
        psi[32] = new Tretja.RodovniskiPes("aabab", null, null);
        psi[33] = new Tretja.RodovniskiPes("aabab", null, null);

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
