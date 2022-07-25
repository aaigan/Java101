import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a positive natural number (max 2147483647) : ");
        int number = inp.nextInt();
        int firstNumber = number;
        int basValue = 0;
        int result = 0;

        while (number != 0 ){
            basValue = number%10;
            result += basValue;
            number /= 10;
        }
        System.out.println("The sum of the digits of  the number " + firstNumber + " is " + result );
    }
}
