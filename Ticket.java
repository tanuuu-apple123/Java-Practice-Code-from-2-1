/********************************
Program no.  :15
Program name :Student.java
Author       :Tanavya
Date         :19-08-2025
Purpose      :Implemention of types of variables
************************************/
import java.util.Scanner;
public class Ticket
{
  //Add instance variables
  String name;
  String source;
  String destination;
  String Date;
  int seat;
  int fare;
  
 //no-array Constructor
  public Ticket()
  {
    name="Guest";
    source="Not Assigned";
    destination="Not Assigned";
    Date="00-00-0000";
    seat=0;
    fare=10;
  }

 //Overloaded Constructor Partial
  public Ticket(String name,String source)
  {
    this.name=name;
    this.source=source;
    destination="Not Assigned";
    Date="00-00-0000";
    seat=0;
    fare=0;
  }

  //Parameterised Constructor
    public Ticket(String name,String source,String destination,String Date,int seat,int fare)
    {
      this.name=name;
      this.source=source;
      this.destination=destination;
      this.Date=Date;
      this.seat=seat;
      this.fare=fare;
    }
 
  //Instance methods to be added
    public int getDiscountFare()
    {
      if(seat>=1 && seat<=10)
         return(fare-50);
      else if(seat>=11 && seat<=20)
         return(fare-25);
      else if(seat>20)
         return fare;
      else
         return 0;
    }
 
 //Add instance method display
   public void display(int Ticketid)
   {
     int finalfare=getDiscountFare();
     System.out.println("Ticket" + Ticketid + ":" + name + "," + source + "->" + destination + ", Date:" + Date + ", seat:" + seat + ", fare :Rs." + finalfare );
   }
}
class TicketTest
{
  public static void main(String args[])
  {
    System.out.println("Enter number of entries:");
    Scanner sc=new Scanner(System.in);
    int total=Integer.parseInt(sc.nextLine());
    Ticket tickets[]=new Ticket[total];
    int count=0;
    System.out.println("Enter Ticket information:");
    while(count<total && sc.hasNextLine())
    {
      String line=sc.nextLine();
      String parts[]=line.split(" ");
      if(parts[0].equals("DEFAULT"))
      {
        tickets[count++]=new Ticket();
      }
      else if(parts[0].equals("PARTIAL"))
      { 
        tickets[count++]=new Ticket(parts[1],parts[2]);
      }
     else if(parts[0].equals("PARAM"))
{
    int seat = Integer.parseInt(parts[5]);
    int fare = Integer.parseInt(parts[6]);

    if(seat >= 1 && seat <= 100)
    {
        tickets[count++] = new Ticket(parts[1], parts[2], parts[3], parts[4], seat, fare);
    }
    else
    {
        System.out.println("Invalid Seat No: " + seat + " Ticket Stored with default");
        tickets[count++] = new Ticket();
    }
}

      else if(parts[0].equals("DATE_QUERY"))
      {
        String qdate=parts[1];
        int found=0;
        for(int i=0;i<count;i++)
        {
          if(tickets[i].Date.equals(qdate))
          {
            found++;
          }
        }
        System.out.println("Date "+qdate+" has "+found+" ticket(s).");
      }
       else if(parts[0].equals("DESTINATION_QUERY"))
      {
        String city=parts[1];
        int found=0;
        for(int i=0;i<count;i++)
        {
          if(tickets[i].destination.equals(city))
          {
            found++;
          }
        }
        System.out.println("Destination "+city+" has "+found+" ticket(s).");
      }
      else if(parts[0].equals("SHOW"))
      {
        int totalfare=0;
        for(int i=0;i<count;i++)
        {
          tickets[i].display(i+1);
          totalfare+=tickets[i].getDiscountFare();
        }
        System.out.println("Total collected Fare: RS"+totalfare);
        break;
      }
    }
  }
}