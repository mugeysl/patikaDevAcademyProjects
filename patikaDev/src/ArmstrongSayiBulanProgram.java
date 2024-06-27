import java.util.Scanner;

public class ArmstrongSayiBulanProgram {
    public static void main(String[] args) {
//        N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
//        Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        int basamakSayisi = 0;
        int tempSayi = sayi;
        int basamakDegeri;
        int sonuc = 0;
        int basamakUssu;

        while (tempSayi != 0) {
            tempSayi /= 10;
            basamakSayisi++;
        }

        tempSayi = sayi;

        while (tempSayi != 0) {
            basamakDegeri = tempSayi % 10;
            basamakUssu = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                basamakUssu *= basamakDegeri;
            }
            sonuc += basamakUssu;
            tempSayi /= 10;
        }
        System.out.println("Sonuç= " + sonuc);
    }
}