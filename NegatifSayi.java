import java.util.Scanner;
public class NegatifSayi {
    public static void main(String[] args) {
      int sayi;
        Scanner inp = new Scanner(System.in);
      /*  for (boolean run = true ; run;){
            System.out.print("Sayı Giriniz : ");
            sayi = inp.nextInt();
            if ( sayi < 0 ){
                run = false;
            }

        }
    }*/
        do {
            System.out.println("Sayı Giriniz :");
            sayi = inp.nextInt();
        }while ( sayi > 0);

        System.out.println("======================for================");

        for ( int i = 0; i < 10 ; i++){
            System.out.println(i);
        }

       System.out.println("================while====================");

        int j = 1;
        while ( j<10) {
            System.out.println(j);
            j++;
        }
        }
}
