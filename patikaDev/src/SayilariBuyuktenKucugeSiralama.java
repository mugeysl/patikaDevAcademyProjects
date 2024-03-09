import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        a = scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        b = scan.nextInt();
        System.out.print("Ucuncu sayiyi giriniz: ");
        c = scan.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else if (c > b) {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else if (c > a) {
                System.out.println("b > c > a");
            }
        } else if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println("c > a > b");
            } else if (b > a) {
                System.out.println("c > b > a");
            }
        }
    }
}
