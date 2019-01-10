import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //list of variables
        double keSales = 0.0;
        double vsSales = 0.0;
        double v4vSales = 0.0;
        double totShipping = 0.0;
        double commissionKE = 0.17;
        double commissionVS = 0.33;
        double commissionV4V = 0.33;
        double commissionShipping = 0.67;
        double totPay = 0.0;
        String name = "";

        Scanner scnr = new Scanner(System.in);

        System.out.println("Who is the salesperson?");
        name = scnr.nextLine();

        System.out.println("What were the total KE sales?");
        keSales = scnr.nextDouble();

        System.out.println("What were the total VS sales?");
        vsSales = scnr.nextDouble();

        System.out.println("What were the total V4V sales?");
        v4vSales = scnr.nextDouble();

        System.out.println("What was the total shipping charges?");
        totShipping = scnr.nextDouble();

        totPay = keSales * commissionKE;
        totPay = totPay + (vsSales * commissionVS);
        totPay = totPay + (v4vSales * commissionV4V);
        totPay = totPay + (totShipping * commissionShipping);

        System.out.println("Write a check to " + name + " for $" + totPay);
    }
}
