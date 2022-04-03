import java.util.Scanner;

public class DaireHesap {
    public static void main(String[] args) {
        double r, alan, cevre;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçap Giriniz : ");
        r = inp.nextDouble();
        alan = 3.14 * r * r;
        cevre = 2 * 3.14 * r;
        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Dairenin Çevresi :" + cevre);


    }
}
