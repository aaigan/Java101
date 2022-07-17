import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int k;
        int i = 1;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter factorial number : ");
        k = input.nextInt();
        /*
        for (int i = 1; i <= k ; i++) {
            total *= i;
        }
        //bu kısmı dongunun içine yazarsak her çevirmede cıkan sonucu gosteriyor
        System.out.println(k + ". Factorial : " + total);
         */
        while ( i <= k ){
            total *= i;
            i++;
        }
        System.out.println(total);
    }
}
