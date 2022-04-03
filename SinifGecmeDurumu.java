import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //
        //Geçme Notu : 55
        int mat, fiz, tur, kim, muz;
        float ort;

        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notu Giriniz :");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100){
            mat = 0;
        }
        System.out.println("Fizik Notu Giriniz :");
        fiz = inp.nextInt();
        if (fiz < 0 || fiz > 100){
            fiz = 0;
        }
        System.out.println("Türkçe Notu Giriniz :");
        tur = inp.nextInt();
        if (tur < 0 || tur > 100){
            tur = 0;
        }
        System.out.println("Kimya Notu Giriniz :");
        kim = inp.nextInt();
        if (kim < 0 || kim > 100){
            kim = 0;
        }
        System.out.println("Müzik Notu Giriniz :");
        muz = inp.nextInt();
        if (muz < 0 || muz > 100){
            muz = 0;
        }
        ort = (mat + fiz + tur + kim + muz)/5;
        if ( ort >= 55 ){
            System.out.println("geçtiniz");
        }else{
            System.out.println("kaldınız");
        }
        System.out.println("ortalamanız :" + ort);
    }
}