//average of elements in array
 import java.util.Scanner;
public class L4A2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n=sc.nextInt();
		int a[];
		a = new int[n];// also initialize by : int a[] = new int[n]; or int[] a = new int[n];
		float sum=0;
		for(int i = 0; i < n ; i++){
			System.out.print("Enter Array Number : ");
			 a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		double result;
		result=(sum)/n;
		System.out.print("Average : " +result);
	}
}