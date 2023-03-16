
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test06 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        List<Cetrta.Celica> celice = new ArrayList<>(Arrays.asList(
            new Cetrta.Celica(6, 3),
            new Cetrta.Celica(5, 3),
            new Cetrta.Celica(9, 8),
            new Cetrta.Celica(3, 4),
            new Cetrta.Celica(5, 0),
            new Cetrta.Celica(5, 2),
            new Cetrta.Celica(9, 3),
            new Cetrta.Celica(8, 0),
            new Cetrta.Celica(4, 1),
            new Cetrta.Celica(10, 5),
            new Cetrta.Celica(0, 5),
            new Cetrta.Celica(1, 10),
            new Cetrta.Celica(7, 10),
            new Cetrta.Celica(4, 2),
            new Cetrta.Celica(9, 2),
            new Cetrta.Celica(4, 0),
            new Cetrta.Celica(7, 5),
            new Cetrta.Celica(9, 1),
            new Cetrta.Celica(6, 7),
            new Cetrta.Celica(8, 8),
            new Cetrta.Celica(7, 2),
            new Cetrta.Celica(0, 3),
            new Cetrta.Celica(1, 7),
            new Cetrta.Celica(4, 6),
            new Cetrta.Celica(1, 9),
            new Cetrta.Celica(4, 9),
            new Cetrta.Celica(10, 8),
            new Cetrta.Celica(5, 10),
            new Cetrta.Celica(2, 9),
            new Cetrta.Celica(1, 3),
            new Cetrta.Celica(4, 5),
            new Cetrta.Celica(1, 8),
            new Cetrta.Celica(4, 10),
            new Cetrta.Celica(0, 1),
            new Cetrta.Celica(0, 2)
        ));
        celice.sort(null);
        System.out.println(celice);
    }
}
