import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] aargs) {
        String kullaniciAdi, sifre;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanici adini giriniz: ");
        kullaniciAdi = scan.nextLine();
        System.out.print("Sifreyi giriniz: ");
        sifre = scan.nextLine();

        if (kullaniciAdi.equals("mugeyisill") && sifre.equals("123456")) {
            System.out.println("Kullanici girisi basarili!");
        } else if (!sifre.equals("123456")) {
            System.out.print("Sifrenizi sifirlamak ister misiniz? E/H : ");
            String secim = scan.nextLine();

            if (secim.equals("e")) {
                System.out.println("!!!Yeni sifreniz eski sifrenizden farklı olmalıdır!!!");
                System.out.print("Yeni sifreniz: ");
                String yeniSifre = scan.nextLine();
                if (yeniSifre.equals(sifre)) {
                    System.out.println("Sifre olusturulamadi, lütfen baska sifre giriniz!");
                } else if (!yeniSifre.equals(sifre)) {
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
