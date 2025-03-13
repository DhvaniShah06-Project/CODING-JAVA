import java.util.Scanner;
public class L4A3Fn{
	public static void main(String[] args){
		 L4A3Fn d = new L4A3Fn();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Array Length : ");
		int n = sc.nextInt();
		d.L4A3Fn(n);
	}
		public class void (int n){
			int a[];
		    a = new int[n];
		    Scanner k = new Scanner(System.in);
		    for(int i = 0 ; i < a.length ; i++){
			System.out.print("Enter Array Element : ");
			a[i] = k.nextInt();
		}
		System.out.println("Array In reverse Order : ");
		for(int i = n - 1 ; i >= 0 ; i--){
			System.out.println(a[i]);
		}
	
		}
}