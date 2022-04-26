import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        k = inp.nextInt();
        System.out.println("-------------Multiples of 5-------------");

        for (int i = 1; i < k; i *= 5 ) {
            System.out.println(i);
        }
        System.out.println("-------------Multiples of 4-------------");
        for (int j = 1; j < k ; j*=4 ){
            System.out.println(j);

        }
    }
}