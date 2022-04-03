import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        //açılış ücreti 10
        //km başına 2.20
        //min tutar 20
        int km;
        double perKm = 2.20, total;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafe Giriniz :");
        km = inp.nextInt();
        total = (km * perKm);
        total += 10;
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Ücret : " + total + " Türk Lirası");


    }
}
