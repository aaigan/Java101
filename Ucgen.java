import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {

        int k1, k2;
        double k3;

        Scanner inp = new Scanner(System.in);

        System.out.print("1'inci kenar uzunluğunu giriniz : ");
        k1 = inp.nextInt();
        System.out.print("2'inci kenar uzunluğunu giriniz : ");
        k2 = inp.nextInt();
        k3 = Math.sqrt((k1*k1) + (k2*k2));

        System.out.print("Hipotenüs Uzunluğu : " + k3);



    }
}
