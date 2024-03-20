package JOBSHEET4.BruteForceDivideConquer.Pangkat;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc.nextInt();
        
        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen ; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println("============================");
        System.out.println("1. Hitung dengan metode BRUTE FORCE");
        System.out.println("2. Hitung dengan metode DIVIDE AND CONQUER");
        System.out.print("Pilih metode : ");
        int metode = sc.nextInt();
        switch (metode) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                System.out.println
                ("Hasil dari "
                + png[i].nilai+" pangkat "
                + png[i].pangkat+" adalah "
                + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }   
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println
                    ("Hasil dari "
                    + png[i].nilai+" pangkat "
                    + png[i].pangkat+" adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Silahkan pilih sesuai metode yang tersedia.");
                break;
        }
    }
}
