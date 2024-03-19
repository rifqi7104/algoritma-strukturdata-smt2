package Quiz1;
import java.util.Scanner;

public class PersewaanMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SewaMobil mobil[] = new SewaMobil [3];
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println("\nInput Data Mobil");
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        for (int i = 0; i < mobil.length; i++) {
            System.out.print("\n("+(i+1)+") Masukkan Merk Mobil : ");
            String merk = sc.next();
            System.out.print("    Masukkan Tahun Mobil : ");
            int Tahun = sc.nextInt();
            System.out.print("    Masukkan Kapasitas Mobil : ");
            int kaps  = sc.nextInt();
            System.out.print("    Masukkan Harga Sewa : ");
            int harga  = sc.nextInt();
            
            mobil[i] = new SewaMobil(merk, Tahun, kaps, harga);
        }
        
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println("\nList Mobil Persewaan Malang");
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < mobil.length; i++) {
            mobil[i].menampilkanData(i+1);
        }
        System.out.print("Pilih Mobil : ");
        int pilih = sc.nextInt();
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println("\nInput Data Penyewaan");
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        if (pilih >= 1 && pilih <= mobil.length) {
            System.out.println();
            mobil[pilih-1].menampilkanData(pilih);
            System.out.print("Masukkan jumlah hari penyewaan : ");
            int jmlHari = sc.nextInt();
            System.out.print("Masukkan Nama Penyewa : ");
            String penyewa = sc.next();
            System.out.print("Apakah Anda memiliki member? (Y/N) : ");
            char konfirmMember = sc.next().charAt(0);
            if (konfirmMember == 'Y') {
                mobil[pilih-1].tampilStruk(penyewa,mobil[pilih-1].hitungTotalMember(jmlHari),jmlHari);
            } else if (konfirmMember == 'N'){
                mobil[pilih-1].tampilStruk(penyewa,mobil[pilih-1].hitungTotal(jmlHari),jmlHari);
            }
        }
    }
}
