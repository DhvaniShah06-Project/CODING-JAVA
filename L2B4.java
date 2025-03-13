//convert farenheit to celsius
import java.util.Scanner;
	public class L2B4
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Farenheit : ");
			int f=sc.nextInt();
			System.out.print("Celsius : "+((f-32)*5)/9);
			System.out.print("C");
		}
	}