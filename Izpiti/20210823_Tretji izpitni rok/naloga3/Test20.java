
public class Test20 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[82];
        zivali[0] = new Tretja.RodovniskiPes("aabab", null, null);
        zivali[1] = new Tretja.Pes();
        zivali[2] = new Tretja.RodovniskiPes("aabab", null, null);
        zivali[3] = new Tretja.RodovniskiPes("aabab", null, null);
        zivali[4] = new Tretja.Pes();
        zivali[5] = new Tretja.RodovniskiPes("aabab", null, null);
        zivali[6] = new Tretja.Pes();
        zivali[7] = new Tretja.Macka();
        zivali[8] = new Tretja.Pes();
        zivali[9] = new Tretja.Pes();
        zivali[10] = new Tretja.Pes();
        zivali[11] = new Tretja.Pes();
        zivali[12] = new Tretja.Pes();
        zivali[13] = new Tretja.Macka();
        zivali[14] = new Tretja.Pes();
        zivali[15] = new Tretja.RodovniskiPes("aabab", null, null);
        zivali[16] = new Tretja.RodovniskiPes("bbab", null, null);
        zivali[17] = new Tretja.Macka();
        zivali[18] = new Tretja.Pes();
        zivali[19] = new Tretja.Pes();
        zivali[20] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[21] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[22] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[23] = new Tretja.Pes();
        zivali[24] = new Tretja.Macka();
        zivali[25] = new Tretja.Pes();
        zivali[26] = new Tretja.Macka();
        zivali[27] = new Tretja.Pes();
        zivali[28] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[29] = new Tretja.RodovniskiPes("aabab", null, null);
        zivali[30] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[31] = new Tretja.Macka();
        zivali[32] = new Tretja.RodovniskiPes("bbab", null, null);
        zivali[33] = new Tretja.RodovniskiPes("aa", null, null);
        zivali[34] = new Tretja.Pes();
        zivali[35] = new Tretja.Macka();
        zivali[36] = new Tretja.Pes();
        zivali[37] = new Tretja.Pes();
        zivali[38] = new Tretja.Macka();
        zivali[39] = new Tretja.Pes();
        zivali[40] = new Tretja.Pes();
        zivali[41] = new Tretja.Macka();
        zivali[42] = new Tretja.Macka();
        zivali[43] = new Tretja.Macka();
        zivali[44] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[45] = new Tretja.Macka();
        zivali[46] = new Tretja.Macka();
        zivali[47] = new Tretja.RodovniskiPes("aabab", null, null);
        zivali[48] = new Tretja.Pes();
        zivali[49] = new Tretja.Macka();
        zivali[50] = new Tretja.Pes();
        zivali[51] = new Tretja.RodovniskiPes("aa", null, null);
        zivali[52] = new Tretja.Macka();
        zivali[53] = new Tretja.Pes();
        zivali[54] = new Tretja.Macka();
        zivali[55] = new Tretja.RodovniskiPes("aa", null, null);
        zivali[56] = new Tretja.Macka();
        zivali[57] = new Tretja.Pes();
        zivali[58] = new Tretja.Pes();
        zivali[59] = new Tretja.Macka();
        zivali[60] = new Tretja.Macka();
        zivali[61] = new Tretja.Macka();
        zivali[62] = new Tretja.Pes();
        zivali[63] = new Tretja.Pes();
        zivali[64] = new Tretja.Macka();
        zivali[65] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[66] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[67] = new Tretja.Pes();
        zivali[68] = new Tretja.RodovniskiPes("aa", null, null);
        zivali[69] = new Tretja.Pes();
        zivali[70] = new Tretja.RodovniskiPes("aabab", null, null);
        zivali[71] = new Tretja.RodovniskiPes("aa", null, null);
        zivali[72] = new Tretja.Pes();
        zivali[73] = new Tretja.Macka();
        zivali[74] = new Tretja.Macka();
        zivali[75] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[76] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[77] = new Tretja.RodovniskiPes("aa", null, null);
        zivali[78] = new Tretja.Pes();
        zivali[79] = new Tretja.Macka();
        zivali[80] = new Tretja.Pes();
        zivali[81] = new Tretja.RodovniskiPes("ba", null, null);

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
