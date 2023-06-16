import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        //tekrar eden çift sayıları bul

        int[] numbers = {13, 11, 21, 3, 5, 13, 113, 4, 4, 8, 7, 9, 8, 2, 44, 2};
        int[] duplicate = new int[numbers.length];
        int startIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j= 0; j < numbers.length; j++){
                if ((i != j) && ( numbers[i] == numbers[j]) ){
                    if (!isFind(duplicate, numbers[i])){
                        duplicate[startIndex++] = numbers[j];
                    }
                    break;
                }
            }
        }

        for (int number : duplicate){
            if(number != 0){
                if (number % 2 == 0){
                    System.out.println(number);
                }
            }
        }

    }
}