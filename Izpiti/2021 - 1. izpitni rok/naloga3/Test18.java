
public class Test18 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 159);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 254);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 3);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 418);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 312);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 478);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 103);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 10);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 350);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 174);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 461);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 295);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 443);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 372);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 115);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 92);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 206);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 327);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 146);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 8);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 307);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 23);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 200);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 488);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 485);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 103);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 324);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 73);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 463);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o11});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o28, o4});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o4, o15});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o11, o20, o19, o3, o24});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o1, o3});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o7, o27});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o13, o18});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o23});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o3});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Vesna Pirc", 385),
            new Tretja.Delavec("Leon Furlan", 999),
            new Tretja.Delavec("Cene Jerman", 283),
            new Tretja.Delavec("Janez Sovinc", 601),
            new Tretja.Delavec("Franci Debeljak", 733),
            new Tretja.Delavec("Roman Ivnik", 246),
            new Tretja.Delavec("Karel Cevc", 2),
            new Tretja.Delavec("Gregor Pirc", 355),
            new Tretja.Delavec("Jana Golob", 330),
            new Tretja.Delavec("Sonja Jerman", 34),
            new Tretja.Delavec("Bojan Debeljak", 489),
            new Tretja.Delavec("Andrej Ravnikar", 501),
            new Tretja.Delavec("Zinka Urlep", 399),
            new Tretja.Delavec("Matija Novak", 238),
            new Tretja.Delavec("Karla Bevk", 177),
            new Tretja.Delavec("Vinko Antolin", 509),
            new Tretja.Delavec("Ula Lipnik", 517),
            new Tretja.Delavec("Nina Ermenc", 963),
            new Tretja.Delavec("Romana Ivnik", 713),
            new Tretja.Delavec("Jana Lipnik", 289),
            new Tretja.Delavec("Karla Tanko", 290),
            new Tretja.Delavec("Nace Sovinc", 99),
            new Tretja.Delavec("Maja Cevc", 299),
            new Tretja.Delavec("Leon Klasinc", 217),
            new Tretja.Delavec("Dejan Antolin", 650),
            new Tretja.Delavec("Cene Golob", 937),
            new Tretja.Delavec("Urban Vidic", 159),
            new Tretja.Delavec("Tilen Mihevc", 940),
            new Tretja.Delavec("Franci Ermenc", 944),
            new Tretja.Delavec("Nace Sovinc", 534),
            new Tretja.Delavec("Janez Han", 20),
            new Tretja.Delavec("Zoran Golob", 893),
            new Tretja.Delavec("Lara Mihevc", 185),
            new Tretja.Delavec("Ivan Mihevc", 678),
            new Tretja.Delavec("Sonja Ravnikar", 518),
            new Tretja.Delavec("Sonja Debeljak", 745),
            new Tretja.Delavec("Zoran Bevk", 74),
            new Tretja.Delavec("Dejan Oblak", 918),
            new Tretja.Delavec("Eva Bevk", 62),
            new Tretja.Delavec("Nina Mihevc", 50),
            new Tretja.Delavec("Matija Urlep", 983),
            new Tretja.Delavec("Cvetka Debeljak", 854),
            new Tretja.Delavec("Urban Sovinc", 245),
            new Tretja.Delavec("Maja Mihevc", 801),
            new Tretja.Delavec("Leon Oblak", 459),
            new Tretja.Delavec("Ula Lipnik", 570),
            new Tretja.Delavec("Ana Ermenc", 499),
            new Tretja.Delavec("Olga Ivnik", 463),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p8, p0, p6}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3, p2, p4, p7}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p1}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0, p7, p8, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p8, p4, p1, p7}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p6, p8, p0, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p8, p6}));
    }
}
