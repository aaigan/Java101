import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {

        //formul Kilo (kg) / Boy(m) * Boy(m)
        double kilo, boy, endex;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz (kg) : ");
        kilo = inp.nextDouble();
        System.out.print("Boyunuzu giriniz (m) : ");
        boy = inp.nextDouble();
        endex = kilo / (boy * boy);
        System.out.print("Vücut Kitle Endeksiniz : " + endex );


    }

}
