
public class Test26 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[70];
        zivali[0] = new Tretja.Pes();
        zivali[1] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[2] = new Tretja.Macka();
        zivali[3] = new Tretja.Macka();
        zivali[4] = new Tretja.Macka();
        zivali[5] = new Tretja.Macka();
        zivali[6] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[7] = new Tretja.Macka();
        zivali[8] = new Tretja.Pes();
        zivali[9] = new Tretja.Pes();
        zivali[10] = new Tretja.Macka();
        zivali[11] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[12] = new Tretja.Macka();
        zivali[13] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[14] = new Tretja.Macka();
        zivali[15] = new Tretja.Pes();
        zivali[16] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[17] = new Tretja.Pes();
        zivali[18] = new Tretja.Macka();
        zivali[19] = new Tretja.Macka();
        zivali[20] = new Tretja.Pes();
        zivali[21] = new Tretja.Macka();
        zivali[22] = new Tretja.Pes();
        zivali[23] = new Tretja.Macka();
        zivali[24] = new Tretja.Macka();
        zivali[25] = new Tretja.Pes();
        zivali[26] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[27] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[28] = new Tretja.Pes();
        zivali[29] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[30] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[31] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[32] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[33] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[34] = new Tretja.Pes();
        zivali[35] = new Tretja.Pes();
        zivali[36] = new Tretja.Pes();
        zivali[37] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[38] = new Tretja.Macka();
        zivali[39] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[40] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[41] = new Tretja.Macka();
        zivali[42] = new Tretja.Macka();
        zivali[43] = new Tretja.Pes();
        zivali[44] = new Tretja.Pes();
        zivali[45] = new Tretja.Pes();
        zivali[46] = new Tretja.Pes();
        zivali[47] = new Tretja.Pes();
        zivali[48] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[49] = new Tretja.Macka();
        zivali[50] = new Tretja.Macka();
        zivali[51] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[52] = new Tretja.Macka();
        zivali[53] = new Tretja.Pes();
        zivali[54] = new Tretja.Pes();
        zivali[55] = new Tretja.Macka();
        zivali[56] = new Tretja.Pes();
        zivali[57] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[58] = new Tretja.Macka();
        zivali[59] = new Tretja.Pes();
        zivali[60] = new Tretja.Macka();
        zivali[61] = new Tretja.Pes();
        zivali[62] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[63] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[64] = new Tretja.Pes();
        zivali[65] = new Tretja.Macka();
        zivali[66] = new Tretja.Macka();
        zivali[67] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[68] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[69] = new Tretja.RodovniskiPes("bab", null, null);

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
