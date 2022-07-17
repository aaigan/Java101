import java.util.Scanner;

public class PatikaAirlines {
    public static void main(String[] args) {
        int distance;
        double mbu = 0.10;
        double nTutar;
        double iTutar;
        double tTutar;
        double yasIndirim;
        double yonIndirim = 0;
        int age;
        int tType;


        Scanner inp = new Scanner(System.in);
        System.out.print("Please Enter Distance : ");
        distance = inp.nextInt();
        System.out.print("Please Enter Age : ");
        age = inp.nextInt();
        System.out.print("Please Choose Travel Type : 1- One Direction, 2- Round Trip : ");
        tType = inp.nextInt();

        if (distance >= 0 && age>=0 && ((tType==1) || (tType==2) )){
            nTutar = distance*mbu;
            if (age<12){
                yasIndirim = nTutar * 0.50;
            }else if ((age>=12) && (age<=24)){
                yasIndirim = nTutar * 0.10;
            }else if (age>65){
                yasIndirim = nTutar * 0.30;
            }else {
                yasIndirim = 0;
            }

            iTutar = nTutar - yasIndirim;
            tTutar= iTutar - yonIndirim;

            //System.out.println(iTutar);

            if (tType==2){
                yonIndirim = iTutar * 0.20;
                tTutar = 2*(iTutar-yonIndirim);
            }else {
                yonIndirim = 0;
                tTutar = iTutar;
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("1 ticket price : " + nTutar + "$");
            System.out.println("Age discount : " + yasIndirim + "$");
            System.out.println("Round-trip ticket discount for 1 ticket  : " + yonIndirim + "$");
            System.out.println("Total price : " + tTutar + "$");
            System.out.println("Thank you for choosing us :-) Patika Airlines ");

        }else {
            System.out.println("Incorrect data entry, try again.");
        }
        








    }
}
//mesafe
//yaş
//tekyön
//gidiş dönüş

