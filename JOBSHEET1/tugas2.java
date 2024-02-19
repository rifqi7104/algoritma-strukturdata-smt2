import java.util.Scanner;
public class tugas2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        switch (pilihMenu()) {
            case 1:
                rumusKecepatan();
                break;
        
            case 2:
                rumusJarak();
                break;
        
            case 3:
                rumusWaktu();
                break;
        
            default:
                break;
        }
    }

    static int pilihMenu(){
        System.out.println("Daftar Rumus");
        System.out.println("1. Rumus Kecepatan");
        System.out.println("2. Rumus Jarak");
        System.out.println("3. Rumus Waktu");
        System.out.print("Pilih Rumus : ");
        int X = sc.nextInt();
        return X;
    }
    static void rumusKecepatan(){
        System.out.print("Masukkan nilai Jarak (s) dalam meter: ");
        double Jarak = sc.nextInt();
        System.out.print("Masukkan nilai Waktu (t) dalam sekon : ");
        double Waktu = sc.nextInt();
        double hasil = Jarak / Waktu;
        System.out.print("Jarak = "+Jarak);
        System.out.print("\nWaktu = "+Waktu);
        System.out.print("\nRumus = "+hasil);
    }
    static void rumusJarak(){
        System.out.print("Masukkan nilai Kecepatan (v) dalam m/s: ");
        double Kecepatan = sc.nextInt();
        System.out.print("Masukkan nilai Waktu (t) dalam sekon : ");
        double Waktu = sc.nextInt();
        double hasil = Kecepatan * Waktu;
        System.out.print("Kecepatan = "+Kecepatan);
        System.out.print("\nWaktu = "+Waktu);
        System.out.print("\nRumus = "+hasil);
    }
    static void rumusWaktu(){
        System.out.print("Masukkan nilai Jarak (s) dalam meter: ");
        double Jarak = sc.nextInt();
        System.out.print("Masukkan nilai Kecepatan (v) dalam m/s : ");
        double Kecepatan = sc.nextInt();
        double hasil = Jarak / Kecepatan;
        System.out.print("Jarak = "+Jarak);
        System.out.print("\nKecepatan = "+Kecepatan);
        System.out.print("\nRumus = "+hasil);
    }
}
