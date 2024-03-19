package JOBSHEET3.BangunRuang;

public class Bola {
    int jari;
    public Bola(int r){
        jari = r;
    }

    public double hitungVolumeBola(){
        return (4/3) * Math.PI * Math.pow(jari, 3);
    }

    public double hitungLuasPermukaanBola(){
        return 4 * Math.PI * Math.pow(jari, 2);
    }
}
