import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = inp.nextInt();
        for ( int i = 1; i <= n; i++){
            for (int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++){
                System.out.print("*");
            }
            // herbir satırdaki işlem tamamlandığında bir alt satıra inmesi için;
            System.out.println(" ");
            if (i == n){
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

    }
}
