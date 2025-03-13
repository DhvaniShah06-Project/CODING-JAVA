import java.util.Scanner;
public class L4A2Fn{
	public static void main(String[] args){
		L4A2Fn d=new L4A2Fn();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		d.L4A2Fn(n);
	}
	public void L4A2Fn(int n){
		int sum=0;
		int a[];
		a = new int[n];
		Scanner k = new Scanner(System.in);
		for(int i = 0; i < n ; i++){
			System.out.print("Enter Array Number : ");
			 a[i]=k.nextInt();
			sum=sum+a[i];
		}
		float result;
		result=(sum)/n;
		System.out.print("Average : "+result);
	}
	}
