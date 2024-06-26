import java.util.Scanner;

public class TekBirSayiGirileneKadarSayilarinToplaminiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.print("Lütfen bir sayı giriniz:");
            int sayi = scan.nextInt();

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
