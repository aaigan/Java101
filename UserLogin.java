import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adı : ");
        userName = inp.nextLine();
        System.out.print("Şifre : ");
        password = inp.nextLine();
        if (userName.equals("alibak34") && password.equals("java123")){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Hatalı Giriş!");
        }
    }
}
