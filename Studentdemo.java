import java.util.Scanner;
class Student{
String name;
int roll;
double spi;
String course;
public void set(String name,int roll,double spi,String course){
	this.name = name;
	this.roll = roll;
	this.spi =spi;
	this.course = course;
}
public void get(){
	System.out.print("Name : "+name+" Roll No : "+roll+" SPI : "+spi+" Course : "+course );
}
}
public class Studentdemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		String n =sc.next();
		System.out.print("Enter roll : ");
		int r = sc.nextInt();
		System.out.print("Enter spi : ");
		double spi =sc.nextDouble();
		System.out.print("Enter course : ");
		String c = sc.next();
		Student s1 = new Student();
		s1.set(n,r,spi,c);
		s1.get();

	}
}