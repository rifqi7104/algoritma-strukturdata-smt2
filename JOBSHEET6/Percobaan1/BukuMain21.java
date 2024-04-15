import java.util.Scanner;
public class BukuMain21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        Scanner s1 = new Scanner(System.in);        
        
        PencarianBuku21 data = new PencarianBuku21();
        int jumBuku = 5;

        System.out.println("---------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku \t:");
            String kodeBuku = s.next();
            System.out.print("Judul Buku \t:");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t:");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t:");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t:");
            int stock = s.nextInt();

            Buku21 m = new Buku21(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("---------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku :");
        String cari = s1.nextLine();
        Buku21 dataBuku = data.findBuku(cari);
        dataBuku.tampilDataBuku();
        // data.sort();
        // System.out.println("menggunakan Sequential Search");
        // int posisi = data.findSeqSearchJudul(cari);
        // data.TampilPosisi(cari, posisi);
        // data.tampilDataPosisi(cari, posisi);

        // System.out.println("=====================");
        // System.out.println("menggunakan Binary Search");
        // posisi = data.findBinarySearchJudul(cari, 0, data.listBk.length-1);
        // data.TampilPosisi(cari, posisi);
        // data.tampilDataPosisi(cari, posisi);
    }
}
