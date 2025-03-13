import java.util.Scanner;
public class Sort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array");
		for(int p =0; p<n; p++){
			System.out.print("Enter Array Element : ");
			a[p] = sc.nextInt();
		}
		sc.close();
		int c,z;
		for(int q=0; q<n ;q++){
			for(z=q+1;z<n;z++){
				if(a[q]>a[z]){
					c = a[q];
					a[q]=a[z];
					a[z]=c;

				}
			}
		}
		System.out.println("Sorted Array:");
		for(int v=0;v<n;v++){
			System.out.println(a[v]);
		}

		System.out.print("Enter pivot Index : ");
		int k = sc.nextInt();
		int j=0;
		int b[] = new int[n];
		for(int i = k;  i<n ; i++, j++){
			b[j] = a[i];
		}
		int t = 0;
		for(; t<=k-1;t++,j++){
			b[j]=a[t];
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
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.print("-1");
		}
	}
}