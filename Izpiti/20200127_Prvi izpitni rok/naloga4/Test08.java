
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test08 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        List<Cetrta.Celica> celice = new ArrayList<>(Arrays.asList(
            new Cetrta.Celica(0, 0),
            new Cetrta.Celica(0, 2)
        ));
        celice.sort(null);
        System.out.println(celice);
    }
}
