

/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02..04: kli"cejo samo metodo dolzinaVrste
 * 05..07: kli"cejo samo metodo steviloDokumentov
 * 08..10: kli"cejo samo metodo natisni
 *
 * Skriti testni primeri: 
 * 01..16: kli"cejo samo metodo dolzinaVrste
 * 17..33: kli"cejo samo metodo steviloDokumentov
 * 34..50: kli"cejo samo metodo natisni
 *
 * (Vsi testni primeri kli"cejo konstruktor in metodo prejmi, a ta dva se ne to"ckujeta.)
 */

import java.util.*;

public class Tretja {

    public static abstract class Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Profesor extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Docent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Asistent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Tiskalnik {

        private List<String> Profesorvrst = new ArrayList<>();
        private List<String> Docentvrsta = new ArrayList<>();
        private List<String> Asistentvrsta = new ArrayList<>();

        public Tiskalnik() {
            // dopolnite ...
        }

        public void prejmi(Pedagog pedagog, String dokument) {
            if(pedagog instanceof Profesor){
                Profesorvrst.add(dokument);
            }else if(pedagog instanceof Docent){
                Docentvrsta.add(dokument);
            }else if(pedagog instanceof Asistent){
                Asistentvrsta.add(dokument);
            }
        }

        public int dolzinaVrste() {
            return Profesorvrst.size() + Docentvrsta.size() + Asistentvrsta.size();
        }

        public int steviloDokumentov(Pedagog pedagog) {
            if(pedagog instanceof Profesor){
                return Profesorvrst.size();
            }else if(pedagog instanceof Docent){
                return Docentvrsta.size();
            }else{
                return Asistentvrsta.size();
            }
        }

        public String natisni() {
            if(Profesorvrst.isEmpty()){
                if(Docentvrsta.isEmpty()){
                    if(Asistentvrsta.isEmpty()){
                        return null;
                    }
                    String a = Asistentvrsta.get(0);
                    Asistentvrsta.remove(0);
                    return a;
                }
                String a = Docentvrsta.get(0);
                Docentvrsta.remove(0);
                return a;
            }
            String a = Profesorvrst.get(0);
            Profesorvrst.remove(0);
            return a;
        }

        // pomo"zne metode (po potrebi) ...
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
