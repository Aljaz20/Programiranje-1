import java.util.*;

public class DN08_63220304{
    static Scanner sc;

    private static class Monografija{
        private static double Tocke(int stevilo){
            return 10.0 / stevilo;
        }
        private static String Izpis(int stevilo, String avtor, String[] avtorji, String naslov, String tocke){
            String zalozba = sc.next();
            int leto = sc.nextInt();
            String ISBN = sc.next();
            String text = Arrays.toString(avtorji).replace("[", "").replace("]", "").replace("null", "");
            String izpis = String.format("%s: %s. %s %d, ISBN %s | %s", text, naslov, zalozba, leto, ISBN, tocke);
            return izpis;
        }
    }

    private static class Referat{
        private static double Tocke(int stevilo, boolean vrsta){
            if(vrsta == true){
                return 3.0 / stevilo;
            }else{
                return 1.0 / stevilo;
            }
        }
        private static String Izpis(int stevilo, String avtor, String[] avtorji, String naslov, String konferenca, String tocke){
            int zacetna = sc.nextInt();
            int koncna = sc.nextInt();
            String text = Arrays.toString(avtorji).replace("[", "").replace("]", "").replace("null", "");
            String izpis = String.format("%s: %s. %s: %d-%d | %s", text, naslov, konferenca, zacetna, koncna, tocke);
            return izpis;
        }

    }

    private static class Clanek{

        private static double Tocke(int stevilo, int mesto, int stevilorevij){
            if (mesto == stevilorevij + 1){
                return 2.0 / stevilo;
            }
            double p = (1.0 * mesto) / stevilorevij;
            if (p <= 0.25){
                return 10.0 / stevilo;
            }else if(p <= 0.5){
                return 8.0 / stevilo;
            }else if(p <= 0.75){
                return 6.0 / stevilo;
            }else{
                return 4.0 / stevilo;
            }
        }
        private static String Izpis(int stevilo, String ime, String[] avtorji, String naslov, String naziv, int letnik, int stevilka, int letoizdaje, String tocke){
            int zacetna = sc.nextInt();
            int koncna = sc.nextInt();
            String text = Arrays.toString(avtorji).replace("[", "").replace("]", "").replace("null", "");
            String izpis = String.format("%s: %s. %s %d(%d): %d-%d (%d) | %s", text, naslov, naziv, letnik, stevilka, zacetna, koncna, letoizdaje, tocke);
            return izpis;
        }

    }



    public static void main(String[] args){
        sc = new Scanner(System.in);
        String ime = sc.next();
        int n = sc.nextInt();
        double[] tocke = new double[n];
        String[] izpis = new String[n];

        for (int i = 0; i < n ; i++){
            String beseda = sc.next();
            int stevilo = sc.nextInt();
            String[] avtorji = new String[stevilo];
            for (int j = 0; j < stevilo; j++){
                String b = sc.next();
                if (b.equals("#")){
                    avtorji[j] += ime;
                }else{
                    avtorji[j] += b;
                }
            }            
            String naslov = sc.next();

            switch (beseda) {
                case "monografija": 
                    tocke[i] = Monografija.Tocke(stevilo);
                    izpis[i] = Monografija.Izpis(stevilo, ime, avtorji, naslov, Ostanek(stevilo, tocke[i]));
                break;
                case "clanek":
                    String naziv = sc.next();
                    int letnik = sc.nextInt();
                    int stevilka = sc.nextInt();
                    int letoizdaje = sc.nextInt();
                    int mesto = sc.nextInt();
                    int stevilorevij = sc.nextInt();
                    tocke[i] = Clanek.Tocke(stevilo, mesto, stevilorevij);
                    izpis[i] = Clanek.Izpis(stevilo, ime, avtorji, naslov, naziv, letnik, stevilka, letoizdaje, Ostanek(stevilo, tocke[i]));
                break;
                case "referat":
                    String konferenca = sc.next();
                    boolean vrsta = sc.nextBoolean();
                    tocke[i] = Referat.Tocke(stevilo, vrsta);
                    izpis[i] = Referat.Izpis(stevilo, ime, avtorji, naslov, konferenca, Ostanek(stevilo, tocke[i]));
                break;
            }
        }

        double[] urejenetocke = Arrays.copyOf(tocke, n);
        Arrays.sort(urejenetocke);

        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j < n; j++){
                if(urejenetocke[i] == tocke[j]){
                    System.out.println(izpis[j]);
                    tocke[j] = 11;
                }
                continue;
            }
        }

        
//naredi se en double array ki ga sortiraj in potem v for loopu gledaj kdaj je isto in potem izpiši

    }

    private static String Ostanek(int stevilo, double tocke){
        int stevilka = (int) Math.round(stevilo * tocke);
        int celota = stevilka / stevilo;
        int ostanek = stevilka % stevilo;
        int delitelj = gcd(stevilo, ostanek);
        String vrni = "";
        if(ostanek == 0){
            vrni += celota;
            return vrni;
        }else{
        return celota + "+" + ostanek/delitelj + "/" + stevilo/delitelj;
        }

    }
    public static int gcd(int a, int b) {
		if (b == 0) {
		return a;
		}
		return gcd(b, a % b);
	}
}