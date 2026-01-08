import java.util.Scanner;
@FunctionalInterface
interface FareStrategy{
	double calculatefare(double distance);
}
public class yyyyy{
public static void printfare(String ridetype,FareStrategy strategy,double distance){
double fare=strategy.calculatefare(distance);
System.out.println(ridetype + " Ride Fare: Rs." + fare);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter distance");
double distance=sc.nextDouble();
FareStrategy standard=d->20+d*10;
FareStrategy luxury=d->10+d*20;
FareStrategy premium=d->20+d*30;
System.out.println("_____Fare_____");
printfare("standard",standard,distance);
printfare("luxury",luxury,distance);
printfare("premium",premium,distance);
}
}

