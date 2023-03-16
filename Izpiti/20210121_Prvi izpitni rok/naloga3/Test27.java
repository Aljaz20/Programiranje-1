
public class Test27 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 416);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 284);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 9);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 115);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 454);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 251);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 333);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 311);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 142);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 358);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 344);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 289);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 240);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 248);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 243);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 119);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 415);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 50);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 391);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 118);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 250);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 283);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 90);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 360);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 178);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 391);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o24});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o15, o0, o25, o16});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o1, o8, o15});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o6, o8, o18});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o25});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Nina Lipnik", 225),
            new Tretja.Delavec("Eva Bevk", 811),
            new Tretja.Delavec("Tilen Bevk", 775),
            new Tretja.Delavec("Vesna Debeljak", 983),
            new Tretja.Delavec("Vinko Vidic", 414),
            new Tretja.Delavec("Zinka Oblak", 898),
            new Tretja.Delavec("Andrej Cevc", 230),
            new Tretja.Delavec("Ivan Jerman", 991),
            new Tretja.Delavec("Tanja Jerman", 681),
            new Tretja.Delavec("Gregor Antolin", 104),
            new Tretja.Delavec("Maja Mihevc", 199),
            new Tretja.Delavec("Gabrijela Klasinc", 700),
            new Tretja.Delavec("Zinka Tanko", 169),
            new Tretja.Delavec("Emil Antolin", 199),
            new Tretja.Delavec("Hinko Cevc", 245),
            new Tretja.Delavec("Dejan Tanko", 324),
            new Tretja.Delavec("Nina Golob", 884),
            new Tretja.Delavec("Peter Han", 223),
            new Tretja.Delavec("Jana Furlan", 472),
            new Tretja.Delavec("Matija Golob", 558),
            new Tretja.Delavec("Franci Pirc", 457),
            new Tretja.Delavec("Emil Novak", 95),
            new Tretja.Delavec("Cene Oblak", 828),
            new Tretja.Delavec("Oton Ravnikar", 720),
            new Tretja.Delavec("Gregor Lipnik", 468),
            new Tretja.Delavec("Zinka Antolin", 395),
            new Tretja.Delavec("Roman Ivnik", 285),
            new Tretja.Delavec("Peter Klasinc", 496),
            new Tretja.Delavec("Olga Ermenc", 879),
            new Tretja.Delavec("Eva Vidic", 200),
            new Tretja.Delavec("Maja Klasinc", 78),
            new Tretja.Delavec("Urban Furlan", 739),
            new Tretja.Delavec("Lara Sovinc", 565),
            new Tretja.Delavec("Nace Ivnik", 63),
            new Tretja.Delavec("Karla Jerman", 642),
            new Tretja.Delavec("Leon Ivnik", 980),
            new Tretja.Delavec("Cvetka Debeljak", 31),
            new Tretja.Delavec("Urban Cevc", 538),
            new Tretja.Delavec("Franci Oblak", 857),
            new Tretja.Delavec("Gabrijela Antolin", 997),
            new Tretja.Delavec("Petra Jerman", 447),
            new Tretja.Delavec("Tilen Lipnik", 511),
            new Tretja.Delavec("Hilda Antolin", 512),
            new Tretja.Delavec("Cvetka Klasinc", 494),
            new Tretja.Delavec("Lara Oblak", 118),
            new Tretja.Delavec("Cene Tanko", 350),
            new Tretja.Delavec("Francka Lipnik", 777),
            new Tretja.Delavec("Peter Vidic", 866),
            new Tretja.Delavec("Roman Debeljak", 360),
            new Tretja.Delavec("Tanja Golob", 161),
            new Tretja.Delavec("Nina Ravnikar", 248),
            new Tretja.Delavec("Oton Ermenc", 692),
            new Tretja.Delavec("Vinko Sovinc", 216),
            new Tretja.Delavec("Oton Ivnik", 86),
            new Tretja.Delavec("Jana Furlan", 993),
            new Tretja.Delavec("Hinko Sovinc", 882),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3, p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2}));
    }
}
