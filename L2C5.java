//Find largest Number Among Three Number
import java.util.Scanner;
	public class L2C5
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a number : ");
			int	a=sc.nextInt();
			System.out.print("Enter a number : ");
			int b=sc.nextInt();
			System.out.print("Enter a number : ");
			int c=sc.nextInt();
			if(a>b){
				if(a>c){
					System.out.print("Largest Number : "+a);
				}
				else{
					System.out.print("Largest Number : "+c);
				}
			}
			else{
				if(a<c){
					System.out.print("Largest Number : "+c);
				}
				else{
					System.out.print("Largest Number : "+b);
				}
			}
			}
	}