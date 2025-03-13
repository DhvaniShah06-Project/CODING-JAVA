//array in reverse order
import java.util.Scanner;
public class L4A3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Length : ");
		int n = sc.nextInt();
		int a[];
		a = new int[n];
		int i = 0;
		for(i=0; i<a.length;i++){
			System.out.print("Enter Array Element : ");
			a[i] = sc.nextInt();
		}
			System.out.println("Array In reverse Order : ");
		for(i=n-1; i>=0;i--){
			System.out.println(a[i]);
		}
	}
}
// "Array in reverse order : "+a[i]
//print(a[i]" ") 