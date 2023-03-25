
public class Test16 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 909);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 215);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 292);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 406);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 295);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 638);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 908);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 3);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 549);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 713);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 874);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 658);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 980);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 415);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 345);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 835);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 282);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 800);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 833);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 643);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 327);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 396);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 795);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 43);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 38);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 776);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 369);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 245);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 665);
        Tretja.Opravilo o29 = new Tretja.Opravilo("o29", 762);
        Tretja.Opravilo o30 = new Tretja.Opravilo("o30", 284);
        Tretja.Opravilo o31 = new Tretja.Opravilo("o31", 505);
        Tretja.Opravilo o32 = new Tretja.Opravilo("o32", 183);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o15, o24, o1, o11, o18, o9, o27, o4, o13, o3});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o2, o1, o10, o17});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o16, o27, o7, o11, o12});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o0, o23, o22, o24, o5, o2, o7, o4, o19, o17, o8});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o29, o16, o26});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
    }
}
