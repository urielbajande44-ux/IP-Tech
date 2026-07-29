import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rate per Hour: ");
        double ratePerHour = sc.nextDouble();
        System.out.print("Enter Number of Hours: ");
        double numberOfHours = sc.nextDouble();
        System.out.print("Enter Number of OT Hours: ");
        double otHours = sc.nextDouble();

        double regularPay = ratePerHour * numberOfHours;
        double otRate = ratePerHour+(ratePerHour*0.25);
        double otPay = otRate * otHours;

        double grossPay = otPay+regularPay;

        double sss = grossPay *0.05;
        double tax = grossPay *0.10;
        double medicare = grossPay *0.03;
        double pagibig = grossPay *0.01;

        double totalDeduction = sss + tax + medicare + pagibig;
        double thirteenMonthPay = (grossPay*12)/10;

        double netPay = grossPay + thirteenMonthPay - totalDeduction;

        System.out.println("\nRate per Hour: "+ratePerHour);
        System.out.println("Number of Hours: "+numberOfHours);
        System.out.println("Regular Pay: "+regularPay);
        System.out.println("Overtime Rate: "+otRate);
        System.out.println("Number of Overtime Hours: "+otHours);
        System.out.println("Overtime Pay: "+otPay);
        System.out.println("\nGross Pay: "+ grossPay);
        System.out.println("=====Deductions===== ");
        System.out.println("SSS: "+ sss);
        System.out.println("Tax: "+tax);
        System.out.println("Medicare: "+ medicare);
        System.out.println("Pagibig: "+pagibig);
        System.out.println("Total Deductions: "+totalDeduction);
        System.out.println("13th Month Pay: "+thirteenMonthPay);
        System.out.println("Net Pay: "+netPay);
    }
}
