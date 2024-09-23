public class Main {
    public static void main(String[] args) {
        double inputValue = 143;
        double SALES_TAX_RATE = 0.05;
        double salesTax;
        double totalCost;

        salesTax = inputValue * SALES_TAX_RATE;
        totalCost = inputValue + salesTax;
        System.out.println("Price of item(s): " + inputValue);
        System.out.println("Sales tax: "+ salesTax);
        System.out.println("Grand total: " + totalCost);
    }
}