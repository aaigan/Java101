public class PrimeNumbers {
    public static void main(String[] args) {
        // 1'den 100'e kadar olan asal sayıları yazdır.

        int sayac;

        for (int i = 2; i < 100; i++){
            sayac =0;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    sayac++;
                }
            }
            if (sayac == 0){
                System.out.print(i + " ");
            }

        }
    }
}


