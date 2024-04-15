package JOBSHEET7.Percobaan1;
import java.util.Scanner;

public class Utama21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tentukan berapa kapasitas gudang Anda : ");
        int kaps = sc.nextInt();
        Gudang21 gudang = new Gudang21(kaps);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan barang teratas");
            System.out.println("4. Tampilkan barang terbawah");
            System.out.println("5. Tampilkan tumpukan barang");
            System.out.println("6. Cari barang berdasarkan kode");
            System.out.println("7. Cari barang berdasarkan nama");
            System.out.println("8. Keluar");
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
                    gudang.lihatBarangTeratas();
                    break;
                case 4:
                    gudang.lihatBarangTerbawah();
                    break;
                case 5:
                    gudang.tampilkanBarang();
                    break;
                case 6:
                    System.out.println("Masukkan kode barang yang dicari : ");
                    int cari = sc.nextInt();
                    gudang.cariBarang(cari);
                    break;
                case 7:
                    System.out.println("Masukkan nama barang yang dicari : ");
                    String cariNama = sc.nextLine();
                    gudang.cariNamaBarang(cariNama);    
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
