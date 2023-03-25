
public class Test29 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[90];
        zivali[0] = new Tretja.RodovniskiPes("baabb", null, null);
        zivali[1] = new Tretja.Macka();
        zivali[2] = new Tretja.Pes();
        zivali[3] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[4] = new Tretja.RodovniskiPes("aba", null, null);
        zivali[5] = new Tretja.Pes();
        zivali[6] = new Tretja.RodovniskiPes("baabb", null, null);
        zivali[7] = new Tretja.Pes();
        zivali[8] = new Tretja.Pes();
        zivali[9] = new Tretja.Pes();
        zivali[10] = new Tretja.Macka();
        zivali[11] = new Tretja.Macka();
        zivali[12] = new Tretja.Pes();
        zivali[13] = new Tretja.Pes();
        zivali[14] = new Tretja.Macka();
        zivali[15] = new Tretja.Pes();
        zivali[16] = new Tretja.Pes();
        zivali[17] = new Tretja.Pes();
        zivali[18] = new Tretja.RodovniskiPes("aba", null, null);
        zivali[19] = new Tretja.Pes();
        zivali[20] = new Tretja.Macka();
        zivali[21] = new Tretja.Macka();
        zivali[22] = new Tretja.Pes();
        zivali[23] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[24] = new Tretja.Macka();
        zivali[25] = new Tretja.Macka();
        zivali[26] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[27] = new Tretja.Pes();
        zivali[28] = new Tretja.RodovniskiPes("baabb", null, null);
        zivali[29] = new Tretja.Pes();
        zivali[30] = new Tretja.Pes();
        zivali[31] = new Tretja.Pes();
        zivali[32] = new Tretja.Pes();
        zivali[33] = new Tretja.Pes();
        zivali[34] = new Tretja.Pes();
        zivali[35] = new Tretja.Macka();
        zivali[36] = new Tretja.Pes();
        zivali[37] = new Tretja.Pes();
        zivali[38] = new Tretja.Macka();
        zivali[39] = new Tretja.RodovniskiPes("baabb", null, null);
        zivali[40] = new Tretja.Pes();
        zivali[41] = new Tretja.Macka();
        zivali[42] = new Tretja.Pes();
        zivali[43] = new Tretja.Pes();
        zivali[44] = new Tretja.Macka();
        zivali[45] = new Tretja.Macka();
        zivali[46] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[47] = new Tretja.RodovniskiPes("aba", null, null);
        zivali[48] = new Tretja.Macka();
        zivali[49] = new Tretja.Macka();
        zivali[50] = new Tretja.Macka();
        zivali[51] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[52] = new Tretja.Pes();
        zivali[53] = new Tretja.Pes();
        zivali[54] = new Tretja.Pes();
        zivali[55] = new Tretja.Pes();
        zivali[56] = new Tretja.Macka();
        zivali[57] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[58] = new Tretja.Pes();
        zivali[59] = new Tretja.Macka();
        zivali[60] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[61] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[62] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[63] = new Tretja.Macka();
        zivali[64] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[65] = new Tretja.RodovniskiPes("aba", null, null);
        zivali[66] = new Tretja.RodovniskiPes("aba", null, null);
        zivali[67] = new Tretja.RodovniskiPes("baabb", null, null);
        zivali[68] = new Tretja.Pes();
        zivali[69] = new Tretja.Macka();
        zivali[70] = new Tretja.Pes();
        zivali[71] = new Tretja.Pes();
        zivali[72] = new Tretja.Pes();
        zivali[73] = new Tretja.Macka();
        zivali[74] = new Tretja.Pes();
        zivali[75] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[76] = new Tretja.Macka();
        zivali[77] = new Tretja.Pes();
        zivali[78] = new Tretja.RodovniskiPes("aba", null, null);
        zivali[79] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[80] = new Tretja.Pes();
        zivali[81] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[82] = new Tretja.Macka();
        zivali[83] = new Tretja.RodovniskiPes("aba", null, null);
        zivali[84] = new Tretja.Pes();
        zivali[85] = new Tretja.RodovniskiPes("aba", null, null);
        zivali[86] = new Tretja.Macka();
        zivali[87] = new Tretja.Macka();
        zivali[88] = new Tretja.Pes();
        zivali[89] = new Tretja.Macka();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
