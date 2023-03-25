
public class Test23 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 79);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 385);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 344);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 318);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 135);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 161);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 468);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 252);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 107);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 339);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 333);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 33);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 346);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 152);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 219);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 30);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 345);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 154);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o8, o13, o10});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o8});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o6, o11, o2});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o14, o9, o1});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o12});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o13, o6});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o9, o11, o8});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o14, o12, o6});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o11, o7});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o13});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o5, o8});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o13, o3});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Darja Bevk", 801),
            new Tretja.Delavec("Ivan Lipnik", 230),
            new Tretja.Delavec("Gregor Lipnik", 312),
            new Tretja.Delavec("Cvetka Oblak", 2),
            new Tretja.Delavec("Romana Sovinc", 927),
            new Tretja.Delavec("Tilen Ravnikar", 131),
            new Tretja.Delavec("Nace Cevc", 699),
            new Tretja.Delavec("Peter Golob", 977),
            new Tretja.Delavec("Maja Cevc", 396),
            new Tretja.Delavec("Nace Furlan", 439),
            new Tretja.Delavec("Peter Ivnik", 109),
            new Tretja.Delavec("Hilda Mihevc", 679),
            new Tretja.Delavec("Petra Ravnikar", 187),
            new Tretja.Delavec("Vesna Mihevc", 859),
            new Tretja.Delavec("Francka Antolin", 779),
            new Tretja.Delavec("Vesna Antolin", 849),
            new Tretja.Delavec("Branka Golob", 448),
            new Tretja.Delavec("Matija Ivnik", 347),
            new Tretja.Delavec("Vesna Antolin", 111),
            new Tretja.Delavec("Peter Novak", 577),
            new Tretja.Delavec("Emil Sovinc", 866),
            new Tretja.Delavec("Hinko Mihevc", 801),
            new Tretja.Delavec("Tilen Lipnik", 742),
            new Tretja.Delavec("Zoran Golob", 846),
            new Tretja.Delavec("Francka Han", 798),
            new Tretja.Delavec("Franci Lipnik", 532),
            new Tretja.Delavec("Emil Vidic", 649),
            new Tretja.Delavec("Emil Furlan", 686),
            new Tretja.Delavec("Emil Debeljak", 320),
            new Tretja.Delavec("Tilen Novak", 880),
            new Tretja.Delavec("Tanja Pirc", 183),
            new Tretja.Delavec("Urban Vidic", 838),
            new Tretja.Delavec("Ula Urlep", 444),
            new Tretja.Delavec("Cene Lipnik", 748),
            new Tretja.Delavec("Hinko Lipnik", 632),
            new Tretja.Delavec("Dejan Klasinc", 41),
            new Tretja.Delavec("Franci Golob", 68),
            new Tretja.Delavec("Roman Cevc", 908),
            new Tretja.Delavec("Cene Lipnik", 2),
            new Tretja.Delavec("Romana Oblak", 330),
            new Tretja.Delavec("Branka Ermenc", 507),
            new Tretja.Delavec("Oton Antolin", 751),
            new Tretja.Delavec("Nace Ravnikar", 747),
            new Tretja.Delavec("Janez Zorman", 358),
            new Tretja.Delavec("Bojan Debeljak", 497),
            new Tretja.Delavec("Darja Debeljak", 215),
            new Tretja.Delavec("Nina Debeljak", 808),
            new Tretja.Delavec("Darja Han", 538),
            new Tretja.Delavec("Francka Klasinc", 337),
            new Tretja.Delavec("Karla Furlan", 363),
            new Tretja.Delavec("Tanja Bevk", 120),
            new Tretja.Delavec("Franci Bevk", 448),
            new Tretja.Delavec("Cene Tanko", 16),
            new Tretja.Delavec("Olga Ermenc", 786),
            new Tretja.Delavec("Ana Jerman", 218),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p7, p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p9, p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p8, p7, p5, p6}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0, p9, p5, p3, p11}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p11, p6, p9, p5, p7}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p8, p4, p9, p7}));
    }
}
