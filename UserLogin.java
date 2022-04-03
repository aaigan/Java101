import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName, password, sifirla = null, newPassword = null;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adı : ");
        userName = inp.nextLine();
        System.out.print("Şifre : ");
        password = inp.nextLine();
        if ( userName.equals("alibak34") && password.equals("java123") )
                System.out.println("Giriş Başarılı");
            else if ( userName.equals("alibak34") && !password.equals("java123") )
            {
            System.out.println("Hatalı Şifre! Sıfırlamak için e'ye basınız");
            sifirla = inp.nextLine();
            if (sifirla.equals("e"))
            {
                System.out.println("Yeni Şifre Giriniz :");
                newPassword = inp.nextLine();
                if (!newPassword.equals(password))
                {
                    System.out.println("Şifre Değiştirme Başarılı ");

                }
            }
        }
    }
}
