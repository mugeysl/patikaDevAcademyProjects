import java.util.Scanner;

public class UceVeDordeTamBolunenSayilarinOrtalamasiniHesaplayanProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen sayi giriniz: ");
        int sayi = scan.nextInt();
        int toplam = 0, sayac = 0;
        double ortalama;


        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {  // '&' yerine '&&' kullanın
                toplam += i;
                sayac++;
            }
        }
        if (sayac > 0) {
            ortalama = (double) toplam / sayac;  // Ortalamayı double olarak hesaplayın
            System.out.println("Ortalama= " + ortalama);
        } else {
            System.out.println("0 ile " + sayi + " arasında hem 3'e hem de 4'e bölünebilen bir sayı bulunamadı.");
        }
    }
}
