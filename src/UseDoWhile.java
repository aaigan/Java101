import java.util.Scanner;

public class UseDoWhile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int pass;
        boolean askPassword = true;



        do {
            System.out.print("şifre giriniz :");
            pass = inp.nextInt();
            if ( pass == 123 ){
                System.out.println("Şifre doğru");
                askPassword = false;
            }else {
                System.out.println("Yanlış");
            }
        }while (askPassword);


        int year = 2022;
        do {
            System.out.println("döngü işletiliyor");
        } while ( year < 2022 );








    }
}
