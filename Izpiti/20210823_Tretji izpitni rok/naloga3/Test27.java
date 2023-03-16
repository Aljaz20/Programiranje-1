
public class Test27 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[88];
        zivali[0] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[1] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[2] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[3] = new Tretja.Macka();
        zivali[4] = new Tretja.Pes();
        zivali[5] = new Tretja.Macka();
        zivali[6] = new Tretja.Macka();
        zivali[7] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[8] = new Tretja.Pes();
        zivali[9] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[10] = new Tretja.Macka();
        zivali[11] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[12] = new Tretja.Pes();
        zivali[13] = new Tretja.Macka();
        zivali[14] = new Tretja.Pes();
        zivali[15] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[16] = new Tretja.Pes();
        zivali[17] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[18] = new Tretja.Macka();
        zivali[19] = new Tretja.Pes();
        zivali[20] = new Tretja.Macka();
        zivali[21] = new Tretja.Pes();
        zivali[22] = new Tretja.Pes();
        zivali[23] = new Tretja.Pes();
        zivali[24] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[25] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[26] = new Tretja.Pes();
        zivali[27] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[28] = new Tretja.Macka();
        zivali[29] = new Tretja.Macka();
        zivali[30] = new Tretja.Pes();
        zivali[31] = new Tretja.Macka();
        zivali[32] = new Tretja.Macka();
        zivali[33] = new Tretja.Macka();
        zivali[34] = new Tretja.Macka();
        zivali[35] = new Tretja.Macka();
        zivali[36] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[37] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[38] = new Tretja.Macka();
        zivali[39] = new Tretja.Macka();
        zivali[40] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[41] = new Tretja.Pes();
        zivali[42] = new Tretja.Pes();
        zivali[43] = new Tretja.Macka();
        zivali[44] = new Tretja.Macka();
        zivali[45] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[46] = new Tretja.Pes();
        zivali[47] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[48] = new Tretja.Pes();
        zivali[49] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[50] = new Tretja.Macka();
        zivali[51] = new Tretja.Pes();
        zivali[52] = new Tretja.Macka();
        zivali[53] = new Tretja.Macka();
        zivali[54] = new Tretja.Macka();
        zivali[55] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[56] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[57] = new Tretja.Macka();
        zivali[58] = new Tretja.Pes();
        zivali[59] = new Tretja.Pes();
        zivali[60] = new Tretja.Macka();
        zivali[61] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[62] = new Tretja.Pes();
        zivali[63] = new Tretja.Macka();
        zivali[64] = new Tretja.Pes();
        zivali[65] = new Tretja.Pes();
        zivali[66] = new Tretja.Pes();
        zivali[67] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[68] = new Tretja.Macka();
        zivali[69] = new Tretja.Pes();
        zivali[70] = new Tretja.Macka();
        zivali[71] = new Tretja.Pes();
        zivali[72] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[73] = new Tretja.Pes();
        zivali[74] = new Tretja.Macka();
        zivali[75] = new Tretja.Pes();
        zivali[76] = new Tretja.Pes();
        zivali[77] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[78] = new Tretja.Macka();
        zivali[79] = new Tretja.Macka();
        zivali[80] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[81] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[82] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[83] = new Tretja.RodovniskiPes("bbba", null, null);
        zivali[84] = new Tretja.Pes();
        zivali[85] = new Tretja.Macka();
        zivali[86] = new Tretja.Pes();
        zivali[87] = new Tretja.RodovniskiPes("ba", null, null);

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
