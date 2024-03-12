import javax.sql.rowset.serial.SerialStruct;
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double toplamFiyat, indirimliFiyat, mesafeBasinaUcret = 0.10;

        Scanner scan = new Scanner(System.in);
        System.out.print("KM cinsinden mesafeyi giriniz: ");
        mesafe = scan.nextInt();
        System.out.print("Yasinizi giriniz: ");
        yas = scan.nextInt();
        System.out.print("1| Tek yön\n2| Gidis-Dönüs\nYolculuk tipi giriniz: ");
        yolculukTipi = scan.nextInt();

        toplamFiyat = mesafeBasinaUcret * mesafe;

        if ((mesafe > 0) && (yas > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12) {
                toplamFiyat = toplamFiyat - ((toplamFiyat) * 0.5);
                if (yolculukTipi == 2) {
                    indirimliFiyat = (toplamFiyat - ((toplamFiyat) * 0.2)) * 2;
                    System.out.println("Ödenecek tutar= " + indirimliFiyat);
                } else {
                    System.out.println("Ödenecek tutar= " + toplamFiyat);
                }
            } else if (yas > 12 && yas < 24) {
                toplamFiyat = toplamFiyat - ((toplamFiyat) * 0.1);
                if (yolculukTipi == 2) {
                    indirimliFiyat = (toplamFiyat - ((toplamFiyat) * 0.2)) * 2;
                    System.out.println("Ödenecek tutar= " + indirimliFiyat);
                } else {
                    System.out.println("Ödenecek tutar= " + toplamFiyat);
                }
            } else if (yas > 65) {
                toplamFiyat = toplamFiyat - ((toplamFiyat) * 0.3);
                if (yolculukTipi == 2) {
                    indirimliFiyat = (toplamFiyat - ((toplamFiyat) * 0.2)) * 2;
                    System.out.println("Ödenecek tutar= " + indirimliFiyat);
                } else {
                    System.out.println("Ödenecek tutar= " + toplamFiyat);
                }
            } else {
                if (yolculukTipi == 2) {
                    indirimliFiyat = (toplamFiyat - ((toplamFiyat) * 0.2)) * 2;
                    System.out.println("Ödenecek tutar= " + indirimliFiyat);
                } else {
                    System.out.println("Ödenecek tutar= " + toplamFiyat);
                }
            }
        } else {
            System.out.println("Hatali Veri Girdiniz!!");
        }
    }
}