import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, fiz, kim, bio, mzk, tar;


        Scanner inp = new Scanner(System.in);


        //kullanıcıdan veri almak için
        System.out.println("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz :");
        fiz = inp.nextInt();

        System.out.println("Kimya Notunuz :");
        kim = inp.nextInt();

        System.out.println("Biyoloji Notunuz :");
        bio = inp.nextInt();

        System.out.println("Müzik Notunuz :");
        mzk = inp.nextInt();

        System.out.println("Tarih Notunuz :");
        tar = inp.nextInt();


        double top = fiz + kim + bio + mat + tar + mzk;
        double ort = top / 6.0;
        System.out.println("Ortalamanız :  " + ort );

        if( ort < 55.0 ){
            System.out.println("Kaldınız");
        }else if ( ort == 55.0 ){
            System.out.println("Bütünlemeye Kaldınız");
        }else {
            System.out.println("Tebrikler, Geçtiniz !");
        }


    }
}
