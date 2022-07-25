import java.util.Scanner;
public class CiftSayilar {
    public static void main(String[] args) {
        int k;
        int i = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();
        while ( i <= k){
            if ( i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
