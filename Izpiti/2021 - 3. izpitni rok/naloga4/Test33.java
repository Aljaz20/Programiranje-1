
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(8, 86, "aab"),
            new Cetrta.Prostor(4, 100, "aaaab"),
            new Cetrta.Prostor(9, 67, "baabb"),
            new Cetrta.Prostor(8, 55, "baabb"),
            new Cetrta.Prostor(2, 80, "aaaab"),
            new Cetrta.Prostor(3, 21, "aaaab"),
            new Cetrta.Prostor(3, 35, "aab"),
            new Cetrta.Prostor(8, 45, "aab"),
            new Cetrta.Prostor(3, 25, "aaaab"),
            new Cetrta.Prostor(3, 79, "baaa"),
            new Cetrta.Prostor(1, 33, "baabb"),
            new Cetrta.Prostor(10, 57, "aab"),
            new Cetrta.Prostor(1, 79, "baabb"),
            new Cetrta.Prostor(5, 41, "baabb"),
            new Cetrta.Prostor(7, 20, "aab"),
            new Cetrta.Prostor(3, 14, "baaa"),
            new Cetrta.Prostor(5, 62, "baabb"),
            new Cetrta.Prostor(7, 96, "aaaab"),
            new Cetrta.Prostor(9, 57, "baabb"),
            new Cetrta.Prostor(7, 47, "baabb"),
            new Cetrta.Prostor(7, 38, "baaa"),
            new Cetrta.Prostor(3, 39, "aaaab"),
            new Cetrta.Prostor(2, 93, "baaa"),
            new Cetrta.Prostor(2, 69, "aab"),
            new Cetrta.Prostor(5, 67, "aaaab"),
            new Cetrta.Prostor(2, 33, "aab"),
            new Cetrta.Prostor(10, 23, "aaaab"),
            new Cetrta.Prostor(10, 65, "baaa"),
            new Cetrta.Prostor(9, 52, "baaa"),
            new Cetrta.Prostor(5, 65, "aab"),
            new Cetrta.Prostor(3, 86, "aab"),
            new Cetrta.Prostor(4, 79, "baabb"),
            new Cetrta.Prostor(8, 49, "aaaab"),
            new Cetrta.Prostor(6, 53, "aaaab"),
            new Cetrta.Prostor(2, 53, "baabb"),
            new Cetrta.Prostor(6, 66, "baaa"),
            new Cetrta.Prostor(7, 69, "aaaab"),
            new Cetrta.Prostor(10, 5, "baaa"),
            new Cetrta.Prostor(4, 26, "aaaab"),
            new Cetrta.Prostor(1, 20, "aab"),
            new Cetrta.Prostor(10, 64, "aaaab"),
            new Cetrta.Prostor(10, 61, "aaaab"),
            new Cetrta.Prostor(2, 52, "aab"),
            new Cetrta.Prostor(9, 44, "aab"),
            new Cetrta.Prostor(3, 22, "aaaab"),
            new Cetrta.Prostor(3, 41, "aaaab"),
            new Cetrta.Prostor(7, 27, "aaaab"),
            new Cetrta.Prostor(9, 36, "baaa"),
            new Cetrta.Prostor(1, 64, "aaaab"),
            new Cetrta.Prostor(9, 5, "aab"),
            new Cetrta.Prostor(5, 78, "baaa"),
            new Cetrta.Prostor(10, 17, "aab"),
            new Cetrta.Prostor(3, 90, "aaaab"),
            new Cetrta.Prostor(10, 47, "baabb"),
            new Cetrta.Prostor(4, 20, "aaaab"),
            new Cetrta.Prostor(8, 7, "baaa"),
            new Cetrta.Prostor(1, 86, "aaaab"),
            new Cetrta.Prostor(10, 91, "aab"),
            new Cetrta.Prostor(6, 99, "baabb"),
            new Cetrta.Prostor(1, 80, "aaaab"),
            new Cetrta.Prostor(8, 99, "aaaab"),
            new Cetrta.Prostor(7, 48, "baaa"),
            new Cetrta.Prostor(9, 50, "baabb"),
            new Cetrta.Prostor(7, 68, "aab"),
            new Cetrta.Prostor(6, 81, "baabb"),
            new Cetrta.Prostor(10, 51, "aab"),
            new Cetrta.Prostor(3, 6, "baabb"),
            new Cetrta.Prostor(1, 7, "aab")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
