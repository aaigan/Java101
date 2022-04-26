import java.util.Scanner;

public class FındExponantionalNumber {
    public static void main(String[] args) {
        int k;
        int ex;
        int total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        k = inp.nextInt();
        System.out.print("Please enter exponent of number : ");
        ex = inp.nextInt();
        /*

        while ( i <= ex){
            total *= k;
            i++;
        }
        System.out.println(total);

         */
        //with for
        for (int j = 0; j < ex; j++) {
            total *= k;
        }
        System.out.println(k + "^" + ex + " = " + total);
    }
}
