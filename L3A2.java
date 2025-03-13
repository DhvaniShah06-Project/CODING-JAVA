//find even or odd
import java.util.Scanner;
	public class L3A2{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a Number");
			int a=sc.nextInt();
			if(a % 2 == 0){
				System.out.print(a+ " is Even");
			}
			else{
				System.out.print(a+ " is Odd");
			}
		}
	}
