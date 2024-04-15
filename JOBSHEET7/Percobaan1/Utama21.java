package JOBSHEET7.Percobaan1;
import java.util.Scanner;

public class Utama21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gudang21 gudang = new Gudang21(7);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = sc.nextLine();
                    Barang21 barangBaru = new Barang21(kode,nama,kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
