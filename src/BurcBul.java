import java.util.Scanner;
public class BurcBul {
    public static void main(String[] args) {

        int day, month;

        Scanner input = new Scanner(System.in);
        System.out.print("Ay Giriniz : ");
        month = input.nextInt();
        System.out.print("Gün Giriniz : ");
        day = input.nextInt();

        switch (month){
            case 1:
                if (( day < 1 ) || (day > 31 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 20 ){
                System.out.println("Oğlak");
            }else {
                System.out.println("Kova");
            }
                break;
            case 2:
                if (( day < 1 ) || (day > 29 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 19 ){
                    System.out.println("Kova");
                }else {
                    System.out.println("Balık");
                }break;
            case 3:
                if (( day < 1 ) || (day > 31 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 21 ){
                    System.out.println("Balık");
                }else {
                    System.out.println("Koç");
                }break;
            case 4:
                if (( day < 1 ) || (day > 30 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 20 ){
                    System.out.println("Koç");
                }else {
                    System.out.println("Boğa");
                }break;
            case 5:
                if (( day < 1 ) || (day > 31 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 21 ){
                    System.out.println("Boğa");
                }else {
                    System.out.println("İkizler");
                }break;
            case 6:
                if (( day < 1 ) || (day > 30 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 21){
                    System.out.println("İkizler");
                }else {
                    System.out.println("Yengeç");
                }break;
            case 7:
                if (( day < 1 ) || (day > 31 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 23 ){
                    System.out.println("Yengeç");
                }else{
                    System.out.println("Aslan");
                }break;
            case 8:
                if (( day < 1 ) || (day > 31 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 23 ){
                    System.out.println("Aslan");
                }else{
                    System.out.println("Başak");
                }break;
            case 9:
                if (( day < 1 ) || (day > 30 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 23 ){
                    System.out.println("Başak");
                }else {
                    System.out.println("Terazi");
                }break;
            case 10:
                if (( day < 1 ) || (day > 31 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 23 ){
                    System.out.println("Terazi");
                }else {
                    System.out.println("Akrep");
                }break;
            case 11:
                if (( day < 1 ) || (day > 30 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 22 ){
                    System.out.println("Akrep");
                }else {
                    System.out.println("Yay");
                }break;
            case 12:
                if (( day < 1 ) || (day > 31 )){
                    System.out.println("Hatalı gün girdiniz");
                }else if ( day < 22 ){
                    System.out.println("Yay");
                }else {
                    System.out.println("Oğlak");
                }break;



            default:
                System.out.println("Hatalı Giriş!");
        }
}
}
//KOÇ BURCU: 21 Mart-19 Nisan
//BOĞA BURCU: 20 Nisan-20 Mayıs
//İKİZLER BURCU: 21 Mayıs-20 Haziran
//YENGEÇ BURCU: 21 Haziran-22 Temmuz
//ASLAN BURCU: 23 Temmuz-22 Ağustos
//BAŞAK BURCU: 23 Ağustos-22 Eylül  (Eylül hangi burç)
//TERAZİ BURCU: 23 Eylül-22 Ekim  (Eylül hangi burç)
//AKREP BURCU: 23 Ekim-21 Kasım
//YAY BURCU: 22 Kasım-21 Aralık
//OĞLAK BURCU: 22 Aralık-19 Ocak
//KOVA BURCU: 20 Ocak-18 Şubat
//BALIK BURCU: 19 Şubat-20 Mart