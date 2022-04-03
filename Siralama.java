import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner inp = new Scanner(System.in);
        System.out.print("a sayısı:");
        a = inp.nextInt();
        System.out.print("b sayısı:");
        b = inp.nextInt();
        System.out.print("c sayısı:");
        c = inp.nextInt();

        // a < b < c, a < c < b, b < a < c, b < c < a, c < b < a, c < a < b

        if (( a < b ) && ( a < c )){
            if ( b < c ){
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b");
            }
        }else if (( b < a ) && ( b < c )){
            if ( a < c ){
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");
            }
        }else {
            if ( b < a ){
                System.out.println("c < b < a");
            }else {
                System.out.println("c < a < b");
            }
        }
    }
}
