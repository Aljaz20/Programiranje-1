
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(9, 29, "bbba"),
            new Cetrta.Prostor(4, 11, "bbba"),
            new Cetrta.Prostor(4, 37, "bbba"),
            new Cetrta.Prostor(4, 5, "bbba"),
            new Cetrta.Prostor(9, 75, "bbba"),
            new Cetrta.Prostor(1, 6, "bbba"),
            new Cetrta.Prostor(1, 75, "bbba"),
            new Cetrta.Prostor(3, 89, "bbba"),
            new Cetrta.Prostor(6, 61, "bbba"),
            new Cetrta.Prostor(6, 86, "bbba"),
            new Cetrta.Prostor(9, 49, "bbba"),
            new Cetrta.Prostor(1, 52, "bbba"),
            new Cetrta.Prostor(1, 100, "bbba"),
            new Cetrta.Prostor(7, 72, "bbba"),
            new Cetrta.Prostor(5, 82, "bbba"),
            new Cetrta.Prostor(3, 46, "bbba"),
            new Cetrta.Prostor(7, 22, "bbba"),
            new Cetrta.Prostor(3, 15, "bbba"),
            new Cetrta.Prostor(9, 15, "bbba"),
            new Cetrta.Prostor(2, 13, "bbba"),
            new Cetrta.Prostor(8, 94, "bbba"),
            new Cetrta.Prostor(4, 31, "bbba"),
            new Cetrta.Prostor(5, 69, "bbba"),
            new Cetrta.Prostor(2, 55, "bbba"),
            new Cetrta.Prostor(9, 100, "bbba"),
            new Cetrta.Prostor(6, 28, "bbba"),
            new Cetrta.Prostor(9, 80, "bbba"),
            new Cetrta.Prostor(2, 26, "bbba"),
            new Cetrta.Prostor(3, 65, "bbba"),
            new Cetrta.Prostor(8, 49, "bbba"),
            new Cetrta.Prostor(8, 35, "bbba"),
            new Cetrta.Prostor(6, 48, "bbba"),
            new Cetrta.Prostor(2, 54, "bbba"),
            new Cetrta.Prostor(4, 100, "bbba"),
            new Cetrta.Prostor(8, 69, "bbba"),
            new Cetrta.Prostor(7, 92, "bbba"),
            new Cetrta.Prostor(7, 53, "bbba"),
            new Cetrta.Prostor(8, 41, "bbba"),
            new Cetrta.Prostor(1, 20, "bbba"),
            new Cetrta.Prostor(1, 90, "bbba"),
            new Cetrta.Prostor(7, 39, "bbba"),
            new Cetrta.Prostor(1, 14, "bbba"),
            new Cetrta.Prostor(8, 18, "bbba"),
            new Cetrta.Prostor(3, 4, "bbba"),
            new Cetrta.Prostor(4, 17, "bbba"),
            new Cetrta.Prostor(8, 40, "bbba"),
            new Cetrta.Prostor(6, 49, "bbba"),
            new Cetrta.Prostor(7, 62, "bbba"),
            new Cetrta.Prostor(5, 39, "bbba"),
            new Cetrta.Prostor(2, 72, "bbba"),
            new Cetrta.Prostor(3, 28, "bbba"),
            new Cetrta.Prostor(8, 58, "bbba"),
            new Cetrta.Prostor(7, 28, "bbba"),
            new Cetrta.Prostor(1, 50, "bbba"),
            new Cetrta.Prostor(1, 33, "bbba"),
            new Cetrta.Prostor(4, 7, "bbba"),
            new Cetrta.Prostor(2, 81, "bbba"),
            new Cetrta.Prostor(5, 45, "bbba"),
            new Cetrta.Prostor(9, 70, "bbba"),
            new Cetrta.Prostor(6, 38, "bbba"),
            new Cetrta.Prostor(5, 93, "bbba"),
            new Cetrta.Prostor(6, 46, "bbba"),
            new Cetrta.Prostor(9, 51, "bbba"),
            new Cetrta.Prostor(7, 16, "bbba"),
            new Cetrta.Prostor(1, 5, "bbba"),
            new Cetrta.Prostor(1, 3, "bbba"),
            new Cetrta.Prostor(6, 81, "bbba"),
            new Cetrta.Prostor(2, 90, "bbba"),
            new Cetrta.Prostor(7, 54, "bbba"),
            new Cetrta.Prostor(5, 97, "bbba"),
            new Cetrta.Prostor(8, 2, "bbba"),
            new Cetrta.Prostor(5, 28, "bbba"),
            new Cetrta.Prostor(9, 56, "bbba"),
            new Cetrta.Prostor(9, 81, "bbba"),
            new Cetrta.Prostor(4, 63, "bbba"),
            new Cetrta.Prostor(6, 16, "bbba"),
            new Cetrta.Prostor(3, 81, "bbba"),
            new Cetrta.Prostor(2, 61, "bbba"),
            new Cetrta.Prostor(1, 83, "bbba"),
            new Cetrta.Prostor(5, 40, "bbba"),
            new Cetrta.Prostor(1, 44, "bbba"),
            new Cetrta.Prostor(9, 31, "bbba"),
            new Cetrta.Prostor(4, 20, "bbba"),
            new Cetrta.Prostor(4, 15, "bbba"),
            new Cetrta.Prostor(6, 12, "bbba"),
            new Cetrta.Prostor(4, 32, "bbba"),
            new Cetrta.Prostor(2, 9, "bbba"),
            new Cetrta.Prostor(4, 22, "bbba"),
            new Cetrta.Prostor(5, 27, "bbba"),
            new Cetrta.Prostor(1, 94, "bbba"),
            new Cetrta.Prostor(5, 6, "bbba"),
            new Cetrta.Prostor(7, 42, "bbba"),
            new Cetrta.Prostor(3, 32, "bbba"),
            new Cetrta.Prostor(5, 5, "bbba"),
            new Cetrta.Prostor(8, 20, "bbba"),
            new Cetrta.Prostor(1, 24, "bbba"),
            new Cetrta.Prostor(8, 26, "bbba"),
            new Cetrta.Prostor(4, 75, "bbba"),
            new Cetrta.Prostor(5, 86, "bbba")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}