package JOBSHEET2;

public class Buku21{
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku21(){
        
    }

    public Buku21(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi(){
        System.out.println("Judul : "+ judul);
        System.out.println("Pengarang : "+ pengarang);
        System.out.println("Jumlah Halaman : "+ halaman);
        System.out.println("Sisa Stok : "+ stok);
        System.out.println("Harga : Rp. "+ harga);
    }

    void terjual(int jml){
        if (stok > 0) {
            stok -= jml;
        }
    }  

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
}