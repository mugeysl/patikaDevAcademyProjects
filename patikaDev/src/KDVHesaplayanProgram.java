import java.util.Scanner;

public class KDVHesaplayanProgram {
    public static void main(String[] args) {

        double KDV = 0.18;
        Scanner scanner = new Scanner(System.in);
        System.out.print("KDV'sini hesaplamak istediginiz sayiyi giriniz: ");
        int sayi = scanner.nextInt();

        double KDVli_Fiyat = sayi + (sayi * KDV);
        double KDV_Tutari = KDVli_Fiyat - sayi;

        System.out.println("KDV'siz Fiyat= " + sayi);
        System.out.println("KDV'li Fiyat= " + KDVli_Fiyat);
        System.out.println("KDV Tutari= " + KDV_Tutari);

    }
}