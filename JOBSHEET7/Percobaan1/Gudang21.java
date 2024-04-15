package JOBSHEET7.Percobaan1;

public class Gudang21 {
    Barang21[] tumpukan;
    int size;
    int top;

    public Gudang21(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang21[size];
        top = -1;
    }

    public boolean cekKosong(){
        if (top == 1) {
            return true;
        }else {
            return false;
        }
    }

    public boolean cekPenuh(){
        if (top == size -1) {
            return true;
        }else {
            return false;
        }
    }

    public String konversiDesimalkeBiner(int kode){
        StackKonversi21 stack = new StackKonversi21();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public void tambahBarang(Barang21 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+brg.nama+" berhasil ditambahkan ke Gudang");
        }else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang21 ambilBarang(){
        if (!cekPenuh()) {
            Barang21 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" diambil dari Gudang");
            System.out.println("Kode unik dalam biner : "+konversiDesimalkeBiner(delete.kode));
            return delete;            
        }else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang21 lihatBarangTeratas(){
        if (!cekPenuh()) {
            Barang21 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : "+barangTeratas.nama);
            return barangTeratas;
        }else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang(){
        if (!cekPenuh()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode,tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
}
