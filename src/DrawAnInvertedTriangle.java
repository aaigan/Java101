import java.util.Scanner;

public class DrawAnInvertedTriangle {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = keyboard.nextInt();

        for (int a = (n - 1); a >= 1; a--){
            for (int b = a; b < n; b++){
                System.out.print(" ");
            }
            for (int c = 1; c <= ((2 * a) - 1); c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
