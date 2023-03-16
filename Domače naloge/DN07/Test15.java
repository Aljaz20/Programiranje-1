
public class Test15 {

    public static void main(String[] args) {
        Stanovanje s = new Stanovanje(new Oseba[6]);
        TestSkupno.preveri(s.steviloStanovalcev() == 6);
    }
}
