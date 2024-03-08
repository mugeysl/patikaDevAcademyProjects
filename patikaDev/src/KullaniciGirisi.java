import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] aargs) {
        Scanner scan = new Scanner(System.in);
        String kullaniciAdi = "mugeyisill", sifre = "123456", kullaniciAdiKontrol, sifreKontrol;

        System.out.print("Kullanici adini giriniz: ");
        kullaniciAdiKontrol = scan.nextLine();
        System.out.print("Sifreyi giriniz: ");
        sifreKontrol = scan.nextLine();

        if (kullaniciAdiKontrol.equals(kullaniciAdi) && sifreKontrol.equals(sifre)) {
            System.out.println("Kullanici girisi basarili!");
        } else if (!sifreKontrol.equals(sifre)) {
            System.out.print("Sifreniz hatali sifrenizi sifirlamak ister misiniz? E/H : ");
            String secim = scan.nextLine();
            if (secim.equals("e")) {
                System.out.println("!!!Yeni sifreniz eski sifrenizden farkli olmalıdır!!!");
                System.out.print("Yeni sifreniz: ");
                String yeniSifre = scan.nextLine();
                if (yeniSifre.equals(sifre) || yeniSifre.equals(sifreKontrol)) {
                    System.out.println("Sifre olusturulamadi, lütfen baska sifre giriniz!");
                } else if (!sifre.equals(yeniSifre)) {
                    System.out.println("Sifre olusturuldu.");
                } else {
                    System.out.println("Hatali giris yaptiniz!!");
                }
            } else if (secim.equals("h")) {
                System.out.println("Sifre yenilemek istemediniz. Sifrenizi yazarak giris yapabilirsiniz.");
            }
        } else {
            System.out.println("Hatali giris yaptiniz!!");
        }
    }
}