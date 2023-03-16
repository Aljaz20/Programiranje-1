
public class Test31 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 5695, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 6413, null);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 5159, v000);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 5730, v002);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 2827, v000);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 4425, v003);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 4217, v005);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 6504, null);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 2260, v002);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 8188, v000);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 2568, v003);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 1161, null);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 1555, v005);
        Tretja.Vodja v013 = new Tretja.Vodja("v013", 7114, v001);
        Tretja.Vodja v014 = new Tretja.Vodja("v014", 2279, null);
        Tretja.Vodja v015 = new Tretja.Vodja("v015", 1386, v006);
        Tretja.Vodja v016 = new Tretja.Vodja("v016", 1443, v001);
        Tretja.Vodja v017 = new Tretja.Vodja("v017", 8738, v006);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012, v013, v014, v015, v016, v017};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
