import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutFiyati = 2.14, elmaFiyati = 3.67, domatesFiyati = 1.11, muzFiyati = 0.95, patlicanFiyati = 5;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Kaç kilo armut almak istiyorsunuz? : ");
        double armut = scan.nextDouble();

        System.out.print("Kaç kilo elma almak istiyorsunuz? : ");
        double elma = scan.nextDouble();

        System.out.print("Kaç kilo domates almak istiyorsunuz? : ");
        double domates = scan.nextDouble();

        System.out.print("Kaç kilo muz almak istiyorsunuz? : ");
        double muz = scan.nextDouble();

        System.out.print("Kaç kilo patlican almak istiyorsunuz? : ");
        double patlican = scan.nextDouble();

        double toplamTutar = (armut * armutFiyati) + (elma * elmaFiyati) + (domates * domatesFiyati) + (muz * muzFiyati) + (patlican * patlicanFiyati);
        System.out.println("Toplam tutar= " + toplamTutar);
    }
}