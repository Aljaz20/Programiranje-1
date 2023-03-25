
public class Test03 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 10);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 409);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 892);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 231);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 801);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 745);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 580);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 740);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 437);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 891);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 373);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 109);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 217);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 271);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 875);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 192);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 576);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 778);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 123);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 562);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 198);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 104);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 760);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 569);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 406);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 238);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 585);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 410);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 497);
        Tretja.Opravilo o29 = new Tretja.Opravilo("o29", 401);
        Tretja.Opravilo o30 = new Tretja.Opravilo("o30", 108);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o13, o10, o28, o19, o9, o20, o26, o25, o6, o7});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o10, o28, o23, o0, o21, o3, o16, o24, o13});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o18, o9, o19, o15, o24});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o13, o7, o17, o15, o4, o25, o3, o20});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o16, o11});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o11, o29, o1, o28, o30, o14, o23});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
        System.out.println(p5.zahtevnost());
    }
}
