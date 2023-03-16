
public class Test18 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[19];
        zivali[0] = new Tretja.Pes();
        zivali[1] = new Tretja.Macka();
        zivali[2] = new Tretja.Macka();
        zivali[3] = new Tretja.Pes();
        zivali[4] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[5] = new Tretja.Pes();
        zivali[6] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[7] = new Tretja.Macka();
        zivali[8] = new Tretja.Pes();
        zivali[9] = new Tretja.Macka();
        zivali[10] = new Tretja.Pes();
        zivali[11] = new Tretja.Macka();
        zivali[12] = new Tretja.RodovniskiPes("bbabb", null, null);
        zivali[13] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[14] = new Tretja.RodovniskiPes("abab", null, null);
        zivali[15] = new Tretja.Pes();
        zivali[16] = new Tretja.Pes();
        zivali[17] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[18] = new Tretja.RodovniskiPes("ab", null, null);

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
