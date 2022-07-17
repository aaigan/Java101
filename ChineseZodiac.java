import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = inp.nextInt();
        int mod;
        mod = year%12;

        if (year>=0){
            switch (mod) {
                case 0:
                    System.out.println("Chinese zodiac : Monkey ");
                    break;
                case 1:
                    System.out.println("Chinese zodiac : Cockerel ");
                    break;
                case 2:
                    System.out.println("Chinese zodiac : Dog ");
                    break;
                case 3:
                    System.out.println("Chinese zodiac : Pig ");
                    break;
                case 4:
                    System.out.println("Chinese zodiac : Mouse ");
                    break;
                case 5:
                    System.out.println("Chinese zodiac : Ox ");
                    break;
                case 6:
                    System.out.println("Chinese zodiac : Tiger ");
                    break;
                case 7:
                    System.out.println("Chinese zodiac : Rabbit ");
                    break;
                case 8:
                    System.out.println("Chinese zodiac : Dragon ");
                    break;
                case 9:
                    System.out.println("Chinese zodiac : Snake ");
                    break;
                case 10:
                    System.out.println("Chinese zodiac : Horse ");
                    break;
                case 11:
                    System.out.println("Chinese zodiac : Sheep ");
                    break;
            }
        }else{
                System.out.println("Incorret data entry, try again.");
            }

        }
    }

