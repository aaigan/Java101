import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {

        int k1, k2, k3;

        Scanner inp = new Scanner(System.in);

        System.out.print("1'inci kenar uzunluğunu giriniz : ");
        k1 = inp.nextInt();
        System.out.print("2'inci kenar uzunluğunu giriniz : ");
        k2 = inp.nextInt();
        System.out.print("3'üncü kenar uzunluğunu giriniz : ");
        k3 = inp.nextInt();
        float u = (k1 + k2 + k3)/2;
        float alanKare = u * (u - k1) * (u - k2) * (u - k3);

        System.out.print("Üçgenin Alanı " + Math.sqrt(alanKare));

        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //
        //𝑢 = (a+b+c) / 2
        //
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)



    }
}
