import java.util.Scanner;

public class UsHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayi: ");
        int n = scan.nextInt();
        System.out.print("Üs olacak sayi: ");
        int k = scan.nextInt();

        int sonuc = 1;
        for (int i = 1; i <= k; i++) {
            sonuc *= n;
        }
        System.out.println(n + " üssü " + k + " = " + sonuc);
    }
}