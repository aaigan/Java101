import java.util.Scanner;

public class AdvancedCalculator {
    //işlemlerimi tanımlayacağım metodlar burada olacak
    static int sum(int a, int b){
        int result = a + b;
        System.out.println("result of collection: " + result);
        return result;
    }

    static int ex(int a, int b){
        int result = a - b;
        System.out.println("result of extraction: " + result);
        return result;
    }

    static int impact(int a, int b){
        int result = a * b;
        System.out.println("result of multiplication: " + result);
        return result;
    }

    static int divided(int a, int b){
        int result = a / b;
        System.out.println("result of division: " + result);
        return result;
    }

    static int exp(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= b;
        }
        return 1;
    }
    public static void main(String[] args) {
        int a = 2;
        Scanner inp = new Scanner(System.in);
        int b = inp.nextInt();
        int result = 1;
        for (int i = 1; i <= b; i++){
            int temp = a*b;
            result = a;
        }
        System.out.println("sonuç: " + result);
    }
}
