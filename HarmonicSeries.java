import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n;
        double total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        n = inp.nextInt();
        for (int i = 1; i <= n ; i++) {
            total += (1.0/i); //bu kısım double olmalı
        }
        System.out.println(total);
    }
}
