
public class Test19 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[84];
        zivali[0] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[1] = new Tretja.Pes();
        zivali[2] = new Tretja.RodovniskiPes("ababa", null, null);
        zivali[3] = new Tretja.Pes();
        zivali[4] = new Tretja.Pes();
        zivali[5] = new Tretja.Pes();
        zivali[6] = new Tretja.Pes();
        zivali[7] = new Tretja.RodovniskiPes("ababa", null, null);
        zivali[8] = new Tretja.Pes();
        zivali[9] = new Tretja.Macka();
        zivali[10] = new Tretja.RodovniskiPes("aaba", null, null);
        zivali[11] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[12] = new Tretja.Pes();
        zivali[13] = new Tretja.RodovniskiPes("aaba", null, null);
        zivali[14] = new Tretja.RodovniskiPes("ababa", null, null);
        zivali[15] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[16] = new Tretja.Pes();
        zivali[17] = new Tretja.Macka();
        zivali[18] = new Tretja.Macka();
        zivali[19] = new Tretja.Macka();
        zivali[20] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[21] = new Tretja.Pes();
        zivali[22] = new Tretja.RodovniskiPes("ababa", null, null);
        zivali[23] = new Tretja.Macka();
        zivali[24] = new Tretja.Macka();
        zivali[25] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[26] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[27] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[28] = new Tretja.Pes();
        zivali[29] = new Tretja.Pes();
        zivali[30] = new Tretja.Pes();
        zivali[31] = new Tretja.Pes();
        zivali[32] = new Tretja.Macka();
        zivali[33] = new Tretja.Macka();
        zivali[34] = new Tretja.Macka();
        zivali[35] = new Tretja.Macka();
        zivali[36] = new Tretja.Pes();
        zivali[37] = new Tretja.Pes();
        zivali[38] = new Tretja.Macka();
        zivali[39] = new Tretja.Pes();
        zivali[40] = new Tretja.Macka();
        zivali[41] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[42] = new Tretja.RodovniskiPes("aaba", null, null);
        zivali[43] = new Tretja.Pes();
        zivali[44] = new Tretja.RodovniskiPes("aaba", null, null);
        zivali[45] = new Tretja.RodovniskiPes("aaba", null, null);
        zivali[46] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[47] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[48] = new Tretja.Pes();
        zivali[49] = new Tretja.RodovniskiPes("aaba", null, null);
        zivali[50] = new Tretja.Pes();
        zivali[51] = new Tretja.RodovniskiPes("ababa", null, null);
        zivali[52] = new Tretja.Pes();
        zivali[53] = new Tretja.RodovniskiPes("aaba", null, null);
        zivali[54] = new Tretja.Macka();
        zivali[55] = new Tretja.Pes();
        zivali[56] = new Tretja.RodovniskiPes("aaba", null, null);
        zivali[57] = new Tretja.Pes();
        zivali[58] = new Tretja.Macka();
        zivali[59] = new Tretja.RodovniskiPes("ababa", null, null);
        zivali[60] = new Tretja.Macka();
        zivali[61] = new Tretja.Macka();
        zivali[62] = new Tretja.RodovniskiPes("ababa", null, null);
        zivali[63] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[64] = new Tretja.Macka();
        zivali[65] = new Tretja.Pes();
        zivali[66] = new Tretja.Macka();
        zivali[67] = new Tretja.Pes();
        zivali[68] = new Tretja.Macka();
        zivali[69] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[70] = new Tretja.Macka();
        zivali[71] = new Tretja.Pes();
        zivali[72] = new Tretja.Pes();
        zivali[73] = new Tretja.Macka();
        zivali[74] = new Tretja.RodovniskiPes("ababa", null, null);
        zivali[75] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[76] = new Tretja.Pes();
        zivali[77] = new Tretja.RodovniskiPes("aaba", null, null);
        zivali[78] = new Tretja.Pes();
        zivali[79] = new Tretja.Macka();
        zivali[80] = new Tretja.Pes();
        zivali[81] = new Tretja.Pes();
        zivali[82] = new Tretja.Pes();
        zivali[83] = new Tretja.RodovniskiPes("ababa", null, null);

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
