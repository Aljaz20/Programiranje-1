
/*
 * tj.exe
 */

public class Tretja {

    public static abstract class Predavalnica {
        private String oznaka;
        private int stMest;

        protected Predavalnica(String oznaka, int stMest) {
            this.oznaka = oznaka;
            this.stMest = stMest;
        }

        public String vrniOznako() {
            return this.oznaka;
        }

        public int vrniSteviloMest() {
            return this.stMest;
        }

        // popravite / dopolnite ...
        public int casCiscenja() {
            int cas = this.stMest * 2;
            return cas;
        }
    }

    public static class Avditorna extends Predavalnica {

        public Avditorna(String oznaka, int stMest) {
            super(oznaka, stMest);
        }
        
    }

    public static class Racunalnica extends Predavalnica {
        private int stRacunalnikov;

        public Racunalnica(String oznaka, int stMest, int stRacunalnikov) {
            super(oznaka, stMest);
            this.stRacunalnikov = stRacunalnikov;
        }

        public int vrniSteviloRacunalnikov() {
            return this.stRacunalnikov;
        }
        @Override
        public int casCiscenja() {
            int cas = super.stMest * 2 + 3* this.stRacunalnikov;
            return cas;
        }
    }

    public static class Garaza extends Predavalnica {
        private int povrsina;

        public Garaza(String oznaka, int stMest, int povrsina) {
            super(oznaka, stMest);
            this.povrsina = povrsina;
        }
        @Override
        public int casCiscenja() {
            int cas = super.stMest * 2 + this.povrsina;
            return cas;
        }
    }

    public static class Stavba {
        private Predavalnica[] predavalnice;

        public Stavba(Predavalnica[] predavalnice) {
            this.predavalnice = predavalnice;
        }

        public int casCiscenja() {
            int cas = 0;
            for (Predavalnica predavalnica: this.predavalnice) {
                cas += predavalnica.casCiscenja();
            }
            return cas;
        }

        public int[] razporedi(int stStudentov, int[] ostanek) {
            int[] razpored = new int[this.predavalnice.length];
            for(int i = 0; i < this.predavalnice.length ; i ++){
                if(this.predavalnice[i] instanceof Avditorna){
                    if(stStudentov - this.predavalnice[i].stMest <= 0){
                        razpored[i] = stStudentov;
                        stStudentov = 0;
                        break;
                    }else{
                        razpored[i] = this.predavalnice[i].stMest;
                        stStudentov -= razpored[i];
                    }
                }
            }
            if(stStudentov>0){
                for(int i = 0; i < this.predavalnice.length ; i ++){
                    if(this.predavalnice[i] instanceof Racunalnica){
                        if(stStudentov - this.predavalnice[i].stMest <= 0){
                            razpored[i] = stStudentov;
                            stStudentov = 0;
                            break;
                        }else{
                            razpored[i] = this.predavalnice[i].stMest;
                            stStudentov -= razpored[i];
                        }
                    }
                }
            }
            if(stStudentov>0){
                for(int i = 0; i < this.predavalnice.length ; i ++){
                    if(this.predavalnice[i] instanceof Garaza){
                        if(stStudentov - this.predavalnice[i].stMest <= 0){
                            razpored[i] = stStudentov;
                            stStudentov = 0;
                            break;
                        }else{
                            razpored[i] = this.predavalnice[i].stMest;
                            stStudentov -= razpored[i];
                        }
                    }
                }
            }
            ostanek[0] = stStudentov;
            return razpored;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
