
public class Test30 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 364);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 325);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 312);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 347);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 11);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 230);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 328);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 61);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 196);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 281);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 342);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 416);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 322);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 357);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 74);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 150);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 379);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 188);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 194);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 405);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o2, o3});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o12});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o3});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o14, o4, o13});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o14});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o11, o8, o13, o2});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Nina Antolin", 400),
            new Tretja.Delavec("Simon Ermenc", 75),
            new Tretja.Delavec("Eva Ravnikar", 398),
            new Tretja.Delavec("Ula Sovinc", 515),
            new Tretja.Delavec("Gabrijela Zorman", 827),
            new Tretja.Delavec("Maja Ivnik", 232),
            new Tretja.Delavec("Tanja Mihevc", 222),
            new Tretja.Delavec("Andrej Cevc", 363),
            new Tretja.Delavec("Lara Han", 407),
            new Tretja.Delavec("Zoran Cevc", 730),
            new Tretja.Delavec("Tilen Golob", 138),
            new Tretja.Delavec("Darja Golob", 328),
            new Tretja.Delavec("Jana Ravnikar", 716),
            new Tretja.Delavec("Hinko Novak", 318),
            new Tretja.Delavec("Cvetka Oblak", 918),
            new Tretja.Delavec("Andrej Klasinc", 882),
            new Tretja.Delavec("Hinko Antolin", 863),
            new Tretja.Delavec("Eva Ravnikar", 457),
            new Tretja.Delavec("Karla Tanko", 965),
            new Tretja.Delavec("Oton Oblak", 34),
            new Tretja.Delavec("Nina Tanko", 634),
            new Tretja.Delavec("Peter Tanko", 266),
            new Tretja.Delavec("Eva Sovinc", 464),
            new Tretja.Delavec("Ula Cevc", 283),
            new Tretja.Delavec("Gregor Han", 155),
            new Tretja.Delavec("Leon Furlan", 901),
            new Tretja.Delavec("Oton Oblak", 783),
            new Tretja.Delavec("Ula Mihevc", 92),
            new Tretja.Delavec("Urban Han", 697),
            new Tretja.Delavec("Maja Zorman", 78),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p3, p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p5, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p1}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3, p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p5, p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p4, p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0, p3, p1}));
    }
}
