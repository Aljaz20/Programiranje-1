
public class Test11 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 180);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 228);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 191);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 573);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 542);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 761);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 770);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 568);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 879);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 102);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 516);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 205);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 372);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 243);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 766);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 940);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 492);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 676);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 170);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 794);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 506);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 538);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 874);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 726);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 506);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 426);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 789);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 409);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 440);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o5, o4, o19, o8});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o8});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o7, o15, o18, o16, o20, o9, o27, o3, o17});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o17, o26, o21, o23, o15, o14, o8, o4});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o10, o2});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o14, o26, o13, o21, o5, o19});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o21, o3, o4, o0, o5});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o28, o1, o20, o23, o7, o13, o0, o19});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o8, o18, o27, o9, o13, o16});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o28, o7, o25, o19});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o1, o23});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o23, o19, o16});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o18});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
        System.out.println(p5.zahtevnost());
        System.out.println(p6.zahtevnost());
        System.out.println(p7.zahtevnost());
        System.out.println(p8.zahtevnost());
        System.out.println(p9.zahtevnost());
        System.out.println(p10.zahtevnost());
        System.out.println(p11.zahtevnost());
        System.out.println(p12.zahtevnost());
    }
}
