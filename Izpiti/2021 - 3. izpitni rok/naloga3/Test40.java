
public class Test40 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[55];
        psi[0] = new Tretja.RodovniskiPes("aba", null, null);
        psi[1] = new Tretja.RodovniskiPes("aba", null, null);
        psi[2] = new Tretja.RodovniskiPes("aba", psi[0], psi[1]);
        psi[3] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[4] = new Tretja.RodovniskiPes("aba", psi[3], psi[2]);
        psi[5] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[6] = new Tretja.RodovniskiPes("aba", psi[5], psi[4]);
        psi[7] = new Tretja.RodovniskiPes("aba", null, null);
        psi[8] = new Tretja.RodovniskiPes("aba", psi[7], psi[6]);
        psi[9] = new Tretja.RodovniskiPes("aba", null, null);
        psi[10] = new Tretja.RodovniskiPes("aba", psi[8], psi[9]);
        psi[11] = new Tretja.RodovniskiPes("aba", null, null);
        psi[12] = new Tretja.RodovniskiPes("aba", null, null);
        psi[13] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[14] = new Tretja.RodovniskiPes("aba", psi[13], psi[11]);
        psi[15] = new Tretja.RodovniskiPes("aba", psi[10], psi[12]);
        psi[16] = new Tretja.RodovniskiPes("aba", psi[14], psi[15]);
        psi[17] = new Tretja.RodovniskiPes("aba", null, null);
        psi[18] = new Tretja.RodovniskiPes("aba", psi[17], psi[16]);
        psi[19] = new Tretja.RodovniskiPes("aba", null, null);
        psi[20] = new Tretja.RodovniskiPes("aba", null, null);
        psi[21] = new Tretja.RodovniskiPes("aba", psi[19], psi[20]);
        psi[22] = new Tretja.RodovniskiPes("aba", psi[18], psi[21]);
        psi[23] = new Tretja.RodovniskiPes("aba", null, null);
        psi[24] = new Tretja.RodovniskiPes("aba", null, null);
        psi[25] = new Tretja.RodovniskiPes("aba", psi[23], psi[22]);
        psi[26] = new Tretja.RodovniskiPes("aba", psi[24], psi[25]);
        psi[27] = new Tretja.RodovniskiPes("aba", null, null);
        psi[28] = new Tretja.RodovniskiPes("aba", psi[26], psi[27]);
        psi[29] = new Tretja.RodovniskiPes("aba", null, null);
        psi[30] = new Tretja.RodovniskiPes("aba", psi[29], psi[28]);
        psi[31] = new Tretja.RodovniskiPes("aba", null, null);
        psi[32] = new Tretja.RodovniskiPes("aba", psi[30], psi[31]);
        psi[33] = new Tretja.RodovniskiPes("aba", null, null);
        psi[34] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[35] = new Tretja.RodovniskiPes("aba", null, null);
        psi[36] = new Tretja.RodovniskiPes("aba", psi[35], psi[33]);
        psi[37] = new Tretja.RodovniskiPes("aba", psi[32], psi[34]);
        psi[38] = new Tretja.RodovniskiPes("aba", null, null);
        psi[39] = new Tretja.RodovniskiPes("aba", null, null);
        psi[40] = new Tretja.RodovniskiPes("aba", psi[36], psi[39]);
        psi[41] = new Tretja.RodovniskiPes("aba", psi[40], psi[38]);
        psi[42] = new Tretja.RodovniskiPes("abbba", psi[41], psi[37]);
        psi[43] = new Tretja.RodovniskiPes("aba", null, null);
        psi[44] = new Tretja.RodovniskiPes("aba", null, null);
        psi[45] = new Tretja.RodovniskiPes("aba", psi[42], psi[44]);
        psi[46] = new Tretja.RodovniskiPes("aba", null, null);
        psi[47] = new Tretja.RodovniskiPes("aba", psi[43], psi[46]);
        psi[48] = new Tretja.RodovniskiPes("aba", null, null);
        psi[49] = new Tretja.RodovniskiPes("aba", null, null);
        psi[50] = new Tretja.RodovniskiPes("aba", psi[49], psi[47]);
        psi[51] = new Tretja.RodovniskiPes("aba", null, null);
        psi[52] = new Tretja.RodovniskiPes("aba", psi[50], psi[51]);
        psi[53] = new Tretja.RodovniskiPes("aba", null, null);
        psi[54] = new Tretja.RodovniskiPes("aba", psi[45], psi[52]);

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
