import java.util.Scanner;
public class NotHesap {
    public static void main(String[] args) {
        int fiz, kim, tur, muz, tar, ort;

        Scanner inp = new Scanner(System.in);
        System.out.print("Fizik Notu Giriniz : ");
        fiz = inp.nextInt();
        System.out.print("Kimya Notu Giriniz : ");
        kim = inp.nextInt();
        System.out.print("Türkçe Notu Giriniz : ");
        tur = inp.nextInt();
        System.out.print("Müzik Notu Giriniz : ");
        muz = inp.nextInt();
        System.out.print("Tarih Notu Giriniz : ");
        tar = inp.nextInt();

        ort = ( fiz + kim + tur + muz + tar) / 5;
        System.out.println("Ortalamanız : " + ort);
        boolean sonuc = ort >= 60;
        String gectiKaldi = sonuc ? " Tebrikler, Geçtiniz !" : "Kaldınız !";
        System.out.println(gectiKaldi);



    }
}
