
public class RoyalGarden {
    static double[] totalPendapatan = new double[4];
    static String[][] RoyalGarden = {
        {"","Aglonema","Keladi","Alocasia","Mawar"},
        {"RoyalGarden 1","10","5","15","7"},
        {"RoyalGarden 2","6","11","9","12"},
        {"RoyalGarden 3","2","10","10","5"},
        {"RoyalGarden 4","5","7","12","9"}
    };

    public static void main(String[] args) {
        for (int i = 0; i < RoyalGarden.length; i++) {
            System.out.printf("%-15s %10s  %8s  %10s  %7s\n", RoyalGarden[i][0], RoyalGarden[i][1], RoyalGarden[i][2], RoyalGarden[i][3], RoyalGarden[i][4]);
        }
        System.out.println();
        System.out.println("Total Pendapatan :");
        for (int i = 1; i < RoyalGarden.length; i++) {
            hitungPendapatan(i);
        }
        for (int i = 1; i < RoyalGarden.length; i++) {
            hitungPenguranganStok(i);
        }
        System.out.println();
        System.out.println("Hasil Pengurangan Stok :");
        for (int i = 0; i < RoyalGarden.length; i++) {
            System.out.printf("%-15s %10s  %8s  %10s  %7s\n", RoyalGarden[i][0], RoyalGarden[i][1], RoyalGarden[i][2], RoyalGarden[i][3], RoyalGarden[i][4]);
        }

    }

    static void hitungPendapatan(int cabang) {
        double totalAglonema = Double.parseDouble(RoyalGarden[cabang][1]) * 75000;
        double totalKeladi = Double.parseDouble(RoyalGarden[cabang][2]) * 50000;
        double totalAlocasia = Double.parseDouble(RoyalGarden[cabang][3]) * 60000;
        double totalMawar = Double.parseDouble(RoyalGarden[cabang][4]) * 10000;
        totalPendapatan[cabang - 1] = totalAglonema + totalAlocasia + totalKeladi + totalMawar;
        System.out.printf("Total Pendapatan %s = Rp. %.2f\n", RoyalGarden[cabang][0], totalPendapatan[cabang - 1]);
    }

    static void hitungPenguranganStok(int cabang) {
        int[] stokBerkurang = {1,2,0,5};
        for (int i = 1; i < RoyalGarden[cabang].length; i++) {
            int stok = Integer.parseInt(RoyalGarden[cabang][i]);
            stok -= stokBerkurang[i - 1];
            RoyalGarden[cabang][i] = String.valueOf(stok);
        }
    }
}