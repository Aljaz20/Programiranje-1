
public class Test25 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 480);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 270);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 134);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 248);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 383);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 381);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 305);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 436);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 399);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 231);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 150);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 11);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 280);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 413);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 64);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 365);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 99);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 273);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 397);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 83);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 331);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o1, o14});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o20, o0});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o13});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o1});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o0, o17});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o2, o15, o14});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o3});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o5});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o12, o11, o10});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o16, o17, o19, o20});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o1, o5, o11});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o16, o19, o12, o17});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o6});
        Tretja.Projekt p13 = new Tretja.Projekt("p13", new Tretja.Opravilo[]{o18, o9, o6});
        Tretja.Projekt p14 = new Tretja.Projekt("p14", new Tretja.Opravilo[]{o6, o2, o16});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Nace Han", 120),
            new Tretja.Delavec("Andrej Antolin", 925),
            new Tretja.Delavec("Janez Urlep", 302),
            new Tretja.Delavec("Francka Oblak", 242),
            new Tretja.Delavec("Matija Novak", 967),
            new Tretja.Delavec("Peter Ravnikar", 526),
            new Tretja.Delavec("Bojan Klasinc", 327),
            new Tretja.Delavec("Nace Furlan", 873),
            new Tretja.Delavec("Peter Ivnik", 167),
            new Tretja.Delavec("Roman Pirc", 348),
            new Tretja.Delavec("Hinko Vidic", 342),
            new Tretja.Delavec("Emil Klasinc", 73),
            new Tretja.Delavec("Bojan Mihevc", 534),
            new Tretja.Delavec("Cene Novak", 915),
            new Tretja.Delavec("Francka Golob", 552),
            new Tretja.Delavec("Branka Oblak", 425),
            new Tretja.Delavec("Nina Ivnik", 189),
            new Tretja.Delavec("Andrej Tanko", 880),
            new Tretja.Delavec("Cene Vidic", 779),
            new Tretja.Delavec("Francka Urlep", 227),
            new Tretja.Delavec("Ula Han", 743),
            new Tretja.Delavec("Hilda Antolin", 501),
            new Tretja.Delavec("Hilda Vidic", 255),
            new Tretja.Delavec("Franci Ermenc", 116),
            new Tretja.Delavec("Gabrijela Debeljak", 852),
            new Tretja.Delavec("Simon Debeljak", 276),
            new Tretja.Delavec("Branka Mihevc", 542),
            new Tretja.Delavec("Tanja Sovinc", 290),
            new Tretja.Delavec("Zoran Sovinc", 482),
            new Tretja.Delavec("Andrej Vidic", 422),
            new Tretja.Delavec("Vesna Pirc", 513),
            new Tretja.Delavec("Andrej Novak", 726),
            new Tretja.Delavec("Hilda Mihevc", 785),
            new Tretja.Delavec("Branka Mihevc", 611),
            new Tretja.Delavec("Olga Golob", 350),
            new Tretja.Delavec("Oton Novak", 265),
            new Tretja.Delavec("Ana Sovinc", 216),
            new Tretja.Delavec("Andrej Mihevc", 802),
            new Tretja.Delavec("Branka Urlep", 716),
            new Tretja.Delavec("Nina Ravnikar", 685),
            new Tretja.Delavec("Branka Cevc", 913),
            new Tretja.Delavec("Maja Cevc", 230),
            new Tretja.Delavec("Branka Ermenc", 745),
            new Tretja.Delavec("Iva Cevc", 806),
            new Tretja.Delavec("Hilda Vidic", 30),
            new Tretja.Delavec("Peter Mihevc", 343),
            new Tretja.Delavec("Francka Lipnik", 630),
            new Tretja.Delavec("Simon Ravnikar", 817),
            new Tretja.Delavec("Sonja Klasinc", 874),
            new Tretja.Delavec("Tanja Ermenc", 217),
            new Tretja.Delavec("Branka Han", 497),
            new Tretja.Delavec("Romana Han", 531),
            new Tretja.Delavec("Cene Oblak", 606),
            new Tretja.Delavec("Maja Lipnik", 747),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3, p10, p7}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p1, p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0, p12, p7, p4, p2, p10}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p6, p8}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p14, p10, p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p4, p10}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p11, p1, p9, p12, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p12, p11, p13, p8, p3, p1, p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p7, p8, p4, p6, p10, p11, p12}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p12}));
    }
}
