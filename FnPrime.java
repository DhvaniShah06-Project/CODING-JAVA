import java.util.Scanner;
public class FnPrime{
	public static void main(String[] args){
        FnPrime d=new FnPrime();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        System.out.print("Enter a Number : ");
        int b = sc.nextInt();
        int i;
            for(i=a;i<=b;i++){
       	        d.FnPrime(i);
       }
	}
	public void FnPrime(int n ){
	int i,flag=0;
            for (i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    flag = flag + 1;
                    break;
                }
        }
        if(flag==0){
        	System.out.println("Prime : "+n);
        }
    }
}