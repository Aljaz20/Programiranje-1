
public class Test20 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 7236, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 2938, null);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 2718, v001);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 5383, v000);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 5734, null);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 7603, v003);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 8708, v000);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 9530, v006);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 8504, v006);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 5691, v000);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 5839, v006);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 6119, v010);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 2455, v004);
        Tretja.Vodja v013 = new Tretja.Vodja("v013", 5321, v005);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012, v013};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
