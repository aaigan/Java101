import java.util.Scanner;

public class TriangleOfStars {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = inp.nextInt();

        //satır sayısı kadar döngü oluşturduk
        //n-i kadar boşluk oluşturduk
        //2*i - 1 kadar yıldız oluşturduk

        for (int i = 1; i <= n ; i++) {
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }

            System.out.println(); //her işlemden sonra bir alt satıra inmesi için kullandık
        }
    }
}
