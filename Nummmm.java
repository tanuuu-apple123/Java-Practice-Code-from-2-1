import java.util.*;
import java.util.stream.*;
public class Nummmm{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
List<Integer> number=new ArrayList<>();
System.out.println("Enter number of integer");
int n=sc.nextInt();
System.out.println("Enter integers");
for(int i=0;i<n;i++){
number.add(sc.nextInt());
}
System.out.println("number list"+number);
Optional<Integer> Optionalproduct=number.stream().reduce((a,b)->a*b);
int productwithiden=number.stream().reduce(1,(a,b)->a*b);
if(Optionalproduct.isPresent()){
System.out.println("Productss "+Optionalproduct.get());
}
else
System.out.println("no optional....");
System.out.println("FFfff "+productwithiden);
}
}
