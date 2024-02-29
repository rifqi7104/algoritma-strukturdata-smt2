package JOBSHEET3.PersegiPanjang;
import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak baris pada array : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan banyak kolom pada array : ");
        int kolom = sc.nextInt();
        PersegiPanjang[][] ppArray = new PersegiPanjang[baris][kolom];

        for (int i = 0; i < ppArray.length; i++) {
            for (int j = 0; j < ppArray[i].length; j++){
                ppArray[i][j] = new PersegiPanjang();
                System.out.println("Persegi Panjang baris ke- "+i+" kolom ke- "+j);
                System.out.print("Masukkan panjang : ");
                ppArray[i][j].panjang = sc.nextInt();
                System.out.print("Masukkan lebar : ");
                ppArray[i][j].lebar = sc.nextInt();
            }
        }
        for (int i = 0; i < ppArray.length; i++) {
            for (int j = 0; j < ppArray[i].length; j++) {
                System.out.println("Persegi Panjang baris ke- "+i+" kolom ke- "+j);
                System.out.println("Panjang: "+ ppArray[i][j].panjang + ", lebar: " + ppArray[i][j].lebar);
            }
        }
    }
}
