package mybank;
//create a simple package
public class Balance{
    public String name;
    public double bal;
    public Balance(String n, double b)
    {
        name=n;
        bal=b;
    }
    public void show()
    {
        if(bal<0)
        {
            System.out.println("Insufficient balance!");
        }
        System.out.println(name+" :RS."+bal);
    }
}