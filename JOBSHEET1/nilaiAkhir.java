import java.util.Scanner;

public class nilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tugas, Kuis, UTS, UAS;
        double nilaiAkhir = 0, nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        String nilaiHuruf = null;
        for (int index = 0; index <= 20; index++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("Masukkan nilai Tugas : ");
        Tugas = sc.nextInt();
        System.out.print("Masukkan nilai Kuis : ");
        Kuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        UTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        UAS = sc.nextInt();
        for (int index = 0; index <= 20; index++) {
            System.out.print("=");
        }
        if ((Tugas >= 0 && Tugas <= 100) && (Kuis >= 0 && Kuis <= 100) && (UTS >= 0 && UTS <= 100)
                && (UAS >= 0 && UAS <= 100)) {
            nilaiAkhir += (nilaiTugas = Tugas * 20 / 100);
            nilaiAkhir += (nilaiKuis = Kuis * 20 / 100);
            nilaiAkhir += (nilaiUTS = UTS * 30 / 100);
            nilaiAkhir += (UAS = UAS * 30 / 100);
            if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
                nilaiHuruf = "D";
            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
            }

        } else {
            System.out.println();
            for (int index = 0; index <= 20; index++) {
                System.out.print("=");
            }
            System.out.println();
            System.out.println("Nilai Tidak Valid");
            for (int index = 0; index <= 20; index++) {
                System.out.print("=");
            }
            System.out.println();
            for (int index = 0; index <= 20; index++) {
                System.out.print("=");
            }
            System.exit(0);
        }
        System.out.println();
        for (int index = 0; index <= 20; index++) {
            System.out.print("=");
        }
        if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            System.out.println();
            System.out.println("Nilai Akhir = " + nilaiAkhir);
            System.out.println("Nilai Huruf = " + nilaiHuruf);
            for (int index = 0; index <= 20; index++) {
                System.out.print("=");
            }
            System.out.println("ANDA TIDAK LULUS");
        } else {
            System.out.println();
            System.out.println("Nilai Akhir = " + nilaiAkhir);
            System.out.println("Nilai Huruf = " + nilaiHuruf);
            for (int index = 0; index <= 20; index++) {
                System.out.print("=");
            }
            System.out.println();
            for (int index = 0; index <= 20; index++) {
                System.out.print("=");
            }
            System.out.println();
            System.out.println("SELAMAT ANDA LULUS");
        }

    }
}