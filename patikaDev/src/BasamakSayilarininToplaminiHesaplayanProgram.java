import java.util.Scanner;

public class BasamakSayilarininToplaminiHesaplayanProgram {
    public static void main(String[] args) {
//        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
//        Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        int basamakDegeri;
        int toplam = 0;

        while (true) {
            basamakDegeri = sayi % 10;
            System.out.println(basamakDegeri);
            toplam += basamakDegeri;
            sayi /= 10;
            if (sayi == 0) {
                break;
            }
        }
        System.out.println("Sonuç= " + toplam);
    }
}