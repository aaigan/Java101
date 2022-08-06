import java.util.Scanner;

public class AutomathicTellerMachine {
    public static void main(String[] args) {
        int right = 3;
        int balance = 1500;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.println("YatırBANK'a Hoşgeldiniz\n" +
                " ====    ==== \n" +
                "   O  ||   O  \n" +
                "*     ||      \n" +
                "    wwwwwwww   \n" +
                "  ww |||||| ww\n" +
                "     wwwwww   \n" +
                "      wwww   \n" +
                "       ww  \n" +
                "Ben Yatır. Sizin için buradayım.\n" +
                "                "
                );
        System.out.print("Kullanıcı adı giriniz: ");
        String userName = input.nextLine();
        System.out.print("Şifre giriniz: ");
        String password = input.nextLine();
        while ( right > 0 ){
            if ( userName.equals("a") && password.equals("a")){
                do {
                    System.out.print("Yapmak istediğiniz işlemi seçiniz;\n" +
                            "1 -> Para Yatırmak\n" +
                            "2 -> Para Çekmek\n" +
                            "3 -> Bakiye Sorgulamak\n" +
                            "4 -> Çıkış Yapmak\n" +
                            "Seçiminiz: ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tuturı giriniz: ");
                            int value1 = input.nextInt();
                            balance += value1;
                            break;
                        case 2:
                            int tValue = balance;
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            int value2 = input.nextInt();
                            if ((tValue -= value2) >= 0){
                                balance -= value2;
                            }else {
                                System.out.println("= :( = :( =  :( = :( = :( =  :( =");
                                System.out.println("Bakiyeniz bu işlem için yetersiz");
                                System.out.println("= :( = :( =  :( = :( = :( =  :( =");
                            }
                            break;
                        case 3:
                            System.out.println("=====================================");
                            System.out.println("Bakiyeniz " + balance + " Türk Lirası");
                            System.out.println("=====================================");
                            break;
                    }
                }while (select != 4 );
                    System.out.println("===========================================");
                    System.out.println("Görüşmek üzere, yine bekleriz. -YatırBANK-");
                    System.out.println("===========================================");
                    break;
            } else {
                right--;
                System.out.println("Hatalı giriş!");
                if (right == 0){
                    System.out.println("Hesabınız bloke edildi. Banka ile iletişime geçiniz.");
                }else {
                    System.out.println("kalan deneme hakkınız: " + right);
                }
            }
        }

    }
}
