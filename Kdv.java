import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {

        double para, net, vtutar;
        double vOran;

        Scanner inp = new Scanner(System.in);

        System.out.println("Para tutarı giriniz : ");
        para = inp.nextInt();


        vOran = 0.18;
        vtutar = para * vOran;
        System.out.println("KDV tutarı : " + vtutar);

        net = para + vtutar;
        System.out.println("Toplam Tutar : " + net);
    }
}
