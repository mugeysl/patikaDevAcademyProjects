import java.util.Scanner;

public class DaireAlanVeCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        int yaricap;
        double alan, cevre, pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz: ");
        yaricap = scan.nextInt();
        alan = pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;
        System.out.println("Dairenin alani= " + alan);
        System.out.println("Dairenin cevresi= " + cevre);
    }
}
