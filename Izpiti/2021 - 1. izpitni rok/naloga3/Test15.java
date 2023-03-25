
public class Test15 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 227);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 867);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 506);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 260);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 971);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 388);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 890);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 881);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 856);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 972);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 215);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 315);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 886);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 918);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 223);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 177);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 861);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 967);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 146);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 84);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 418);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 886);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 729);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 532);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 381);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 609);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 3);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 597);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 272);
        Tretja.Opravilo o29 = new Tretja.Opravilo("o29", 497);
        Tretja.Opravilo o30 = new Tretja.Opravilo("o30", 404);
        Tretja.Opravilo o31 = new Tretja.Opravilo("o31", 142);
        Tretja.Opravilo o32 = new Tretja.Opravilo("o32", 170);
        Tretja.Opravilo o33 = new Tretja.Opravilo("o33", 374);
        Tretja.Opravilo o34 = new Tretja.Opravilo("o34", 111);
        Tretja.Opravilo o35 = new Tretja.Opravilo("o35", 302);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o34, o13});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o6, o33, o23, o14, o11, o15, o13, o4, o19, o8, o29});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o7, o12, o5});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o31, o19, o35, o17, o32, o8, o6, o25, o34, o3, o14, o7});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o30});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o4, o9, o12, o20, o15, o24, o29, o6, o27, o31, o21});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
        System.out.println(p5.zahtevnost());
    }
}
