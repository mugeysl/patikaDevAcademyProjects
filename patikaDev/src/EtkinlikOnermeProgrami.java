import java.util.Scanner;

public class EtkinlikOnermeProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sicakligini giriniz : ");
        int havaSicakligi = input.nextInt();

        if (havaSicakligi <= 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if ((5 <= havaSicakligi) && (havaSicakligi <= 10)) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if ((10 <= havaSicakligi) && (havaSicakligi <= 15)) {
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.println("Piknige gidebilirsiniz.");
        } else if ((15 <= havaSicakligi) && (havaSicakligi <= 25)) {
            System.out.println("Piknige gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}