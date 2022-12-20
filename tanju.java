
import java.util.Scanner;

public class tanju {
    public static void main(String[] args) {
        System.out.println("Hello how are you?");
        System.out.println("Currency's available  are listed below ");
        System.out.println("USD");
        System.out.println("BDT");
        System.out.println("JPY");
        System.out.println("INR");
        System.out.println("What Currency do you want to input? : ");



        Scanner inp = new Scanner(System.in);

        //entered currency name
        String choice = inp.nextLine();

        // amount
        System.out.println("Please enter amount: ");
        double amt = inp.nextDouble();

        System.out.println("What currency do you want to convert to?");
        //currency to conver to
         String cnvrt = inp.next();
        //if choice is USD & cnvrt is BDT run the usd to bdt method to calculate
        if (choice.equals("USD")&& cnvrt.equals("BDT")){
             usd_to_bdt(amt);
        }
        //if choice is BDT & cnvrt is USD run the bdt to usd method to calucate
        if (choice.equals("BDT")&& cnvrt.equals("USD")){
            bdt_to_usd(amt);
        }
        //if choice USD & cnvrt INR use the usd to inr method to calculate
        if (choice.equals("USD")&& cnvrt.equals("INR")){
            usd_to_inr(amt);

        }
        //if choice INR & cnvrt USD use the inr to usd method to calculate
        if (choice.equals("INR")&& cnvrt.equals("USD")){
            inr_to_usd(amt);
        }
        //if choice USD & cnvrt JPY use the usd to jpy method to calculate
        if (choice.equals("USD")&& cnvrt.equals("JPY")){
            usd_to_jpy(amt);
        }
        //if choice JPY & cnvrt USD use the jpy to usd method to calculate
        if (choice.equals("JPY")&& cnvrt.equals("USD")){
             jpy_to_usd(amt);
        }
        //if choice BDT & cnvrt INR use the bdt to inr mehtod
        if (choice.equals("BDT")&& cnvrt.equals("INR")){
            bdt_to_inr(amt);
        }
        //if choice INR & cnvrt BDT use the inr to bdt method
        if (choice.equals("INR") && cnvrt.equals("BDT")){
            inr_to_bdt(amt);

        }
        //if choive BDT & cnvrt Jpy use the bdt to jpy method
        if (choice.equals("BDT") && cnvrt.equals("JPY")){
            bdt_to_jpy(amt);
        }
        //if choice is jpy & cnvrt is bdt use the jpy to bdt method
        if (choice.equals("JPY") && cnvrt.equals("BDT")){
            jpy_to_bdt(amt);
        }
        //if choice INR & cnvrt JPY use the inr to jpy method
        if (choice.equals("INR") && cnvrt.equals("JPY")){
            inr_to_jpy(amt);
        }
        //if choice JPY & cnvrt INR use the jpy to inr method
        if (choice.equals("JPY") && cnvrt.equals("INR")){
            jpy_to_inr(amt);
        }
    }

    //usd to bdt
        public static void usd_to_bdt(double amt) {
        System.out.println(amt +" USD= "+(amt*104)+" BDT");


    }
//bdt to usd
    public static void bdt_to_usd(double amt) {
        System.out.println(amt + " BDT= "+(amt*0.0094)+" USD");

    }
    //usd to inr
    public static void usd_to_inr (double amt) {
        System.out.println(amt + " USD= "+(amt*82.73)+" INR");
    }
//inr to usd
    public static void inr_to_usd(double amt) {
        System.out.println(amt + " INR= "+(amt*0.012)+" USD");

        //usd to jpy
    }
    public static void usd_to_jpy(double amt) {
        System.out.println(amt + " USD= "+(amt*136.34)+" JPY");
//jpy to usd
    }
    public static void jpy_to_usd(double amt) {
        System.out.println(amt + " JPY= "+(amt*0.0073)+" USD");

    }
//bdt to inr
    public static void bdt_to_inr(double amt) {
        System.out.println(amt + " BDT= "+(amt*0.79)+" INR");

    }
//inr to bdt
    public static void inr_to_bdt(double amt) {
        System.out.println(amt + " INR= "+(amt*1.29)+" BDT");

    }
    //bdt to jpy
    public static void bdt_to_jpy(double amt){
        System.out.println(amt + " BDT= "+ (amt*1.30) + " JPY");
    }
//jpy to bdt
    public static void jpy_to_bdt(double amt) {
        System.out.println(amt+ "JPY= "+(amt*0.78)+ " BDT");

    }
//inr to jpy
    public static void inr_to_jpy(double amt) {
        System.out.println(amt+ "INR= "+(amt*1.65)+ " JPY");

    }
//jpy to inr
    public static void jpy_to_inr(double amt) {
        System.out.println(amt+ "JPY= "+(amt*0.60)+ " INR");

    }
    }




