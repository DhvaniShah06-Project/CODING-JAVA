//array in ascending and then from index rotate that and then find the index of entered number
import java.util.Scanner;
public class L5C3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array in Ascending Order");
		for(int p =0; p<n; p++){
			System.out.print("Enter Array Element : ");
			a[p] = sc.nextInt();
		}
		System.out.print("Enter pivot Index : ");
		int k = sc.nextInt();
		int i = k;
		int j=0;
		int b[] = new int[n];
		for(i = k;  i<n ; i++, j++){
			b[j] = a[i];
			//System.out.println(b[j]);
		}
		int t = 0;
		for(; t<=k-1;t++,j++){
			b[j]=a[t];
			//System.out.println(b[t]);
		}
		for(int r=0;r<n;r++){
			System.out.println(b[r]);
		}
		
		int flag=0;
		System.out.print("Enter Element to find : ");
		int d =sc.nextInt();
		for(int l=0 ; l<n ;l++){
			if(b[l]==d){
				System.out.println(l);
				//System.out.print(b[l]);
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.print("-1");
		}
		

	}
}