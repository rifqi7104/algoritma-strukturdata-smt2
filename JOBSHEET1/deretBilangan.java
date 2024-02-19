import java.util.Scanner;

public class deretBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input NIM : ");
        String NIM = sc.next();
        String duaAngka = NIM.substring(NIM.length()-2);
        int n = Integer.parseInt(duaAngka);
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println("\nn = "+n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else {
                if (i%2 == 0) {
                    System.out.print(i);
                } else{
                    System.out.print("*");
                }
            }
        }
    }    
}
