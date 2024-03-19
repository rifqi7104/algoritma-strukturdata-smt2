package Quiz1;

public class SewaMobil {
    public String merk;
    public int harga, kaps;
    public int tahun;
    
    public SewaMobil(String merk, int tahun, int kaps, int harga){
        this.merk = merk;
        this.tahun = tahun;
        this.harga = harga;
        this.kaps = kaps;
    }

    public void menampilkanData(int i){
        System.out.printf("(%d) Merk : %s\n",i,merk);
        System.out.println("    Tahun : "+tahun);
        System.out.println("    Kapasistas : "+kaps);
        System.out.println("    Harga (1 hari) : "+harga);
    }

    public void tampilStruk(String penyewa, double total, int jmlHari){
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println("\nNama        : "+penyewa);
        System.out.println("Merk Mobil  : "+merk);
        System.out.println("Tahun Mobil : "+tahun);
        System.out.println("Kapasistas  : "+kaps);
        System.out.println("Harga Sewa per Hari : "+harga);
        System.out.println("Lama Sewa : "+jmlHari);
        System.out.println("Total Harga : "+total);
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
    }

    public double hitungTotal(int jmlHari){
        return harga*jmlHari;
    }

    public double hitungTotalMember(int jmlHari){
        return (harga*jmlHari)-(0.2*(harga*jmlHari));
    }
}
