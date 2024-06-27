import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
//        C(n,r) = n! / (r! * (n-r)!)
        Scanner scan = new Scanner(System.in);

        System.out.print("n elemanı: ");
        int n = scan.nextInt();

        int n_faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            n_faktoriyel *= i;
        }

        System.out.print("r elemanı: ");
        int r = scan.nextInt();

        int r_faktoriyel = 1;
        for (int i = 1; i <= r; i++) {
            r_faktoriyel *= i;
        }

        int n_r_faktoriyel = 1;
        for (int i = 1; i <= (n - r); i++) {
            n_r_faktoriyel *= i;
        }
        System.out.println("C(" + n + "," + r + ")= " + (n_faktoriyel / (r_faktoriyel * n_r_faktoriyel)));
    }
}
