import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        int taban, yukseklik;
        double hipotenus;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hipotenusunu hesaplamak istedeginiz ucgen olculerini giriniz:");
        System.out.print("Taban= ");
        taban = scan.nextInt();
        System.out.print("Yukseklik= ");
        yukseklik = scan.nextInt();

        hipotenus = Math.sqrt((taban * taban) + (yukseklik * yukseklik));
        System.out.println("Hipotenus= " + hipotenus);

    }
}
