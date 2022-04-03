import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {

        double para, net, vtutar;
        double vOran;

        Scanner inp = new Scanner(System.in);

        System.out.println("Para tutarı giriniz : ");
        para = inp.nextInt();


        vOran1 = 0.18;
        vOran2 = 0.08;
        boolean kdv = para < 1000;
        double hangiOran = kdv ? vOran1 : vOran2;
        vtutar = para * hangiOran;
        System.out.println("KDV tutarı : " + vtutar);
        net = para + vtutar;
        System.out.println("Toplam Tutar : " + net);
    }
}
