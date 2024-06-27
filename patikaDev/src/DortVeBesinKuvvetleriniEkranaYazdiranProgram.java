import java.util.Scanner;

public class DortVeBesinKuvvetleriniEkranaYazdiranProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır sayısı giriniz: ");

        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i *= 4) {

            System.out.println(i);
        }

        for (int i = 1; i <= sayi; i *= 5) {

            System.out.println(i);
        }
    }
}
