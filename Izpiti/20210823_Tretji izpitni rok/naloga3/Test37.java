
public class Test37 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[44];
        psi[0] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[1] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[2] = new Tretja.RodovniskiPes("aaba", psi[0], psi[1]);
        psi[3] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[4] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[5] = new Tretja.RodovniskiPes("aaba", psi[3], psi[4]);
        psi[6] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[7] = new Tretja.RodovniskiPes("aaba", psi[6], psi[5]);
        psi[8] = new Tretja.RodovniskiPes("aaba", psi[7], psi[2]);
        psi[9] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[10] = new Tretja.RodovniskiPes("aaba", psi[8], psi[9]);
        psi[11] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[12] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[13] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[14] = new Tretja.RodovniskiPes("aaba", psi[12], psi[10]);
        psi[15] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[16] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[17] = new Tretja.RodovniskiPes("aaba", psi[16], psi[15]);
        psi[18] = new Tretja.RodovniskiPes("aaba", psi[11], psi[13]);
        psi[19] = new Tretja.RodovniskiPes("aaba", psi[14], psi[18]);
        psi[20] = new Tretja.RodovniskiPes("aaba", psi[19], psi[17]);
        psi[21] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[22] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[23] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[24] = new Tretja.RodovniskiPes("aaba", psi[22], psi[21]);
        psi[25] = new Tretja.RodovniskiPes("aaba", psi[20], psi[24]);
        psi[26] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[27] = new Tretja.RodovniskiPes("aaba", psi[23], psi[25]);
        psi[28] = new Tretja.RodovniskiPes("aaba", psi[26], psi[27]);
        psi[29] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[30] = new Tretja.RodovniskiPes("aaba", psi[29], psi[28]);
        psi[31] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[32] = new Tretja.RodovniskiPes("ba", null, null);
        psi[33] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[34] = new Tretja.RodovniskiPes("ba", null, null);
        psi[35] = new Tretja.RodovniskiPes("aaba", psi[33], psi[30]);
        psi[36] = new Tretja.RodovniskiPes("aaba", psi[34], psi[35]);
        psi[37] = new Tretja.RodovniskiPes("aaba", psi[31], psi[32]);
        psi[38] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[39] = new Tretja.RodovniskiPes("ba", null, null);
        psi[40] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[41] = new Tretja.RodovniskiPes("aaba", null, null);
        psi[42] = new Tretja.RodovniskiPes("aaba", psi[37], psi[40]);
        psi[43] = new Tretja.RodovniskiPes("aaba", null, null);

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
