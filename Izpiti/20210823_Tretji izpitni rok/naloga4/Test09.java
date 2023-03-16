
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(1, 73, "baa"),
            new Cetrta.Prostor(8, 13, "baab"),
            new Cetrta.Prostor(6, 34, "bbb"),
            new Cetrta.Prostor(6, 93, "baa"),
            new Cetrta.Prostor(10, 29, "aaa"),
            new Cetrta.Prostor(3, 83, "ba"),
            new Cetrta.Prostor(5, 38, "aaa"),
            new Cetrta.Prostor(6, 4, "ba"),
            new Cetrta.Prostor(8, 17, "baab"),
            new Cetrta.Prostor(5, 79, "baaa"),
            new Cetrta.Prostor(5, 8, "bbb"),
            new Cetrta.Prostor(8, 14, "aaa"),
            new Cetrta.Prostor(9, 28, "ba"),
            new Cetrta.Prostor(7, 12, "ba"),
            new Cetrta.Prostor(1, 92, "baa"),
            new Cetrta.Prostor(2, 58, "aaa"),
            new Cetrta.Prostor(3, 14, "bbb"),
            new Cetrta.Prostor(2, 8, "bbb"),
            new Cetrta.Prostor(10, 41, "baab"),
            new Cetrta.Prostor(3, 77, "aaa"),
            new Cetrta.Prostor(6, 13, "aaa"),
            new Cetrta.Prostor(9, 23, "ba"),
            new Cetrta.Prostor(3, 72, "ba"),
            new Cetrta.Prostor(9, 48, "ba"),
            new Cetrta.Prostor(2, 48, "aaa"),
            new Cetrta.Prostor(2, 63, "bbb"),
            new Cetrta.Prostor(8, 28, "baab"),
            new Cetrta.Prostor(8, 35, "baab"),
            new Cetrta.Prostor(8, 92, "aaa"),
            new Cetrta.Prostor(2, 5, "bbb"),
            new Cetrta.Prostor(4, 90, "baa"),
            new Cetrta.Prostor(1, 81, "baab"),
            new Cetrta.Prostor(6, 75, "baa"),
            new Cetrta.Prostor(8, 38, "aaa"),
            new Cetrta.Prostor(7, 58, "bbb"),
            new Cetrta.Prostor(10, 87, "ba"),
            new Cetrta.Prostor(2, 47, "ba"),
            new Cetrta.Prostor(2, 17, "baa"),
            new Cetrta.Prostor(8, 26, "bbb"),
            new Cetrta.Prostor(2, 10, "bbb"),
            new Cetrta.Prostor(1, 54, "baaa"),
            new Cetrta.Prostor(6, 33, "baab"),
            new Cetrta.Prostor(4, 75, "bbb"),
            new Cetrta.Prostor(6, 29, "bbb"),
            new Cetrta.Prostor(2, 75, "aaa"),
            new Cetrta.Prostor(7, 24, "baa"),
            new Cetrta.Prostor(3, 44, "ba"),
            new Cetrta.Prostor(7, 99, "ba"),
            new Cetrta.Prostor(2, 65, "baaa"),
            new Cetrta.Prostor(8, 45, "aaa"),
            new Cetrta.Prostor(3, 92, "baaa")
        ));

        List<String> namembnosti = new ArrayList<>(Cetrta.namembnosti(prostori));
        namembnosti.sort(null);
        System.out.println(namembnosti);
    }
}
