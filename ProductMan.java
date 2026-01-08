import java.util.*;
public class ProductMan{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
ArrayList<String> Product=new ArrayList<>();
int choice;
do{
System.out.println("1.Add\n2.remove\n3.search\n4.display");
System.out.println("Enter your choice:");
choice=sc.nextInt();
sc.nextLine();
switch(choice){
case 1:
	System.out.println("enter product to add:");
	String p=sc.nextLine();
	Product.add(p);
	System.out.println("Successfully added "+p);
	break;
case 2:
	System.out.println("Enter product to remove:");
	String r=sc.nextLine();
	Product.remove(r);
	System.out.println("Removed "+r);
	break;
case 3:
	System.out.println("Enter product to search:");
	String s=sc.nextLine();
	if(Product.contains(s))
	System.out.println("found "+s);
	else
	System.out.println("not found "+s);
	break;
case 4:
	System.out.println("-----Products-----");
	for(String Products:Product){
		System.out.println(Products);
	}
	break;
case 5:
	System.out.println("Exiting......");
	break;
default:
	System.out.println("Invalid!");
}
}while(choice!=5);
LinkedList<String> DemoS=new LinkedList<>(Product);
HashSet<String>DemoH=new HashSet<>(Product);
System.out.println("Linked List"+DemoS);
System.out.println("Hash Set"+DemoH);
}
}












