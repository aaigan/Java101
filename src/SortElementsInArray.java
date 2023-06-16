import java.util.Arrays;
import java.util.Scanner;


public class SortElementsInArray {

    public static void main(String[] args) {

//        Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
//        Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int size = input.nextInt();
        int element;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print(i + ". eleman: ");
            element = input.nextInt();
            numbers[i] = element;
        }
        Arrays.sort(numbers);
        System.out.println("Dizi : " + Arrays.toString(numbers));



    }
}