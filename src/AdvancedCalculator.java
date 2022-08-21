import java.util.Scanner;

public class AdvancedCalculator {
    //işlemlerimi tanımlayacağım metodlar burada olacak
    static int sum(int a, int b){
        int result = a + b;
        System.out.println( "==========\n" + "Result: " + result );
        return result;
    }

    static int ex(int a, int b){
        int result = a - b;
        System.out.println( "==========\n" + "Result: " + result );
        return result;
    }

    static int multiple(int a, int b){
        int result = a * b;
        System.out.println( "==========\n" + "Result: " + result );
        return result;
    }

    static int divided(int a, int b){
        int result = a / b;
        System.out.println( "==========\n" + "Result: " + result );
        return result;
    }

    static int exp(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println( "==========\n" + "Result: " + result );
        return result;
    }

    static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++ ){
            result *= i;
        }
        System.out.println( "==========\n" + n + "! (factorial) = " + result );
        return result;
    }

    static int mode(int a, int b){
        int result = a % b;
        System.out.println( "==========\n" + a + "mod" + b + " = " + result );
        return result;
    }

    static int rectangular(int a, int b){
        int area;
        int perimeter;
        area = a * b;
        perimeter = 2 * (a + b);
        System.out.println( "==========\n"
                + "Area of the rectangular: " + area
                + "\nPerimeter of the rectangular: " + perimeter );
        return 1;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
    /*
    5-exponential calculation
    6-factorial calculation
    7-mode calculation
    8-rectangular area and perimeter calculation
    0-Exit
     */
        int select = -1;
        String menu = "1-Sum\n"
                + "2-Extraction\n"
                + "3-Multiplication\n"
                + "4-Division\n"
                + "5-Exponential Calculation\n"
                + "6-Factorial Calculation\n"
                + "7-Mode Calculation\n"
                + "8-Rectangular Area and Perimeter Calculation\n"
                + "0-Exit";

        System.out.println(menu);

            while (select != 0) {

                System.out.print("=============================================\n"
                        + "Choose a mathematical operation: ");
                select = inp.nextInt();

                if ( select == 6){

                    System.out.print("Enter the n number: ");
                    int n = inp.nextInt();
                    factorial(n);

                }else if ( select == 8){

                    System.out.print("Enter the lenght of the side a: ");
                    int a = inp.nextInt();
                    System.out.print("Enter the lenght of the side b: ");
                    int b = inp.nextInt();

                    rectangular(a, b);

                } else if ( select > 0 && select <= 5 || select == 7 ){

                    System.out.print("Enter the number a: ");
                    int a = inp.nextInt();
                    System.out.print("Enter the number b: ");
                    int b = inp.nextInt();

                    switch (select) {
                        case 1:
                            sum(a, b);
                            break;
                        case 2:
                            ex(a, b);
                            break;
                        case 3:
                            multiple(a, b);
                            break;
                        case 4:
                            divided(a, b);
                            break;
                        case 5:
                            exp(a, b);
                            break;
                        case 7:
                            mode(a, b);
                            break;
                            

                }

                }
            }

    }
}
