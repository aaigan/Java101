import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        String soru = "kaç kilo? :";
        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5.0;
        double ak, ek, dk, mk, pk, top;

       Scanner inp = new Scanner(System.in);

       System.out.print("Armut " + soru);
        ak = inp.nextDouble();
       System.out.print("Elma " + soru);
        ek = inp.nextDouble();
       System.out.print("Domates " + soru);
        dk = inp.nextDouble();
       System.out.print("Muz " + soru);
        mk = inp.nextDouble();
       System.out.print("Patlıcan " + soru);
        pk = inp.nextDouble();

        top = ( ak * a ) + ( ek * e ) + ( dk * d ) + ( mk * m ) + ( pk * p );
        System.out.println("Toplam Tutar Yalnız " + top + " Türk lirası'dır");



        /*
Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL*/
    }
}
