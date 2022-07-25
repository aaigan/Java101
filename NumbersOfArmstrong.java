import java.util.Scanner;

public class NumbersOfArmstrong {
    public static void main(String[] args) {

        /*
        işlem basamakları
        1) basamak sayısını bul
        2) basamak değerlerini bul
        3) basamak değerlerinin basamak sayısı ile üssünü al
        4) armstrong olma durumunu kontrol et
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayı = input.nextInt();
        int tempNum;
        tempNum = sayı;
        int basNum = 0;
        int basVal;
        int toplam = 0;
        int result;

        while (tempNum != 0){
            basNum++;
            tempNum /= 10;
        }
        tempNum = sayı;
        while (tempNum != 0){
            basVal = tempNum % 10;
            result = 1;
            for (int i = 1; i <= basNum; i++){
                result *= basVal ; //7
                //System.out.println(toplam);
            }
            toplam += result;
            tempNum /= 10;
        }
        if (toplam == sayı){
            System.out.println(sayı + " bir armstrong sayıdır.");
        }else{
            System.out.println(sayı + "bir armstrong sayı değildir.");
        }
        //System.out.println(toplam);
    }
}
