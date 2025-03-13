//division as per marks
import java.util.Scanner;
	public class L3A1
	{
		public static void main(String[] args)
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Marks For Subject 1 : ");
			int a=sc.nextInt();
			System.out.print("Enter Marks For Subject 2 : ");
			int b=sc.nextInt();
			System.out.print("Enter Marks For Subject 3 : ");
			int c=sc.nextInt();
			System.out.print("Enter Marks For Subject 4 : ");
			int d=sc.nextInt();
			System.out.print("Enter Marks For Subject 5 : ");
			int e=sc.nextInt();
			double res;
			res=(a+b+c+d+e)/5.0;
			if(res >= 60){
				System.out.print("First Division : "+res);
			}
			else if(res >= 50 && res <= 59){
				System.out.print("Second Division : "+res);
			}
			else if(res >= 40 && res <= 49){
				System.out.print("Third Division : "+res);
			}
			else {
				System.out.print("Fail");
			}
		}
	}