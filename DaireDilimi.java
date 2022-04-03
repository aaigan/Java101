import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        int r;
        double pi = 3.14, alfa, alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yariçap Giriniz : ");
        r = inp.nextInt();
        System.out.print("Açı Giriniz : ");
        alfa = inp.nextDouble();

        alan = pi * r * r * alfa;
        System.out.println("Alan : " + alan);

    }
}
