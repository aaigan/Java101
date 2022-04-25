import java.util.Scanner;

public class UceVeDordeBolunenSayilariBul {
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);
        System.out.print(" Sayı giriniz : ");
        k = inp.nextInt();
        System.out.println(" 3'e veya 4'e tam bölünen sayılar;");
        for (int i = 0; i < k; i++) {
            if ( (i % 3 == 0) || (i % 4 == 0)){
                System.out.println(i);
            }

        }
    }
}
