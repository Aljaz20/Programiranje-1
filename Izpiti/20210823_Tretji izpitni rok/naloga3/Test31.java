
public class Test31 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[74];
        zivali[0] = new Tretja.Macka();
        zivali[1] = new Tretja.Pes();
        zivali[2] = new Tretja.Pes();
        zivali[3] = new Tretja.Macka();
        zivali[4] = new Tretja.Pes();
        zivali[5] = new Tretja.Pes();
        zivali[6] = new Tretja.Macka();
        zivali[7] = new Tretja.Macka();
        zivali[8] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[9] = new Tretja.Pes();
        zivali[10] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[11] = new Tretja.Pes();
        zivali[12] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[13] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[14] = new Tretja.Pes();
        zivali[15] = new Tretja.Pes();
        zivali[16] = new Tretja.Macka();
        zivali[17] = new Tretja.Pes();
        zivali[18] = new Tretja.Macka();
        zivali[19] = new Tretja.Pes();
        zivali[20] = new Tretja.Pes();
        zivali[21] = new Tretja.Pes();
        zivali[22] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[23] = new Tretja.Pes();
        zivali[24] = new Tretja.Macka();
        zivali[25] = new Tretja.Pes();
        zivali[26] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[27] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[28] = new Tretja.Pes();
        zivali[29] = new Tretja.Macka();
        zivali[30] = new Tretja.Pes();
        zivali[31] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[32] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[33] = new Tretja.Pes();
        zivali[34] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[35] = new Tretja.Pes();
        zivali[36] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[37] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[38] = new Tretja.Macka();
        zivali[39] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[40] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[41] = new Tretja.Pes();
        zivali[42] = new Tretja.Pes();
        zivali[43] = new Tretja.Pes();
        zivali[44] = new Tretja.Macka();
        zivali[45] = new Tretja.Macka();
        zivali[46] = new Tretja.Pes();
        zivali[47] = new Tretja.Macka();
        zivali[48] = new Tretja.Macka();
        zivali[49] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[50] = new Tretja.Macka();
        zivali[51] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[52] = new Tretja.Macka();
        zivali[53] = new Tretja.Pes();
        zivali[54] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[55] = new Tretja.Macka();
        zivali[56] = new Tretja.Pes();
        zivali[57] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[58] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[59] = new Tretja.Pes();
        zivali[60] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[61] = new Tretja.Macka();
        zivali[62] = new Tretja.Macka();
        zivali[63] = new Tretja.Macka();
        zivali[64] = new Tretja.Macka();
        zivali[65] = new Tretja.Macka();
        zivali[66] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[67] = new Tretja.Macka();
        zivali[68] = new Tretja.RodovniskiPes("aabb", null, null);
        zivali[69] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[70] = new Tretja.Pes();
        zivali[71] = new Tretja.Macka();
        zivali[72] = new Tretja.Pes();
        zivali[73] = new Tretja.Pes();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
