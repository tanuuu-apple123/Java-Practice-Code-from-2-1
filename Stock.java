package warehouse.stock;
import warehouse.product.Product;
public class Stock{
    //Instance variables
    Product product;
    int quantity;
    double price;

    //constructor
    public Stock(Product product,int quantity,double price)
    {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    //Method to update Stock quantity
    public void updateQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

    //Method of update price
    public void updatePrice(double newPrice)
    {
        this.price = newPrice;
    }

    //Method to calculate total value of this product stock
    public double getStockValue(){
        return quantity*price;
    }

    //Method to display stock details
    public void displayStock(){
        product.display();
        System.out.println("Quantity :"+quantity);
        System.out.println("Price per unit:"+price);
        System.out.println("Total Value:"+getStockValue());
        System.out.println("-----------------------------");
        
    }
}