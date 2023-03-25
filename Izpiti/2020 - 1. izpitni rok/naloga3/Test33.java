
public class Test33 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 6614, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 4454, null);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 6470, null);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 6607, null);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 8142, v002);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 2952, v004);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 6765, v000);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 3517, v001);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 6022, v007);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 4589, v007);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 8280, v009);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 5264, v003);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 1586, v000);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
