//area of rectangle
import java.util.Scanner;
public class L2A3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length : ");
		double a=sc.nextDouble();
	if(a<0){
				 for(;a<0;){
				 	System.out.print("Error Enter Positive value of Length : ");
				 	double c=sc.nextDouble();
				 	if(c>0){
				 		a=c;
				 		break;
				 	}
				 }
	}
	System.out.print("Enter Breadth : ");
	double b=sc.nextDouble();
	if(b<0){
		for(;b<0;){
			System.out.print("Error Enter Positive value of Breadth : ");
			double d=sc.nextDouble();
			if(d>0){
			b=d;
			break;
		}
	}
	}
	System.out.print("Area Of Rectangle : "+(a*b));
}
}