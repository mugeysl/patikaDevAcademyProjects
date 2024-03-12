import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Artik yil olup olmadigini hesaplamak istediginiz yil:");
        yil = scan.nextInt();
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.print(yil + " artik yildir.");
                } else {
                    System.out.print(yil + " artik yil degildir!");
                }
            } else {
                System.out.print(yil + " artik yildir.");
            }
        } else {
            System.out.print(yil + " artik yil degildir!");
        }
    }
}