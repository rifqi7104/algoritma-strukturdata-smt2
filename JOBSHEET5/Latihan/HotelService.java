package JOBSHEET5.Latihan;

public class HotelService {
    Hotel[] rooms = new Hotel[5];
    int rmx;

    void tambah(Hotel H){
        if (rmx < rooms.length) {
            rooms[rmx] = H;
            rmx++;
        }else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll(){
        for (Hotel rm : rooms) {
            System.out.println("Nama     : "+rm.nama);
            System.out.println("Kota     : "+rm.kota);
            System.out.println("Harga    : "+rm.harga);
            System.out.println("Bintang  : "+rm.bintang);
            System.out.println("--------------------------");
        }
    }

    void bubbleSortHarga(){
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga > rooms[j-1].harga){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortBintang(){
        for (int i = 0; i < rooms.length-1; i++) {
            int rmxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[rmxMin].bintang) {
                    rmxMin = j;
                }
            }
            Hotel tmp = rooms[rmxMin];
            rooms[rmxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
