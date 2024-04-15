package JOBSHEET4.BruteForceDivideConquer.Sum;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan jumlah perusahaan : ");
        int perusahaan = sc.nextInt();
        
        Sum sm[] = new Sum[perusahaan];
        System.out.println("========================================================");
        for (int j = 0; j < sm.length; j++) {
            System.out.println("Perusahaan ke- "+(j+1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();
            sm[j] = new Sum(elm);
            for (int i = 0; i < sm[j].elemen; i++) {
                System.out.print("Masukkan untung bulan ke- "+(i+1)+" = ");
                sm[j].keuntungan[i] = sc.nextDouble();
            } 
        }
        for (int i = 0; i < sm.length; i++){
            System.out.println("========================================================");
            System.out.println("Perusahaan ke- "+(i+1));
            System.out.println("========================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama "+sm[i].elemen+" bulan adalah = "+sm[i].totalBF(sm[i].keuntungan));
            System.out.println("========================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama "+sm[i].elemen+" bulan adalah = "+sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));    
        }
    }
}
