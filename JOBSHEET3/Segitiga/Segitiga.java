package JOBSHEET3.Segitiga;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(){
        
    }

    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    
    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
    
    public double hitungKeliling(){
        double miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return miring + alas + tinggi;
    }
}
