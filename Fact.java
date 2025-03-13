import java.util.Scanner;
	public class Fact
	{
		public static void main(String[] args)
		{
			Fact d = new Fact();
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter Number : ");
			int a=sc.nextInt();
			 d.Fact(a);
			
		}
		public void Fact(int n){
			int k=n;
			for(; n >1 ; n--){
				k = k*(n-1);
			}
		}
	}