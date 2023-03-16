
public class Test13 {

    public static void main(String[] args) {
        Stanovanje s = new Stanovanje(new Oseba[23]);
        TestSkupno.preveri(s.steviloStanovalcev() == 23);
    }
}
