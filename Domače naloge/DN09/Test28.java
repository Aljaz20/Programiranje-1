
public class Test28 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lev lev = new Lev();
        Medved medved = new Medved();
        Zelva zelva = new Zelva();
        Kaca kaca = new Kaca();

        tiger.seHrani();
        zelva.seHrani();
        medved.seHrani();
        medved.seHrani();
        medved.seHrani();
        zelva.seHrani();
        zelva.seHrani();
        kaca.seHrani();
        lev.seHrani();
        tiger.seHrani();
        lev.seHrani();
        lev.seHrani();
        lev.seHrani();
        tiger.seHrani();
        kaca.seHrani();
        lev.seHrani();
        lev.seHrani();
        kaca.seHrani();
        zelva.seHrani();
        zelva.seHrani();
        kaca.seHrani();
        tiger.seHrani();
        tiger.seHrani();
        tiger.seHrani();
        medved.seHrani();
        kaca.seHrani();
        zelva.seHrani();
        kaca.seHrani();
        lev.seHrani();
        medved.seHrani();
        lev.seHrani();
        zelva.seHrani();
        lev.seHrani();
        tiger.seHrani();
        kaca.seHrani();
        lev.seHrani();

        System.out.println(tiger.steviloHranjenj());
        System.out.println(lev.steviloHranjenj());
        System.out.println(medved.steviloHranjenj());
        System.out.println(zelva.steviloHranjenj());
        System.out.println(kaca.steviloHranjenj());

        System.out.println("---");

        tiger.preganja(lev);
        lev.preganja(lev);
        medved.preganja(kaca);
        kaca.preganja(lev);
        lev.preganja(kaca);
        zelva.preganja(kaca);
        lev.preganja(zelva);
        kaca.preganja(lev);
        kaca.preganja(lev);
        tiger.preganja(kaca);
        kaca.preganja(zelva);
        zelva.preganja(kaca);
        medved.preganja(zelva);
        kaca.preganja(tiger);
        lev.preganja(lev);
        tiger.preganja(medved);
        medved.preganja(lev);
        lev.preganja(kaca);
        lev.preganja(zelva);
        kaca.preganja(kaca);
        lev.preganja(kaca);
        medved.preganja(kaca);
        kaca.preganja(zelva);
        lev.preganja(lev);
        zelva.preganja(medved);
        tiger.preganja(zelva);
        lev.preganja(lev);
        tiger.preganja(zelva);
        zelva.preganja(tiger);
        lev.preganja(kaca);
        zelva.preganja(lev);
        zelva.preganja(medved);
        tiger.preganja(zelva);
        kaca.preganja(tiger);
        medved.preganja(medved);
        kaca.preganja(kaca);
        lev.preganja(kaca);
        kaca.preganja(medved);
        kaca.preganja(medved);
        kaca.preganja(zelva);
        lev.preganja(kaca);
        medved.preganja(tiger);
        lev.preganja(medved);
        lev.preganja(medved);

        System.out.println(tiger.steviloPreganjanj(tiger));
        System.out.println(tiger.steviloPreganjanj(lev));
        System.out.println(tiger.steviloPreganjanj(medved));
        System.out.println(tiger.steviloPreganjanj(zelva));
        System.out.println(tiger.steviloPreganjanj(kaca));
        System.out.println(lev.steviloPreganjanj(tiger));
        System.out.println(lev.steviloPreganjanj(lev));
        System.out.println(lev.steviloPreganjanj(medved));
        System.out.println(lev.steviloPreganjanj(zelva));
        System.out.println(lev.steviloPreganjanj(kaca));
        System.out.println(medved.steviloPreganjanj(tiger));
        System.out.println(medved.steviloPreganjanj(lev));
        System.out.println(medved.steviloPreganjanj(medved));
        System.out.println(medved.steviloPreganjanj(zelva));
        System.out.println(medved.steviloPreganjanj(kaca));
        System.out.println(zelva.steviloPreganjanj(tiger));
        System.out.println(zelva.steviloPreganjanj(lev));
        System.out.println(zelva.steviloPreganjanj(medved));
        System.out.println(zelva.steviloPreganjanj(zelva));
        System.out.println(zelva.steviloPreganjanj(kaca));
        System.out.println(kaca.steviloPreganjanj(tiger));
        System.out.println(kaca.steviloPreganjanj(lev));
        System.out.println(kaca.steviloPreganjanj(medved));
        System.out.println(kaca.steviloPreganjanj(zelva));
        System.out.println(kaca.steviloPreganjanj(kaca));
    }
}
