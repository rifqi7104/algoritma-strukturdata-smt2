package JOBSHEET3.BangunRuang;

public class Limas {
    int sisi, tinggi;
    public Limas(int s, int t){
        sisi = s;
        tinggi = t;
    }
    
    public double hitungVolumeLimas(){
        return (1.0/3.0) * (sisi*sisi)* tinggi;
    }
    
    public double hitungLuasPermukaanLimas(){
        return Math.pow(sisi, 2) + (4*((1/2) * sisi * (Math.sqrt(Math.pow((0.5 * sisi), 2) + Math.pow(tinggi, 2)))));
    }
}
