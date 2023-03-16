
public class Test12 {

    public static void main(String[] args) {
        Stanovanje s = new Stanovanje(new Oseba[1]);
        TestSkupno.preveri(s.steviloStanovalcev() == 1);
    }
}
