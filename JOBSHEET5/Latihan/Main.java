package JOBSHEET5.Latihan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService hotel = new HotelService();
        Hotel h1 = new Hotel("TidurNyenyak", "Malang", 2500000, (byte)5);
        Hotel h2 = new Hotel("SariSari", "Lampung", 500000, (byte)2);
        Hotel h3 = new Hotel("NyamanDisini", "Surabaya", 1500000, (byte)4);
        Hotel h4 = new Hotel("NgantukYa", "Jakarta", 1000000, (byte)3);
        Hotel h5 = new Hotel("JanganLupaTidur", "Bekasi", 150000, (byte)1);

        hotel.tambah(h1);
        hotel.tambah(h2);
        hotel.tambah(h3);
        hotel.tambah(h4);
        hotel.tambah(h5);

        System.out.println("Daftar Hotel");
        System.out.println("--------------------------");
        hotel.tampilAll();
        
        System.out.println("Jenis Filter : ");
        System.out.println("1. Urutkan Berdasarkan Harga");
        System.out.println("2. Urutkan Berdasarkan Bintang");
        System.out.print("Pilih Filter : ");
        int filter = sc.nextInt();
        System.out.println("--------------------------");
        

        switch (filter) {
            case 1:
                System.out.println("Daftar Hotel Berdasarkan Harga");
                hotel.bubbleSortHarga();
                hotel.tampilAll();
                break;
            case 2:
                System.out.println("Daftar Hotel berdasarkan Bintang");
                hotel.selectionSortBintang();
                hotel.tampilAll();
            default:
                break;
        }

    }
}
