import java.util.*;
class Order{
int orderid;
String productname;
String customername;
public Order(int orderid,String productname,String customername){
this.orderid=orderid;
this.productname=productname;
this.customername=customername;
}
public String toString(){
return "Order"+orderid+"item"+productname+"customer"+customername;
}
}
public class FoodMang{
public static void main(String[] args){
LinkedList<Order> Orderqueue = new LinkedList<>();
Scanner sc=new Scanner(System.in);
int choice;
do{
System.out.println("1.add\n2.serve next order\n3.cancel\n4.view all pending order\n5.ext");
System.out.println("Enter your choice: ");
choice=sc.nextInt();
switch(choice){
case 1:
	System.out.println("Enter order id");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter product name:");
	String prn=sc.nextLine();
	sc.nextLine();
	System.out.println("enter customer name: ");
	String cn=sc.nextLine();
	Orderqueue.add(new Order(id,prn,cn));
	System.out.println("added");
	break;
case 2:
	if(Orderqueue.isEmpty())
	System.out.println("It is empty");
	else{
	Order served=Orderqueue.removeFirst();
	System.out.println("Serving "+served);
	}
	break;
case 3:
	if(Orderqueue.isEmpty())
	System.out.println("It is empty");
	else{
	System.out.println("Enter order id to cancel");
	int cancelid=sc.nextInt();
	Boolean found=false;
	Iterator<Order> itr=Orderqueue.iterator();
	while(itr.hasNext()){
	Order o=itr.next();
	if(o.orderid==cancelid){
	itr.remove();
	System.out.println("Removed");
	found=true;
	}
	}
	if(!found)
	System.out.println("not exist");
	}
	break;
case 4:
	if(Orderqueue.isEmpty())
	System.out.println("It is empty");
	else{
	for(Order o:Orderqueue){
	System.out.println(o);
	}
	}
	break;
case 5:
	System.out.println("Exiting......");
	break;
default:
	System.out.println("Invalid");
}
}while(choice!=5);
}
}














