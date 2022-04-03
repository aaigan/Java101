import java.util.Scanner;
public class CalculatorBasıc {
    public static void main(String[] args) {
        int a, b, select;

        Scanner giris = new Scanner(System.in);
        System.out.print("1'inci sayıyı giriniz : ");
        a = giris.nextInt();
        System.out.print("2'inci sayıyı giriniz : ");
        b = giris.nextInt();
        System.out.print("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme\nSeçiniz : ");
        select = giris.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam : " + (a + b) );
                break;
            case 2:
                System.out.println("Sonuç : " + (a - b) );
                break;
            case 3:
                System.out.println("Sonuç : " + (a * b) );
                break;
            case 4:
                System.out.println("Sonuç : " + (a / b) );
            default:
                System.out.println("Hatalı seçim yaptınız" );
        }

    }
}
