
import java.util.Scanner;

public class NSiralama {
    public static void main(String[] args) {
        //girilen n tane sayidan en büyüğünü ve en küçüğünü ekrana yazdıran program
        Scanner inp = new Scanner(System.in);
        int size;
        int buyukSayi = 0;
        int kucukSayi = 0;
        System.out.print("Girilecek sayı miktarı: ");
        size = inp.nextInt();
        for (int i = 1; i <= size ; i++) {
            System.out.print( i + ". sayıyı giriniz: ");
            int n = inp.nextInt();

            if (i == 1){
                buyukSayi = n;
                kucukSayi = n;
            }
            if ( n > buyukSayi ){
                buyukSayi = n;
            }
            if (n < kucukSayi){
                kucukSayi = n;
            }

        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("En büyük değer: " + buyukSayi);
        System.out.println("En küçük değer: " + kucukSayi);
    }

}
