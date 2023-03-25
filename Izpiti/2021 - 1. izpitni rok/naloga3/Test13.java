
public class Test13 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 366);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 550);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 483);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 598);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 216);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 546);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 200);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 255);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 327);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 904);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 131);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 325);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 259);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 935);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 152);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 166);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 588);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 982);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 320);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 241);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 171);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 417);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 603);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 179);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 531);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 745);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 881);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 135);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 21);
        Tretja.Opravilo o29 = new Tretja.Opravilo("o29", 875);
        Tretja.Opravilo o30 = new Tretja.Opravilo("o30", 68);
        Tretja.Opravilo o31 = new Tretja.Opravilo("o31", 319);
        Tretja.Opravilo o32 = new Tretja.Opravilo("o32", 661);
        Tretja.Opravilo o33 = new Tretja.Opravilo("o33", 769);
        Tretja.Opravilo o34 = new Tretja.Opravilo("o34", 153);
        Tretja.Opravilo o35 = new Tretja.Opravilo("o35", 371);
        Tretja.Opravilo o36 = new Tretja.Opravilo("o36", 319);
        Tretja.Opravilo o37 = new Tretja.Opravilo("o37", 338);
        Tretja.Opravilo o38 = new Tretja.Opravilo("o38", 92);
        Tretja.Opravilo o39 = new Tretja.Opravilo("o39", 634);
        Tretja.Opravilo o40 = new Tretja.Opravilo("o40", 459);
        Tretja.Opravilo o41 = new Tretja.Opravilo("o41", 194);
        Tretja.Opravilo o42 = new Tretja.Opravilo("o42", 17);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o28});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o37, o10, o31, o38, o25, o21, o4, o22, o32, o30, o34, o27});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o41, o22, o20, o26, o37, o5, o27, o39, o11, o4, o30, o38});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o32, o12, o33, o30, o7, o15, o17, o28, o40, o36, o34});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o29, o14, o16, o39, o8, o22});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
    }
}
