
public class Test24 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[83];
        zivali[0] = new Tretja.Macka();
        zivali[1] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[2] = new Tretja.Macka();
        zivali[3] = new Tretja.Pes();
        zivali[4] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[5] = new Tretja.Macka();
        zivali[6] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[7] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[8] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[9] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[10] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[11] = new Tretja.Macka();
        zivali[12] = new Tretja.Macka();
        zivali[13] = new Tretja.Macka();
        zivali[14] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[15] = new Tretja.Pes();
        zivali[16] = new Tretja.Macka();
        zivali[17] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[18] = new Tretja.Pes();
        zivali[19] = new Tretja.Pes();
        zivali[20] = new Tretja.RodovniskiPes("baaab", null, null);
        zivali[21] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[22] = new Tretja.Pes();
        zivali[23] = new Tretja.Macka();
        zivali[24] = new Tretja.Pes();
        zivali[25] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[26] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[27] = new Tretja.Macka();
        zivali[28] = new Tretja.Macka();
        zivali[29] = new Tretja.Pes();
        zivali[30] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[31] = new Tretja.RodovniskiPes("baaab", null, null);
        zivali[32] = new Tretja.Pes();
        zivali[33] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[34] = new Tretja.Macka();
        zivali[35] = new Tretja.Pes();
        zivali[36] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[37] = new Tretja.Pes();
        zivali[38] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[39] = new Tretja.Macka();
        zivali[40] = new Tretja.Macka();
        zivali[41] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[42] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[43] = new Tretja.Pes();
        zivali[44] = new Tretja.Macka();
        zivali[45] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[46] = new Tretja.Pes();
        zivali[47] = new Tretja.Macka();
        zivali[48] = new Tretja.Macka();
        zivali[49] = new Tretja.Macka();
        zivali[50] = new Tretja.Macka();
        zivali[51] = new Tretja.Macka();
        zivali[52] = new Tretja.Macka();
        zivali[53] = new Tretja.RodovniskiPes("baaab", null, null);
        zivali[54] = new Tretja.Pes();
        zivali[55] = new Tretja.Pes();
        zivali[56] = new Tretja.Pes();
        zivali[57] = new Tretja.Macka();
        zivali[58] = new Tretja.Pes();
        zivali[59] = new Tretja.RodovniskiPes("baaab", null, null);
        zivali[60] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[61] = new Tretja.Pes();
        zivali[62] = new Tretja.Macka();
        zivali[63] = new Tretja.Macka();
        zivali[64] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[65] = new Tretja.Macka();
        zivali[66] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[67] = new Tretja.Pes();
        zivali[68] = new Tretja.Macka();
        zivali[69] = new Tretja.Pes();
        zivali[70] = new Tretja.Pes();
        zivali[71] = new Tretja.Pes();
        zivali[72] = new Tretja.Pes();
        zivali[73] = new Tretja.Macka();
        zivali[74] = new Tretja.RodovniskiPes("baaab", null, null);
        zivali[75] = new Tretja.Pes();
        zivali[76] = new Tretja.Pes();
        zivali[77] = new Tretja.Macka();
        zivali[78] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[79] = new Tretja.Pes();
        zivali[80] = new Tretja.Pes();
        zivali[81] = new Tretja.Pes();
        zivali[82] = new Tretja.Macka();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
