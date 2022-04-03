import java.util.Scanner;
public class Oneri {
    public static void main(String[] args) {
        int temp;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava sıcaklığı giriniz : ");
        temp = inp.nextInt();
        if (temp < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if ( temp >= 5 &&  temp <= 25 ){
            if ( temp <= 15 ){
                System.out.println("Sinemaya gidebilirsiniz.");
            }if ( temp >= 10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else{
            System.out.println("Yüzmeye gidebilrisiniz");
        }
    }
}
