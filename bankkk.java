import java.util.InputMismatchException;
import java.util.Scanner;
class InsufficeintFundsException extends Exception{
public InsufficeintFundsException(String message){
super(message);
}
}
public class bankkk{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
try{
double balance=5000;
System.out.println("Current balance"+balance);
System.out.println("Enter amount to withdraw");
double amount=sc.nextDouble();
if(amount<0)
throw new IllegalArgumentException("not right brooo");
if(amount>balance)
throw new InsufficeintFundsException("tooo much brooo");
balance-=amount;
System.out.println("Remaining balance"+balance);
}
catch(InputMismatchException e){
System.out.println("invalid"+e.getMessage());
}
catch(IllegalArgumentException e){
System.out.println("Not numberrr brooo");
}
catch(InsufficeintFundsException e){
System.out.println(e.getMessage());
}
finally{
System.out.println("thank you banking broo...");
sc.close();
}
}
}










