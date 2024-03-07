import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        double mesafe, kmBasiTutar = 2.20, acilisUcreti = 10, toplamMesafeUcreti, minOdenecekTutar = 20;
        Scanner scan = new Scanner(System.in);
        System.out.print("Gitmek istediginiz mesafeyi KM cinsinden giriniz: ");
        mesafe = scan.nextDouble();
        toplamMesafeUcreti = acilisUcreti + (mesafe * kmBasiTutar);
        boolean kosul = toplamMesafeUcreti < 20;
        toplamMesafeUcreti = (kosul) ? toplamMesafeUcreti = minOdenecekTutar : toplamMesafeUcreti;
        System.out.println("Toplam mesafe ucreti= " + toplamMesafeUcreti);
    }
}
