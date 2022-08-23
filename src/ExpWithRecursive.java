import java.util.Scanner;

public class ExpWithRecursive {
    
    static int result =1;
    static int f(int x, int y){

        if (y == 0){
            return 1;
        }
        result *= x;

        return f(x, y-1) * x;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number base: ");
        int a = inp.nextInt();
        System.out.print("Enter the number exponent: ");
        int b = inp.nextInt();

        System.out.println( a + "^" + b + " = " + f(a, b));
    }
}
