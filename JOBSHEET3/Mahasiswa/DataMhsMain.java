package JOBSHEET3.Mahasiswa;
import java.util.Scanner;

public class DataMhsMain {
    public static void main(String[] args) {
        double rataIPK = 0;
        Scanner sc = new Scanner(System.in);
        DataMhs arrayMhs [] = new DataMhs[3];
        for (int i = 0; i < arrayMhs.length; i++) {
            System.out.println("Data Mahasiswa ke- "+i);
            System.out.print("Masukkan Nama : ");
            String nama = sc.next();
            System.out.print("Masukkan NIM : ");
            int nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            char jenis = sc.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();

            arrayMhs[i] = new DataMhs(nama, nim, jenis, ipk);
        }

        for (int i = 0; i < arrayMhs.length; i++) {
            arrayMhs[i].menampilkanData(i);
        }
        for (int i = 0; i < arrayMhs.length; i++) {
            rataIPK += arrayMhs[i].hitungRataIPK();
        }
        rataIPK /= 3;
        System.out.printf("Rata - rata IPK : %.2f",rataIPK);
    }
}