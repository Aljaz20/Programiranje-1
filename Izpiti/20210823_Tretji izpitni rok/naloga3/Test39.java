
public class Test39 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[45];
        psi[0] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[1] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[2] = new Tretja.RodovniskiPes("abbba", psi[0], psi[1]);
        psi[3] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[4] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[5] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[6] = new Tretja.RodovniskiPes("abbba", psi[2], psi[4]);
        psi[7] = new Tretja.RodovniskiPes("abbba", psi[6], psi[3]);
        psi[8] = new Tretja.RodovniskiPes("abbba", psi[5], psi[7]);
        psi[9] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[10] = new Tretja.RodovniskiPes("abbba", psi[9], psi[8]);
        psi[11] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[12] = new Tretja.RodovniskiPes("abbba", psi[11], psi[10]);
        psi[13] = new Tretja.RodovniskiPes("bba", null, null);
        psi[14] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[15] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[16] = new Tretja.RodovniskiPes("abbba", psi[15], psi[14]);
        psi[17] = new Tretja.RodovniskiPes("abbba", psi[13], psi[16]);
        psi[18] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[19] = new Tretja.RodovniskiPes("abbba", psi[18], psi[12]);
        psi[20] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[21] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[22] = new Tretja.RodovniskiPes("abbba", psi[20], psi[17]);
        psi[23] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[24] = new Tretja.RodovniskiPes("abbba", psi[21], psi[23]);
        psi[25] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[26] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[27] = new Tretja.RodovniskiPes("abbba", psi[19], psi[26]);
        psi[28] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[29] = new Tretja.RodovniskiPes("bba", null, null);
        psi[30] = new Tretja.RodovniskiPes("abbba", psi[25], psi[27]);
        psi[31] = new Tretja.RodovniskiPes("abbba", psi[22], psi[24]);
        psi[32] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[33] = new Tretja.RodovniskiPes("abbba", psi[31], psi[28]);
        psi[34] = new Tretja.RodovniskiPes("bba", null, null);
        psi[35] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[36] = new Tretja.RodovniskiPes("abbba", psi[32], psi[30]);
        psi[37] = new Tretja.RodovniskiPes("abbba", psi[35], psi[33]);
        psi[38] = new Tretja.RodovniskiPes("abbba", psi[37], psi[36]);
        psi[39] = new Tretja.RodovniskiPes("abbba", psi[34], psi[38]);
        psi[40] = new Tretja.RodovniskiPes("abbba", psi[39], psi[29]);
        psi[41] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[42] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[43] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[44] = new Tretja.RodovniskiPes("abbba", null, null);

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
