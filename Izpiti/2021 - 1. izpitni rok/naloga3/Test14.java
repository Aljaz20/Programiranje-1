
public class Test14 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 654);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 358);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 65);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 984);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 963);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 34);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 71);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 401);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 136);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 140);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 519);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 851);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 280);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 139);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 662);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 715);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 755);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 815);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 888);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 992);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 945);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 477);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 292);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 739);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 860);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 707);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 671);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o16, o15, o18});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o11, o13});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o3, o25, o1, o12, o24, o16, o0, o8});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o20, o7, o18, o12, o5});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o16, o2, o22, o17, o8, o19, o7});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o6, o19, o17, o16, o9, o7});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o11, o4, o8, o24});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
        System.out.println(p5.zahtevnost());
        System.out.println(p6.zahtevnost());
    }
}
