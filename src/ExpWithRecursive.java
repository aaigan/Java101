import java.util.Scanner;

public class ExpWithRecursive {
    static void exp(int a, int b){
        int result = 1;
        for ( int i = 1; i <= b; i++ ){
            result *= a;
        }
        System.out.println(result);
    }
    static int result =1;
    static int f(int x, int y){

        if (y == 0){
            return 1;
        }
        result *= x;
        f(x, y-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = inp.nextInt();
        System.out.print("Enter the number b: ");
        int b = inp.nextInt();

        System.out.println( a + "^" + b + " = " + f(a, b));
    }
}
