package warehouse.report;
import warehouse.stock.Stock;
public class Report{
    //Method to calculate total Inventory value
    public static double calculateTotalValue(Stock[] stocks)
    {
        double total = 0;
        for(Stock s:stocks){
            total+=s.getStockValue();
        }
        return total;
    }

    //method to print formatted inventory report
    public static void printReport(Stock[] stocks){
        System.out.println("=====================================");
        for(Stock s:stocks){
            s.displayStock();
        }
        double totalValue  = calculateTotalValue(stocks);
        System.out.println("Total Inventory Value:"+totalValue);
        System.out.println("=====================================");
    }
}