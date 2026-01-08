package mainapp;
import java.util.Scanner;
import warehouse.product.Product;
import warehouse.stock.Stock;
import warehouse.report.Report;
public class WareHouse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr no of products:");
        int n = sc.nextInt();
        sc.nextLine();
        Stock[] stocks = new Stock[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter details of product"+(i+1)+":");
            System.out.print("Enter the product ID:");
            String pid  = sc.nextLine();
            System.out.print("Enter product name:");
            String pname = sc.nextLine();
            System.out.print("Enter the Product Category:");
            String pcat = sc.nextLine();

            //Create Product Object
            Product product = new Product(pid,pname,pcat);
            System.out.print("Enter Quantity:");
            int qty = sc.nextInt();
            System.out.println("Enter the price per unit:");
            double price  = sc.nextDouble();
            sc.nextLine();
            
            //Create stock object
            stocks[i] = new Stock(product,qty,price);
        }
        //Generate report
        Report.printReport(stocks);
        sc.close();
    }
}