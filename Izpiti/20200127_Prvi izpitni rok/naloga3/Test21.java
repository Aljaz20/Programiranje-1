
public class Test21 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 1425, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 4842, v000);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 3239, v001);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 9374, v002);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 6609, v000);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 7686, null);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 5547, v000);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 5418, v002);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 7170, v003);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 1143, v008);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 4917, v006);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 7679, v010);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 8288, null);
        Tretja.Vodja v013 = new Tretja.Vodja("v013", 7873, v011);
        Tretja.Vodja v014 = new Tretja.Vodja("v014", 4964, null);
        Tretja.Vodja v015 = new Tretja.Vodja("v015", 1013, v004);
        Tretja.Vodja v016 = new Tretja.Vodja("v016", 3594, v008);
        Tretja.Vodja v017 = new Tretja.Vodja("v017", 5336, v001);
        Tretja.Vodja v018 = new Tretja.Vodja("v018", 2568, v016);
        Tretja.Vodja v019 = new Tretja.Vodja("v019", 4336, v007);
        Tretja.Vodja v020 = new Tretja.Vodja("v020", 2648, v014);
        Tretja.Vodja v021 = new Tretja.Vodja("v021", 3557, v008);
        Tretja.Vodja v022 = new Tretja.Vodja("v022", 7494, v002);
        Tretja.Vodja v023 = new Tretja.Vodja("v023", 5548, v011);
        Tretja.Vodja v024 = new Tretja.Vodja("v024", 4780, v014);
        Tretja.Vodja v025 = new Tretja.Vodja("v025", 8868, null);
        Tretja.Vodja v026 = new Tretja.Vodja("v026", 1346, v006);
        Tretja.Vodja v027 = new Tretja.Vodja("v027", 7160, v011);
        Tretja.Vodja v028 = new Tretja.Vodja("v028", 2991, v026);
        Tretja.Vodja v029 = new Tretja.Vodja("v029", 8172, v001);
        Tretja.Vodja v030 = new Tretja.Vodja("v030", 3337, v008);
        Tretja.Vodja v031 = new Tretja.Vodja("v031", 6725, v015);
        Tretja.Vodja v032 = new Tretja.Vodja("v032", 1226, v024);
        Tretja.Vodja v033 = new Tretja.Vodja("v033", 6487, v008);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012, v013, v014, v015, v016, v017, v018, v019, v020, v021, v022, v023, v024, v025, v026, v027, v028, v029, v030, v031, v032, v033};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
