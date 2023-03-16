
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test13 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        List<Cetrta.Celica> celice = new ArrayList<>(Arrays.asList(
            new Cetrta.Celica(4, 10),
            new Cetrta.Celica(8, 11),
            new Cetrta.Celica(1, 1),
            new Cetrta.Celica(6, 6),
            new Cetrta.Celica(5, 4),
            new Cetrta.Celica(10, 5),
            new Cetrta.Celica(5, 6),
            new Cetrta.Celica(10, 12),
            new Cetrta.Celica(6, 5),
            new Cetrta.Celica(8, 0),
            new Cetrta.Celica(12, 1),
            new Cetrta.Celica(6, 7),
            new Cetrta.Celica(9, 6),
            new Cetrta.Celica(4, 9),
            new Cetrta.Celica(7, 9),
            new Cetrta.Celica(6, 11),
            new Cetrta.Celica(10, 0),
            new Cetrta.Celica(10, 8),
            new Cetrta.Celica(7, 12),
            new Cetrta.Celica(0, 5),
            new Cetrta.Celica(10, 7),
            new Cetrta.Celica(11, 12),
            new Cetrta.Celica(1, 10),
            new Cetrta.Celica(7, 3),
            new Cetrta.Celica(2, 8),
            new Cetrta.Celica(1, 7),
            new Cetrta.Celica(11, 9),
            new Cetrta.Celica(9, 12),
            new Cetrta.Celica(4, 7),
            new Cetrta.Celica(0, 4),
            new Cetrta.Celica(1, 4),
            new Cetrta.Celica(3, 10),
            new Cetrta.Celica(1, 3),
            new Cetrta.Celica(4, 6),
            new Cetrta.Celica(12, 3),
            new Cetrta.Celica(3, 12),
            new Cetrta.Celica(12, 8),
            new Cetrta.Celica(11, 3),
            new Cetrta.Celica(5, 12),
            new Cetrta.Celica(11, 0),
            new Cetrta.Celica(7, 8),
            new Cetrta.Celica(3, 7)
        ));
        celice.sort(null);
        System.out.println(celice);
    }
}
