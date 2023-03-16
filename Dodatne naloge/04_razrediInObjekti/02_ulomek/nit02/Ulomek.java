public class Ulomek{

    private int stevec;
    private int imenovalec;

    public Ulomek(int a, int b){

        int c = gcd(a, b);

        a = a / c;
        b = b / c;

        if(b<0){
            a = a * -1;
            b = b * -1;
        }

        this.stevec = a;
        this.imenovalec = b;
    }

    private int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }

    public String toString(){
        return String.format("%d/%d", this.stevec, this.imenovalec);
    }

    public boolean jeEnakKot(Ulomek u){
        return u.toString().equals(this.toString());
    }

    public Ulomek negacija(){
        return new Ulomek(this.stevec * -1 , this.imenovalec);
    }

    public Ulomek obrat(){
        return new Ulomek(this.imenovalec, this.stevec);
    }

    public Ulomek vsota(Ulomek u){
        return new Ulomek(this.stevec * u.imenovalec + u.stevec * this.imenovalec, this.imenovalec*u.imenovalec);
    }
    public Ulomek razlika(Ulomek u){
        return new Ulomek(this.stevec * u.imenovalec - u.stevec * this.imenovalec, this.imenovalec*u.imenovalec);
    }
    public Ulomek zmnozek(Ulomek u){
        return new Ulomek(this.stevec *  u.stevec, this.imenovalec*u.imenovalec);
    }
    public Ulomek kolicnik(Ulomek u){
        return new Ulomek(this.stevec * u.imenovalec , this.imenovalec*u.stevec);
    }
    public Ulomek potenca(int eksponent){
        if(eksponent < 0){
            return new Ulomek((int)Math.pow(this.imenovalec, eksponent*-1), (int)Math.pow(this.stevec, eksponent*-1));
        }else{
            return new Ulomek((int)Math.pow(this.stevec, eksponent), (int)Math.pow(this.imenovalec, eksponent));
        }
    }
    public boolean jeManjsiOd(Ulomek u){
        return this.stevec*1.0/this.imenovalec < u.stevec*1.0/u.imenovalec;
    }





}