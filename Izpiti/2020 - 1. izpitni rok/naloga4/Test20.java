
public class Test20 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        Cetrta.Ovojnik ovojnik = new Cetrta.Ovojnik(new boolean[][]{
            {T, T, T, T, T},
            {T, T, T, F, T},
            {T, T, F, T, T},
            {F, T, T, T, T},
            {T, T, F, F, T},
        });
        System.out.println(ovojnik.enice());
    }
}
