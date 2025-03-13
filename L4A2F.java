import java.util.Scanner;
public class L4A2F{
	public static void main (String[] args){
		L4A2F d=new L4A2F();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		int a[];
		a=new int[n];
		for(int i = 0; i < a.length ; i++){
			System.out.print("Enter Array Number : ");
			a[i]=sc.nextInt();
		}
		    d.L4A2F(a);
			}


		public void L4A2F(int a[]){
			 int sum=0;
			 for(int i=0; i<a.length;i++){
				sum=sum+a[i];
		 	}
			double result;
			result=(sum)/(a.length);
			System.out.print("Average : "+result);
		}
}
			
