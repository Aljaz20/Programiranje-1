
public class Test32 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 3542, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 9578, v000);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 3444, v000);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 1975, v001);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 2461, v001);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 9505, v003);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 8807, v000);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 9077, v002);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 1347, v006);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 9520, v006);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 8178, v009);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 2839, v004);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 8923, v000);
        Tretja.Vodja v013 = new Tretja.Vodja("v013", 8596, v009);
        Tretja.Vodja v014 = new Tretja.Vodja("v014", 2601, v002);
        Tretja.Vodja v015 = new Tretja.Vodja("v015", 1334, v000);
        Tretja.Vodja v016 = new Tretja.Vodja("v016", 5276, v000);
        Tretja.Vodja v017 = new Tretja.Vodja("v017", 3961, v006);
        Tretja.Vodja v018 = new Tretja.Vodja("v018", 1944, v016);
        Tretja.Vodja v019 = new Tretja.Vodja("v019", 9766, v000);
        Tretja.Vodja v020 = new Tretja.Vodja("v020", 6691, v002);
        Tretja.Vodja v021 = new Tretja.Vodja("v021", 4937, v009);
        Tretja.Vodja v022 = new Tretja.Vodja("v022", 6634, v021);
        Tretja.Vodja v023 = new Tretja.Vodja("v023", 3130, v021);
        Tretja.Vodja v024 = new Tretja.Vodja("v024", 3594, v021);
        Tretja.Vodja v025 = new Tretja.Vodja("v025", 9488, v003);
        Tretja.Vodja v026 = new Tretja.Vodja("v026", 8992, v015);
        Tretja.Vodja v027 = new Tretja.Vodja("v027", 4090, null);
        Tretja.Vodja v028 = new Tretja.Vodja("v028", 9899, v014);
        Tretja.Vodja v029 = new Tretja.Vodja("v029", 4200, v016);
        Tretja.Vodja v030 = new Tretja.Vodja("v030", 8209, null);
        Tretja.Vodja v031 = new Tretja.Vodja("v031", 2270, v001);
        Tretja.Vodja v032 = new Tretja.Vodja("v032", 2540, v002);
        Tretja.Vodja v033 = new Tretja.Vodja("v033", 2898, v027);
        Tretja.Vodja v034 = new Tretja.Vodja("v034", 4887, v004);
        Tretja.Vodja v035 = new Tretja.Vodja("v035", 7628, null);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012, v013, v014, v015, v016, v017, v018, v019, v020, v021, v022, v023, v024, v025, v026, v027, v028, v029, v030, v031, v032, v033, v034, v035};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
