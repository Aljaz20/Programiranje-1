
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(5, 77, "abbab"),
            new Cetrta.Prostor(3, 6, "baaab"),
            new Cetrta.Prostor(3, 36, "baaab"),
            new Cetrta.Prostor(5, 42, "abbab"),
            new Cetrta.Prostor(6, 82, "baaa"),
            new Cetrta.Prostor(1, 47, "abb"),
            new Cetrta.Prostor(6, 80, "abb"),
            new Cetrta.Prostor(2, 73, "baaa"),
            new Cetrta.Prostor(4, 34, "baaab"),
            new Cetrta.Prostor(2, 19, "baaab"),
            new Cetrta.Prostor(1, 73, "baaa"),
            new Cetrta.Prostor(5, 55, "baaab"),
            new Cetrta.Prostor(7, 87, "baaa"),
            new Cetrta.Prostor(4, 53, "abbab"),
            new Cetrta.Prostor(3, 80, "baaa"),
            new Cetrta.Prostor(7, 59, "baaa"),
            new Cetrta.Prostor(7, 90, "baaa"),
            new Cetrta.Prostor(2, 46, "baaab"),
            new Cetrta.Prostor(3, 40, "abbab"),
            new Cetrta.Prostor(7, 96, "baaa"),
            new Cetrta.Prostor(4, 29, "baaab"),
            new Cetrta.Prostor(3, 61, "abb"),
            new Cetrta.Prostor(7, 74, "abb"),
            new Cetrta.Prostor(6, 59, "baaa"),
            new Cetrta.Prostor(4, 20, "abb"),
            new Cetrta.Prostor(2, 95, "baaa"),
            new Cetrta.Prostor(3, 87, "abbab"),
            new Cetrta.Prostor(2, 87, "baaa"),
            new Cetrta.Prostor(5, 36, "abb"),
            new Cetrta.Prostor(4, 98, "baaab"),
            new Cetrta.Prostor(3, 69, "baaab"),
            new Cetrta.Prostor(1, 24, "baaa"),
            new Cetrta.Prostor(4, 68, "baaab"),
            new Cetrta.Prostor(7, 72, "abbab"),
            new Cetrta.Prostor(7, 54, "abbab"),
            new Cetrta.Prostor(4, 52, "baaab"),
            new Cetrta.Prostor(6, 53, "abb"),
            new Cetrta.Prostor(6, 19, "baaa"),
            new Cetrta.Prostor(7, 12, "abb"),
            new Cetrta.Prostor(5, 53, "abbab"),
            new Cetrta.Prostor(5, 82, "abb"),
            new Cetrta.Prostor(3, 19, "abbab"),
            new Cetrta.Prostor(4, 100, "baaa"),
            new Cetrta.Prostor(2, 58, "baaab"),
            new Cetrta.Prostor(3, 68, "baaa"),
            new Cetrta.Prostor(1, 91, "abbab"),
            new Cetrta.Prostor(2, 75, "abbab"),
            new Cetrta.Prostor(4, 87, "baaab"),
            new Cetrta.Prostor(5, 66, "baaab"),
            new Cetrta.Prostor(1, 85, "abbab"),
            new Cetrta.Prostor(5, 83, "abbab"),
            new Cetrta.Prostor(2, 43, "abb"),
            new Cetrta.Prostor(7, 25, "baaab"),
            new Cetrta.Prostor(6, 2, "abbab"),
            new Cetrta.Prostor(5, 80, "abb"),
            new Cetrta.Prostor(3, 3, "abb"),
            new Cetrta.Prostor(5, 1, "baaab"),
            new Cetrta.Prostor(1, 89, "baaab"),
            new Cetrta.Prostor(4, 19, "baaa"),
            new Cetrta.Prostor(7, 36, "baaab"),
            new Cetrta.Prostor(1, 16, "abbab"),
            new Cetrta.Prostor(1, 71, "baaa"),
            new Cetrta.Prostor(3, 52, "baaab"),
            new Cetrta.Prostor(1, 15, "abb"),
            new Cetrta.Prostor(3, 18, "baaab"),
            new Cetrta.Prostor(5, 8, "baaa"),
            new Cetrta.Prostor(7, 41, "baaa"),
            new Cetrta.Prostor(3, 96, "abbab"),
            new Cetrta.Prostor(3, 51, "baaab"),
            new Cetrta.Prostor(2, 91, "abbab"),
            new Cetrta.Prostor(2, 9, "baaab"),
            new Cetrta.Prostor(2, 81, "abb"),
            new Cetrta.Prostor(1, 77, "baaab"),
            new Cetrta.Prostor(2, 28, "abb"),
            new Cetrta.Prostor(2, 51, "baaa"),
            new Cetrta.Prostor(4, 36, "baaab"),
            new Cetrta.Prostor(3, 32, "baaab"),
            new Cetrta.Prostor(1, 29, "baaa"),
            new Cetrta.Prostor(3, 22, "baaa"),
            new Cetrta.Prostor(4, 42, "baaa"),
            new Cetrta.Prostor(1, 40, "abb"),
            new Cetrta.Prostor(5, 91, "abbab"),
            new Cetrta.Prostor(7, 97, "abb"),
            new Cetrta.Prostor(5, 32, "baaa")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
