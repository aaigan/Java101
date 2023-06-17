
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Java dilinde programın 0-100 arasında rastgele seçtiği
        // bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.

        int guess;
        int life = 5;
        int randomNumber;
        Scanner input = new Scanner(System.in);

        randomNumber = (int) (Math.random() * 100);

        while (life >= 0) {

            if (life == 0){
                System.out.println( "Hiç canın kalmadı :( Tekrar deneyebilirsin.");
                System.out.println("Gizli Sayı: " + randomNumber);
                break;
            }

            System.out.print("Bir sayı giriniz: ");
            guess = input.nextInt();


            if ((guess <= 0) || (guess >= 100)){
                System.out.println("Girdiğiniz sayı 0 ile 100 arasında olmalıdır.");
                continue;
            }

            if (guess == randomNumber){

                System.out.println( "Tebrikler, doğru tahmin! KAZANDIN :)");
                int point = life * 20;
                System.out.println( "Toplam puan: " + point);
                break;

            }else {

                if (guess < randomNumber){
                    System.out.println("Daha büyük bir sayı tahmin etmelisin.");
                    life -= 1;
                    System.out.println("Kalan can: " + life);
                }

                if (guess > randomNumber){
                    System.out.println("Daha küçük bir sayı tahmin etmelisin.");
                    life -= 1;
                    System.out.println("Kalan can: " + life);
                }
            }
        }
    }
}
