import java.util.Scanner;

public class CiftSayilariTopla {
    public static void main(String[] args) {
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        int k;
        int total = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Please enter a number: ");
            k = inp.nextInt();
            if ( k % 2 == 0 ){
                total += k;
                System.out.println("Total : " + total );
            }
        }while ( (k > 0) && ( k % 2 == 0) );
    }

}