import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int totalN = 1, totalR = 1, totalGnl = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("C(n,r) kombinasyonu için;");
        System.out.print("n sayısını girin : ");
        int n = input.nextInt();
        System.out.print("r sayısını girin : ");
        int r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            totalN = totalN * i;
        }
        System.out.println(n + "! = " + totalN);

        for (int j = 1; j <= r; j++) {
            totalR = totalR * j;

        }

        System.out.println(r + "! = " + totalR);

        for (int k = 1; k <= (n - r); k++) {
            totalGnl = totalGnl * k;
        }

        System.out.println((n - r) + "! = " + totalGnl);

        double sonuc = (totalN / (totalR * (totalGnl)));

        System.out.println("C(" + n + "," + r + ")=" + sonuc);
    }
}
