import java.util.Scanner;

public class TekBirSayiGirileneKadarSayilarinToplaminiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int sayi = scan.nextInt();
        int toplam = 0;

        while (sayi % 2 == 0) {
            System.out.print("Lütfen bir sayı giriniz:");
            sayi = scan.nextInt();

            if (sayi % 2 != 0) {
                break;
            }
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }
        System.out.println("Toplam:" + toplam);
    }
}
