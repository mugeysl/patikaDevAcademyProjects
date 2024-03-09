import java.util.Scanner;

public class SinifGecmeDurumuHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mat, fizik, kimya, turkce, tarih, toplamNot = 0, toplamDers = 0;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();
        if (mat <= 100 && mat >= 0) {
            toplamNot += mat;
            toplamDers++;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();
        if (fizik <= 100 && fizik >= 0) {
            toplamNot += fizik;
            toplamDers++;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();
        if (kimya <= 100 && kimya >= 0) {
            toplamNot += kimya;
            toplamDers++;
        }
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scan.nextInt();
        if (turkce <= 100 && turkce >= 0) {
            toplamNot += turkce;
            toplamDers++;
        }
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scan.nextInt();
        if (tarih <= 100 && tarih >= 0) {
            toplamNot += tarih;
            toplamDers++;
        }

        double ortalama = toplamNot / toplamDers;
        if (ortalama >= 55) {
            System.out.println("Sinifi gectiniz!!");
        } else {
            System.out.println("Sinifta kaldiniz!!");
        }
        System.out.println("Ortalamaniz: " + ortalama);
    }
}
