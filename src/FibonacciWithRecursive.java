import java.util.Scanner;

public class FibonacciWithRecursive {
    static int fib(int n){
        if ( n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.print( "Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        int v = keyboard.nextInt();
        System.out.println("Value: " + fib(v));
    }
}
