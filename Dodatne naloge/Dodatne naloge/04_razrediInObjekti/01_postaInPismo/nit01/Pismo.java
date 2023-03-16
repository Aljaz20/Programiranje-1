public class Pismo{

    private Posta izvorna;
    private Posta ciljna;
    private boolean jePriporoceno;
    private int razdalja;
    private static int r;
    private static int c;
    private static int p;

    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja)
{
        this.izvorna = izvorna;
        this.ciljna = ciljna;
        this.jePriporoceno = jePriporoceno;
        this.razdalja = razdalja;
    }

    private String priporoceno(){
        if(this.jePriporoceno){
            return "P";
        }else{
            return "N";
        }
    }

    public String toString(){
        return String.format("%s -> %s (%d km) [%s]", this.izvorna, this.ciljna, this.razdalja, this.priporoceno());
    }

    public boolean izviraOd(Posta posta){
        return posta.equals(this.izvorna);
    }

    public boolean staIzvorInCiljIsta(){
        return this.izvorna.equals(this.ciljna);
    }

    public boolean imaIstiCiljKot(Pismo pismo){
        return this.ciljna.equals(pismo.ciljna);
    }

    public static boolean imataIstiCilj(Pismo p1, Pismo p2){
        return p1.ciljna.equals(p2.ciljna);
    }

    public int cena(){
        int cena = (this.razdalja/r + 1)* c;
        if (this.jePriporoceno){
            return cena + p;
        }else{
            return cena;
        }

    }

    public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCene, int priporocnina){
        r = enotaRazdalje;
        c = enotaCene;
        p = priporocnina;
    }

    public boolean jeDrazjeOd(Pismo pismo){
        return this.cena() > pismo.cena();
    }

    public static Pismo vrniDrazje(Pismo p1, Pismo p2){
        return (p1.cena() <= p2.cena())?(p2):(p1);
    }

    public Pismo izdelajPovratno(){
        return new Pismo(this.ciljna, this.izvorna, this.jePriporoceno, this.razdalja);
    }   
}