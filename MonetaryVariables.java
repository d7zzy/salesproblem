/**
 * This class contains the data and methods
 * @author reverseshell
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class MonetaryVariables {
    private double annualsalary = 50000;
    private double annualsales;
    private double commissionrate = .05;
    private double totalcompensation;
    private double accelerator = 1.25;
    private double minimumSales = 120000 * .80;
    private double salesTarget = 120000;
    private Scanner scanner;
    private DecimalFormat dollar;
    
    
    /**
     * Asks end user to enter sale volume
     */
    public void getSales() {
        Scanner response = new Scanner(System.in);
        System.out.println("Please enter your annual sales: ");
        try{
            this.annualsales = response.nextDouble();
        }
        catch(Exception e){
            System.out.println("Please enter only numbers.");
            System.exit(0);
        }
     }
    /**
     * Instantiates the DecimalFormat class and prints out the table title strings
     */
    public void printTableHeader(){
        dollar = new DecimalFormat("$###,##0.00");
        System.out.println("Total Sales" + "\t\t\t\t\t\t" + "Total Compensation");
    }
    /**
     * Prints the entries for this method
     */
    public void printTableEntry(double sales, double compensation){
        System.out.println();
    }
    /**
     * Beginning of the while loop
     */
    public void calculate(){
        printTableHeader();
    double startSales = this.annualsales;
    double endSales = this.annualsales * 1.50;
    double compensation = 0;
    
    while (startSales <= endSales){


        if (startSales < this.minimumSales){
        compensation = annualsalary;
        printTableEntry(startSales, compensation);
        startSales = minimumSales;
        endSales = startSales * 1.5;
        continue;
    } else if(startSales >= this.minimumSales && startSales <= this.salesTarget){
        compensation = this.annualsalary + (startSales * this.commissionrate);
        printTableEntry(startSales, compensation);
    }else{
        compensation = this.annualsalary + (startSales * this.commissionrate * this.accelerator);
        printTableEntry(startSales, compensation);
    }
        
    startSales = startSales + 5000;
}
}
    /**
     * Print the sum of the calculation
     */
    public void total() {

        totalcompensation = annualsales * commissionrate + annualsalary;
        System.out.println("Your total annual compensation is: " + totalcompensation);
    }

}
