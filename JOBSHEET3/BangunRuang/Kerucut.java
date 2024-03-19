package JOBSHEET3.BangunRuang;

public class Kerucut {
    int jari, miring;
    public Kerucut(int r, int m){
        jari = r;
        miring = m;
    }
    
    public double hitungVolumeKerucut(){
        return (1.0/3.0)* Math.PI * (jari*jari) * (Math.sqrt((miring*miring)-(jari*jari)));
    }
        
    public double hitungLuasPermukaanKerucut(){
        return (Math.PI * jari * miring) + (Math.PI * Math.pow(jari, 2));
    }
}