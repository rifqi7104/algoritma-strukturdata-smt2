import java.util.Scanner;

public class tugas1 {
    static char[] Kode = {
        'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'
    };    
    static char[][] Kota = {
        { 'B', 'A', 'N', 'T', 'E', 'N' },
        { 'D', 'K', 'I', ' ', 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
        { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
        { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
        { 'B', 'O', 'G', 'O', 'R' },
        { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
        { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
        { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
        {  'M', 'A', 'L', 'A', 'N', 'G' },
        { 'T', 'E', 'G', 'A', 'L' }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        char kodePlat = scanner.next().charAt(0);
        int index = -1;
        int x = 0;
        String namaKota = new String(Kota[x]);
        for (int i = 0; i < Kode.length; i++) {
            if (kodePlat == Kode[i]) {
                index = i;
                x = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Kode plat mobil tidak ditemukan!");
        } else {
            System.out.print("Kota: "+namaKota);
        }
    }
}
