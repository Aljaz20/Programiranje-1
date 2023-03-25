
public class Test23 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 1975, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 9858, null);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 2224, null);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 5634, v002);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 6127, v002);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 6883, v000);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 2465, v004);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 7886, v005);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 6618, v004);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 9981, v002);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 6525, v005);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 3796, v001);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 4512, v003);
        Tretja.Vodja v013 = new Tretja.Vodja("v013", 6182, v005);
        Tretja.Vodja v014 = new Tretja.Vodja("v014", 5358, v006);
        Tretja.Vodja v015 = new Tretja.Vodja("v015", 3150, null);
        Tretja.Vodja v016 = new Tretja.Vodja("v016", 5577, v015);
        Tretja.Vodja v017 = new Tretja.Vodja("v017", 4752, v012);
        Tretja.Vodja v018 = new Tretja.Vodja("v018", 4837, null);
        Tretja.Vodja v019 = new Tretja.Vodja("v019", 8890, null);
        Tretja.Vodja v020 = new Tretja.Vodja("v020", 8502, v014);
        Tretja.Vodja v021 = new Tretja.Vodja("v021", 9094, v010);
        Tretja.Vodja v022 = new Tretja.Vodja("v022", 9101, v008);
        Tretja.Vodja v023 = new Tretja.Vodja("v023", 9785, v008);
        Tretja.Vodja v024 = new Tretja.Vodja("v024", 2199, v000);
        Tretja.Vodja v025 = new Tretja.Vodja("v025", 2404, v022);
        Tretja.Vodja v026 = new Tretja.Vodja("v026", 6045, v000);
        Tretja.Vodja v027 = new Tretja.Vodja("v027", 5615, v023);
        Tretja.Vodja v028 = new Tretja.Vodja("v028", 1752, null);
        Tretja.Vodja v029 = new Tretja.Vodja("v029", 4353, v014);
        Tretja.Vodja v030 = new Tretja.Vodja("v030", 9616, v006);
        Tretja.Vodja v031 = new Tretja.Vodja("v031", 8723, v021);
        Tretja.Vodja v032 = new Tretja.Vodja("v032", 9414, v031);
        Tretja.Vodja v033 = new Tretja.Vodja("v033", 2660, v025);
        Tretja.Vodja v034 = new Tretja.Vodja("v034", 5831, v017);
        Tretja.Vodja v035 = new Tretja.Vodja("v035", 1191, v007);
        Tretja.Vodja v036 = new Tretja.Vodja("v036", 1960, v019);
        Tretja.Vodja v037 = new Tretja.Vodja("v037", 8298, v016);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012, v013, v014, v015, v016, v017, v018, v019, v020, v021, v022, v023, v024, v025, v026, v027, v028, v029, v030, v031, v032, v033, v034, v035, v036, v037};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
