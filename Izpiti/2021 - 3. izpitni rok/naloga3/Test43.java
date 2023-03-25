
public class Test43 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[60];
        psi[0] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[1] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[2] = new Tretja.RodovniskiPes("bbba", psi[1], psi[0]);
        psi[3] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[4] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[5] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[6] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[7] = new Tretja.RodovniskiPes("bbba", psi[5], psi[4]);
        psi[8] = new Tretja.RodovniskiPes("bbba", psi[2], psi[6]);
        psi[9] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[10] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[11] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[12] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[13] = new Tretja.RodovniskiPes("bbba", psi[3], psi[11]);
        psi[14] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[15] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[16] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[17] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[18] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[19] = new Tretja.RodovniskiPes("bab", psi[9], psi[14]);
        psi[20] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[21] = new Tretja.RodovniskiPes("bbba", psi[15], psi[16]);
        psi[22] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[23] = new Tretja.RodovniskiPes("bab", null, null);
        psi[24] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[25] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[26] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[27] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[28] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[29] = new Tretja.RodovniskiPes("bbba", psi[19], psi[27]);
        psi[30] = new Tretja.RodovniskiPes("bbba", psi[20], psi[21]);
        psi[31] = new Tretja.RodovniskiPes("bbba", psi[28], psi[8]);
        psi[32] = new Tretja.RodovniskiPes("bbba", psi[18], psi[29]);
        psi[33] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[34] = new Tretja.RodovniskiPes("bab", null, null);
        psi[35] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[36] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[37] = new Tretja.RodovniskiPes("bbba", psi[34], psi[25]);
        psi[38] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[39] = new Tretja.RodovniskiPes("bbba", psi[38], psi[32]);
        psi[40] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[41] = new Tretja.RodovniskiPes("bbba", psi[24], psi[10]);
        psi[42] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[43] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[44] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[45] = new Tretja.RodovniskiPes("bbba", psi[7], psi[44]);
        psi[46] = new Tretja.RodovniskiPes("bbba", psi[17], psi[30]);
        psi[47] = new Tretja.RodovniskiPes("bbba", psi[39], psi[33]);
        psi[48] = new Tretja.RodovniskiPes("bbba", psi[23], psi[13]);
        psi[49] = new Tretja.RodovniskiPes("bbba", psi[47], psi[41]);
        psi[50] = new Tretja.RodovniskiPes("bbba", psi[36], psi[35]);
        psi[51] = new Tretja.RodovniskiPes("bab", psi[46], psi[49]);
        psi[52] = new Tretja.RodovniskiPes("bbba", psi[37], psi[12]);
        psi[53] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[54] = new Tretja.RodovniskiPes("bbba", psi[53], psi[31]);
        psi[55] = new Tretja.RodovniskiPes("bbba", psi[26], psi[54]);
        psi[56] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[57] = new Tretja.RodovniskiPes("bbba", null, null);
        psi[58] = new Tretja.RodovniskiPes("bbba", psi[50], psi[45]);
        psi[59] = new Tretja.RodovniskiPes("bbba", null, null);

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
