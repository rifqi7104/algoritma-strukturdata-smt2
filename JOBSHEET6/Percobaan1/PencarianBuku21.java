public class PencarianBuku21 {
    Buku21 listBk[] = new Buku21[5];
    int idx;

    void tambah(Buku21 m){
        if(idx < listBk.length){
            listBk[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for (Buku21 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public Buku21 findBuku(String cari) {
        int posisi = findSeqSearchString(cari);
        return (posisi != -1) ? listBk[posisi] : null;
    }

    int findSeqSearchString(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void TampilPosisi(String x, int pos){
        if (pos != 1) {
            System.out.println("data "+ x + " ditemukan pada indeks ke-"+pos);
        }else {
            System.out.println("data "+ x + " tidak ditemukan");
        }
    }

    void tampilDataPosisi(String x, int pos){
        if (pos != 1) {
            System.out.println("Kode Buku\t : "+ x);
            System.out.println("Judul\t\t : "+ listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : "+ listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : "+ listBk[pos].pengarang);
            System.out.println("Stock\t\t : "+ listBk[pos].stock);
        } else {
            System.out.println("data "+ x + " tidak ditemukan");
        }
    }

    int findBinarySearchString(String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            int comparison = cari.compareTo(listBk[mid].kodeBuku);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                return findBinarySearchString(cari, left, mid - 1);
            } else {
                return findBinarySearchString(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int findSeqSearchJudul(String cari){
        int count = 0;
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.toLowerCase().contains(cari.toLowerCase())) {
                posisi = i;
                count++;
            }
        }
        if(count > 1){
            System.out.println(count + " data ditemukan dengan judul yang sama!");
        }
        return posisi;
    }

    void sort(){
        int length = listBk.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku21 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    int findBinarySearchJudul(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            int comparison = listBk[mid].judulBuku.compareToIgnoreCase(cari); 
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                return findBinarySearchJudul(cari, mid + 1, right);
            } else {
                return findBinarySearchJudul(cari, left, mid - 1);
            }
        }
        return -1;
    }
}
