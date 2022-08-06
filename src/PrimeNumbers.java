public class PrimeNumbers {
    public static void main(String[] args) {
        // i li dongu istenilen aralıktaki sayıları yazdırıyor
        // j 'li dongü i ye gelene kadar olan sayıları yazdırıyor
           // çünkü sayının çarpanları sayının kendisinden küçük veya sayıya eşit olmak durumunda
        // while ifadesinin içinde i aralığındaki sayıların asal çarpanlarına ayrılmış hali var
        for (int i = 1; i <= 20; i++) {
            for (int j = 1;  j <= i; j++){
               while (i%j == 0){
                   System.out.println(j);
                   break;
               }
            }
            }

        }
    }
