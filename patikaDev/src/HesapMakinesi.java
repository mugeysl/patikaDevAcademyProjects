import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double sayi1, sayi2, sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen islem yapmak istediginiz ilk sayiyi giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("Toplama:1 \nCikarma:2 \nCarpma:3 \nBolme:4 \nLütfen yapmak istediginiz islemi giriniz: ");
        int islem = scan.nextInt();
        System.out.print("Lütfen islem yapmak istediginiz ikincic sayiyi giriniz: ");
        sayi2 = scan.nextInt();

        switch (islem) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuc= " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuc= " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuc= " + sonuc);
                break;
            case 4:
                boolean kosul = (sayi2!= 0);
                System.out.println("Sonuc= " + ((kosul) ? (sayi1 / sayi2) : "Bir sayi sifira bolunmez!"));
                break;
            default:
                System.out.println("Hatali giris yaptiniz!");
        }
    }
}