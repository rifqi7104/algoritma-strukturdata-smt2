package JOBSHEET3.BangunRuang;
import java.util.Scanner;

public class BangunRuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan berapa banyak bangun ruang Bola yang ingin dimasukkan : ");
        int bola = sc.nextInt();
        System.out.print("Masukkan berapa banyak bangun ruang Kerucut yang ingin dimasukkan : ");
        int kerucut = sc.nextInt();
        System.out.print("Masukkan berapa banyak bangun ruang Limas Segi Empat yang ingin dimasukkan : ");
        int limas = sc.nextInt();

        Bola arrayBola[] = new Bola[bola];
        Kerucut arrayKerucut[] = new Kerucut[kerucut];
        Limas arrayLimas[] = new Limas[limas];
        for (int i = 0; i < arrayBola.length; i++) {
            System.out.print("Masukkan nilai jari-jari Bola "+(i+1)+" : ");
            int jari = sc.nextInt();
            arrayBola[i] = new Bola(jari);
        }
        for (int i = 0; i < arrayKerucut.length; i++) {
            System.out.print("Masukkan nilai jari-jari Kerucut "+(i+1)+" : ");
            int jari = sc.nextInt();
            System.out.print("Masukkan nilai sisi miring Kerucut "+(i+1)+": ");
            int miring = sc.nextInt();
            arrayKerucut[i] = new Kerucut(jari, miring);
        }
        for (int i = 0; i < arrayLimas.length; i++) {
            System.out.print("Masukkan nilai sisi Limas "+(i+1)+" : ");
            int sisi = sc.nextInt();
            System.out.print("Masukkan nilai tinggi Limas "+(i+1)+" : ");
            int tinggi = sc.nextInt();
            arrayLimas[i] = new Limas(sisi,tinggi);
        }
    
        for (int i = 0; i < arrayBola.length; i++) {
            System.out.printf("Volume Bola %d : %.2f , Luas Permukaan Bola %d : %.2f\n",(i+1),arrayBola[i].hitungVolumeBola(),(i+1), arrayBola[i].hitungLuasPermukaanBola());
        }
        for (int i = 0; i < arrayKerucut.length; i++) {
            System.out.printf("Volume Kerucut %d : %.2f , Luas Permukaan Kerucut %d : %.2f\n",(i+1),arrayKerucut[i].hitungVolumeKerucut(),(i+1), arrayKerucut[i].hitungLuasPermukaanKerucut());
        }
        for (int i = 0; i < arrayLimas.length; i++) {
            System.out.printf("Volume Limas %d : %.2f , Luas Permukaan Limas %d : %.2f\n",(i+1),arrayLimas[i].hitungVolumeLimas(),(i+1), arrayLimas[i].hitungLuasPermukaanLimas());
        }
    }
}
