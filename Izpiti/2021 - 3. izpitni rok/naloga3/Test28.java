
public class Test28 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[54];
        zivali[0] = new Tretja.Pes();
        zivali[1] = new Tretja.RodovniskiPes("babba", null, null);
        zivali[2] = new Tretja.RodovniskiPes("babba", null, null);
        zivali[3] = new Tretja.Macka();
        zivali[4] = new Tretja.Pes();
        zivali[5] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[6] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[7] = new Tretja.Macka();
        zivali[8] = new Tretja.Macka();
        zivali[9] = new Tretja.RodovniskiPes("babba", null, null);
        zivali[10] = new Tretja.Macka();
        zivali[11] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[12] = new Tretja.Macka();
        zivali[13] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[14] = new Tretja.Macka();
        zivali[15] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[16] = new Tretja.Pes();
        zivali[17] = new Tretja.RodovniskiPes("babba", null, null);
        zivali[18] = new Tretja.Macka();
        zivali[19] = new Tretja.RodovniskiPes("babba", null, null);
        zivali[20] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[21] = new Tretja.RodovniskiPes("babba", null, null);
        zivali[22] = new Tretja.Macka();
        zivali[23] = new Tretja.Pes();
        zivali[24] = new Tretja.Pes();
        zivali[25] = new Tretja.Macka();
        zivali[26] = new Tretja.Pes();
        zivali[27] = new Tretja.Pes();
        zivali[28] = new Tretja.Pes();
        zivali[29] = new Tretja.Macka();
        zivali[30] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[31] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[32] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[33] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[34] = new Tretja.Macka();
        zivali[35] = new Tretja.Macka();
        zivali[36] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[37] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[38] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[39] = new Tretja.Pes();
        zivali[40] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[41] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[42] = new Tretja.RodovniskiPes("babba", null, null);
        zivali[43] = new Tretja.Macka();
        zivali[44] = new Tretja.Macka();
        zivali[45] = new Tretja.Macka();
        zivali[46] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[47] = new Tretja.Pes();
        zivali[48] = new Tretja.Macka();
        zivali[49] = new Tretja.Macka();
        zivali[50] = new Tretja.Pes();
        zivali[51] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[52] = new Tretja.Pes();
        zivali[53] = new Tretja.Macka();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
