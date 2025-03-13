//add two imaginary count
import java.util.Scanner;
class ComplexNumber{
	int real;
	int img;

	public ComplexNumber(){
		this.real = 0;
		this.img = 0;
	}
	public ComplexNumber(int r1,int i1){
		real =r1;
		img = i1;
	}
	public void Addition(ComplexNumber C2){
		this.real+=C2.real;
		this.img+=C2.img;

		System.out.print(this.real+" + ");
		System.out.print(this.img+"i");
		// ComplexNumber ans = new ComplexNumber(this.real+C2.real , this.img+C2.img);
		// return ans;
	}
}
public class L6B5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		System.out.print("Enter Real Number : ");
		int r1 = sc.nextInt();
		System.out.print("Enter Imaginary Number : ");
		int i1 = sc.nextInt();
		System.out.println("Enter Second Number :");
		System.out.print("Enter Real Number : ");
		int r2 = sc.nextInt();
		System.out.print("Enter Imaginary Number : ");
		int i2 = sc.nextInt();
		ComplexNumber C1 = new ComplexNumber(r1,i1);
		ComplexNumber C2 = new ComplexNumber(r2,i2);
		C1.Addition(C2);
		// ComplexNumber ans = C1.Addition(C2);
		// System.out.print("Addition : "+ans);
	}
}