
public class Test35 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        Cetrta.Ovojnik ovojnik = new Cetrta.Ovojnik(new boolean[][]{
            {F, F, F, T, F, F, T, F, F},
            {F, T, F, T, F, F, F, F, F},
            {F, T, F, F, T, T, F, F, T},
            {F, T, T, F, F, T, T, F, T},
            {F, F, F, T, F, F, T, T, F},
            {F, T, F, F, F, F, F, T, T},
            {F, F, F, F, F, F, F, T, T},
            {F, F, T, F, F, T, T, T, T},
            {T, T, F, T, F, F, F, F, F},
        });
        System.out.println(ovojnik.enice());
    }
}
