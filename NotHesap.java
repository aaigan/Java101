import java.util.Scanner;
public class NotHesap {
    public static void main(String[] args) {
        int mat, fiz, kim, bio, muz, tar, ort;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notu Giriniz : ");
        mat = inp.nextInt();
        System.out.print("Fizik Notu Giriniz : ");
        fiz = inp.nextInt();
        System.out.print("Kimya Notu Giriniz : ");
        kim = inp.nextInt();
        System.out.print("Biyoloji Notu Giriniz : ");
        bio = inp.nextInt();
        System.out.print("Müzik Notu Giriniz : ");
        muz = inp.nextInt();
        System.out.print("Tarih Notu Giriniz : ");
        tar = inp.nextInt();

        ort = (mat + fiz + kim + bio + muz + tar) / 6;
        System.out.println("Ortalamanız : " + ort);
        if( ort >= 50 ){
            System.out.println("Tebrikler, GEÇTİNİZ!");
        }else {
            System.out.println("KALDINIZ!");
        }



    }
}
