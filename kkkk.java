import java.util.Scanner;
class Staff{
int id;
String name;
double basicSalary;
public Staff(int id,String name,double basicSalary){
this.id=id;
this.name=name;
this.basicSalary=basicSalary;
}
void display(){
System.out.println("ID: "+id+"\n"+"Name: "+name+"\n"+"Basic Salary: "+basicSalary+"\n");
}
}
class TeachingStaff extends Staff{
int experience;
String subject;
public TeachingStaff(int id,String name,double basicSalary,int experience,String subject){
super(id,name,basicSalary);
this.experience=experience;
this.subject=subject;
}
void display(){
super.display();
System.out.println("Experience: "+experience+"\n"+"Subject "+subject+"\n");
}
}
class  Hod extends TeachingStaff{
String department;
public Hod(int id,String name,double basicSalary,int experience,String subject,String department){
super(id,name,basicSalary,experience,subject);
this.department=department;
}
void display(){
super.display();
System.out.println("Department "+department+"\n");
}
}
class NonTeachingStaff extends Staff{
String work;
public NonTeachingStaff(int id,String name,double basicSalary,String work){
super(id,name,basicSalary);
this.work=work;
}
void display(){
super.display();
System.out.println("Work "+work+"\n");
}
}
public class kkkk{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("1.Teaching staff\n2.non teaching staff\n3.HOD\n");
System.out.println("Enter your choice:");
int choice=sc.nextInt();
switch(choice){
case 1:
	System.out.println("Enter ID: ");
	int sid=sc.nextInt();
	System.out.println("Enter name: ");
	String sname=sc.nextLine();
	System.out.println("Enter Basic Salary: ");
	double sbasicSalary=sc.nextDouble();
	System.out.println("Enter Experience: ");
	int sexperience=sc.nextInt();
	System.out.println("Enter subject: ");
	String ssubject=sc.nextLine();
	TeachingStaff ts=new TeachingStaff(sid,sname,sbasicSalary,sexperience,ssubject);
	ts.display();
	break;
case 2:
	System.out.println("Enter ID: ");
	int bid=sc.nextInt();
	System.out.println("Enter name: ");
	String bname=sc.nextLine();
	System.out.println("Enter Basic Salary: ");
	double bbasicSalary=sc.nextDouble();
	System.out.println("Enter work type: ");
	String bwork=sc.nextLine();
	NonTeachingStaff ntf=new NonTeachingStaff(bid,bname,bbasicSalary,bwork);
	ntf.display();
	break;
case 3:
	System.out.println("Enter ID: ");
	int tid=sc.nextInt();
	System.out.println("Enter name: ");
	String tname=sc.nextLine();
	System.out.println("Enter Basic Salary: ");
	double tbasicSalary=sc.nextDouble();
	System.out.println("Enter Experience: ");
	int texperience=sc.nextInt();
	System.out.println("Enter subject: ");
	String tsubject=sc.nextLine();
	System.out.println("Enter department:");
	String tdepartment=sc.nextLine();
	Hod hh=new Hod(tid,tname,tbasicSalary,texperience,tsubject,tdepartment);
	hh.display();
default:
	System.out.println("Invalidd");
}
}
}



























