//conversion meter to foot
import java.util.Scanner;
public class L1B5
{
	public static void main(String[] args)
	{
		Scanner M=new Scanner(System.in);
		System.out.print("Enter Meter : ");
		double a=M.nextDouble();
		System.out.print("Conversion From Meter to Foot : ");
		System.out.print(a*3.28);
		M.close();	
	}
}
/* Conversion of foot to meter
System.out.print("Enter Foot : ");
		double b=M.nextDouble();
		System.out.print("Conversion From Foot to Meter : ");
		System.out.print(b/3.28);*/