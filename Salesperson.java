/**
 * This class calculates the total annual compensation of a salesperson
 * @author reverseshell
 */
public class Salesperson {

    /**
     * Entry point for the main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creates object to call methods that are used to computate values
        MonetaryVariables monetaryObject = new MonetaryVariables();
        monetaryObject.getSales();
        monetaryObject.printTableHeader();
        monetaryObject.printTableEntry(0,0);
        monetaryObject.calculate();
        monetaryObject.total();
        
    }

}
