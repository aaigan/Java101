import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        int result;
        int a = 0;
        int temp = 1;

        for (int i = 0; i <= n; i++){
           if ( i == 0 ){
               System.out.print(0 + " ");
           }else if (i == 1){
               System.out.print(1 + " ");
           }else {
               result = a + temp;
               a = temp;
               temp = result;
               System.out.print(result + " ");
           }
        }
        }

    }

