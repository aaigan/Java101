import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int toplam = 0;
        int n;
        n = 0;
        System.out.print("Bir pozitif tamsayı giriniz: ");
        n = inp.nextInt();
        for (int i = 1; i < n; i++){
            while (n%i == 0){
                toplam += i;
                break;
            }
        }
        if ( toplam == n ){
            System.out.println(n + " mükemmel sayıdır.");
        }else {
            System.out.println(n + " mükemmel sayı değildir.");
        }
    }
}
