

import java.util.Scanner;

public class BurcBulV2 {
    public static void main(String[] args) {

        int month, day;
        String burc = null;
        boolean isError = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a month : ");
        month = inp.nextInt();
        System.out.print("Please enter a day : ");
        day = inp.nextInt();

        if (month == 1){
            if ( (day >= 1) && (day <= 19) ){
                burc = "oğlak";
            }else {
                burc = "kova";
            }
        }else if (month == 2){
            if ( (day >= 1) && (day <= 18) ){
                burc = "kova";
            }else {
                burc = "balık";
            }
        }else if (month == 3){
            if ( (day >= 1) && (day <= 20) ){
                burc = "balık";
            }else {
                burc = "koç";
            }
        }else if (month == 4){
            if ( (day >= 1) && (day <= 19) ){
                burc = "koç";
            }else {
                burc = "boğa";
            }
        }else if (month == 5){
            if ( (day >= 1) && (day <= 20) ){
                burc = "boğa";
            }else {
                burc = "ikizler";
            }
        }else if (month == 6){
            if ( (day >= 1) && (day <= 20) ){
                burc = "ikizler";
            }else {
                burc = "Yengeç";
            }
        }else if (month == 7){
            if ( (day >= 1) && (day <= 22) ){
                burc = "yengeç";
            }else {
                burc = "aslan";
            }
        }else if (month == 8){
            if ( (day >= 1) && (day <= 22) ){
                burc = "aslan";
            }else {
                burc = "başak";
            }
        }else if (month == 9){
            if ( (day >= 1) && (day <= 22) ){
                burc = "başak";
            }else {
                burc = "terazi";
            }
        }else if (month == 10){
            if ( (day >= 1) && (day <= 22) ){
                burc = "terazi";
            }else {
                burc = "akrep";
            }
        }else if (month == 11){
            if ( (day >= 1) && (day <= 21) ){
                burc = "akrep";
            }else {
                burc = "yay";
            }
        }else if (month == 12){
            if ( (day >= 1) && (day <= 21) ){
                burc = "yay";
            }else {
                burc = "oğlak";
            }
        }else {
            System.out.println("you entered the wrong month, try again");
        }
        System.out.println("your zodiac sign : " + burc);






    }
}