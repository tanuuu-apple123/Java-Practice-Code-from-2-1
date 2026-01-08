package warehouse.product;
public class Product{
    //Instance variables
    String productID;
    String name;
    String category;

    //parameterized onstructor 
    public Product(String productID,String name,String category)
    {
        this.productID = productID;
        this.name = name;
        this.category = category;
    }
    public void display()
    {
        System.out.println("Product ID:"+productID);
        System.out.println("Product name:"+name);
        System.out.println("Product category:"+category);
    }
}