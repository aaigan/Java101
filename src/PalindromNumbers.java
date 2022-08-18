import java.util.Scanner;

public class PalindromNumbers {
    //iki taraftan da okunduğunda aynı değere sahip olan sayıya palindrom sayı denir

    // 1881
    // 1
    // 8
    // 8
    // 1

    // 1991
    //2002
    static boolean isPalindrom(int number){
        int temp = number, reverse = 0, last;
        while ( temp != 0 ){
            last = temp%10;
            reverse = ( reverse*10 ) + last;
            temp/=10;
        }
        if ( number == reverse)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(101));
    }
}
