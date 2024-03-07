import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        double boy, kilo, vucutKitleIndeksi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinde giriniz: ");
        boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();
        vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz= " + vucutKitleIndeksi);
    }
}