
public class Test22 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[22];
        zivali[0] = new Tretja.Pes();
        zivali[1] = new Tretja.Pes();
        zivali[2] = new Tretja.RodovniskiPes("abab", null, null);
        zivali[3] = new Tretja.Macka();
        zivali[4] = new Tretja.RodovniskiPes("babbb", null, null);
        zivali[5] = new Tretja.Pes();
        zivali[6] = new Tretja.RodovniskiPes("abab", null, null);
        zivali[7] = new Tretja.Macka();
        zivali[8] = new Tretja.Pes();
        zivali[9] = new Tretja.RodovniskiPes("abab", null, null);
        zivali[10] = new Tretja.Macka();
        zivali[11] = new Tretja.Pes();
        zivali[12] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[13] = new Tretja.RodovniskiPes("babbb", null, null);
        zivali[14] = new Tretja.Macka();
        zivali[15] = new Tretja.Macka();
        zivali[16] = new Tretja.Macka();
        zivali[17] = new Tretja.Macka();
        zivali[18] = new Tretja.RodovniskiPes("abbbb", null, null);
        zivali[19] = new Tretja.RodovniskiPes("abab", null, null);
        zivali[20] = new Tretja.Macka();
        zivali[21] = new Tretja.Pes();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
