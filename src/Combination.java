import java.util.Scanner;

public class Combination {
    /*
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
    n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
     */
    public static void main(String[] args) {
        int n;
        int r;
        int t = 1;
        double facN = 1;
        int facR = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print( "Please enter n : ");
        n = inp.nextInt();
        System.out.print( "Please enter r : ");
        r = inp.nextInt();
        for (int i = 1; i <= n ; i++) {
            facN *= i;
        }
        for (int j = 1; j <= r ; j++) {
            facR *= j;
        }

        for (int k = 1; k <= (n-r) ; k++) {
            t *= k;
        }
        System.out.println( n+ "! = " + facN );
        System.out.println( r+ "! = " + facR );
        System.out.println( (n - r) + "! = " + t );

        System.out.println( n + " in " + r + " combination : " + (facN / (facR*t)));

    }
}
