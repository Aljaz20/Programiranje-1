public class Datum{

    private  int Dan;
    private  int Mesec;
    private  int Leto;
    private int jePrestopno = 0;
    private int[] dneviVmesecu = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static Datum ustvari(int dan, int mesec, int leto){
        int jePrestopno = 0;
        if(leto % 400 == 0 || (leto % 4 == 0 && leto % 100 != 0)){
            jePrestopno = 1;
        }
        int[] dneviVmesecu = {31,28,31,30,31,30,31,31,30,31,30,31};
        dneviVmesecu[1] = dneviVmesecu[1] + jePrestopno;
        if((leto > 1582 && leto < 3000) && (mesec > 0 && mesec < 13) && (dan > 0 && dan <= dneviVmesecu[mesec-1])){
            return new Datum(dan, mesec, leto);
        }else{
            return null;
        }
    }

    private Datum(int dan, int mesec, int leto){
        this.Dan = dan;
        this.Mesec = mesec;
        this.Leto = leto;
        if(this.Leto % 400 == 0 || (this.Leto % 4 == 0 && this.Leto % 100 != 0)){
            this.jePrestopno = 1;
        }
        this.dneviVmesecu[1] += jePrestopno;

    }

    public String toString(){
        return String.format("%02d.%02d.%d", this.Dan, this.Mesec, this.Leto);
    }

    public boolean jeEnakKot(Datum datum){
        return this.toString().equals(datum.toString());
    }
    public boolean jePred(Datum datum){
        if(this.Leto < datum.Leto){
            return true;
        }else if(this.Leto == datum.Leto){
            if(this.Mesec < datum.Mesec){
                return true;
            }else if (this.Mesec == datum.Mesec){
                if(this.Dan < datum.Dan){
                    return true;
                }
            }
        }
        return false;
    }



    public Datum naslednik(){
        if(this.toString().equals("31.12.2999")){
            return null;
        }if(this.Dan == this.dneviVmesecu[this.Mesec-1]){
            if(this.Mesec == 12){
                return new Datum(1, 1, this.Leto+1);
            }else{
                return new Datum(1, this.Mesec + 1, this.Leto);
            }
        }else{
            return new Datum(this.Dan + 1, this.Mesec, this.Leto);
        }
    }

    public Datum predhodnik(){
        if(this.toString().equals("01.01.1583")){
            return null;
        }if(this.Dan == 1){
            if(this.Mesec == 1){
                return new Datum(31, 12, this.Leto-1);
            }else{
                return new Datum(dneviVmesecu[this.Mesec-2], this.Mesec -1 , this.Leto);
            }
        }else{
            return new Datum(this.Dan - 1, this.Mesec, this.Leto);
        }
    }

    public Datum cez(int stDni){
        Datum novi = this;
        if(stDni < 0){
            for(int i = stDni; i < 0; i++){
                novi = novi.predhodnik();
            }
        }else{
            for(int i = 0; i < stDni; i++){
                novi = novi.naslednik();
            }
        }

        if(novi.jePred(new Datum(1, 1, 1583)) || (new Datum(31, 12, 2999)).jePred(novi)){
            return null;
        }else{
            return novi;
        }
    }
    public int razlika(Datum datum){
        int stdni = 0;
        if(datum.jePred(this)){
            while(!datum.jeEnakKot(this)){
                if((datum.Leto % 400 == 0 || (datum.Leto % 4 == 0 && datum.Leto % 100 != 0))&&(datum.Leto < this.Leto - 4)){
                    stdni= stdni + 365*4 + 1;
                    datum = new Datum(datum.Dan, datum.Dan, datum.Leto + 4);
                }else{
                    stdni++;
                    datum = datum.naslednik();
                }
                
            }
        }else{
            while(!datum.jeEnakKot(this)){
                if((datum.Leto % 400 == 0 || (datum.Leto % 4 == 0 && datum.Leto % 100 != 0))&&(datum.Leto > this.Leto + 4)){
                    stdni= stdni - 365*4 - 1;
                    datum = new Datum(datum.Dan, datum.Mesec, datum.Leto - 4);
                }else{
                    stdni--;
                    datum = datum.predhodnik();
                }
            }
        }
        return stdni;
    }




    
}