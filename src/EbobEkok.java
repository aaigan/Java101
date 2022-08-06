import java.util.Scanner;

public class EbobEkok {
        public static void main(String[] args) {

            int n1 = 1;
            int n2 = 1;
            int ebob = 1;
            int ekok;

            Scanner inp = new Scanner(System.in);
            System.out.print("n1 sayısını giriniz: ");
            n1 = inp.nextInt();
            System.out.print("n2 sayısını giriniz: ");
            n2 = inp.nextInt();

            if( n1 < n2 ){
                for (int i = 1; i <= n1 ; i++) {
                    while (( n1%i ==0 ) && ( n2 % i == 0)){
                        ebob = i;
                        i++;
                    }
                }
            }else {
                for (int i = 1; i <= n2 ; i++) {
                    while (( n1%i ==0 ) && ( n2 % i == 0)){
                        ebob = i;
                        i++;
                    }
                }
            }
            ekok = (n1*n2)/ebob ;
            System.out.println(n1 + " ve " + n2 + " sayılarının en büyük ortak böleni (EBOB): " + ebob);
            System.out.println(n1 + " ve " + n2 + " sayılarının en küçük ortak katı: (EKOK): " + ekok);

        }
}
