import java.util.Scanner;
@FunctionalInterface
interface DataProcess<T>{
T processes(T a,T b);
}
public class hhhh{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int choice;
do{
System.out.println("1.largest\n2.discount\n3.concatenete\n4.count words\n5.exit");
System.out.println("Enter your choice:");
choice=sc.nextInt();
switch(choice){
case 1:
	System.out.println("Enter first ");
	int n1=sc.nextInt();
	System.out.println("Enter Second");
	int n2=sc.nextInt();
	DataProcess<Integer> Max=(a,b)->(a>b)?a:b;
	System.out.println("MAXxxxxxxxxx "+Max.processes(n1,n2));
	break;
case 2:
	System.out.println("Enter price ");
	double p1=sc.nextDouble();
	System.out.println("Enter discount");
	double d1=sc.nextDouble();
	DataProcess<Double> Discount=(p,d)->(p-(p*(d/100)));
	System.out.println("Discount "+Discount.processes(p1,d1));
	sc.nextLine();
	break;
case 3:
	System.out.println("Enter first name ");
	sc.nextLine();
	String fa=sc.nextLine();
	System.out.println("Enter Second name");
	String fb=sc.nextLine();
	DataProcess<String> cont=(a,b)->a+" "+b;
	System.out.println("name "+cont.processes(fa,fb));
	sc.nextLine();
	break;
case 4:
	System.out.println("Enter review");
	String review = sc.nextLine();
	DataProcess<String> wordcount = (a,b) -> {
    	String[] word = a.trim().split("\\s+");
    	return String.valueOf(word.length);
	};
	System.out.println("length " + wordcount.processes(review,""));
case 5:
	System.out.println("Exiting...");
	break;
default:
	System.out.println("Invalid!");
}
}while(choice!=5);
}
}















