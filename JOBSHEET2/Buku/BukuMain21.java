package JOBSHEET2.Buku;

public class BukuMain21 {
    public static void main(String[] args) {
        Buku21 bk1 = new Buku21();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.hitungHargaTotal(bk1.terjual(5));
        bk1.hitungDiskon(bk1.total);
        bk1.hitungHargaBayar(bk1.Diskon, bk1.total);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku21 bk2 = new Buku21("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku21 bukuRifqi = new Buku21("Sebuah Seni Untuk Bersikap Bodo Amat", "Mark Manson", 256, 20, 80000);
        bukuRifqi.tampilInformasi();
        bukuRifqi.gantiHarga(65000);
        bukuRifqi.tampilInformasi();
        bukuRifqi.hitungHargaTotal(bukuRifqi.terjual(10));
        bukuRifqi.hitungDiskon(bukuRifqi.total);
        bukuRifqi.hitungHargaBayar(bukuRifqi.Diskon, bukuRifqi.total);
        bukuRifqi.tampilInformasi();
    }
}