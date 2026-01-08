import java.io.*;
import java.util.Scanner;
public class gi{
static String FILENAME="backup.txt";
static Scanner sc=new Scanner(System.in);
public static void main(String[] args){
int choice;
do{
System.out.println("1.add\n2.view\n3.exit");
System.out.println("Enter your choice:");
choice=sc.nextInt();
switch(choice){
case 1:
	addnote();
	break;
case 2:
	viewnote();
	break;
case 3:
	System.out.println("Exiting..");
	break;
default:
	System.out.println("Invalid!");

}
}while(choice!=3);
}
public static void addnote(){
System.out.println("Enter note:");
sc.nextLine();
String note=sc.nextLine();
try{
FileOutputStream fos=new FileOutputStream(FILENAME,true);
note=note+"\n";
fos.write(note.getBytes());
System.out.println("Completed");
}
catch(IOException e){
System.out.println("Failed"+e.getMessage());
}
}
public static void viewnote(){
try{
FileInputStream fis=new FileInputStream(FILENAME);
int i=0;
while((i=fis.read())!=-1){
System.out.print((char)i);
}
}
catch(IOException e){
System.out.println("Failed"+e.getMessage());
}
}
}

























